package spring.oshare.service;

import java.util.List;
import java.util.Map;

import spring.oshare.dto.BoardDTO;

public interface BoardService {
	
	/**
	 * 물품 등록
	 * */
	int insertBoard(BoardDTO board);

	/**
	 * 물품 수정
	 * */
	int updateBoard(BoardDTO board);
	
	/**
	 * 물품 삭제
	 * */
	int deleteBoard(int boardNo);
	
	/**
	 * 물품 전체 조회(쉐어링 or 렌탈)
	 * */
	void selectAll(String boardType);
	
	/**
	 * 카테고리 별 조회
	 * */
	void selectByCategory(String boardType, String category);
	
	/**
	 * 물품 상세 검색(카테고리, 제품명, 지역, 시작일, 종료일) 
	 * */
	void selectByDetailInfo(String category, String productName, String loc, String startDate, String endDate);
	
	/**
	 * 물품 상세 정보(게시물 번호로 조회)
	 * boolean flag : true = 조회수 증가
	 * 				  false = 조회수 그대로
	 * */
	BoardDTO selectByBoardNo(int boardNo, boolean flag);

	/**
	 *  리스트
	 */
	List<BoardDTO> pageList(Map<String, Object> map);
	
	/**
	 *  게시글 갯수
	 */
	int getBoardCount(Map<String, Object> map);
	
	/**
	 * 물품 상세 정보(게시물 번호로 조회)
	 * */
	BoardDTO detailBoard(int boardNo);
	
}
