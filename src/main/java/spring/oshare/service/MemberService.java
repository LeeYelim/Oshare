package spring.oshare.service;

import spring.oshare.dto.MemberDTO;

public interface MemberService {

	/**
	 * 회원가입
	 * */
	int signUp(MemberDTO user);

	/**
	 * 로그인
	 * */
	int login(MemberDTO user);
	
	/**
	 * 로그인 체크(아이디/비밀번호 타당성 확인) 
	 */
	MemberDTO loginCheck(MemberDTO dto);
	
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
