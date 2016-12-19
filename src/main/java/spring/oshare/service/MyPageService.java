package spring.oshare.service;

import java.util.List;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.MessageDTO;

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
	
	
	/**
	 * 쪽지 보내기
	 * */
	int insertMessage(MessageDTO message);
	
	/**
	 * 쪽지 보관함
	 * */
	List<MessageDTO> selectMessage(String posts , String division);
	
	/**
	 * 쪽지 삭제
	 * */
	int deleteMessage(String[] messageNo);
	
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
