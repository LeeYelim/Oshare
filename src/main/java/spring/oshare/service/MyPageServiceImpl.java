package spring.oshare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.oshare.dao.MyPageDAO;
import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.CartDTO;
import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.MessageDTO;

@Service
public class MyPageServiceImpl implements MyPageService{
	
	@Autowired
	private MyPageDAO myPageDAO;

	@Override
	public List<BoardDTO> salesItemList(String memberId) {
		return myPageDAO.salesItemList(memberId);
	}

	@Override
	public List<BoardDTO> rentalItemList(String memeberId) {
		return myPageDAO.rentalItemList(memeberId);
	}
	
	@Override
	public String insertMessage(MessageDTO message) {
		if(myPageDAO.insertMessage(message)>0) {
			return message.getReceiver();
		}
		return "";
	}

	@Override
	public List<MessageDTO> selectMessage(String posts , String division) {
		List<MessageDTO> messageList;
		if(posts.equals("receiver")){
			messageList = myPageDAO.selectReceiverMessage(division);//수신자
		}else{	
			messageList = myPageDAO.selectSenderMessage(division);//송신자
		}
		return messageList;
	}

	@Override
	public int deleteMessage(String[] messageNo) {
		return myPageDAO.deleteMessage(messageNo);
	}
	
	@Override
	public int insertMemberGrade(GradeDTO dto) {
		return myPageDAO.insertMemberGrade(dto);
	}
	
	/**
	 * 장바구니 리스트
	 */
	@Override
	public List<CartDTO> selectCart(String memberId) {
		return myPageDAO.selectCart(memberId);
	}

	/**
	 * 장바구니 삭제
	 */
	@Override
	public int deleteCart(int boardNo) {
		return myPageDAO.deleteCart(boardNo);
	}
	
	
	@Override
	public List<MemberDTO> adminAllUserSelect() {
		// TODO Auto-generated method stub
		return myPageDAO.adminAllUserSelect();
	}
}
