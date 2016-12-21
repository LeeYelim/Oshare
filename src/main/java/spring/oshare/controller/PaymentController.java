package spring.oshare.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.ExtraChargeDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.ReservationDTO;
import spring.oshare.dto.SharingDTO;
import spring.oshare.service.BoardService;
import spring.oshare.service.MemberService;
import spring.oshare.service.PaymentService;
import spring.oshare.service.ReservationService;

@Controller
@RequestMapping("payment")
public class PaymentController {

	@Autowired
	private BoardService boardService; 
	@Autowired
	private MemberService memberService;
	@Autowired
	private PaymentService paymentService;
	@Autowired
	private ReservationService reservationService;
	
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
		         
		        // �ð����̸� �ð�,��,�ʸ� ���� ������ ������ �Ϸ� ������ ����
		        long diff = endDate.getTime() - beginDate.getTime();
		        diffDays = diff / (24 * 60 * 60 * 1000) + 1;
		 
		        System.out.println("-----------------------------------------��¥����=" + diffDays);
		         
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
	
	/**
	 * �߰��� ���� ��û
	 * */
	@RequestMapping("extraCharge")
	public String insertExtraCharge(ExtraChargeDTO dto) {
		/*f(reservationService.insertReservation(new ReservationDTO(boardNo, start, end), sharing)>1) { 
			  return "redirect:/mypage/rentalItem";
		  } */
	
		System.out.println("===============chargeNo : " + dto.getChargeNo());
		System.out.println("===============charge : " + dto.getCharge());
		System.out.println("===============chargeReason : "+ dto.getChargeReason());
		
		int re1 = paymentService.insertExtraCharge(dto);
		int re2 = reservationService.updateTransactionState(dto.getChargeNo(), "���û��");
		
		if(re1+re2>1) {
			return "redirect:/mypage/salesItem";
		} else {
			return "error/errorMessage";
		}
	}
	
	/**
	 * �߰��� ����
	 * */
	@RequestMapping("selectExtraChargeInfo")
	@ResponseBody
	public SharingDTO selectExtraChargeInfo(int sharingNo) {
		return paymentService.selectExtraChargeInfo(sharingNo);
	}
	
	
}
