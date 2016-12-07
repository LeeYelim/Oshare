package spring.oshare.service;

import java.util.List;

import spring.oshare.dto.ReservationDTO;

public interface ReservationService {

	/**
	 * ���� ��û
	 * */
	int insertReservation(ReservationDTO reservation);
	
	/**
	 * ���� ��Ȳ ������Ʈ
	 * */
	int updateReservation(ReservationDTO reservation);
	
	/**
	 * ���� ���
	 * */
	int deleteReservation(int reservationNo);
	
	/**
	 * �Խñۿ� �ش��ϴ� ���� ��¥ ��ȸ
	 * */
	List<ReservationDTO> selectReservationByBoardNo(int boardNo);
	
	
}
