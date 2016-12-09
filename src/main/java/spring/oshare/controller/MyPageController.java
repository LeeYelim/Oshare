package spring.oshare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.oshare.service.MyPageService;

/**
 *  마이페이지
 *  - 위시리스트
 *  - 대여중인목록
 *  - 판매중인목록
 *  - 쪽지함
 *  - 결제관리
 *  - 회원정보수정
 *  - 장바구니
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
	@RequestMapping("salesItem")
	public String salesItem(){
		return "mypage/salesItem/saleItemList";
	}
	
	/**
	 * 빌린 물품 목록
	 */
	@RequestMapping("rentalItem")
	public String rentalItem(){
		return "mypage/rentalItem/rentalItemList";
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
	
	/**
	 * 장바구니
	 * */
	@RequestMapping("shoppingBasket")
	public String shoppingBasketForm(){
		return "shoppingBasket/shoppingBasket";
	}
	
	
}
