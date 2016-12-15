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
		String memberAddr = 														  // sql�� ����� �ּ�
				"�����ȣ : (" + memberAddr1+") _" + memberAddr2 + "_" + memberAddr3; //�����ȣ + �ּ� + ���ּ�

		String memberBank = dto.getMemberBank(); //ī�弱��

			String memberAccount1 = dto.getMemberAccount1();		//ī���ȣ16�ڸ� �� ù��°
			String memberAccount2 = dto.getMemberAccount2(); 		//ī���ȣ16�ڸ� �� �ι�°
			String memberAccount3 = dto.getMemberAccount3(); 		//ī���ȣ16�ڸ� �� ����°
			String memberAccount4 = dto.getMemberAccount4(); 		//ī���ȣ16�ڸ� �� �׹�°
		String memberAccount = 														// sql�� ����� ī���ȣ 16�ڸ�
				memberAccount1 + memberAccount2 + memberAccount3 + memberAccount4;  //ī���ȣ16�ڸ� = ù��° + �ι�° + ����° + �׹�°
			
		int memberValidMonth = dto.getMemberValidMonth(); // ��ȿ�Ⱓ ��
		int memberValidYear = dto.getMemberValidYear(); // ��ȿ�Ⱓ ��
		int memberSharingCount = dto.getMemberSharingCount(); // ����ȸ��
			
			String memberPhone1 = dto.getMemberPhone1(); //������ȣ
			String memberPhone2 = dto.getMemberPhone2(); //�Է¹�ȣ ���ڸ� 4��
			String memberPhone3 = dto.getMemberPhone3(); //�Է¹�ȣ ���ڸ� 4��
		String memberPhone = 													//sql�� ����� ��ȭ��ȣ
				memberPhone1 + memberPhone2 + memberPhone3; //��ȭ��ȣ = ������ȣ(010) + ���ڸ�4�� + ���ڸ�4��
		
		MemberDTO member = new MemberDTO(
										memberNo, memberId, memberPwd, memberName, memberBirth,memberAddr,memberBank, memberAccount, 
										memberValidMonth, memberValidYear, memberSharingCount, memberPhone
										);
		
		memberService.signUp(member);
		
		return "main/index";	//ȸ������ �� ������������ �̵�
//		return "login/loginForm"; // ȸ������ �� �α��� �������� �̵�
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
	public String loginCheck(MemberDTO memberDTO, HttpSession session, HttpServletRequest request) {
		// ���̵� + ����� ���Ͽ� db�� ������ȸ
		MemberDTO dbMemberDTO = memberService.loginCheck(memberDTO);

		if(dbMemberDTO == null) {
			request.setAttribute("errorMsg", "���������� �ٽ� Ȯ�����ּ���.");
		}
		System.out.println("asdasdasd: "+dbMemberDTO.getMemberName());
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
















