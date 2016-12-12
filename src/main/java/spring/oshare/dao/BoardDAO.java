package spring.oshare.dao;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.CommentDTO;
import spring.oshare.dto.ReviewDTO;

public interface BoardDAO {
	
	/**
	 * ��ǰ ���
	 * */
	void insertBoard(BoardDTO board);
	
	/**
	 * ��ǰ ��� ��, viewdetail�� ��ȯ�ϱ� ���� sequence no ��ȯ
	 */
	int selectBoardSeqNo();
	
	/**
	 * ��ǰ ����
	 * */
	int updateBoard(BoardDTO board);
	
	/**
	 * ��ǰ ����
	 * */
	int deleteBoard(int boardNo);
	
	/**
	 * ��ǰ ��ü ��ȸ(��� or ��Ż�� ����)
	 * */
	void selectAll(String boardType);
	
	/**
	 * ī�װ� �� ��ȸ
	 * */
	void selectByCategory(String boardType, String category);
	
	/**
	 * ��ǰ �� �˻�(ī�װ�, ��ǰ��, ����, ������, ������) 
	 * */
	void selectByDetailInfo(String category, String productName, String loc, String startDate, String endDate);
	
	/**
	 * ��ǰ �� ����(�Խù� ��ȣ�� ��ȸ)
	 * */
	void detailBoard(String boardNo);
	
	/**
	 * ��� �߰�
	 * */
	int insertComment(CommentDTO comment);
	
	/**
	 * ��� ����
	 * */
	int deleteComment(int commentNo);
	
	/**
	 * ��� ����
	 * */
	int updateComment(CommentDTO comment);
	
	/**
	 * �Խù��� �ش��ϴ� ��� ��ȸ
	 * */
	void selectAllComments(String boardNo);
	
	/**
	 * �ı� �߰�
	 * */
	int insertReview(ReviewDTO review);
	
	/**
	 * �ı� ����
	 * */
	int updateReview(ReviewDTO review);
	
	/**
	 * �ı� ����
	 * */
	int deleteReview(int reviewNo);
	
	/**
	 * �Խù��� �ش��ϴ� �ı� ��ȸ
	 * */
	void selectAllReviews(String boardNo);
	
	/**
	 * ���ø���Ʈ �߰�
	 * */
	int insertWishList(String boardNo, String userId);
	
	/**
	 * ��ٱ��� �߰�
	 * */
	int insertCart(String boardNo, String userId);
}
