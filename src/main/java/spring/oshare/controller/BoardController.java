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
import org.springframework.web.servlet.ModelAndView;

import spring.oshare.dto.BoardDTO;
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
}
