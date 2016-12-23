package spring.oshare.dto;


import org.springframework.web.multipart.MultipartFile;
import java.util.List;

public class BoardDTO {
	private int boardNo; // �Խù� ��ȣ
	private String productName; // ��ǰ��
	private String memberId;	// ����� ����ID
	private String category; // ī�װ�
	private int price; // 1�ϴ� �뿩����
	private String condition; // ��ǰ ����
	private String boardType; // �Խù� ����(��� or ��Ż)
	private String dealingType; // �ŷ� ����(�ù� or ���ŷ�)
	private String detail; // ��ǰ ��
	private String regDate; // �� ��� ��¥
	private int viewCount; // ��ȸ��
	private List<SharingDTO> sharing;
	
	// board - member join 1:1 association
	private MemberDTO memberDTO;
	
	private ReviewDTO reviewDTO;
	
	private MultipartFile file; // ����� ��ǥ �̹���
	private String filePath;
	
	// Default Constructor
	public BoardDTO() {}
	// Constructor for inserting Product
	public BoardDTO(String productName, String category, String memberId, int price, String condition, String boardType, String detail, String filePath) {
		this.productName = productName;
		this.category = category;
		this.memberId = memberId;
		this.price = price;
		this.condition = condition;
		this.boardType = boardType;
		this.detail = detail;
		this.filePath = filePath;
		this.regDate = regDate;
		this.viewCount = viewCount;
	}
	

		public BoardDTO(String productName,  String memberId, int price, String condition,  String detail) {
			this.productName = productName;
			this.memberId = memberId;
			this.price = price;
			this.condition = condition;
			this.detail = detail;
			this.filePath = filePath;
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
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
	public MemberDTO getMemberDTO() {
		return memberDTO;
	}
	public void setMemberDTO(MemberDTO memberDTO) {
		this.memberDTO = memberDTO;
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
	
	public ReviewDTO getReviewDTO() {
		return reviewDTO;
	}
	public void setReviewDTO(ReviewDTO reviewDTO) {
		this.reviewDTO = reviewDTO;
	}
	@Override
	public String toString() {
		return "BoardDTO [boardNo=" + boardNo + ", productName=" + productName + ", memberId=" + memberId
				+ ", category=" + category + ", price=" + price + ", condition=" + condition + ", boardType="
				+ boardType + ", dealingType=" + dealingType + ", detail=" + detail + ", regDate=" + regDate
				+ ", viewCount=" + viewCount + ", sharing=" + sharing + ", memberDTO=" + memberDTO + ", file=" + file
				+ ", filePath=" + filePath + "]";
	}
		
	
}
