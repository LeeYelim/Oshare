package spring.oshare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.oshare.service.ReservationServiceImpl;

@Controller
public class HomeController {

	@Autowired
	private ReservationServiceImpl service;
	
	/**
	 * 메인페이지
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {	
		Thread t = new Thread(service);
		t.start();
		return "main/index"; //tilesView실행
	}
	
}
