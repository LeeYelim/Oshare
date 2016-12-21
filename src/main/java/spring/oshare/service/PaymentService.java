package spring.oshare.service;

import spring.oshare.dto.ExtraChargeDTO;
import spring.oshare.dto.SharingDTO;

public interface PaymentService {

	/**
	 * �߰� �ݾ� ����
	 * */
	int insertExtraCharge(ExtraChargeDTO dto);
	
	/**
	 * �߰��� ���� ��ȸ
	 * */
	SharingDTO selectExtraChargeInfo(int sharingNo);
}
