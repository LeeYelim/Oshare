package spring.oshare.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.oshare.dto.MemberDTO;
import spring.oshare.service.MemberService;

@Controller
@RequestMapping("member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	/**
	 *  �α��� Form ȭ��
	 */
	@RequestMapping("loginForm")
	public String loginForm(){
		return "login/loginForm";
	}
	
//	@RequestMapping("login/index")
//	public void loginOk() {}
	
	/**
	 * �α��� ���̵�/��й�ȣ üũ
	 * �α��� ������ ���� loginMemberName/loginMemberId ���� �� ���� ������ �̵�
	 * �α��� ���н� ���� ������ �̵�
	 */
	@RequestMapping("loginCheck")
	public String loginCheck(MemberDTO memberDTO, HttpSession session, HttpServletRequest request) {
		// ���̵� + ����� ���Ͽ� db�� ������ȸ
		MemberDTO dbMemberDTO = memberService.loginCheck(memberDTO);

		if(dbMemberDTO == null) {
			request.setAttribute("errorMsg", "���������� �ٽ� Ȯ�����ּ���.");
		}
		
		// ���ǿ� �������� ����
		session.setAttribute("loginMemberName", dbMemberDTO.getMemberName());
		session.setAttribute("loginMemberId", dbMemberDTO.getMemberId());
		
		return "redirect:/";
	}
	
	/**
	 *  �α׾ƿ� �� ���� ���� ��, ���� ������ �̵�
	 */
	@RequestMapping("logout")
	public String logout(HttpSession session, HttpServletResponse response) {
		session.invalidate();
		return "redirect:/";
	}
	

}
















