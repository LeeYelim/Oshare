package spring.oshare.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.ReservationDTO;
import spring.oshare.service.BoardService;
import spring.oshare.service.MemberService;

@Controller
@RequestMapping("payment")
public class PaymentController {

	@Autowired
	private BoardService boardService; 
	@Autowired
	private MemberService memberService;
	
/*	@RequestMapping("goodsPayment")
	public String paymentForm(){
		return "payment/goodsPayment";
	}*/


	@RequestMapping("goodsPayment")
	public ModelAndView  paymentForm(HttpSession session, ReservationDTO reservation) throws ParseException{
		long diffDays=0;
		
		try {
		        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		        Date beginDate = formatter.parse(reservation.getStartDate());
		        Date endDate = formatter.parse(reservation.getEndDate());
		         
		        // 시간차이를 시간,분,초를 곱한 값으로 나누면 하루 단위가 나옴
		        long diff = endDate.getTime() - beginDate.getTime();
		        diffDays = diff / (24 * 60 * 60 * 1000) + 1;
		 
		        System.out.println("-----------------------------------------날짜차이=" + diffDays);
		         
		    } catch (ParseException e) {
		        e.printStackTrace();
		    }
		BoardDTO board = boardService.selectByBoardNo(reservation.getBoardNo(), false);
		String memberId = (String)session.getAttribute("loginMemberId");
		MemberDTO member = memberService.selectByMember(memberId);
		ModelAndView mv = new ModelAndView();
		mv.addObject("board", board);
		mv.addObject("reservation", reservation);
		mv.addObject("member", member);
		mv.addObject("diffDays", diffDays);
		mv.addObject("totalPayment", diffDays*board.getPrice());
		mv.setViewName("payment/goodsPayment");
		
		  
		
		return mv;
	}
	
}
