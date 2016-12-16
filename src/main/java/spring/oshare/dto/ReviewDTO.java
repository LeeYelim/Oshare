package spring.oshare.dto;

public class ReviewDTO {
	private int reviewNo;
	private int boardNo;
	private String memberId;
	private String contents;
	private String regDate;
	
	public ReviewDTO() {	}
	public ReviewDTO(int reviewNo, int boardNo, String memberId, String contents, String regDate) {
		super();
		this.reviewNo = reviewNo;
		this.boardNo = boardNo;
		this.memberId = memberId;
		this.contents = contents;
		this.regDate = regDate;
	}
	
	public int getReviewNo() {
		return reviewNo;
	}
	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
}
