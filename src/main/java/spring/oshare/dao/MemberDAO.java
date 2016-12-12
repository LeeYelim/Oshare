package spring.oshare.dao;

import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.LocationDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.MessageDTO;

public interface MemberDAO {
	
	/**
	 * ȸ������
	 * */
	void signUp(MemberDTO member);
	
	/**
	 * ID�ߺ�üũ
	 * */
	MemberDTO idCheck(String memberId);
	
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
