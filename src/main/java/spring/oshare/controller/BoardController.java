package spring.oshare.controller;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
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
import spring.oshare.dto.CartDTO;
import spring.oshare.dto.CommentDTO;
import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.ReviewDTO;
import spring.oshare.service.BoardService;
import spring.oshare.service.MyPageService;
import spring.oshare.util.PagingUtil;

/**
 * BoardController - rental board - sharing board
 */
@Controller
@RequestMapping("board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@Autowired
	private MyPageService myPageService;

	// ������ �ϳ��� �Խñ� �� 
	private int pageSize = 12;
	// pagination block count
	private int blockCount = 3;

	/**
	 * Sharing �Խ��� �̵�
	 */
	@RequestMapping("goodsList")
	public ModelAndView goodsListForm(@RequestParam(value = "pageNum", defaultValue = "1") int currentPage,
			@RequestParam(value = "keyField", defaultValue = "") String keyField,
			@RequestParam(value = "keyWord", defaultValue = "") String keyWord,
			@RequestParam(value = "searchBar",defaultValue = "") String searchBar,
			HttpServletRequest request) {
		int count=0;
		String pagingHtml = "";
		String path = request.getSession().getServletContext().getContextPath() + "/board/goodsList";
		List<BoardDTO> list = null;
		
		System.out.println("@@@@@@@@@@@@"+searchBar);
		if(searchBar.equals("")){

			HashMap<String, Object> map = new HashMap<String, Object>();
			//map.put("keyField", keyField);
			//map.put("keyWord", keyWord);
	
			// �� ���� ���� �Ǵ� �˻��� ���� ����
			count = boardService.getBoardCount(map);
	
			
			// ����¡ ó��
			//PagingUtil page = new PagingUtil(keyField, keyWord, currentPage, count, pageSize, blockCount, "board/goodsList");
			PagingUtil page = new PagingUtil(null, null, currentPage, count, pageSize, blockCount, path);
	
			pagingHtml = page.getPagingHtml().toString();
	
			map.put("start", page.getStartCount()-1);
			map.put("end", page.getEndCount());
	
			if (count > 0) {
				list = boardService.pageList(map);
			} else {
				list = Collections.emptyList();
			}
		}else{
			
			System.out.println("@@@@@@@@@@@@"+searchBar);
			HashMap<String, Object> map = new HashMap<String, Object>();
			//map.put("keyField", keyField);
			
			map.put("keyWord", searchBar);
	

			count = boardService.getBoardSearchCount(map);
			// ����¡ ó��
			//PagingUtil page = new PagingUtil(keyField, keyWord, currentPage, count, pageSize, blockCount, "board/goodsList");
			PagingUtil page = new PagingUtil(null, searchBar, currentPage, count, pageSize, blockCount, path);
	
			pagingHtml = page.getPagingHtml().toString();
	/*
			map.put("start", page.getStartCount()-1);
			map.put("end", page.getEndCount());*/
	
			if (count > 0) {
				list = boardService.searchBoard(searchBar);
			} else {
				list = Collections.emptyList();
			}
		}
		// �� ��Ͽ� ǥ���� ����
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
	 * ��ǰ �� �Խ��� �̵� �Խñ� ��ȣ boardNo�� �´� ��������
	 */
	@RequestMapping("goodsDetail")
	public ModelAndView goodsDetailFrom(int boardNo, HttpSession session) {
		BoardDTO boardDTO = boardService.selectByBoardNo(boardNo, true);
		GradeDTO gradeDTO = boardService.boardDetailSaleGrade(boardDTO.getMemberId());
		ModelAndView mv = new ModelAndView();
		mv.addObject("boardDTO", boardDTO);
		mv.addObject("gradeDTO",gradeDTO);
		mv.setViewName("detail/goodsDetail");

		return mv;
	}
	
	/**
	 * ������ ��ǰ�ı�
	 * */
	@RequestMapping("boardSaleReview")
	@ResponseBody
	public List<GradeDTO> boardDetailSaleReview(int boardNo){
		List<GradeDTO> list  =boardService.boardDetailSaleReview(boardNo);
		System.out.println("gradeDTO LIST : "+ list);
		return list;
	}
	
	/**
	 * ������ �Ǹ���ǰ 
	 * */
	@RequestMapping("boardSaleList")
	@ResponseBody
	public List<BoardDTO> boardDetailSaleList(String memberId){
		return boardService.boardDetailSaleList(memberId);
	}
	
	/**
	 * ��� â
	 * 
	 * ��� ��ü ����Ʈ
	 */
	@RequestMapping("select")
	@ResponseBody
	public List<CommentDTO> selectAllComments(int boardNo){
		List<CommentDTO> list = boardService.selectAllComments(boardNo);
		
		return list;
	}
	
	/**
	 * ����߰�
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
	 * ��ۻ���
	 */
	@RequestMapping("delete")
	@ResponseBody
	public int delete(CommentDTO commentDTO){
		return boardService.deleteComment(commentDTO);
	}
	
	/**
	 * ��ǰ�ı� ��ü����Ʈ
	 */
	@RequestMapping("rselect")
	@ResponseBody
	public List<ReviewDTO> reviewAllSelect(int boardNo){
		List<ReviewDTO> list = boardService.selectAllReview(boardNo);
		return list;
	}
	
	/**
	 * ��ǰ�ı� �߰�
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
	 * ��ǰ�ı� ����
	 */
	@RequestMapping("rdelete")
	@ResponseBody
	public int reviewDelete(ReviewDTO reviewDTO){
		
		return boardService.deleteReview(reviewDTO);
	}
	
	/** 
	 * ��ٱ��� �߰�
	 */
	@RequestMapping("cartinsert")
	public String insertCart(HttpSession session, CartDTO cartDTO) throws Exception{
		
		String mId = (String)session.getAttribute("loginMemberId");
		cartDTO.setMemberId(mId);
		
		long diffDays=0;
		
			try{
				
		        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		        Date beginDate = formatter.parse(cartDTO.getCartStart());
		        Date endDate = formatter.parse(cartDTO.getCartEnd());
		         
		        // �ð����̸� �ð�,��,�ʸ� ���� ������ ������ �Ϸ� ������ ����
		        long diff = endDate.getTime() - beginDate.getTime();
		        diffDays = diff / (24 * 60 * 60 * 1000) + 1;
		        
			}catch (Exception e) {
				 e.printStackTrace();
				 
			}
		
		cartDTO.setCartPrice((int)diffDays*cartDTO.getCartPrice());
		
		System.out.println(cartDTO.getCartPrice());
		
		int result = boardService.insertCart(cartDTO);
		
		if(result == 0){
			
			return "error/errorMessage";
			
		}else{
			
		 return "redirect:/mypage/cartList";
		}
	}

	/**
	 * ��ǰ�˻�
	 */
	@RequestMapping("searchBoard")
	@ResponseBody
	public List<BoardDTO> searchBoard(String productName){
		
		return boardService.searchBoard(productName);
	}
}
