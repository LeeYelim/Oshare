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
	 *  로그인 Form 화면
	 */
	@RequestMapping("loginForm")
	public String loginForm(){
		return "login/loginForm";
	}
	
//	@RequestMapping("login/index")
//	public void loginOk() {}
	
	/**
	 * 로그인 아이디/비밀번호 체크
	 * 로그인 성공시 유저 loginMemberName/loginMemberId 저장 후 메인 페이지 이동
	 * 로그인 실패시 에러 페이지 이동
	 */
	@RequestMapping("loginCheck")
	public String loginCheck(MemberDTO memberDTO, HttpSession session, HttpServletRequest request) {
		// 아이디 + 비번을 통하여 db에 계정조회
		MemberDTO dbMemberDTO = memberService.loginCheck(memberDTO);

		if(dbMemberDTO == null) {
			request.setAttribute("errorMsg", "계정정보를 다시 확인해주세요.");
		}
		
		// 세션에 계정정보 저장
		session.setAttribute("loginMemberName", dbMemberDTO.getMemberName());
		session.setAttribute("loginMemberId", dbMemberDTO.getMemberId());
		
		return "redirect:/";
	}
	
	/**
	 *  로그아웃 시 세션 제거 후, 메인 페이지 이동
	 */
	@RequestMapping("logout")
	public String logout(HttpSession session, HttpServletResponse response) {
		session.invalidate();
		return "redirect:/";
	}
	

}
















