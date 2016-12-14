package spring.oshare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.oshare.dao.MyPageDAO;
import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.MessageDTO;
import spring.oshare.dto.SharingDTO;

@Service
public class MyPageServiceImpl implements MyPageService{
	
	@Autowired
	private MyPageDAO myPageDAO;

	@Override
	public List<BoardDTO> salesItemList(String memberId) {
		return myPageDAO.salesItemList(memberId);
	}

	@Override
	public List<BoardDTO> rentalItemList(String memeberId) {
		return myPageDAO.rentalItemList(memeberId);
	}

	@Override
	public int insertMessage(MessageDTO message) {
		return myPageDAO.insertMessage(message);
	}

	@Override
	public List<MessageDTO> selectMessage(String posts , String division) {
		List<MessageDTO> messageList;
		if(posts.equals("receiver")){
			messageList = myPageDAO.selectReceiverMessage(division);//수신자
		}else{	
			messageList = myPageDAO.selectSenderMessage(division);//송신자
		}
		return messageList;
	}

	@Override
	public int deleteMessage(String[] messageNo) {
		// TODO Auto-generated method stub
		return myPageDAO.deleteMessage(messageNo);
	}
	
}
