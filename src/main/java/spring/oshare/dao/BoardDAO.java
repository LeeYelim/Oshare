package spring.oshare.dao;

import java.util.List;
import java.util.Map;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.CartDTO;
import spring.oshare.dto.CommentDTO;
import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.ReviewDTO;

public interface BoardDAO {
	
	/**
	 * ��ǰ ���
	 * */
	int insertBoard(BoardDTO board);
	
	/**
	 * ��ǰ ��� ��, viewdetail�� ��ȯ�ϱ� ���� sequence no ��ȯ
	 */
	int selectBoardSeqNo();
	
	/**
	 *  ��ȸ�� ����
	 */
	void updateViewCount(int boardNo);
	
	/**
	 * ��ǰ �� ����(�Խù� ��ȣ�� ��ȸ)
	 * */
	BoardDTO selectByBoardNo(int boardNo);
	
	/**
	 * Sharing ����Ʈ
	 */
	List<BoardDTO> pageList(Map<String, Object> map , String productCategory);
	
	/**
	 * Rental ����Ʈ
	 * */
	public List<BoardDTO> pageRentalList(Map<String, Object> map , String productCategory);
	
	/**
	 *  �Խñ� ����
	 */
	int getBoardCount(Map<String, Object> map ,String boardType , String productCategory);
	
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
	BoardDTO detailBoard(int boardNo);
	
	/**
	 * ���ø���Ʈ �߰�
	 * */
	int insertWishList(String boardNo, String userId);
	
	/**
	 * ��ٱ��� �߰�
	 * */
	int insertCart(CartDTO cartDTO);
	
	/**
	 * ������ ��ǰ�ı� select
	 * */
	List<GradeDTO> boardDetailSaleReview (int boardNo);
	
	/**
	 * ������ �Ǹ���ǰ select
	 * */
	List<BoardDTO> boardDetailSaleList(String memberId);

	/**
	 * ����߰�
	 */
	int insertComment(CommentDTO comment);

	/**
	 * ��ۻ���
	 */
	int deleteComment(CommentDTO commentDTO);

	/**
	 * ��۸���Ʈ
	 */
	List<CommentDTO> selectAllComments(int boardNo);

	/**
	 * �ı��߰�
	 */
	int insertReview(ReviewDTO review);

	/**
	 * �ı����
	 */
	int deleteReview(ReviewDTO reviewDTO);

	/**
	 * �ı⸮��Ʈ
	 */
	List<ReviewDTO> selectAllReviews(int boardNo);
	
	/**
	 *  sharing, rental ���� 8�� �׸� �ҷ�����
	 *  (�������)
	 */
	List<BoardDTO> selectTopList(String boardType);	
	
	
	/**
	 *  �󼼺��� ���� 
	 * */
	GradeDTO boardDetailSaleGrade(String sellerId);
	
	/**
	 * ��ǰ�˻�
	 */
	List<BoardDTO> searchBoard(String productName);
	
	/**
	 *  �˻� �Խñ� ����
	 */
	int getBoardSearchCount(Map<String, Object> map );
	
	

	

}
