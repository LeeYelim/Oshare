package spring.oshare.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.CommentDTO;
import spring.oshare.dto.ReviewDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertBoard(BoardDTO board) {
		System.out.println("===="+board.toString());
		return sqlSession.insert("boardMapper.insertBoard", board);
	}

	@Override
	public int selectBoardSeqNo() {
		return sqlSession.selectOne("boardMapper.selectBoardSeqNo");
	}

	@Override
	public void updateViewCount(int boardNo) {
		sqlSession.update("boardMapper.updateViewCount", boardNo);
	}
	
	@Override
	public BoardDTO selectByBoardNo(int boardNo) {
		return sqlSession.selectOne("boardMapper.selectByBoardNo", boardNo);
	}
	
	@Override
	public List<BoardDTO> pageList(Map<String, Object> map) {
		return sqlSession.selectList("boardMapper.selectList", null, new RowBounds((Integer)map.get("start"), 12));
	}

	@Override
	public int getBoardCount(Map<String, Object> map) {
		return sqlSession.selectOne("boardMapper.selectCount");
	}
	
	@Override
	public BoardDTO detailBoard(int boardNo) {
		return sqlSession.selectOne("boardMapper.boardDetail", boardNo);
	}
	
	@Override
	public void selectAll(String boardType) {
		
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
	public void selectByCategory(String boardType, String category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectByDetailInfo(String category, String productName, String loc, String startDate, String endDate) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int insertComment(CommentDTO comment) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteComment(int commentNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateComment(CommentDTO comment) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void selectAllComments(String boardNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int insertReview(ReviewDTO review) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateReview(ReviewDTO review) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteReview(int reviewNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void selectAllReviews(String boardNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int insertWishList(String boardNo, String userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertCart(String boardNo, String userId) {
		// TODO Auto-generated method stub
		return 0;
	}


}
