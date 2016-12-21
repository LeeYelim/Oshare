package spring.oshare.service;

import java.util.List;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.CartDTO;
import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.MemberDTO;
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
	String insertMessage(MessageDTO message);
	
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
	/**
	 * 별점(평가) 삽입
	 * */
	int insertMemberGrade(GradeDTO dto);
	
	/**
	 * 장바구니 리스트
	 */
	List<CartDTO> selectCart(String memberId);

	/**
	 * 장바구니 삭제
	 */
	int deleteCart(int boardNo);
	
	/**
	 * 관리자 회원관리 전체회원
	 * */
	List<MemberDTO> adminAllUserSelect();
}
