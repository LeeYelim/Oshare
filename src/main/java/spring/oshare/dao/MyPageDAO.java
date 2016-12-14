package spring.oshare.dao;

import java.util.List;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.LocationDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.MessageDTO;
import spring.oshare.dto.SharingDTO;

public interface MyPageDAO {

	/**
	 * 빌려준 물품 목록
	 */
	public List<BoardDTO> salesItemList(String memberId);
	
	/**
	 * 대여한 물품 목록
	 * */
	public List<BoardDTO> rentalItemList(String memberId);
	
	/**
	 * 판매자 평가
	 * */
	int insertGrade(GradeDTO dto);
	
	/**
	 * 평가 내역 조회
	 * */
	void selectGrade(String userId);
	
	/**
	 * 배송지 조회
	 * */
	void selectAllDeliveryLocation();
	
	/**
	 * 배송지 추가
	 * */
	int insertDeliveryLocation(LocationDTO location);
	
	/**
	 * 쪽지 보내기
	 * */
	int insertMessage(MessageDTO message);
	
	/**
	 * 쪽지 삭제
	 * */
	int deleteMessage(String[] messageNo);
	
	/**
	 * 송신자 쪽지 조회
	 * */
	List<MessageDTO> selectSenderMessage(String sender);
	
	/**
	 * 수신자 쪽지 조회
	 * */
	List<MessageDTO> selectReceiverMessage(String receiver);
	
}
