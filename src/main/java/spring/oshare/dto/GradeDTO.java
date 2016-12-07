package spring.oshare.dto;

public class GradeDTO {

	private int gradeNo;
	private String memberId; // 평가한 사용자 아이디
	private int memberPoint; // 부여한 점수
	private String memberReview; // 평가 내용
	
	public GradeDTO() { 	}
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
	
}
