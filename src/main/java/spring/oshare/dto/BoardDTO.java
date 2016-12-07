package spring.oshare.dto;

public class BoardDTO {
	private int boardNo; // �Խù� ��ȣ
	private String productName; // ��ǰ��
	private String category; // ī�װ�
	private String price; // 1�ϴ� �뿩����
	private String condition; // ��ǰ ����
	private String boardType; // �Խù� ����(��� or ��Ż)
	private String dealingType; // �ŷ� ����(�ù� or ���ŷ�)
	private String detail; // ��ǰ ��
	private String regDate; // �� ��� ��¥
	private int viewCount; // ��ȸ��
	
	public BoardDTO() {}
	public BoardDTO(int boardNo, String productName, String category, String price, String condition, String boardType,
			String dealingType, String detail, String regDate, int viewCount) {
		super();
		this.boardNo = boardNo;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.condition = condition;
		this.boardType = boardType;
		this.dealingType = dealingType;
		this.detail = detail;
		this.regDate = regDate;
		this.viewCount = viewCount;
	}


	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getBoardType() {
		return boardType;
	}
	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}
	public String getDealingType() {
		return dealingType;
	}
	public void setDealingType(String dealingType) {
		this.dealingType = dealingType;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	
}
