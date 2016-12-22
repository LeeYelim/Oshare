package spring.oshare.service;

import java.util.List;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.CartDTO;
import spring.oshare.dto.DeclarationDTO;
import spring.oshare.dto.GradeDTO;
import spring.oshare.dto.MemberDTO;
import spring.oshare.dto.MessageDTO;
import spring.oshare.dto.WishlistDTO;

public interface MyPageService {

	/**
	 *  ���ø���Ʈ �̵�
	 *//*
	public void myPageWishListForm();
	*/
	
	/**
	 * ������ ��ǰ ���
	 */
	public List<BoardDTO> salesItemList(String memberId);
	
	/**
	 * ���� ��ǰ ���
	 */
	public List<BoardDTO> rentalItemList(String memeberId);
	
	
	/**
	 * ���� ������
	 * */
	String insertMessage(MessageDTO message);
	
	/**
	 * ���� ������
	 * */
	List<MessageDTO> selectMessage(String posts , String division);
	
	/**
	 * ���� ����
	 * */
	int deleteMessage(String[] messageNo);
	
	/*//**
	 * �޼��� ������ ���
	 *//*
	public void messageBox();
	
	*//**
	 * ���� ���� ���
	 *//*
	public void billingManagement();
	*/
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
	
	/**
	 * ������ �Ű� ����ȸ��
	 * */
	List<MemberDTO> adminUserBlacklistSelect(int memberGrade);
	
	/**
	 * ������ ȸ�� ���� ��� ����
	 * */
	int adminUserGradeChage(int[] memberNo ,  int memberGrade);
	
	/**
	 * ���ø���Ʈ �߰�
	 * */
	int insertWishList(WishlistDTO dto);
	
	/**
	 * ���ø���Ʈ ����
	 * */
	int deleteWishList(WishlistDTO dto);
	
	/**
	 * ���ø���Ʈ ��ȸ
	 * */
	List<WishlistDTO> selectWishList(String memberId);
	
	/**
	 * �Ǹ��� �Ű��ϱ�;
	 * */
	int declarationInsert(DeclarationDTO declarationDTO);
	
	/**
	 * �Ǹ��� �Ű� ȸ����� ����
	 * */
	int declarationUserGradeChage(int memberGrade , String memberId);
	
	/**
	 * �Ű�/���� ���� 
	 * */
	List<DeclarationDTO> reasonForFiling(String declarationReporter);

}
