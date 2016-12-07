package spring.oshare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.oshare.dao.ReservationDAO;
import spring.oshare.dto.ReservationDTO;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private ReservationDAO dao;
	
	@Override
	public int insertReservation(ReservationDTO reservation) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateReservation(ReservationDTO reservation) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteReservation(int reservationNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ReservationDTO> selectReservationByBoardNo(int boardNo) {
		return dao.selectReservationByBoardNo(boardNo);
	}

}
