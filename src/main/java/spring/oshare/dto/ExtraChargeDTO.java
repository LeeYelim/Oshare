package spring.oshare.dto;

import java.util.Date;

public class ExtraChargeDTO {

	private int chargeNo; // �߰� �ݾ� ��ȣ
	private int charge; // �߰� �ݾ�
	private String chargeReason; // �߰� �ݾ� ����
	private Date regDate; // �߰� �ݾ� û�� ��¥
	
	public int getChargeNo() {
		return chargeNo;
	}
	public void setChargeNo(int chargeNo) {
		this.chargeNo = chargeNo;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	public String getChargeReason() {
		return chargeReason;
	}
	public void setChargeReason(String chargeReason) {
		this.chargeReason = chargeReason;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
}
