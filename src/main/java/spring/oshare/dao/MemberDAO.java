package spring.oshare.dao;

import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.LocationDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.MessageDTO;

public interface MemberDAO {
	
	/**
	 * ID중복체크
	 * */
	MemberDTO idCheck(String memberId);
	
	/**
	 * 회원가입
	 * */
	void signUp(MemberDTO member);
	
	/**
	 * 로그인
	 * */
	int login(MemberDTO member);
	
	/**
	 * 로그인 체크(아이디/비밀번호 확인)
	 */
	MemberDTO loginCheck(MemberDTO member);
	
	
	/**
	 * 회원 정보 조회
	 * */
	MemberDTO selectByMemberId(String memberId);
	
	/**
	 * 회원정보 수정
	 * */
	int updateMember(MemberDTO member);
	
	/**
	 * 회원 탈퇴
	 * */
	int deleteUser(MemberDTO user);
	

	/**
	 * 수신자 유효성검사
	 * */
	MemberDTO receiverValidation(String receiver);

	
	
}
