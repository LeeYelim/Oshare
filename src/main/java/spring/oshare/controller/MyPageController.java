package spring.oshare.controller;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.CartDTO;
import spring.oshare.dto.DeclarationDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.MessageDTO;
import spring.oshare.dto.WishlistDTO;
import spring.oshare.service.MemberService;
import spring.oshare.service.MyPageService;

/**
 * ���������� - ���ø���Ʈ - �뿩���θ�� - �Ǹ����θ�� - ������ - �������� - ȸ���������� - ��ٱ��� - ����[ȸ�� ����]
 */
@Controller
@RequestMapping("mypage")
public class MyPageController {

	@Autowired
	private MyPageService myPageService;

	@Autowired
	private MemberService memberService;

	/**
	 * ������ ��ǰ ���
	 */
	// @RequestMapping("salesItem")
	/*
	 * public String salesItem(){ return "mypage/salesItem/saleItemList"; }
	 */

	@RequestMapping("salesItem")
	public ModelAndView salesItem(HttpSession session) {
		// ȸ�� ID��������
		String memberId = (String) session.getAttribute("loginMemberId");

		// ID�� �ش��ϴ� �Ǹ�(������) ��� ��ȸ
		List<BoardDTO> saleslist = myPageService.salesItemList(memberId);
		/*
		 * for(BoardDTO board : saleslist) { List<SharingDTO> sharings =
		 * board.getSharing(); for(SharingDTO sharing : sharings) { MemberDTO
		 * member = sharing.getMember(); System.out.println("�Խù� ��ȣ : " +
		 * board.getBoardNo() + ", ��ǰ�� : " + board.getProductName() +
		 * ", ��� ��ȣ : " + sharing.getSharingNo() + ", �Ǹ��� id : " +
		 * sharing.getSellerId() + ", �뿩�� id : " + sharing.getBuyerId() +
		 * ", �뿩�� ����ȣ : " + member.getMemberPhone() + ", ��� ���� : " +
		 * sharing.getSharingStart() + ", ��� ���� : " + sharing.getSharingEnd() +
		 * ", �ŷ� ���� : " + sharing.getTransactionState()); } }
		 */

		ModelAndView mv = new ModelAndView();
		mv.addObject("saleslist", saleslist);
		mv.setViewName("mypage/salesItem/saleItemList");
		return mv;
	}

	/**
	 * ���� ��ǰ ���
	 */
	@RequestMapping("rentalItem")
	public ModelAndView rentalItemList(HttpSession session) {
		// ȸ�� ID��������
		String memberId = (String) session.getAttribute("loginMemberId");

		// ID�� �ش��ϴ� �Ǹ�(������) ��� ��ȸ
		List<BoardDTO> rentallist = myPageService.rentalItemList(memberId);
		ModelAndView mv = new ModelAndView();
		mv.addObject("rentallist", rentallist);
		mv.setViewName("mypage/rentalItem/rentalItemList");
		return mv;
	}

	/**
	 * �޼��� ������ ���
	 */
	@RequestMapping("message")
	public String messageBox(HttpSession session, HttpServletRequest request) throws Exception {
		if (session.getAttribute("loginMemberId") == null) {
			request.setAttribute("errorMsg", "�α����ϰ� ���ʽÿ�");
			throw new Exception();
		}
		return "mypage/messageBox/sendMessage";
	}

	/**
	 * ���� ������
	 */
	/*
	 * @RequestMapping("sendMessageInsert") public String
	 * insertMessage(MessageDTO message, HttpServletRequest request){
	 * myPageService.insertMessage(message); return "redirect:message"; }
	 */

	/**
	 * �󼼺��� ���� ������
	 */
	@RequestMapping("DetailSendMessageInsert")
	@ResponseBody
	public String DetailInsertMessage(MessageDTO message, HttpServletRequest request) {
		System.out.println("detail message : " + message.getReceiver() + message.getSender() + message.getContent());
		return myPageService.insertMessage(message);
	}

	/**
	 * ���� �۽�
	 */
	@RequestMapping("sendMessageSelect")
	@ResponseBody
	public List<MessageDTO> selectMessage(HttpServletRequest request, String posts, String division) {
		List<MessageDTO> list = myPageService.selectMessage(posts, division);
		return list;

	}

	/**
	 * ���� ����
	 */
	@RequestMapping("sendMessageDelete")
	@ResponseBody
	public int deleteMessage(String[] messageNo) {
		return myPageService.deleteMessage(messageNo);
	}

	/**
	 * ��ٱ���
	 */
	@RequestMapping("shoppingBasket")
	public String shoppingBasketForm() {
		return "shoppingBasket/shoppingBasket";
	}

	/**
	 * ����[ȸ�� ����]
	 */
	@RequestMapping("userManagement")
	@ResponseBody
	public ModelAndView userManagementForm(HttpSession session, HttpServletRequest request) throws Exception {
		List<MemberDTO> allUserList = myPageService.adminAllUserSelect();
		ModelAndView mv = new ModelAndView();
		mv.addObject("allUserMemberDTO", allUserList);
		mv.setViewName("mypage/admin/userManagement");
		if (session.getAttribute("loginMemberId") == null) {
			request.setAttribute("errorMsg", "���ٱ��� �����Դϴ� ���ư��ֽʽÿ�");
			throw new Exception();
		} else if (!session.getAttribute("loginMemberId").equals("admin")) {
			request.setAttribute("errorMsg", "���ٱ��� �����Դϴ� ���ư��ֽʽÿ�");
			throw new Exception();
		}

		return mv;

	}

