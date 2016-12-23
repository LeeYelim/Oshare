package spring.oshare.service;

import java.util.List;

import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.SharingDTO;

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
	 * �ŷ����� Ȯ��
	 */
	public SharingDTO deleteMemberConfirm(String transactionState , String memberId);

	/**
	 * ȸ�� Ż��
	 */
	int deleteMember(String memberId);
	
	/**
	 * ������ ��ȿ���˻�
	 * */
	MemberDTO receiverValidation(String receiver);
	
	
	
}
