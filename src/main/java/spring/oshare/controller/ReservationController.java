package spring.oshare.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.ReservationDTO;
import spring.oshare.dto.SharingDTO;
import spring.oshare.service.MyPageService;
import spring.oshare.service.ReservationService;

@Controller
@RequestMapping("reservation")
public class ReservationController {

	@Autowired
	private ReservationService reservationService;
	
	@Autowired
	private MyPageService mypageService;
	
	@RequestMapping("selectByBoardNo")
	@ResponseBody
	public List<ReservationDTO> selectReservationByBoardNo(int boardNo) {
		return reservationService.selectReservationByBoardNo(boardNo);
	}
	
	/**
	   *  ���� ����ϱ�
	   * */
	  @RequestMapping("apply")
	  public String write(int boardNo, String start, String end, SharingDTO sharing){
		  System.out.println("========boardNo : "+boardNo +"======== s : "+start + "======== e : " + end); // ���۳��̶� ������ �� �����ϸ� end�� null�� �ǹ���
		  System.out.println("===========boardNo : " + sharing.getBoardNo());
		  System.out.println("===========buyerId : " + sharing.getBuyerId());
		  System.out.println("===========sellerId : " + sharing.getSellerId());
		  System.out.println("===========productCount : " + sharing.getProductCount());
		  System.out.println("===========totalPrice : " + sharing.getTotalPrice());  
		  
		  sharing.setBoardNo(boardNo);
		  sharing.setSharingStart(start);
		  sharing.setSharingEnd(end);
		  
		  if(reservationService.insertReservation(new ReservationDTO(boardNo, start, end), sharing)>1) { 
			  return "redirect:/mypage/rentalItem?boardNo="+boardNo;
		  } 
		  return "error/errorMessage";
	  }
	  
	  
	  /**
	   * ���� ����ϱ� 
	   * */
	  @RequestMapping("deleteReservation")
	  public String deleteReservation(int reservationNo) {
		  System.out.println("==============================reservationNo : " + reservationNo);
		  if(reservationService.deleteReservation(reservationNo)>1) {
			  return "redirect:/mypage/rentalItem";
		  } 
		  return "error/errorMessage";
	  }
	
	  /**
	   * �뿩��)
	   * * �ݳ� ��û(���� : �ݳ�, �ļ�, �н�)
	   * * �ݳ� : reservation_end ���� ��¥�� & �ݳ� ��û���� ������Ʈ
	   * * �ļ� : reservation_end ���� ��¥�� & �ļ� ������Ʈ
	   * * �н� : reservation_end ���� ��¥�� & �н� ������Ʈ
	   * * */
	  @RequestMapping("applyReturn")
	  public String applyReturn(HttpSession session, int sharingNo, String returnState, GradeDTO dto) {
		  System.out.println("=========sharingNo" + sharingNo + "===================rentalItemList" + returnState);
		  String id = (String)session.getAttribute("loginMemberId");
		  System.out.println("===========================" + dto.getMemberReview() + dto.getMemberPoint() + id + dto.getSellerId());
		  int re1 = reservationService.applyReturn(sharingNo, returnState);
		  dto.setMemberId(id);
		  int re2 = mypageService.insertMemberGrade(dto);
		  
		  if((re1+re2) > 1) {
			  return "redirect:/mypage/rentalItem";
		  }
		  return "error/errorMessage";
	  }
	  
	  /**
	   * �Ǹ���)
	   * �Ϸ� : �ŷ� �Ϸ�� ������Ʈ
	   * */
	  @RequestMapping("responseReturn")
	  public String responseReturn(int sharingNum, String responseState) {
		System.out.println("============================sharingNum : " + sharingNum);
		System.out.println("============================responseState : " + responseState);
		if(reservationService.responseReturn(sharingNum, responseState)>0) {
			return "redirect:/mypage/salesItem";
		}
		return "error/errorMessage";
	  }
	  
	  /**
	   * û���ϱ�
	   * */
	 @RequestMapping("selectDemandPayment")
	 @ResponseBody
	  public SharingDTO demandPayment(int sharingNum) {
		 System.out.println("============================sharingNo : " + sharingNum);
		 SharingDTO dto =  reservationService.demandPayment(sharingNum);
		 System.out.println("getSharingNo : " + dto.getSharingNo());
		 System.out.println("getSharingStart : " + dto.getSharingStart());
		 System.out.println("getSharingEnd : " + dto.getSharingEnd());
		 System.out.println("getSharingDays : " + dto.getSharingDays());
		 System.out.println("getOverDue : " + dto.getOverDue());
		 System.out.println("getOverDueFee : " + dto.getOverDueFee());
		 System.out.println("getTotalPrice : " + dto.getTotalPrice());
		 System.out.println("getPrice : " + dto.getBoard().getPrice());
		 return dto;
		
	  }
	 
	 @RequestMapping("updateTransactionState")
	 public String updateTransactionState(int sharingNum, String state) {
		 if(reservationService.updateTransactionState(sharingNum, state)>0) {
				return "redirect:/mypage/rentalItem";
			}
			return "error/errorMessage";
	 }
	  
	  
}
