package spring.oshare.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.LocationDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.MessageDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int signUp(MemberDTO user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int idCheck(String userId) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int login(MemberDTO user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(MemberDTO user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(MemberDTO user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void selectUserInfo(String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberDTO loginCheck(MemberDTO memberDTO) {
		return sqlSession.selectOne("memberMapper.loginCheck", memberDTO);
	}

}
