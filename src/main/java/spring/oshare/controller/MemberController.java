package spring.oshare.controller;

import java.io.File;

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

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.SharingDTO;
import spring.oshare.service.MemberService;

@Controller
@RequestMapping("member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	/**
	 *  ȸ������ �� �̵�
	 */
	@RequestMapping("signupForm")
	public String signupForm() {
		return "login/signupForm";
	}
	
	/**
	 * ID �ߺ�üũ
	 */
	@RequestMapping("duplicateCheck")
	public ResponseEntity<String> idCheckController(String memberId){
						
		String check = "�ߺ�";
		
		if(!(memberService.serviceIdCheck(memberId))){
			check="��밡��";
		}
		
		HttpHeaders header = new HttpHeaders();
		header.add("content-type", "text/html;charset=UTF-8");
		ResponseEntity<String> re = new ResponseEntity<String>(check, header, HttpStatus.OK);
		
		return re;
	}
	
	   /**
	    * ȸ������
	    */
	   @RequestMapping("joinUs")
	   public String joinUsController(HttpServletRequest request, MemberDTO dto){
	      
	      int memberNo = dto.getMemberNo(); // ���Ե� ����
	      
	      String memberId = dto.getMemberId(); //���̵�
	         
	         String memberPwd1 = dto.getMemberPwd1(); //��й�ȣ1
	         String memberPwd2 = dto.getMemberPwd2(); //��й�ȣ Ȯ��2
	      String memberPwd = memberPwd1; // sql�� ����� ��й�ȣ
	         
	      String memberName = dto.getMemberName(); //�̸�
	         
	         String memberBirth1 = dto.getMemberBirth1(); //����
	         String memberBirth2 = dto.getMemberBirth2(); //��
	         String memberBirth3 = dto.getMemberBirth3(); //��
	      String memberBirth = memberBirth1 + memberBirth2 + memberBirth3; // sql�� ����� �������(Birth) ���� + �� + ��
	         
	         String memberAddr1 = dto.getMemberAddr1(); //�����ȣ
	         String memberAddr2 = dto.getMemberAddr2(); //�ּ�
	         String memberAddr3 = dto.getMemberAddr3(); //���ּ�
	      String memberAddr = memberAddr1 + "_" + memberAddr2 + "_" + memberAddr3; //�����ȣ + �ּ� + ���ּ�

	      String memberBank = dto.getMemberBank(); //ī�弱��

	         String memberAccount1 = dto.getMemberAccount1();      //ī���ȣ16�ڸ� �� ù��°
	         String memberAccount2 = dto.getMemberAccount2();       //ī���ȣ16�ڸ� �� �ι�°
	         String memberAccount3 = dto.getMemberAccount3();       //ī���ȣ16�ڸ� �� ����°
	         String memberAccount4 = dto.getMemberAccount4();       //ī���ȣ16�ڸ� �� �׹�°
	      String memberAccount =                                           
	            memberAccount1 + memberAccount2 + memberAccount3 + memberAccount4;  //ī���ȣ16�ڸ� = ù��° + �ι�° + ����° + �׹�°
	         
	      int memberValidMonth = dto.getMemberValidMonth(); // ��ȿ�Ⱓ ��
	      int memberValidYear = dto.getMemberValidYear(); // ��ȿ�Ⱓ ��
	      int memberSharingCount = dto.getMemberSharingCount(); // ����ȸ��
	         
	         String memberPhone1 = dto.getMemberPhone1(); //������ȣ
	         String memberPhone2 = dto.getMemberPhone2(); //�Է¹�ȣ ���ڸ� 4��
	         String memberPhone3 = dto.getMemberPhone3(); //�Է¹�ȣ ���ڸ� 4��
	      String memberPhone =                                        
	            memberPhone1 + memberPhone2 + memberPhone3; //��ȭ��ȣ = ������ȣ(010) + ���ڸ�4�� + ���ڸ�4��
	      
	      String memberProfilePath = dto.getMemberProfilePath();
	      
	      MemberDTO member = new MemberDTO(
	                              memberNo, memberId, memberPwd1,memberPwd2,memberPwd,
	                              memberName, memberBirth1,memberBirth2,memberBirth3,memberBirth,
	                              memberAddr1, memberAddr2, memberAddr3, memberAddr, memberBank, 
	                              memberAccount1,memberAccount2,memberAccount3,memberAccount4,
	                              memberAccount,memberValidMonth, memberValidYear, memberSharingCount, 
	                              memberPhone1,memberPhone2,memberPhone3,memberPhone,memberProfilePath
	                              );
	      
	      memberService.signUp(member);
	      
	      return "login/loginForm"; // ȸ������ �� �α��� �������� �̵�
	   }
	
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
	public String loginCheck(MemberDTO memberDTO, HttpSession session, HttpServletRequest request) throws Exception {
		// ���̵� + ����� ���Ͽ� db�� ������ȸ
		MemberDTO dbMemberDTO = memberService.loginCheck(memberDTO);
		
		System.out.println("�̸�=" + dbMemberDTO.getMemberName());
		System.out.println("���̵�=" + dbMemberDTO.getMemberId());

		if(dbMemberDTO == null) {
			/*request.setAttribute("errorMsg", "���������� �ٽ� Ȯ�����ּ���.");*/
		}else if(dbMemberDTO.getMemberGrade() == 2){
			request.setAttribute("errorMsg", "�� ������ �������� �����Դϴ� �����ڿ��� ���Ǹ� ���ֽʽÿ�");
			throw new Exception();
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
	
	/**
	 * �α��ε� ȸ������ ID �˻�
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
	      
	      String memberProfilePath = dto.getMemberProfilePath();
	      
	      MemberDTO member = new MemberDTO(
	                              memberNo, memberId, memberPwd1, memberPwd2, memberPwd, memberName, 
	                              memberBirth1, memberBirth2, memberBirth3, memberBirth,
	                              memberAddr1, memberAddr2, memberAddr3, memberAddr, memberBank, 
	                              memberAccount1,memberAccount2,memberAccount3,memberAccount4,memberAccount,
	                              memberValidMonth,memberValidYear, memberSharingCount,
	                              memberPhone1,memberPhone2,memberPhone3,memberPhone, memberProfilePath
	                              );
	      
	      MemberDTO dbMemberDto = memberService.selectByMember(memberId);
	      
	      return new ModelAndView("member/updateMember", "dbMemberDto", dbMemberDto);
	   }
	
	/**
	 * ȸ������ ����
	 */
	@RequestMapping("updateMember")
	public String updateMember(HttpServletRequest request, MemberDTO member, String name, HttpSession session) {

		String memberId = request.getParameter("memberId"); // ���̵�

		String memberName = request.getParameter("memberName"); // �̸�

		String memberAddr1 = request.getParameter("memberAddr1"); // �����ȣ
		String memberAddr2 = request.getParameter("memberAddr2"); // �ּ�
		String memberAddr3 = request.getParameter("memberAddr3"); // ���ּ�
		String memberAddr = memberAddr1 + "_" + memberAddr2 + "_" + memberAddr3; // �����ȣ+�ּ�+���ּ�
		member.setMemberAddr(memberAddr); // ����

		String memberBank = request.getParameter("memberBank"); // ����ī��

		String memberAccount = request.getParameter("memberAccount1"); // ī���ȣ
																		// 16�ڸ�
		member.setMemberAccount(memberAccount); // ����

		int memberValidMonth = Integer.parseInt(request.getParameter("memberValidMonth")); // ��ȿ�Ⱓ
																							// ��
		member.setMemberValidMonth(memberValidMonth); // ����

		int memberValidYear = Integer.parseInt(request.getParameter("memberValidYear")); // ��ȿ�Ⱓ
																							// ��
		member.setMemberValidYear(memberValidYear); // ����

		String memberPhone = request.getParameter("memberPhone1"); // �޴���ȭ 11�ڸ�
		member.setMemberPhone(memberPhone); // ����

		MultipartFile file = member.getFile();
		
		String fileName = file.getOriginalFilename();
		member.setFileName(fileName); //÷�������̸�

		long fileSize = file.getSize();
		member.setFileSize(fileSize); //���� �뷮
		
	  //��θ� "\" �� �����ؼ� ���� ����Ʈ ����
		String [] array;
		
		// �̹��� ������
		String path = session.getServletContext().getRealPath("/resources/profileImg");
		
	  //��θ� "\"�� �����ؼ� �ε��� ������ (�ʿ��� index[11]=resources , index[12]=profileImg )
		array = path.split("\\\\");
		String resources = array[11]; //resources
		String profileImg = array[12];	//profileImg
		String memberProfilePath = "/" + resources + "/" + profileImg + "/" + fileName;	// index[11] + index[12] + ��������̸���.Ȯ����
	  //DTO�� ������� + �����̸�
		member.setMemberProfilePath(memberProfilePath);
				
	  //����Ϸ�
		try {
			member.getFile().transferTo(new File(path+"/"+member.getFileName()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	  // call
		memberService.updateMember(member);
		
		return "redirect:/";
	}
		
	/**
	 * Ż�� ������Ȯ��
	 */
	@RequestMapping("deleteLoginCheck")
	public String deleteLoginCheck(HttpServletRequest request, HttpSession session, MemberDTO memberDTO)throws Exception{
		
		
		// ���̵� + ����� ���Ͽ� db�� ������ȸ
		MemberDTO dbdbMemberDTO = memberService.loginCheck(memberDTO);

		if (dbdbMemberDTO == null) {
			request.setAttribute("errorMsg", "���������� �ٽ� Ȯ�����ּ���.");
			throw new Exception();
		}else{
		memberService.deleteMember(memberDTO.getMemberId());
		
		session.invalidate();
		}
		return "redirect:/";

	}

	/**
	 * �ŷ����� Ȯ��
	 */
	@RequestMapping("deleteMemberConfirm")
	public ModelAndView deleteMemberConfirm(HttpServletRequest request, String transactionState ,String memberId , String memberPwd)throws Exception {
		
		ModelAndView mv = new ModelAndView();
		
		transactionState = "�ݳ�";

		SharingDTO dbSharingDTO = memberService.deleteMemberConfirm(transactionState , memberId);
			
		if(dbSharingDTO != null){
			request.setAttribute("errorMsg", "Ż�� �Ҽ������ϴ�.");
			throw new Exception();
		}
		
		System.out.println("memberID asdaSDASDASD ASDAD LYL : ASDASD "+ memberId + " , "+ memberPwd);
		
		mv.setViewName("mypage/deleteMember/deleteSuccess");
		mv.addObject("memberId", memberId);
		mv.addObject("memberPwd", memberPwd);

		return mv;
	}
	
	/**
	 * ���� ������ ��ȿ���˻�
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
















