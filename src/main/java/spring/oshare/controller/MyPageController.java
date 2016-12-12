package spring.oshare.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.SharingDTO;
import spring.oshare.service.MyPageService;

/**
 *  ����������
 *  - ���ø���Ʈ
 *  - �뿩���θ��
 *  - �Ǹ����θ��
 *  - ������
 *  - ��������
 *  - ȸ����������
 */
@Controller
@RequestMapping("mypage")
public class MyPageController {
	
	@Autowired
	private MyPageService myPageService;
	
	/**
	 *  ���ø���Ʈ �̵�
	 */
	@RequestMapping("wishList")
	public String myPageWishListForm(){
		return "mypage/wishlist/wishList";
	}
	
	/**
	 * ������ ��ǰ ���
	 */
	//@RequestMapping("salesItem")
	/*public String salesItem(){
		return "mypage/salesItem/saleItemList";
	}*/
	
	@RequestMapping("salesItem")
	public ModelAndView salesItem(HttpSession session){
		// ȸ�� ID��������
		String memberId = (String)session.getAttribute("loginMemberId");
		
		// ID�� �ش��ϴ� �Ǹ�(������) ��� ��ȸ
		List<BoardDTO> saleslist = myPageService.salesItemList(memberId);
		/*for(BoardDTO board : saleslist) {
			List<SharingDTO> sharings = board.getSharing();
			for(SharingDTO sharing : sharings) {
				MemberDTO member = sharing.getMember();
				System.out.println("�Խù� ��ȣ : " + board.getBoardNo() + ", ��ǰ�� : " + board.getProductName() 
				+ ", ��� ��ȣ : " + sharing.getSharingNo() + ", �Ǹ��� id : " + sharing.getSellerId() + ", �뿩�� id : " + sharing.getBuyerId() + ", �뿩�� ����ȣ : " + member.getMemberPhone() 
				+ ", ��� ���� : " + sharing.getSharingStart() + ", ��� ���� : " + sharing.getSharingEnd() + ", �ŷ� ���� : " + sharing.getTransactionState());
			}
		}*/
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("saleslist", saleslist);
		mv.setViewName("mypage/salesItem/saleItemList");
		return mv;
	}
	
	/**
	 * ���� ��ǰ ���
	 */
	@RequestMapping("rentalItem")
	public ModelAndView rentalItemList(HttpSession session){
		// ȸ�� ID��������
		String memberId = (String)session.getAttribute("loginMemberId");
				
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
	public String messageBox(){
		return "mypage/messageBox/sendMessage";
	}
	
	/**
	 * ���� ���� ���
	 */
	@RequestMapping("billingManagement")
	public String billingManagement() {
		return "mypage/billingManagement/billingManagement";
	}
	
	
	
}
