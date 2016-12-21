package spring.oshare.service;

import java.util.List;
import java.util.Map;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.CartDTO;
import spring.oshare.dto.CommentDTO;
import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.ReviewDTO;

public interface BoardService {
	
	/**
	 * ��ǰ ���
	 * */
	int insertBoard(BoardDTO board);

	/**
	 * ��ǰ ����
	 * */
	int updateBoard(BoardDTO board);
	
	/**
	 * ��ǰ ����
	 * */
	int deleteBoard(int boardNo);
	
	/**
	 * ��ǰ ��ü ��ȸ(��� or ��Ż)
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
	 * boolean flag : true = ��ȸ�� ����
	 * 				  false = ��ȸ�� �״��
	 * */
	BoardDTO selectByBoardNo(int boardNo, boolean flag);

	/**
	 *  ����Ʈ
	 */
	List<BoardDTO> pageList(Map<String, Object> map);
	
	/**
	 *  �Խñ� ����
	 */
	int getBoardCount(Map<String, Object> map);
	
	/**
	 * ��ǰ �� ����(�Խù� ��ȣ�� ��ȸ)
	 * */
	BoardDTO detailBoard(int boardNo);
	
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
	 * �������
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
	List<ReviewDTO> selectAllReview(int boardNo);
	
	/**
	 *  sharing, rental ���� 8�� �׸� �ҷ�����
	 *  (�������)
	 */
	List<BoardDTO> selectTopList(String boardType);	
	
	/**
	 * ��ٱ��� �߰�
	 */
	int insertCart(CartDTO cartDTO);
	
	/**
	 *  �󼼺��� ���� 
	 * */
	GradeDTO boardDetailSaleGrade(String sellerId);
}
