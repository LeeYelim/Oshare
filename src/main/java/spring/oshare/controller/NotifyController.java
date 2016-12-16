package spring.oshare.controller;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import spring.oshare.dto.MessageDTO;
import spring.oshare.service.MyPageService;

@RestController
@RequestMapping("notify")
public class NotifyController {
	
	private List<SseEmitter> emitters = new CopyOnWriteArrayList<SseEmitter>();
	
	@Autowired
	private MyPageService myPageService;
	
	@RequestMapping("connect")
	public SseEmitter connectSSE(HttpServletRequest request) {
		System.out.println("�˸�");
		SseEmitter emitter = new SseEmitter();
		
		emitters.add(emitter);		
		emitter.onCompletion(() -> emitters.remove(emitter));
		
		return emitter;
	}
	
	@RequestMapping(value="sendMessageInsert")
	public void insertMessage(MessageDTO message , HttpServletRequest request){
		System.out.println("����");
		
//		if(myPageService.insertMessage(message) <= 0) {
//			request.setAttribute("errorMsg", "�����ڰ� �������� �ʽ��ϴ� �ٽ� Ȯ�����ּ���.");
//		}
		
		myPageService.insertMessage(message);
		// �����̸� ������ ���̵� ��ȯ
		// �����ϸ� ���� �޼��� ��ȯ
		
		for(SseEmitter emitter : emitters) {
			try {
				System.out.println("�̺�Ʈ����");
				String success = "success";	// ���⿡ �˸��� �� ������
				emitter.send(SseEmitter.event().name("spring").data(success));
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
