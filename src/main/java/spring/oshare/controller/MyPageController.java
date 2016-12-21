package spring.oshare.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.CartDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.MessageDTO;
import spring.oshare.service.MemberService;
import spring.oshare.service.MyPageService;

/**
 *  ����������
 *  - ���ø���Ʈ
 *  - �뿩���θ��
 *  - �Ǹ����θ��
 *  - ������
 *  - ��������
 *  - ȸ����������
 *  - ��ٱ���
 *  - ����[ȸ�� ����]
 */
@Controller
@RequestMapping("mypage")
public class MyPageController {
	
	@Autowired
	private MyPageService myPageService;
	
	@Autowired
	private MemberService memberService;
	
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
	 * ���� ������
	 * */
	/*
	@RequestMapping("sendMessageInsert")
	public String insertMessage(MessageDTO message, HttpServletRequest request){
		myPageService.insertMessage(message);
		return "redirect:message";
	}
	*/
	
	/**
	 * �󼼺��� ���� ������
	 * */
	@RequestMapping("DetailSendMessageInsert")
	@ResponseBody
	public String DetailInsertMessage(MessageDTO message , HttpServletRequest request){
		System.out.println("detail message : "+message.getReceiver()+ message.getSender() + message.getContent());
		return myPageService.insertMessage(message);
	}
	
	
	/**
	 * ���� �۽�
	 * */
	@RequestMapping("sendMessageSelect")
	@ResponseBody
	public List<MessageDTO>  selectMessage(HttpServletRequest request,String posts , String division){
		 List<MessageDTO> list = myPageService.selectMessage(posts, division);
		 return list;
		
	}
	
	/**
	 * ���� ����
	 * */
	@RequestMapping("sendMessageDelete")
	@ResponseBody
	public int deleteMessage(String[] messageNo){
		return myPageService.deleteMessage(messageNo);
	}
	
	/**
	 * ��ٱ���
	 * */
	@RequestMapping("shoppingBasket")
	public String shoppingBasketForm(){
		return "shoppingBasket/shoppingBasket";
	}
	
	/**
	 * ����[ȸ�� ����]
	 * */	
	@RequestMapping("userManagement")
	public ModelAndView userManagementForm(){
		List<MemberDTO> allUserList = myPageService.adminAllUserSelect();
		ModelAndView mv = new ModelAndView();
		mv.addObject("allUserMemberDTO", allUserList);
		mv.setViewName("mypage/admin/userManagement");
		return mv;
		
	}
	
	/**
	    * ȸ������ ������ �̵�
	    */
	   @RequestMapping("updateMemberForm")
	   public ModelAndView updateMemberForm(HttpServletRequest request){
	      
	      // @RequestMapping("loginCheck") �� ����� session (memberId) ���� �޾Ƽ� 
	      // ���� �����͸� ������ ������������ �̵�
	      
	      //session
	      HttpSession session = request.getSession();
	      String memberId = (String) session.getAttribute("loginMemberId");
	      
	      // call
	      MemberDTO dbMemberDTO = memberService.selectByMember(memberId);

	      //'ȸ������' Ŭ���� ��Ÿ���� ���
	      String dbmemberId = dbMemberDTO.getMemberId();
	      String dbmemberName = dbMemberDTO.getMemberName();
	      String dbmemberAddr = dbMemberDTO.getMemberAddr();
	      String dbmemberPhone = dbMemberDTO.getMemberPhone();
	      String dbmemberAccount = dbMemberDTO.getMemberAccount();
	      int dbmemberValidYear = dbMemberDTO.getMemberValidYear();
	      
	      // ��ϵ��� ���ڿ��� ����
	      String dbmember = dbmemberId + "_" + dbmemberName + "_" + dbmemberAddr + "_"
	                     + dbmemberPhone + "_" + dbmemberAccount + "_" + dbmemberValidYear;
	      
	      // ���ڿ��� '_' �������� �迭�� ����
	      String[] splitMemberDTO = dbmember.split("_");
	      
	      // updateMember.jsp �� value�� �迭�� �ٷ� �Է�
	      request.setAttribute("splitMemberDTO", splitMemberDTO);

	      return new ModelAndView("mypage/updateMember/updateMemberForm");
	      
	   }
	
	   /**
	    * ��ٱ��� ����Ʈ
	    */
	   @RequestMapping("cartList")
	   public ModelAndView selectCart(HttpSession session){
		   String memberId = (String)session.getAttribute("loginMemberId");
		   
		   List<CartDTO> cartList =  myPageService.selectCart(memberId);
		   
		   int total=0;
		   for(CartDTO dto:cartList){
			   total += dto.getCartPrice();
		   }
		   
		   ModelAndView mv = new ModelAndView("shoppingBasket/shoppingBasket", "cartList", cartList);
		   mv.addObject("total", total);
		   
		   return mv;
	   }
	   
	   /**
	    * ��ٱ��� ����
	    */
	   public int deleteCart(int boardNo){
		   
		   return myPageService.deleteCart(boardNo);
	   }
}
