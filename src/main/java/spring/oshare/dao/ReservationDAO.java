package spring.oshare.dao;

import java.util.List;

import spring.oshare.dto.ReservationDTO;
import spring.oshare.dto.SharingDTO;

public interface ReservationDAO {
	
	/**
	 * ���� ��û
	 * */
	int insertReservation(ReservationDTO reservation, SharingDTO sharing);
	
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
	
	/**
	 * sharing ���� ����
	 * ("���� ��¥���� sharing_start�� �۰�, ���� ���°� �뿩 ����� sharing_state �뿩������ ����")
	 * */
	int updateSharingState();
	
	/**
	 * �ݳ� ��û(���� : �ݳ�, �ļ�, �н�)
	 * �ݳ� : reservation_end ���� ��¥�� & �ݳ� ��û���� ������Ʈ
	 * �ļ� : reservation_end ���� ��¥�� & �ļ� ������Ʈ
	 * �н� : reservation_end ���� ��¥�� & �н� ������Ʈ
	 * */
	int applyReturn(int sharingNo, String returnState); 
	
	 /**
	   * �Ǹ���)
	   * �Ϸ� : �ŷ� �Ϸ�� ������Ʈ
	   * 
	   * */
	int responseReturn(int sharingNo, String responseState);
	
	/**
	 * û���ϱ� ��
	 * */
	SharingDTO demandPayment(int sharingNo);
	
}
