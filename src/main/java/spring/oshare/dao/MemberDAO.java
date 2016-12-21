package spring.oshare.dao;

import java.util.List;

import spring.oshare.dto.MemberDTO;

public interface MemberDAO {
	
	/**
	 * ID�ߺ�üũ
	 * */
	MemberDTO idCheck(String memberId);
	
	/**
	 * ȸ������
	 * */
	void signUp(MemberDTO member);
	
	/**
	 * �α���
	 * */
	int login(MemberDTO member);
	
	/**
	 * �α��� üũ(���̵�/��й�ȣ Ȯ��)
	 */
	MemberDTO loginCheck(MemberDTO member);
	
	
	/**
	 * ȸ�� ���� ��ȸ
	 * */
	MemberDTO selectByMemberId(String memberId);
	
	/**
	 * ȸ������ ����
	 * */
	int updateMember(MemberDTO member);
	
	/**
	 * ȸ�� Ż��
	 * */
	int deleteUser(MemberDTO user);
	

	/**
	 * ������ ��ȿ���˻�
	 * */
	MemberDTO receiverValidation(String receiver);


	
}
