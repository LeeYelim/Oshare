package spring.oshare.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.oshare.dao.BoardDAO;
import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.CommentDTO;
import spring.oshare.dto.ReviewDTO;

@Service
@Transactional
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDao;
	
	@Override
	public int insertBoard(BoardDTO board) {
		boardDao.insertBoard(board);
		return boardDao.selectBoardSeqNo();
	}

	@Override
	public int updateBoard(BoardDTO board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoard(int boardNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void selectAll(String boardType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectByCategory(String boardType, String category) {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectByDetailInfo(String category, String productName, String loc, String startDate, String endDate) {
		// TODO Auto-generated method stub

	}

	@Override
	public BoardDTO selectByBoardNo(int boardNo, boolean flag) {
		if(flag) {
			// 조회수 업데이트
			boardDao.updateViewCount(boardNo);
		} 
		return boardDao.selectByBoardNo(boardNo);
	}

	@Override
	public List<BoardDTO> pageList(Map<String, Object> map) {
		return boardDao.pageList(map);
	}

	@Override
	public int getBoardCount(Map<String, Object> map) {
		return boardDao.getBoardCount(map);
	}
	
	@Override
	public BoardDTO detailBoard(int boardNo) {
		return boardDao.detailBoard(boardNo);
	}

	@Override
	public List<BoardDTO> boardDetailSaleReview(int boardNo) {
		// TODO Auto-generated method stub
		return boardDao.boardDetailSaleReview(boardNo);
	}
	
	/**
	 * 댓글추가
	 */
	@Override
	public int insertComment(CommentDTO comment) {
		
		return boardDao.insertComment(comment);
	}

	/**
	 * 댓글삭제
	 */
	@Override
	public int deleteComment(CommentDTO commentDTO) {

		return boardDao.deleteComment(commentDTO);
	}

	/**
	 * 댓글 전체리스트
	 */
	@Override
	public List<CommentDTO> selectAllComments(int boardNo) {
		List<CommentDTO> list = boardDao.selectAllComments(boardNo);
		return list;
	}

	/**
	 * 후기추가
	 */
	@Override
	public int insertReview(ReviewDTO review) {
		return boardDao.insertReview(review);
	}

	/**
	 * 후기삭제
	 */
	@Override
	public int deleteReview(ReviewDTO reviewDTO) {
		return boardDao.deleteReview(reviewDTO);
	}

	/**
	 * 후기 전체리스트
	 */
	@Override
	public List<ReviewDTO> selectAllReview(int boardNo) {
		List<ReviewDTO> list = boardDao.selectAllReviews(boardNo);
		return list;
	}

}
