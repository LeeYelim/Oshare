package spring.oshare.dao;

import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.LocationDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.MessageDTO;

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
