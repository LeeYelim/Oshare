package spring.oshare.service;

import java.util.List;
import java.util.Map;

import spring.oshare.dto.BoardDTO;

public interface BoardService {
	
	/**
	 * ��ǰ ���
	 * */
	int insertBoard(BoardDTO board);

	/**
	 * ��ǰ ����
	 * */
	int updateBoard(BoardDTO board);
	
	/**
	 * ��ǰ ����
	 * */
	int deleteBoard(int boardNo);
	
	/**
	 * ��ǰ ��ü ��ȸ(��� or ��Ż)
	 * */
	void selectAll(String boardType);
	
	/**
	 * ī�װ� �� ��ȸ
	 * */
	void selectByCategory(String boardType, String category);
	
	/**
	 * ��ǰ �� �˻�(ī�װ�, ��ǰ��, ����, ������, ������) 
	 * */
	void selectByDetailInfo(String category, String productName, String loc, String startDate, String endDate);
	
	/**
	 * ��ǰ �� ����(�Խù� ��ȣ�� ��ȸ)
	 * boolean flag : true = ��ȸ�� ����
	 * 				  false = ��ȸ�� �״��
	 * */
	BoardDTO selectByBoardNo(int boardNo, boolean flag);

	/**
	 *  ����Ʈ
	 */
	List<BoardDTO> pageList(Map<String, Object> map);
	
	/**
	 *  �Խñ� ����
	 */
	int getBoardCount(Map<String, Object> map);
	
	/**
	 * ��ǰ �� ����(�Խù� ��ȣ�� ��ȸ)
	 * */
	BoardDTO detailBoard(int boardNo);
	
}
