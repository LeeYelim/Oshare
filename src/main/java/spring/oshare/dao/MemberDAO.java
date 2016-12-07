package spring.oshare.dao;

import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.LocationDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.MessageDTO;

public interface MemberDAO {

	/**
	 * ȸ������
	 * */
	int signUp(MemberDTO user);
	
	/**
	 * �ߺ�üũ
	 * */
	int idCheck(String userId);
	
	/**
	 * �α��� üũ(���̵�/��й�ȣ Ȯ��)
	 */
	MemberDTO loginCheck(MemberDTO memberDto);
	
	/**
	 * �α���
	 * */
	int login(MemberDTO user);
	
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
