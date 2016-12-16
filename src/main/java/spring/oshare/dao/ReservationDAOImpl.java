package spring.oshare.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.oshare.dto.ReservationDTO;
import spring.oshare.dto.SharingDTO;

@Repository
public class ReservationDAOImpl implements ReservationDAO{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insertReservation(ReservationDTO reservation) {
		return sqlSession.insert("reservationMapper.insertReservation", reservation);
	}

	@Override
	public int updateReservation(SharingDTO sharing) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteReservation(int reservationNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void selectAllSharing(String userId, String boardType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ReservationDTO> selectReservationByBoardNo(int boardNo) {
		return sqlSession.selectList("reservationMapper.selectReservationByBoardNo", boardNo);
	}

	
}
