package spring.oshare.dto;


import org.springframework.web.multipart.MultipartFile;
import java.util.List;

public class BoardDTO {
	private int boardNo; // 게시물 번호
	private String productName; // 물품명
	private String category; // 카테고리
	private int price; // 1일당 대여가격
	private String condition; // 물품 상태
	private String boardType; // 게시물 유형(쉐어링 or 렌탈)
	private String dealingType; // 거래 종류(택배 or 직거래)
	private String detail; // 상품 상세
	private String regDate; // 글 등록 날짜
	private int viewCount; // 조회수
	private List<SharingDTO> sharing;	
	
	private MultipartFile file; // 썸네일 대표 이미지
	private String filePath;
	
	// Default Constructor
	public BoardDTO() {}
	// Constructor for inserting Product
	public BoardDTO(String productName, String category, int price, String condition, String boardType, String detail, String filePath) {
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.condition = condition;
		this.boardType = boardType;
		this.detail = detail;
		this.filePath = filePath;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
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
	public List<SharingDTO> getSharing() {
		return sharing;
	}
	public void setSharing(List<SharingDTO> sharing) {
		this.sharing = sharing;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	@Override
	public String toString() {
		return "BoardDTO [boardNo=" + boardNo + ", productName=" + productName + ", category=" + category + ", price="
				+ price + ", condition=" + condition + ", boardType=" + boardType + ", dealingType=" + dealingType
				+ ", detail=" + detail + ", regDate=" + regDate + ", viewCount=" + viewCount + ", file=" + file
				+ ", filePath=" + filePath + "]";
	}

}
