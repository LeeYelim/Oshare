package spring.oshare.dao;

import java.util.List;
import java.util.Map;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.CommentDTO;
import spring.oshare.dto.ReviewDTO;

public interface BoardDAO {
	
	/**
	 * 물품 등록
	 * */
	int insertBoard(BoardDTO board);
	
	/**
	 * 물품 등록 후, viewdetail에 반환하기 위해 sequence no 반환
	 */
	int selectBoardSeqNo();
	
	/**
	 *  조회수 증가
	 */
	void updateViewCount(int boardNo);
	
	/**
	 * 물품 상세 정보(게시물 번호로 조회)
	 * */
	BoardDTO selectByBoardNo(int boardNo);
	
	/**
	 *  리스트
	 */
	List<BoardDTO> pageList(Map<String, Object> map);
	
	/**
	 *  게시글 갯수
	 */
	int getBoardCount(Map<String, Object> map);
	
	/**
	 * 물품 수정
	 * */
	int updateBoard(BoardDTO board);
	
	/**
	 * 물품 삭제
	 * */
	int deleteBoard(int boardNo);
	
	/**
	 * 물품 전체 조회(쉐어링 or 렌탈에 따른)
	 * */
	void selectAll(String boardType);
	
	/**
	 * 카테고리 별 조회
	 * */
	void selectByCategory(String boardType, String category);
	
	/**
	 * 물품 상세 검색(카테고리, 제품명, 지역, 시작일, 종료일) 
	 * */
	void selectByDetailInfo(String category, String productName, String loc, String startDate, String endDate);
	
	/**
	 * 물품 상세 정보(게시물 번호로 조회)
	 * */
	BoardDTO detailBoard(int boardNo);
	
	/**
	 * 댓글 추가
	 * */
	int insertComment(CommentDTO comment);
	
	/**
	 * 댓글 삭제
	 * */
	int deleteComment(int commentNo);
	
	/**
	 * 댓글 수정
	 * */
	int updateComment(CommentDTO comment);
	
	/**
	 * 게시물에 해당하는 댓글 조회
	 * */
	void selectAllComments(String boardNo);
	
	/**
	 * 후기 추가
	 * */
	int insertReview(ReviewDTO review);
	
	/**
	 * 후기 수정
	 * */
	int updateReview(ReviewDTO review);
	
	/**
	 * 후기 삭제
	 * */
	int deleteReview(int reviewNo);
	
	/**
	 * 게시물에 해당하는 후기 조회
	 * */
	void selectAllReviews(String boardNo);
	
	/**
	 * 위시리스트 추가
	 * */
	int insertWishList(String boardNo, String userId);
	
	/**
	 * 장바구니 추가
	 * */
	int insertCart(String boardNo, String userId);
}
