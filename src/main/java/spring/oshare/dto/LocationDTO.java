package spring.oshare.dto;

public class LocationDTO {

	private String memberId; // ȸ�� ���̵�
	private String deliveryName; // �������
	private String deliveryLocation; // ��� ��ġ
	
	
	public LocationDTO() { 	}
	public LocationDTO(String memberId, String deliveryName, String deliveryLocation) {
		super();
		this.memberId = memberId;
		this.deliveryName = deliveryName;
		this.deliveryLocation = deliveryLocation;
	}
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getDeliveryName() {
		return deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}
	public String getDeliveryLocation() {
		return deliveryLocation;
	}
	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}
	
	
}
