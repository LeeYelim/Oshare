package spring.oshare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	/**
	 * 메인페이지
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {	
		return "main/index"; //tilesView실행
	}
	
}
