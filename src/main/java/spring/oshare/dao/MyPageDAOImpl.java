package spring.oshare.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.LocationDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.MessageDTO;
import spring.oshare.dto.SharingDTO;

@Repository
public class MyPageDAOImpl implements MyPageDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<BoardDTO> salesItemList(String memberId) {
		return sqlSession.selectList("myPageMapper.salesItemList", memberId);
	}
	
	@Override
	public List<BoardDTO> rentalItemList(String memberId) {
		return sqlSession.selectList("myPageMapper.rentalItemList", memberId);
	}
	
	@Override
	public int insertGrade(GradeDTO dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void selectGrade(String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectAllDeliveryLocation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int insertDeliveryLocation(LocationDTO location) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertMessage(MessageDTO message) {
		return sqlSession.insert("sendMessageMapper.sendMessageInsert", message);
	}

	@Override
	public int deleteMessage(String[] messageNo) {
		int result =0;
		for(String messageNumber : messageNo){
			result =sqlSession.update("sendMessageMapper.sendMessageDelete", messageNumber);
		}
		return result;
	}

	@Override
	public List<MessageDTO> selectSenderMessage(String sender) {
		System.out.println("sender : " +sender);
		return sqlSession.selectList("sendMessageMapper.senedMessageSenderSelect",sender);
	}

	@Override
	public List<MessageDTO> selectReceiverMessage(String receiver) {
		System.out.println("recevier : "+receiver);
		List<MessageDTO>  list =sqlSession.selectList("sendMessageMapper.senedMessageReceiverSelect",receiver);
		System.out.println("list : "+list.get(0).getMessageNo()+"  "+list.get(0).getSendingDate());
		return list;
	}
	
}
