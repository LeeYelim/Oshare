package spring.oshare.dto;

public class GradeDTO {

	private int gradeNo;
	private String memberId; // ���� ����� ���̵�
	private String regDate; // ��¥    
	private int memberPoint; // �ο��� ����
	private String memberReview; // �� ����
	private  String boardNo; //�Խù� ��ȣ
	
	public GradeDTO() {}
	public GradeDTO(int gradeNo, String memberId, int memberPoint, String memberReview) {
		super();
		this.gradeNo = gradeNo;
		this.memberId = memberId;
		this.memberPoint = memberPoint;
		this.memberReview = memberReview;
	}
	
	public int getGradeNo() {
		return gradeNo;
	}
	public void setGradeNo(int gradeNo) {
		this.gradeNo = gradeNo;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getMemberPoint() {
		return memberPoint;
	}
	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}
	public String getMemberReview() {
		return memberReview;
	}
	public void setMemberReview(String memberReview) {
		this.memberReview = memberReview;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(String boardNo) {
		this.boardNo = boardNo;
	}
	
	
}
