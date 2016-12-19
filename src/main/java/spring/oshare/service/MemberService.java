package spring.oshare.service;

import spring.oshare.dto.MemberDTO;

public interface MemberService {
	
	/**
	 * ID�ߺ�üũ
	 */
	boolean serviceIdCheck(String memberId);

	/**
	 * ȸ������
	 * */
	void signUp(MemberDTO user);

	/**
	 * �α���
	 * */
	int login(MemberDTO user);
	
	/**
	 * �α��� üũ(���̵�/��й�ȣ Ÿ�缺 Ȯ��) 
	 */
	MemberDTO loginCheck(MemberDTO member);
	
	/**
	 * ȸ�� ���� ��ȸ
	 * */
	MemberDTO selectByMember(String memberId);
	
	/**
	 * ȸ������ ����
	 * */
	int updateMember(MemberDTO member);
	
	/**
	 * ȸ�� Ż��
	 * */
	int deleteMember(MemberDTO member);
	
	/**
	 * ������ ��ȿ���˻�
	 * */
	MemberDTO receiverValidation(String receiver);
	
	
	
}
