package spring.oshare.dao;

import java.util.List;

import spring.oshare.dto.ReservationDTO;
import spring.oshare.dto.SharingDTO;

public interface ReservationDAO {
	
	/**
	 * 예약 신청
	 * */
	int insertReservation(ReservationDTO reservation);
	
	/**
	 * <꼭 수정필요!!> 대여 상황 업데이트(반납 신청시, 대여 일수 증가, 연체)
	 * */
	int updateReservation(SharingDTO sharing);
	
	/**
	 * 예약 취소
	 * */
	int deleteReservation(int reservationNo);
	
	/**
	 * 대여/판매 물품 목록 조회
	 * */
	void selectAllSharing(String userId, String boardType);
	
	/**
	 * 게시글에 해당하는 예약 날짜 조회
	 * */
	List<ReservationDTO> selectReservationByBoardNo(int boardNo);
	

}
