package spring.oshare.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.SharingDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	/**
	 * ID�ߺ�
	 */
	@Override
	public MemberDTO idCheck(String memberId) {
		return sqlSession.selectOne("memberMapper.idCheck", memberId);
	}

	/**
	 * ȸ������
	 */
	@Override
	public void signUp(MemberDTO member) {
		sqlSession.insert("memberMapper.joinMember", member);
	}

	/**
	 * �α���
	 */
	@Override
	public int login(MemberDTO member) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * �α��� üũ (���̵�/��й�ȣ)
	 */
	@Override
	public MemberDTO loginCheck(MemberDTO member) {
		return sqlSession.selectOne("memberMapper.loginCheck", member);
	}

   /**
    * ȸ������ ��ȸ
    */
   @Override
   public MemberDTO selectByMemberId(String memberId) {
      return sqlSession.selectOne("memberMapper.selectByMemberId", memberId);
   }
	
   /**
    * ȸ������ ����
    */
   @Override
   public int updateMember(MemberDTO member) {
      return sqlSession.update("memberMapper.updateMember", member);
   }

   /**
    * �ŷ����� Ȯ��
    */
	@Override
	public SharingDTO deleteMemberConfirm(String transactionState , String memberId) {
		Map<String , String>  deleteMemberConfirmMap = new HashMap<>();
		deleteMemberConfirmMap.put("transactionState", transactionState);
		deleteMemberConfirmMap.put("memberId", memberId);
		
		return sqlSession.selectOne("memberMapper.sharingState", deleteMemberConfirmMap);
	}
   

   /**
    * ȸ��Ż��
    */
	@Override
	public int deleteMember(String memberId) {
		return sqlSession.delete("memberMapper.deleteMember", memberId);
	}


	/**
	 * ���� ������ ��ȿ�� �˻�
	 * */
	@Override
	public MemberDTO receiverValidation(String receiver) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("memberMapper.receiverValidation", receiver);
	}



}
