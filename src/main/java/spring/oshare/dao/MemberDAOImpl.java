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
	
	/**
	 * 회원가입
	 */
	@Override
	public void signUp(MemberDTO member) {
		sqlSession.insert("memberMapper.joinMember", member);
	}

	/**
	 * ID중복
	 */
	@Override
	public MemberDTO idCheck(String memberId) {
		return sqlSession.selectOne("memberMapper.idCheck", memberId);
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
