package spring.oshare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.oshare.service.BoardService;

/**
 *  BoardController
 *  - rental board
 *  - sharing board
 */
@Controller
@RequestMapping("board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	/**
	 *  Sharing 게시판 이동
	 */
	@RequestMapping("goodsList")
	public String goodsListForm(){
		return "list/goodsList";
	}
	
	/**
	 *  제품 상세 게시판 이동
	 */
	@RequestMapping("goodsDetail")
	public String goodsDetailFrom(){
		
		
		return "detail/goodsDetail";
	}
}
