package spring.oshare.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.LocationDTO;
import spring.oshare.dto.MessageDTO;

@Repository
public class MyPageDAOImpl implements MyPageDAO{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public int insertGrade(GradeDTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void selectGrade(String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectAllDeliveryLocation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int insertDeliveryLocation(LocationDTO location) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertMessage(MessageDTO message) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMessage(String messageNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void selectAllMessage() {
		// TODO Auto-generated method stub
		
	}
	
}
