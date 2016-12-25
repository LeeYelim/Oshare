package spring.oshare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.oshare.dao.MemberDAO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.SharingDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDao;
	
	/**
	 * ID�ߺ�üũ
	 */
	@Override
	public boolean serviceIdCheck(String memberId){

		MemberDTO memberDTO = memberDao.idCheck(memberId);
		
		//���翩�� Ȯ��
		boolean result = false;
				
		//ID�ߺ�
		if(memberDTO!=null) return true;
		
		//ID��밡��
		return result;
	}
	
	/**
	 * ȸ������
	 */
	@Override
	public void signUp(MemberDTO member) {
		memberDao.signUp(member);
	}

	   /**
	    * �α���
	    * */
	   @Override
	   public int login(MemberDTO member) {
	      // TODO Auto-generated method stub
	      return 0;
	   }

	   /**
	    * �α��� üũ(���̵�/��й�ȣ Ÿ�缺 Ȯ��) 
	    */
	   @Override
	   public MemberDTO loginCheck(MemberDTO member) {
	      return memberDao.loginCheck(member);
	   }
	   
	   /**
	    * ȸ�� ���� ��ȸ
	    * */
	   @Override
	   public MemberDTO selectByMember(String memberId) {
	      
	      return memberDao.selectByMemberId(memberId);
	   }
	   
	   /**
	    * ȸ������ ����
	    */
	   @Override
	   public int updateMember(MemberDTO member) {
	      
	      int result = memberDao.updateMember(member);
	      
	      return result;
	   }

	   /**
		 * �ŷ����� Ȯ��
		 */
		public SharingDTO deleteMemberConfirm(String transactionState , String memberId) {
			return memberDao.deleteMemberConfirm(transactionState , memberId);
		}

		/**
		 * ȸ��Ż��
		 */
		@Override
		public int deleteMember(String memberId) {
			
			int result = memberDao.deleteMember(memberId);
			result = memberDao.deleteMemberBoard(memberId);
			 
		
		
			
			return result;
		}




	/**
	 * ���������� ��ȿ���˻� 
	 * */
	@Override
	public MemberDTO receiverValidation(String receiver) {
		// TODO Auto-generated method stub
		return memberDao.receiverValidation(receiver);
	}



}
