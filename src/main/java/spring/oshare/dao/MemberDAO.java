package spring.oshare.dao;

import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.LocationDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.MessageDTO;

public interface MemberDAO {
	
	/**
	 * 회원가입
	 * */
	void signUp(MemberDTO member);
	
	/**
	 * ID중복체크
	 * */
	MemberDTO idCheck(String memberId);
	
	/**
	 * 로그인 체크(아이디/비밀번호 확인)
	 */
	MemberDTO loginCheck(MemberDTO memberDto);
	
	/**
	 * 로그인
	 * */
	int login(MemberDTO user);
	
	/**
	 * 회원 정보 조회
	 * */
	void selectUserInfo(String userId);
	
	/**
	 * 회원정보 수정
	 * */
	int updateUser(MemberDTO user);
	
	/**
	 * 회원 탈퇴
	 * */
	int deleteUser(MemberDTO user);

	
	
}
