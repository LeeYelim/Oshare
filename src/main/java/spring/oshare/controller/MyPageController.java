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
 *  마이페이지
 *  - 위시리스트
 *  - 대여중인목록
 *  - 판매중인목록
 *  - 쪽지함
 *  - 결제관리
 *  - 회원정보수정
 */
@Controller
@RequestMapping("mypage")
public class MyPageController {
	
	@Autowired
	private MyPageService myPageService;
	
	/**
	 *  위시리스트 이동
	 */
	@RequestMapping("wishList")
	public String myPageWishListForm(){
		return "mypage/wishlist/wishList";
	}
	
	/**
	 * 빌려준 물품 목록
	 */
	//@RequestMapping("salesItem")
	/*public String salesItem(){
		return "mypage/salesItem/saleItemList";
	}*/
	
	@RequestMapping("salesItem")
	public ModelAndView salesItem(HttpSession session){
		// 회원 ID가져오기
		String memberId = (String)session.getAttribute("loginMemberId");
		
		// ID에 해당하는 판매(빌려준) 목록 조회
		List<BoardDTO> saleslist = myPageService.salesItemList(memberId);
		/*for(BoardDTO board : saleslist) {
			List<SharingDTO> sharings = board.getSharing();
			for(SharingDTO sharing : sharings) {
				MemberDTO member = sharing.getMember();
				System.out.println("게시물 번호 : " + board.getBoardNo() + ", 제품명 : " + board.getProductName() 
				+ ", 쉐어링 번호 : " + sharing.getSharingNo() + ", 판매자 id : " + sharing.getSellerId() + ", 대여자 id : " + sharing.getBuyerId() + ", 대여자 폰번호 : " + member.getMemberPhone() 
				+ ", 쉐어링 시작 : " + sharing.getSharingStart() + ", 쉐어링 종료 : " + sharing.getSharingEnd() + ", 거래 상태 : " + sharing.getTransactionState());
			}
		}*/
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("saleslist", saleslist);
		mv.setViewName("mypage/salesItem/saleItemList");
		return mv;
	}
	
	/**
	 * 빌린 물품 목록
	 */
	@RequestMapping("rentalItem")
	public ModelAndView rentalItemList(HttpSession session){
		// 회원 ID가져오기
		String memberId = (String)session.getAttribute("loginMemberId");
				
		// ID에 해당하는 판매(빌려준) 목록 조회
		List<BoardDTO> rentallist = myPageService.rentalItemList(memberId);
		ModelAndView mv = new ModelAndView();
		mv.addObject("rentallist", rentallist);
		mv.setViewName("mypage/rentalItem/rentalItemList");
		return mv;
	}
	
	/**
	 * 메세지 보관함 목록
	 */
	@RequestMapping("message")
	public String messageBox(){
		return "mypage/messageBox/sendMessage";
	}
	
	/**
	 * 결제 관리 목록
	 */
	@RequestMapping("billingManagement")
	public String billingManagement() {
		return "mypage/billingManagement/billingManagement";
	}
	
	
	
}
