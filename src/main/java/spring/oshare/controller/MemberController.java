package spring.oshare.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.oshare.dto.MemberDTO;
import spring.oshare.service.MemberService;

@Controller
@RequestMapping("member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	/**
	 *  회원가입 폼 이동
	 */
	@RequestMapping("signupForm")
	public String signupForm() {
		return "login/signupForm";
	}
	
	/**
	 * ID 중복체크
	 */
	@RequestMapping("duplicateCheck")
	public ResponseEntity<String> idCheckController(String memberId){
						
		String check = "중복";
		
		if(!(memberService.serviceIdCheck(memberId))){
			check="사용가능";
		}
		
		HttpHeaders header = new HttpHeaders();
		header.add("content-type", "text/html;charset=UTF-8");
		ResponseEntity<String> re = new ResponseEntity<String>(check, header, HttpStatus.OK);
		
		return re;
	}
	
	/**
	 * 회원가입
	 */
	@RequestMapping("joinUs")
	public String joinUsController(HttpServletRequest request, MemberDTO dto){
		
		int memberNo = dto.getMemberNo(); // 가입된 순서
		
		String memberId = dto.getMemberId(); //아이디
			
			String memberPwd1 = dto.getMemberPwd1(); //비밀번호1
			String memberPwd2 = dto.getMemberPwd2(); //비밀번호 확인2
		String memberPwd = memberPwd1; // sql에 저장될 비밀번호
			
		String memberName = dto.getMemberName(); //이름
			
			String memberBirth1 = dto.getMemberBirth1(); //생년
			String memberBirth2 = dto.getMemberBirth2(); //월
			String memberBirth3 = dto.getMemberBirth3(); //일
		String memberBirth = memberBirth1 + memberBirth2 + memberBirth3; // sql에 저장될 생년월일(Birth) 생년 + 월 + 일
			
			String memberAddr1 = dto.getMemberAddr1(); //우편번호
			String memberAddr2 = dto.getMemberAddr2(); //주소
			String memberAddr3 = dto.getMemberAddr3(); //상세주소
		String memberAddr = 														  // sql에 저장될 주소
				"우편번호 : (" + memberAddr1+") _" + memberAddr2 + "_" + memberAddr3; //우편번호 + 주소 + 상세주소

		String memberBank = dto.getMemberBank(); //카드선택

			String memberAccount1 = dto.getMemberAccount1();		//카드번호16자리 중 첫번째
			String memberAccount2 = dto.getMemberAccount2(); 		//카드번호16자리 중 두번째
			String memberAccount3 = dto.getMemberAccount3(); 		//카드번호16자리 중 세번째
			String memberAccount4 = dto.getMemberAccount4(); 		//카드번호16자리 중 네번째
		String memberAccount = 														// sql에 저장될 카드번호 16자리
				memberAccount1 + memberAccount2 + memberAccount3 + memberAccount4;  //카드번호16자리 = 첫번째 + 두번째 + 세번째 + 네번째
			
		int memberValidMonth = dto.getMemberValidMonth(); // 유효기간 월
		int memberValidYear = dto.getMemberValidYear(); // 유효기간 연
		int memberSharingCount = dto.getMemberSharingCount(); // 공유회차
			
			String memberPhone1 = dto.getMemberPhone1(); //지역번호
			String memberPhone2 = dto.getMemberPhone2(); //입력번호 앞자리 4개
			String memberPhone3 = dto.getMemberPhone3(); //입력번호 뒷자리 4개
		String memberPhone = 													//sql에 저장될 전화번호
				memberPhone1 + memberPhone2 + memberPhone3; //전화번호 = 지역번호(010) + 앞자리4개 + 뒷자리4개
		
		MemberDTO member = new MemberDTO(
										memberNo, memberId, memberPwd, memberName, memberBirth,memberAddr,memberBank, memberAccount, 
										memberValidMonth, memberValidYear, memberSharingCount, memberPhone
										);
		
		memberService.signUp(member);
		
		return "main/index";	//회원가입 후 메인페이지로 이동
//		return "login/loginForm"; // 회원가입 후 로그인 페이지로 이동
	}
		
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
		System.out.println("asdasdasd: "+dbMemberDTO.getMemberName());
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
	
	/**
	 * 쪽지 수신자 유효성검사
	 * */
	@RequestMapping("receiverSelect")
	@ResponseBody
	public int receiverValidation(String receiver){
		MemberDTO memberDTO = memberService.receiverValidation(receiver);
		int receiverResult = 0;
		if(memberDTO != null)receiverResult=1;
		return receiverResult;
	}
	

}
















