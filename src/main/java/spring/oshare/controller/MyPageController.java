package spring.oshare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	@RequestMapping("salesItem")
	public String salesItem(){
		return "mypage/salesItem/saleItemList";
	}
	
	/**
	 * ���� ��ǰ ���
	 */
	@RequestMapping("rentalItem")
	public String rentalItem(){
		return "mypage/rentalItem/rentalItemList";
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
	
	/**
	 * ��ٱ���
	 * */
	@RequestMapping("shoppingBasket")
	public String shoppingBasketForm(){
		return "shoppingBasket/shoppingBasket";
	}
	
	
}
