package spring.oshare.dto;

public class CommentDTO {

	private int commentNo; // ��۹�ȣ
	private String memberId; // ȸ�� ���̵�
	private int boardNo; // �Խù� ��ȣ
	private String regDate; // ��� �����
	private String contents; // ��� ����
	private int parentCommentNo; // �θ� ��۹�ȣ
	private String subject; // ��� ����
	private String memberPId; // �θ���̵�
	
	public CommentDTO() {	}
	
	public CommentDTO(int commentNo, String memberId, int boardNo, String regDate, String contents, int parentCommentNo,
			String subject, String memberPId) {
		super();
		this.commentNo = commentNo;
		this.memberId = memberId;
		this.boardNo = boardNo;
		this.regDate = regDate;
		this.contents = contents;
		this.parentCommentNo = parentCommentNo;
		this.subject = subject;
		this.memberPId = memberPId;
	}

	public int getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getParentCommentNo() {
		return parentCommentNo;
	}
	public void setParentCommentNo(int parentCommentNo) {
		this.parentCommentNo = parentCommentNo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMemberPId() {
		return memberPId;
	}

	public void setMemberPId(String memberPId) {
		this.memberPId = memberPId;
	}

	
}
