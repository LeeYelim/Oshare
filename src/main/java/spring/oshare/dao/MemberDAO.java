package spring.oshare.dao;

import java.util.List;

import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.SharingDTO;

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
	 * �ŷ����� Ȯ��
	 */
	public SharingDTO deleteMemberConfirm(String transactionState , String memberId);
	
	/**
	 * ȸ�� Ż��
	 * @return 
	 * */
	int deleteMember(String memberId);
	
	/**
	 * ������ ��ȿ���˻�
	 * */
	MemberDTO receiverValidation(String receiver);
	
	/**
	 * ȸ��Ż�� Ż���  �Խù� ����
	 * */
	int deleteMemberBoard(String memberId);
	
	/**
	 * ȸ��Ż�� Ż��� ��������
	 * */
	int deleteMemberGrade(String memberId);

	
}
