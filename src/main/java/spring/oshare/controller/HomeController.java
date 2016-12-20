package spring.oshare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import spring.oshare.dto.BoardDTO;
import spring.oshare.service.BoardService;
import spring.oshare.service.ReservationServiceImpl;

@Controller
public class HomeController {

	@Autowired
	private ReservationServiceImpl service;
	
	@Autowired
	private BoardService boardService;
	
	/**
	 * ����������
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {	
		Thread t = new Thread(service);
		t.start();
		
		List<BoardDTO> sharingTopList = boardService.selectTopList("sharing");
		ModelAndView mv = new ModelAndView();
		mv.addObject("sharingTopList", sharingTopList);
		mv.setViewName("main/index");
		
		return mv; //tilesView����
	}
	
}
