package spring.oshare.dto;

public class SharingDTO {

	private String sharingNo; // �뿩 ��ȣ
	private String sharingStart; // �뿩 ������
	private String sharingEnd; // �뿩 ������
	private String transactionState; // �ŷ� ����
	private int totalPrice; // �� ���
	private int productCount; // ��ǰ ����
	private int boardNo; // �Խù� ��ȣ
	private String sellerId; // �Ǹ��� id
	private String buyerId; // �뿩�� id
	
	public SharingDTO() { 	}
	public SharingDTO(String sharingNo, String sharingStart, String sharingEnd, String transactionState, int totalPrice,
			int productCount, int boardNo, String sellerId, String buyerId) {
		super();
		this.sharingNo = sharingNo;
		this.sharingStart = sharingStart;
		this.sharingEnd = sharingEnd;
		this.transactionState = transactionState;
		this.totalPrice = totalPrice;
		this.productCount = productCount;
		this.boardNo = boardNo;
		this.sellerId = sellerId;
		this.buyerId = buyerId;
	}


	public String getSharingNo() {
		return sharingNo;
	}
	public void setSharingNo(String sharingNo) {
		this.sharingNo = sharingNo;
	}
	public String getSharingStart() {
		return sharingStart;
	}
	public void setSharingStart(String sharingStart) {
		this.sharingStart = sharingStart;
	}
	public String getSharingEnd() {
		return sharingEnd;
	}
	public void setSharingEnd(String sharingEnd) {
		this.sharingEnd = sharingEnd;
	}
	public String getTransactionState() {
		return transactionState;
	}
	public void setTransactionState(String transactionState) {
		this.transactionState = transactionState;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getProductCount() {
		return productCount;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
}