	/**
	 * ���� [�Ű� ����ȸ�� ����]
	 */
	@RequestMapping("userBlacklist")
	@ResponseBody
	public List<MemberDTO> adminUserBlacklistSelect(int memberGrade) {
		return myPageService.adminUserBlacklistSelect(memberGrade);
	}

	/**
	 * ���� [��ư]
	 */
	@RequestMapping("userBtn")
	@ResponseBody
	public int adminUserGradeChage(int[] memberNo, int memberGrade) {

		return myPageService.adminUserGradeChage(memberNo, memberGrade);
	}

	/**
	 * ȸ������ ������ �̵�
	 */
	@RequestMapping("updateMemberForm")
	public ModelAndView updateMemberForm(HttpServletRequest request) {

		// @RequestMapping("loginCheck") �� ����� session (memberId) ���� �޾Ƽ�
		// ���� �����͸� ������ ������������ �̵�

		// session
		HttpSession session = request.getSession();
		String memberId = (String) session.getAttribute("loginMemberId");

		// call
		MemberDTO dbMemberDTO = memberService.selectByMember(memberId);

		// 'ȸ������' Ŭ���� ��Ÿ���� ���
		String dbmemberId = dbMemberDTO.getMemberId();
		String dbmemberName = dbMemberDTO.getMemberName();
		String dbmemberAddr = dbMemberDTO.getMemberAddr();
		String dbmemberPhone = dbMemberDTO.getMemberPhone();
		String dbmemberAccount = dbMemberDTO.getMemberAccount();
		int dbmemberValidYear = dbMemberDTO.getMemberValidYear();

		// ��ϵ��� ���ڿ��� ����
		String dbmember = dbmemberId + "_" + dbmemberName + "_" + dbmemberAddr + "_" + dbmemberPhone + "_"
				+ dbmemberAccount + "_" + dbmemberValidYear;

		// ���ڿ��� '_' �������� �迭�� ����
		String[] splitMemberDTO = dbmember.split("_");

		// updateMember.jsp �� value�� �迭�� �ٷ� �Է�
		request.setAttribute("splitMemberDTO", splitMemberDTO);

		return new ModelAndView("mypage/updateMember/updateMemberForm");

	}
	
	/**
	 * ȸ��Ż�� �� �α���üũ�� �̵�
	 */
	@RequestMapping("deleteLoginForm")
	public String loginForm() {
		return "mypage/deleteMember/deleteLoginForm";
	}

	/**
	 * ��ٱ��� ����Ʈ
	 */
	@RequestMapping("cartList")
	public ModelAndView selectCart(HttpSession session) {
		String memberId = (String) session.getAttribute("loginMemberId");

		List<CartDTO> cartList = myPageService.selectCart(memberId);

		int total = 0;
		for (CartDTO dto : cartList) {
			total += dto.getCartPrice();
		}

		ModelAndView mv = new ModelAndView("shoppingBasket/shoppingBasket", "cartList", cartList);
		mv.addObject("total", total);

		return mv;
	}

	/**
	 * ��ٱ��� ����
	 */
	public int deleteCart(int boardNo) {

		return myPageService.deleteCart(boardNo);
	}

	/**
	 * ���ø���Ʈ �߰�
	 */
	@RequestMapping("insertWishList")
	@ResponseBody
	public int insertWishList(HttpSession session, WishlistDTO dto) {
		String userId = (String) session.getAttribute("loginMemberId");
		dto.setMemberId(userId);
		System.out.println("=================================" + dto.getBoardNo());
		return myPageService.insertWishList(dto);
	}

	/**
	 * ���ø���Ʈ ����
	 */
	@RequestMapping("deleteWishList")
	@ResponseBody
	public int deleteWishList(HttpSession session, WishlistDTO dto) {
		String userId = (String) session.getAttribute("loginMemberId");
		dto.setMemberId(userId);
		System.out.println("=================================" + dto.getBoardNo());
		return myPageService.deleteWishList(dto);
	}

	/**
	 * ���ø���Ʈ �̵� �� ��ȸ
	 */
	@RequestMapping("wishList")
	public ModelAndView selectWishList(HttpSession session) {
		String memberId = (String) session.getAttribute("loginMemberId");
		List<WishlistDTO> list = myPageService.selectWishList(memberId);
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("mypage/wishlist/wishList");
		return mv;
	}

	/**
	 * �Ű��ϱ� , �Ǹ��� ��� ����
	 */
	@RequestMapping("declarationInsert")
	@ResponseBody
	public int declarationInsert(DeclarationDTO declarationDTO) {
		int declarationInsertResult = myPageService.declarationInsert(declarationDTO);
		myPageService.declarationUserGradeChage(1, declarationDTO.getDeclarationReporter());
		return declarationInsertResult;
	}

	/**
	 * �Ű�/���� ����
	 */
	@RequestMapping("reasonForFiling")
	@ResponseBody
	public List<DeclarationDTO> reasonForFiling(String declarationReporter) {
		return myPageService.reasonForFiling(declarationReporter);
	}
}
