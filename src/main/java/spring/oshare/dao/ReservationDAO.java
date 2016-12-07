package spring.oshare.dao;

import java.util.List;

import spring.oshare.dto.ReservationDTO;
import spring.oshare.dto.SharingDTO;

public interface ReservationDAO {
	
	/**
	 * ���� ��û
	 * */
	int insertReservation(ReservationDTO reservation);
	
	/**
	 * <�� �����ʿ�!!> �뿩 ��Ȳ ������Ʈ(�ݳ� ��û��, �뿩 �ϼ� ����, ��ü)
	 * */
	int updateReservation(SharingDTO sharing);
	
	/**
	 * ���� ���
	 * */
	int deleteReservation(int reservationNo);
	
	/**
	 * �뿩/�Ǹ� ��ǰ ��� ��ȸ
	 * */
	void selectAllSharing(String userId, String boardType);
	
	/**
	 * �Խñۿ� �ش��ϴ� ���� ��¥ ��ȸ
	 * */
	List<ReservationDTO> selectReservationByBoardNo(int boardNo);
	

}
