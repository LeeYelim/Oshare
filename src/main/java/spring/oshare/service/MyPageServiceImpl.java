package spring.oshare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.oshare.dao.MyPageDAO;
import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.CartDTO;
import spring.oshare.dto.DeclarationDTO;
import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.MessageDTO;
import spring.oshare.dto.WishlistDTO;

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
			messageList = myPageDAO.selectReceiverMessage(division);//������
		}else{	
			messageList = myPageDAO.selectSenderMessage(division);//�۽���
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
	 * ��ٱ��� ����Ʈ
	 */
	@Override
	public List<CartDTO> selectCart(String memberId) {
		return myPageDAO.selectCart(memberId);
	}

	/**
	 * ��ٱ��� ����
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

	@Override
	public List<MemberDTO> adminUserBlacklistSelect(int memberGrade) {
		// TODO Auto-generated method stub
		return myPageDAO.adminUserBlacklistSelect(memberGrade);
	}

	@Override
	public int adminUserGradeChage(int[] memberNo, int memberGrade) {
		// TODO Auto-generated method stub
		return myPageDAO.adminUserGradeChage(memberNo, memberGrade);
	}
	
	/**
	 * ���ø���Ʈ �߰�
	 * */
	@Override
	public int insertWishList(WishlistDTO dto) {
		return myPageDAO.insertWishList(dto);
	}
	
	/**
	 * ���ø���Ʈ ����
	 * */
	@Override
	public int deleteWishList(WishlistDTO dto) {
		return myPageDAO.deleteWishList(dto);
	}

	/**
	 * ���ø���Ʈ ��ȸ
	 * */
	@Override
	public List<WishlistDTO> selectWishList(String memberId) {
		return myPageDAO.selectWishList(memberId);
	}
	
	@Override
	public int declarationInsert(DeclarationDTO declarationDTO) {
		// TODO Auto-generated method stub
		return myPageDAO.declarationInsert(declarationDTO);
	}

	@Override
	public int declarationUserGradeChage(int memberGrade, String memberId) {
		// TODO Auto-generated method stub
		return myPageDAO.declarationUserGradeChage(memberGrade, memberId);
	}
}
