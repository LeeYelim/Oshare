package spring.oshare.dto;

public class CartDTO {
	
	private int cartNo;
	private int boardNo;
	private String memberId;
	
	public CartDTO() {	}
	public CartDTO(int cartNo, int boardNo, String memberId) {
		super();
		this.cartNo = cartNo;
		this.boardNo = boardNo;
		this.memberId = memberId;
	}
	
	public int getCartNo() {
		return cartNo;
	}
	public void setCartNo(int cartNo) {
		this.cartNo = cartNo;
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
	
}
