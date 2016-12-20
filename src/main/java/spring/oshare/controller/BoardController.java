package spring.oshare.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.CommentDTO;
import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.ReviewDTO;
import spring.oshare.service.BoardService;
import spring.oshare.util.PagingUtil;

/**
 * BoardController - rental board - sharing board
 */
@Controller
@RequestMapping("board")
public class BoardController {

	@Autowired
	private BoardService boardService;

	// 페이지 하나당 게시글 수 
	private int pageSize = 12;
	// pagination block count
	private int blockCount = 3;

	/**
	 * Sharing 게시판 이동
	 */
	@RequestMapping("goodsList")
	public ModelAndView goodsListForm(@RequestParam(value = "pageNum", defaultValue = "1") int currentPage,
			@RequestParam(value = "keyField", defaultValue = "") String keyField,
			@RequestParam(value = "keyWord", defaultValue = "") String keyWord,
			HttpServletRequest request) {

		String pagingHtml = "";

		HashMap<String, Object> map = new HashMap<String, Object>();
		//map.put("keyField", keyField);
		//map.put("keyWord", keyWord);

		// 총 글의 개수 또는 검색된 글의 개수
		int count = boardService.getBoardCount(map);

		String path = request.getSession().getServletContext().getContextPath() + "/board/goodsList";
		
		// 페이징 처리
		//PagingUtil page = new PagingUtil(keyField, keyWord, currentPage, count, pageSize, blockCount, "board/goodsList");
		PagingUtil page = new PagingUtil(null, null, currentPage, count, pageSize, blockCount, path);

		pagingHtml = page.getPagingHtml().toString();

		map.put("start", page.getStartCount()-1);
		map.put("end", page.getEndCount());

		List<BoardDTO> list = null;
		if (count > 0) {
			list = boardService.pageList(map);
		} else {
			list = Collections.emptyList();
		}

		// 글 목록에 표시할 연번
		int number = count - (currentPage - 1) * pageSize;

		ModelAndView mav = new ModelAndView();
		mav.setViewName("list/goodsList");
		mav.addObject("count", count);
		mav.addObject("list", list);
		mav.addObject("pagingHtml", pagingHtml);
		mav.addObject("currentPage",currentPage);
		mav.addObject("number", number);

		return mav;
	}

	/**
	 * 제품 상세 게시판 이동 게시글 번호 boardNo에 맞는 상세페이지
	 */
	@RequestMapping("goodsDetail")
	public ModelAndView goodsDetailFrom(int boardNo, HttpSession session) {
		BoardDTO boardDTO = boardService.selectByBoardNo(boardNo, true);

		ModelAndView mv = new ModelAndView();
		mv.addObject("boardDTO", boardDTO);
		mv.setViewName("detail/goodsDetail");

		return mv;
	}
	
	/**
	 * 프로필 상품후기
	 * */
	@RequestMapping("boardSaleReview")
	@ResponseBody
	public List<GradeDTO> boardDetailSaleReview(int boardNo){
		List<GradeDTO> list  =boardService.boardDetailSaleReview(boardNo);
		System.out.println("gradeDTO LIST : "+ list);
		return list;
	}
	
	/**
	 * 프로필 판매제품 
	 * */
	@RequestMapping("boardSaleList")
	@ResponseBody
	public List<BoardDTO> boardDetailSaleList(String memberId){
		return boardService.boardDetailSaleList(memberId);
	}
	
	/**
	 * 댓글 창
	 * 
	 * 댓글 전체 리스트
	 */
	@RequestMapping("select")
	@ResponseBody
	public List<CommentDTO> selectAllComments(int boardNo){
		List<CommentDTO> list = boardService.selectAllComments(boardNo);
		
		return list;
	}
	
	/**
	 * 댓글추가
	 */
	@RequestMapping("insert")
	@ResponseBody
	public int insert(HttpSession session, HttpServletRequest request, String subject, int boardNo, String contents, String parentCommentNo){
		CommentDTO dto = new CommentDTO();
		String mId = (String)session.getAttribute("loginMemberId");
		
		dto.setMemberId(mId);
		dto.setBoardNo(boardNo);
		dto.setContents(contents);
		if(subject != null) dto.setSubject(subject);
		
		if(parentCommentNo!=null) dto.setParentCommentNo(Integer.parseInt(parentCommentNo));
		
		int re = boardService.insertComment(dto);
		return re;
	}
	
	/**
	 * 댓글삭제
	 */
	@RequestMapping("delete")
	@ResponseBody
	public int delete(CommentDTO commentDTO){
		return boardService.deleteComment(commentDTO);
	}
	
	/**
	 * 상품후기 전체리스트
	 */
	@RequestMapping("rselect")
	@ResponseBody
	public List<ReviewDTO> reviewAllSelect(int boardNo){
		List<ReviewDTO> list = boardService.selectAllReview(boardNo);
		return list;
	}
	
	/**
	 * 상품후기 추가
	 */
	@RequestMapping("rinsert")
	@ResponseBody
	public int reviewInsert(HttpSession session, HttpServletRequest request, String subject, int boardNo, String contents, String parentNo){
		ReviewDTO dto = new ReviewDTO();
		String mId = (String)session.getAttribute("loginMemberId");
		
		dto.setMemberId(mId);
		dto.setBoardNo(boardNo);
		dto.setContents(contents);
		if(subject!=null) dto.setSubject(subject);
		if(parentNo!=null) dto.setParentNo(Integer.parseInt(parentNo));
		
		int re = boardService.insertReview(dto);
		
		return re;
		
	}
	
	/**
	 * 상품후기 삭제
	 */
	@RequestMapping("rdelete")
	@ResponseBody
	public int reviewDelete(ReviewDTO reviewDTO){
		
		return boardService.deleteReview(reviewDTO);
	}
}
