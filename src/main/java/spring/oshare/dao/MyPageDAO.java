package spring.oshare.dao;

import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.LocationDTO;
import spring.oshare.dto.MessageDTO;

public interface MyPageDAO {

	/**
	 * �Ǹ��� ��
	 * */
	int insertGrade(GradeDTO dto);
	
	/**
	 * �� ���� ��ȸ
	 * */
	void selectGrade(String userId);
	
	/**
	 * ����� ��ȸ
	 * */
	void selectAllDeliveryLocation();
	
	/**
	 * ����� �߰�
	 * */
	int insertDeliveryLocation(LocationDTO location);
	
	/**
	 * ���� ������
	 * */
	int insertMessage(MessageDTO message);
	
	/**
	 * ���� ����
	 * */
	int deleteMessage(String messageNo);
	
	/**
	 * ���� ��ȸ
	 * */
	void selectAllMessage();
	
	
}
