package spring.oshare.service;

import java.util.List;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.SharingDTO;

public interface MyPageService {

	/**
	 *  위시리스트 이동
	 *//*
	public void myPageWishListForm();
	*/
	
	/**
	 * 빌려준 물품 목록
	 */
	public List<BoardDTO> salesItemList(String memberId);
	
	/**
	 * 빌린 물품 목록
	 */
	public List<BoardDTO> rentalItemList(String memeberId);
	
	/*//**
	 * 메세지 보관함 목록
	 *//*
	public void messageBox();
	
	*//**
	 * 결제 관리 목록
	 *//*
	public void billingManagement();
	*/
}
