package spring.oshare.dao;

import spring.oshare.dto.ExtraChargeDTO;
import spring.oshare.dto.SharingDTO;

public interface PaymentDAO {
	
	/**
	 * �߰� �ݾ� ����
	 * */
	int insertExtraCharge(ExtraChargeDTO dto);
	
	/**
	 * �߰��� ���� ��ȸ
	 * */
	SharingDTO selectExtraChargeInfo(int sharingNo);
}
