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
	
	/*
	 * 댓글생성
	 * if : 첫번째글
	 * else : 이후 댓글
	 */
	@Override
	public int insertComment(CommentDTO comment) {
		if(comment.getParentCommentNo()==0){
			return sqlSession.insert("CommentMapper.pinsert", comment);
		}else{
			return sqlSession.insert("CommentMapper.insert", comment);
		}
	}
	
	/*
	 * 댓글삭제
	 */
	@Override
	public int deleteComment(CommentDTO commentDTO) {
		
		return sqlSession.delete("CommentMapper.delete", commentDTO);
	}
	
	/*
	 * 전체 댓글리스트
	 */
	@Override
	public List<CommentDTO> selectAllComments(int boardNo) {
		List<CommentDTO> list = sqlSession.selectList("CommentMapper.selectAll", boardNo);
		return list ;
	}

	/*
	 * 후기 생성
	 * if : 첫번째 글
	 * else : 이후 후기
	 */
	@Override
	public int insertReview(ReviewDTO review) {
		if(review.getParentNo()==0){
			return sqlSession.delete("ReviewMapper.reviewPinsert", review);
		}else{
			return sqlSession.delete("ReviewMapper.reviewinsert", review);
		}
	}

	/*
	 * 후기삭제
	 */
	@Override
	public int deleteReview(ReviewDTO reviewDTO) {
		
		return sqlSession.delete("ReviewMapper.reviewdelete", reviewDTO);
	}
	
	/*
	 * 후기 전체리스트
	 */
	@Override
	public List<ReviewDTO> selectAllReviews(int boardNo) {
		List<ReviewDTO> list = sqlSession.selectList("ReviewMapper.reviewSelectAll", boardNo);
		return list;
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

	@Override
	public List<BoardDTO> boardDetailSaleReview(int boardNo) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("boardMapper.boardDetailSaleReview",boardNo);
	}


}
