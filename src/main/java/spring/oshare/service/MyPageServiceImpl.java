package spring.oshare.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.oshare.dao.MyPageDAO;
import spring.oshare.dto.BoardDTO;
import spring.oshare.dto.SharingDTO;

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
	
}
