package spring.oshare.service;

import java.util.List;

import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.SharingDTO;

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
	
	/*//**
	 * �޼��� ������ ���
	 *//*
	public void messageBox();
	
	*//**
	 * ���� ���� ���
	 *//*
	public void billingManagement();
	*/
}
