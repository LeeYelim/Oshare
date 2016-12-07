package spring.oshare.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.oshare.dto.ReservationDTO;
import spring.oshare.service.ReservationService;

@Controller
@RequestMapping("reservation")
public class ReservationController {

	@Autowired
	private ReservationService reservationService;
	
	@RequestMapping("selectByBoardNo")
	@ResponseBody
	public List<ReservationDTO> selectReservationByBoardNo(int boardNo) {
		List<ReservationDTO> list = reservationService.selectReservationByBoardNo(boardNo);
		System.out.println("=============================time " + list.get(0).getStartDate() + list.get(0).getEndDate());
		
		return reservationService.selectReservationByBoardNo(boardNo);
	}
	
	
	 /*@RequestMapping("selectByBoardNo")
	//@ResponseBody
	public ModelAndView selectReservationByBoardNo(int boardNo) {
		System.out.println("=================="+boardNo+"========================");
		List<ReservationDTO> list = service.selectReservationByBoardNo(boardNo);
		System.out.println("listdddd = " + list.size());
		List<String> aa = new ArrayList<>();
		aa.add("test");
		return new ModelAndView("jsonView", "list", list);
	}
*/	 
}
