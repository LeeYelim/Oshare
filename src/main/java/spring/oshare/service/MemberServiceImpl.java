package spring.oshare.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.oshare.dao.MemberDAO;
import spring.oshare.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDao;
	
	@Override
	public int signUp(MemberDTO user) {
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
	public MemberDTO loginCheck(MemberDTO dto) {
		return memberDao.loginCheck(dto);
	}

}
