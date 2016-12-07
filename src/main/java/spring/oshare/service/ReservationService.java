package spring.oshare.service;

import java.util.List;

import spring.oshare.dto.ReservationDTO;

public interface ReservationService {

	/**
	 * 예약 신청
	 * */
	int insertReservation(ReservationDTO reservation);
	
	/**
	 * 예약 상황 업데이트
	 * */
	int updateReservation(ReservationDTO reservation);
	
	/**
	 * 예약 취소
	 * */
	int deleteReservation(int reservationNo);
	
	/**
	 * 게시글에 해당하는 예약 날짜 조회
	 * */
	List<ReservationDTO> selectReservationByBoardNo(int boardNo);
	
	
}
