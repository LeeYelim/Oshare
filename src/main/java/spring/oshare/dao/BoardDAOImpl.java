package spring.oshare.dao;

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
		// TODO Auto-generated method stub
		return 0;
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
	public void detailBoard(String boardNo) {
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
