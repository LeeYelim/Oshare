package spring.oshare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.oshare.dao.MemberDAO;
import spring.oshare.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDao;
	
	/**
	 * ID중복체크
	 */
	@Override
	public boolean serviceIdCheck(String memberId){

		MemberDTO memberDTO = memberDao.idCheck(memberId);
		
	//존재여부 확인
		boolean result = false;
				
	//ID중복
		if(memberDTO!=null) return true;
		
	//ID사용가능
		return result;
	}
	
	/**
	 * 회원가입
	 */
	@Override
	public void signUp(MemberDTO member) {
		memberDao.signUp(member);
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
	public MemberDTO loginCheck(MemberDTO dto) {
		return memberDao.loginCheck(dto);
	}

}
