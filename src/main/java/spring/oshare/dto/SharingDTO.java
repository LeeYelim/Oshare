package spring.oshare.dto;

public class SharingDTO {

	private String sharingNo; // 대여 번호
	private String sharingStart; // 대여 시작일
	private String sharingEnd; // 대여 종료일
	private String transactionState; // 거래 상태
	private int totalPrice; // 총 비용
	private int productCount; // 제품 수량
	private int boardNo; // 게시물 번호
	private String sellerId; // 판매자 id
	private String buyerId; // 대여자 id
	
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
