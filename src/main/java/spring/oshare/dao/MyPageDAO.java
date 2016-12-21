package spring.oshare.dao;

import java.util.List;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.CartDTO;
import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.LocationDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.MessageDTO;

public interface MyPageDAO {

	/**
	 * ������ ��ǰ ���
	 */
	public List<BoardDTO> salesItemList(String memberId);
	
	/**
	 * �뿩�� ��ǰ ���
	 * */
	public List<BoardDTO> rentalItemList(String memberId);
	
	/**
	 * �Ǹ��� ��
	 * */
	int insertGrade(GradeDTO dto);
	
	/**
	 * �� ���� ��ȸ
	 * */
	void selectGrade(String userId);
	
	/**
	 * ����� ��ȸ
	 * */
	void selectAllDeliveryLocation();
	
	/**
	 * ����� �߰�
	 * */
	int insertDeliveryLocation(LocationDTO location);
	
	/**
	 * ���� ������
	 * */
	int insertMessage(MessageDTO message);
	
	/**
	 * ���� ����
	 * */
	int deleteMessage(String[] messageNo);
	
	/**
	 * �۽��� ���� ��ȸ
	 * */
	List<MessageDTO> selectSenderMessage(String sender);
	
	/**
	 * ������ ���� ��ȸ
	 * */
	List<MessageDTO> selectReceiverMessage(String receiver);

	/**
	 * ����(��) ����
	 * */
	int insertMemberGrade(GradeDTO dto);
	
	/**
	 * ��ٱ��� ����Ʈ
	 */
	List<CartDTO> selectCart(String memberId);

	/**
	 * ��ٱ��� ����
	 */
	int deleteCart(int boardNo);
	
	
	/**
	 * ������ ȸ������ ��üȸ��
	 * */
	List<MemberDTO> adminAllUserSelect();
	
}
