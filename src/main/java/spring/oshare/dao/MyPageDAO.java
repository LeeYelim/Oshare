package spring.oshare.dao;

import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.LocationDTO;
import spring.oshare.dto.MessageDTO;

public interface MyPageDAO {

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
	int deleteMessage(String messageNo);
	
	/**
	 * 쪽지 조회
	 * */
	void selectAllMessage();
	
	
}
