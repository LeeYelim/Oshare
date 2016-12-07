package spring.oshare.service;

import spring.oshare.dto.MemberDTO;

public interface MemberService {

	/**
	 * ȸ������
	 * */
	int signUp(MemberDTO user);

	/**
	 * �α���
	 * */
	int login(MemberDTO user);
	
	/**
	 * �α��� üũ(���̵�/��й�ȣ Ÿ�缺 Ȯ��) 
	 */
	MemberDTO loginCheck(MemberDTO dto);
	
	/**
	 * ȸ�� ���� ��ȸ
	 * */
	void selectUserInfo(String userId);
	
	/**
	 * ȸ������ ����
	 * */
	int updateUser(MemberDTO user);
	
	/**
	 * ȸ�� Ż��
	 * */
	int deleteUser(MemberDTO user);
	
	
}
