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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

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
	      String memberAddr = memberAddr1 + "_" + memberAddr2 + "_" + memberAddr3; //우편번호 + 주소 + 상세주소

	      String memberBank = dto.getMemberBank(); //카드선택

	         String memberAccount1 = dto.getMemberAccount1();      //카드번호16자리 중 첫번째
	         String memberAccount2 = dto.getMemberAccount2();       //카드번호16자리 중 두번째
	         String memberAccount3 = dto.getMemberAccount3();       //카드번호16자리 중 세번째
	         String memberAccount4 = dto.getMemberAccount4();       //카드번호16자리 중 네번째
	      String memberAccount =                                           
	            memberAccount1 + memberAccount2 + memberAccount3 + memberAccount4;  //카드번호16자리 = 첫번째 + 두번째 + 세번째 + 네번째
	         
	      int memberValidMonth = dto.getMemberValidMonth(); // 유효기간 월
	      int memberValidYear = dto.getMemberValidYear(); // 유효기간 연
	      int memberSharingCount = dto.getMemberSharingCount(); // 공유회차
	         
	         String memberPhone1 = dto.getMemberPhone1(); //지역번호
	         String memberPhone2 = dto.getMemberPhone2(); //입력번호 앞자리 4개
	         String memberPhone3 = dto.getMemberPhone3(); //입력번호 뒷자리 4개
	      String memberPhone =                                        
	            memberPhone1 + memberPhone2 + memberPhone3; //전화번호 = 지역번호(010) + 앞자리4개 + 뒷자리4개
	      
	      MemberDTO member = new MemberDTO(
	                              memberNo, memberId, memberPwd1,memberPwd2,memberPwd,
	                              memberName, memberBirth1,memberBirth2,memberBirth3,memberBirth,
	                              memberAddr1, memberAddr2, memberAddr3, memberAddr, memberBank, 
	                              memberAccount1,memberAccount2,memberAccount3,memberAccount4,
	                              memberAccount,memberValidMonth, memberValidYear, memberSharingCount, 
	                              memberPhone1,memberPhone2,memberPhone3,memberPhone
	                              );
	      memberService.signUp(member);
	      
	      return "login/loginForm"; // 회원가입 후 로그인 페이지로 이동
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
		
		System.out.println("이름=" + dbMemberDTO.getMemberName());
		System.out.println("아이디=" + dbMemberDTO.getMemberId());
		
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
	
	/**
	 * 로그인된 회원정보 ID 검색
	 */
	@RequestMapping("selectByMemberId")
	   public ModelAndView updateMemberForm(HttpServletRequest request , MemberDTO dto){
	      
	      int memberNo = dto.getMemberNo();
	      
	      String memberId = request.getParameter("memberId");
	      
	      String memberPwd1 = dto.getMemberPwd1();
	      String memberPwd2 = dto.getMemberPwd2();
//	      String memberPwd = memberPwd1 + memberPwd2 ;
	      String memberPwd = memberPwd1;
	      
	      String memberName = dto.getMemberName();
	      
	      String memberBirth1 = dto.getMemberBirth1();
	      String memberBirth2 = dto.getMemberBirth2();
	      String memberBirth3 = dto.getMemberBirth3();
	      String memberBirth = memberBirth1 + memberBirth2 + memberBirth3;
	      
	      String memberAddr1 = dto.getMemberAddr1();
	      String memberAddr2 = dto.getMemberAddr2();
	      String memberAddr3 = dto.getMemberAddr3();
	      String memberAddr = memberAddr1 + memberAddr2 + memberAddr3;
	      
	      String memberBank = request.getParameter("memberBank");
	      
	      String memberAccount1 = dto.getMemberAccount1();
	      String memberAccount2 = dto.getMemberAccount2();
	      String memberAccount3 = dto.getMemberAccount3();
	      String memberAccount4 = dto.getMemberAccount4();
	      String memberAccount = memberAccount1 + memberAccount2 + memberAccount3 + memberAccount4;
	      
	      int memberValidMonth = dto.getMemberValidMonth();
	      int memberValidYear = dto.getMemberValidYear();
	      int memberSharingCount = dto.getMemberSharingCount();
	      
	      String memberPhone1 = dto.getMemberPhone1();
	      String memberPhone2 = dto.getMemberPhone2();
	      String memberPhone3 = dto.getMemberPhone3();
	      String memberPhone = memberPhone1 + memberPhone2 + memberPhone3;
	      
	      MemberDTO member = new MemberDTO(
	                              memberNo, memberId, memberPwd1, memberPwd2, memberPwd, memberName, 
	                              memberBirth1, memberBirth2, memberBirth3, memberBirth,
	                              memberAddr1, memberAddr2, memberAddr3, memberAddr, memberBank, 
	                              memberAccount1,memberAccount2,memberAccount3,memberAccount4,memberAccount,
	                              memberValidMonth,memberValidYear, memberSharingCount,
	                              memberPhone1,memberPhone2,memberPhone3,memberPhone
	                              );
	      
	      MemberDTO dbMemberDto = memberService.selectByMember(memberId);
	      
	      return new ModelAndView("member/updateMember", "dbMemberDto", dbMemberDto);
	   }
	
	 /**
	    * 회원정보 수정
	    */
	   @RequestMapping("updateMember")
	   public String updateMember(HttpServletRequest request , MemberDTO member, String name, HttpSession session, @RequestParam MultipartFile file){
	      
	      String memberId = request.getParameter("memberId"); //아이디
	      
	      String memberName = request.getParameter("memberName"); //이름
	      
	      String memberAddr1 = request.getParameter("memberAddr1"); //우편번호
	      String memberAddr2 = request.getParameter("memberAddr2"); //주소
	      String memberAddr3 = request.getParameter("memberAddr3"); //상세주소
	      String memberAddr = memberAddr1 + "_" + memberAddr2 + "_" + memberAddr3; // 우편번호+주소+상세주소
	      member.setMemberAddr(memberAddr); //저장
	      
	      String memberBank = request.getParameter("memberBank"); //결제카드
	      
	      String memberAccount = request.getParameter("memberAccount1"); //카드번호 16자리
	      member.setMemberAccount(memberAccount); //저장
	      
	      int memberValidMonth = Integer.parseInt(request.getParameter("memberValidMonth")); //유효기간 월
	      member.setMemberValidMonth(memberValidMonth); //저장
	      
	      int memberValidYear = Integer.parseInt(request.getParameter("memberValidYear")); //유효기간 연
	      member.setMemberValidYear(memberValidYear); //저장

	      String memberPhone = request.getParameter("memberPhone1"); //휴대전화 11자리
	      member.setMemberPhone(memberPhone); //저장
	      
	      //이미지 저장경로
	      String saveDir = session.getServletContext().getRealPath("/WEB-INF/saveUpLoad");
	      
	      //파일정보 확인
	      String fileName = file.getOriginalFilename();
	      String fileName2 = file.getName();
	      long size = file.getSize();
	      
//	      try{
//	         file.transferTo(new File(saveDir + "/" + fileName));
//	      }catch(Exception e){
//	         e.printStackTrace();
//	      }
	      
	      ModelAndView mav = new ModelAndView();
	      
	      mav.addObject("saveDir", saveDir);
	      mav.addObject("fileName", fileName);
	      mav.addObject("fileName2", fileName2);
	      mav.addObject("size", size);
	      
	      mav.setViewName("updateMemberForm");
	      
	      //call
	      memberService.updateMember(member);
	      
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
















