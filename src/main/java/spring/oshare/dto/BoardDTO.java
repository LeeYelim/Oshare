package spring.oshare.dto;

public class BoardDTO {
	private int boardNo; // 게시물 번호
	private String productName; // 물품명
	private String category; // 카테고리
	private String price; // 1일당 대여가격
	private String condition; // 물품 상태
	private String boardType; // 게시물 유형(쉐어링 or 렌탈)
	private String dealingType; // 거래 종류(택배 or 직거래)
	private String detail; // 상품 상세
	private String regDate; // 글 등록 날짜
	private int viewCount; // 조회수
	
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
