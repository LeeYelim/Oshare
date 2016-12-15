package spring.oshare.dao;

import spring.oshare.dto.MemberDTO;

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

	/**
	 * ������ ��ȿ���˻�
	 * */
	MemberDTO receiverValidation(String receiver);
	
}
