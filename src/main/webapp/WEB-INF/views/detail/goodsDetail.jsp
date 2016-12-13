<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here!!nn</title>
</head>
<body>
	<div class="container">
		<div class="col-xs-2">
		<div class="goodsListDetailSearch">
			<span class="material-icons">&#xE8B6; </span>세부검색
		</div>
		<div class="goodsListCategory">
		<ul>
			<li><a href="#">카테고리</a></li>
			<li><a href="#">취미 / 도서 / 티켓</a></li>
			<li><a href="#">가구 / 생활 / 주방</a></li>
			<li><a href="#">출산 / 유아</a></li>
			<li><a href="#">가전 / 디지털 / 컴퓨터</a></li>
			<li><a href="#">패션 / 뷰티</a></li>
			<li><a href="#">스포츠 / 레져용품</a></li>
			<li><a href="#">명품</a></li>
		</ul>
		</div>
		</div>
	<div class="col-xs-10">
	
	<!-- mobile goodsListCategory + goodsDetailSearch -->
		<div class="mobileGoodsListForm">
			<div class="mobileGoodsListCategory">
			<span class="material-icons goodsListPrev">&#xE408;</span>
			<ul class="owl-carousel">
			<li class="item"><a href="#">취미 / 도서 / 티켓</a></li>
			<li class="item"><a href="#">가구 / 생활 / 주방</a></li>
			<li class="item"><a href="#">출산 / 유아</a></li>
			<li class="item"><a href="#">가전 / 디지털 / 컴퓨터</a></li>
			<li class="item"><a href="#">패션 / 뷰티</a></li>
			<li class="item"><a href="#">스포츠 / 레져용품</a></li>
			<li class="item"><a href="#">명품</a></li>
			</ul>
			<span class="material-icons goodsListNext">&#xE409;</span>
			</div>
			<div class="mobileDetailSearch">
				<span class="material-icons mobilegoodsListDetailSearch">&#xE8B6;</span>
			</div>
		
				<div class="mobileDetailSearch">
					<span class="material-icons mobilegoodsListDetailSearch">&#xE8B6;</span>
				</div>
			</div>

			<div class="col-xs-6">
				<div class="goodsImg">
					<img src="<c:url value='/resources/image/NoteBook.jpg'/>"
						alt="goodsDetailMainImg">
					<ul>
						<li><img src="<c:url value='/resources/image/NoteBook.jpg'/>"
							alt="goodsDetailMainImg"></li>
						<li><img src="<c:url value='/resources/image/NoteBook.jpg'/>"
							alt="goodsDetailMainImg"></li>
						<li><img src="<c:url value='/resources/image/NoteBook.jpg'/>"
							alt="goodsDetailMainImg"></li>
						<li><img src="<c:url value='/resources/image/NoteBook.jpg'/>"
							alt="goodsDetailMainImg"></li>
						<li><img src="<c:url value='/resources/image/NoteBook.jpg'/>"
							alt="goodsDetailMainImg"></li>
					</ul>
				</div>
				<div class="sellerInformation">
					<ul>
						<li>판매자 정보 : <span class="sellerName">박신혜</span></li>
						<li>판매자 아이디 : <span class="sellerId">google1234</span></li>
						<li><div class="rentalPointForm">
								대여 횟수 <span class="rentalPoint">10</span>
							</div>
							<div class="starGrade">
								<span>★</span> <span>★</span> <span>★</span> <span>★</span> <span>★</span>
							</div>
							<div class="declaration">
							<img src="<c:url value='/resources/image/siren.png'/>" alt="신고버튼">
							</div>
							</li>
						<li><div class="sellerSub">
								<span>프로필보기</span><span>쪽지보내기</span>
							</div></li>
					</ul>
				</div>

				<div class="goodsDetailChage">
					<span>수정하기</span><span>삭제하기</span>
				</div>
	
					<div class="goodsPayment">
						<form name="requestForm" method=post action="">
							<button type="button">결제하기</button>
						</form>
					</div>
			</div>
			<div class="col-xs-6">
				<div class="goodsDetailIcon">
				<span class="material-icons">&#xE87D;</span>
				<span class="material-icons">&#xE8CC;</span>
				</div>
				<div class="goodsDetailInformation">
					<ul>
						<li>제품이름 : <span class="goodsName">iPhone</span></li>
						<li>대여비 : <span class="goodsPrice">10,000원/ 10일</span></li>
						<li>상품상태 : <span class="goodsCondition">상</span></li>
						<li>예약 <span>00월00일 ~ 00월00일</span><span
							class="glyphicon glyphicon-calendar"></span></li>
					</ul>
				</div>
			<div id="calendar"></div>
			
			</div>

			<div class="col-xs-12">
				<ul class="nav nav-tabs goodsDetailNavaction">
					<li class="active"><a data-toggle="tab"
						href="#goodsInformation">상품정보</a></li>
					<li><a data-toggle="tab" href="#goodsReview">상품후기</a></li>
					<li><a data-toggle="tab" href="#goodsQuestion">Q &amp; A</a></li>
					<li><a data-toggle="tab" href="#instructionsResume">안내사항</a></li>
				</ul>

				<div class="tab-content">
					<div id="goodsInformation" class="tab-pane fade in active">
						<h3>상품정보</h3>
					</div>
					<div id="goodsReview" class="tab-pane fade">
					  <div class="goodsReviewFrame">
						<div class="goodsReviewForm">
								<div class="goodsReviewTitle">
										<span>Test</span>
								</div>
								<div class="goodsReviewContent">
									<span>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</span>
									<span class="goodsReviewAdd">댓글달기</span>
								</div>
						</div>
						
						<div class="goodsReviewForm">
								<div class="goodsReviewTitle">
										<span>Test</span>
								</div>
								<div class="goodsReviewContent">
									<span>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</span>
									<span class="goodsReviewAdd">댓글달기</span>
								</div>
						</div>
					  </div>
													
						<div class="goodsReviewPlus">
							<span>질문하기</span>
						</div>						
						
						<div class="goodsReviewPaing">
							<ul class="pagination">
								<li><a href="#">«</a></li>
								<li><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">5</a></li>
								<li><a href="#">6</a></li>
								<li><a href="#">»</a></li>
							</ul>
						</div>
					</div>
					<div id="goodsQuestion" class="tab-pane fade">	
						<div class="goodsQuestionFrame">
						<div class="goodsQuestionForm">
								<div class="goodsQuestionTitle">
									<span>Test</span>
								</div>
								<div class="goodsQuestionContent">
									<span>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</span>
									<span class="goodsQuestionAdd">댓글달기</span>
								</div>
							</div>
						</div>
						<div class="goodsQuestionPlus">
							<span>질문하기</span>
						</div>
						<div class="goodsQuestionPaing">
							<ul class="pagination">
								<li><a href="#">«</a></li>
								<li><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">5</a></li>
								<li><a href="#">6</a></li>
								<li><a href="#">»</a></li>
							</ul>
						</div>
					</div>
					<div id="instructionsResume" class="tab-pane fade">
						<h3>안내사항이력서</h3>
					</div>
				</div>
			</div>
		</div>
</div>
		<!-- goodsListDetailSearchDialog  -->
		<div id="goodsListDetailSearchDialog">
			<form action="" method="post" name="goodsListDetailSearchDialog" onsubmit="return detailSearchValidityCheck()">
				<div class="goodsCategory">
					<span>카테고리</span> <select>
						<option value="취미도서티켓">취미 / 도서 / 티켓</option>
						<option value="가구생활주방">가구 / 생활 / 주방</option> 
						<option value="출산유아">출산 / 유아</option> 
						<option value="가전디지털컴퓨터">가전 / 디지털 / 컴퓨터</option> 
						<option value="패션뷰티">패션 / 뷰티</option> 
						<option value="스포츠레져용품">스포츠 / 레져용품</option> 
						<option value="명품">명품 </option> 
					</select> <span class="material-icons goodsListDialogClose">&#xE5CD;</span>
				</div>
				<div class="goodsArea">
					<span>지역</span>
					<div class="goodsAreaCheckbox">
						<ul>
							<li><input type="checkbox" name="서울">서울</li>
							<li><input type="checkbox" name="인천">인천</li>
							<li><input type="checkbox" name="대전">대전</li>
							<li><input type="checkbox" name="대구">대구</li>
							<li><input type="checkbox" name="부산">부산</li>
							<li><input type="checkbox" name="광주">광주</li>
							<li><input type="checkbox" name="경기">경기</li>
							<li><input type="checkbox" name="강원">강원</li>
							<li><input type="checkbox" name="충남">충남</li>
							<li><input type="checkbox" name="충북">충북</li>
							<li><input type="checkbox" name="전북">전북</li>
							<li><input type="checkbox" name="전남">전남</li>
							<li><input type="checkbox" name="경북">경북</li>
							<li><input type="checkbox" name="경남">경남</li>
							<li><input type="checkbox" name="제주">제주</li>
						</ul>
					</div>
				</div>
				<div class="goodsReservation">
					<span>예약일</span> <input type="text" name="goodsReservation"
						placeholder="0000년00월00일~0000년00월00일">
				</div>
				<div class="goodsSearch">
					<span>검색어</span> <input type="text" name="goodsSearch">
					<button>
						<span class="glyphicon glyphicon-search"></span>
					</button>
				</div>
			</form>
		</div>
		<!-- mobilegoodsListDetailSearchDialog -->
		<div id="mobileGoodsListDetailSearchDialog">
			<form action="" method="post" name="mobileGoodsListDetailSearchDialog"  onsubmit="return mobileDetailSearchValidityCheck()">
				<div class="mobileGoodsCategory">
					<span>카테고리</span> <select>
							<option value="취미도서티켓">취미 / 도서 / 티켓</option>
							<option value="가구생활주방">가구 / 생활 / 주방</option> 
							<option value="출산유아">출산 / 유아</option> 
							<option value="가전디지털컴퓨터">가전 / 디지털 / 컴퓨터</option> 
							<option value="패션뷰티">패션 / 뷰티</option> 
							<option value="스포츠레져용품">스포츠 / 레져용품</option> 
							<option value="명품">명품 </option> 
					</select> <span class="material-icons mobileGoodsListDialogClose">&#xE5CD;</span>
				</div>
				<div class="mobileGoodsArea">
					<span>지역</span>
					<div class="mobileGoodsAreaCheckbox">
						<ul>
							<li><input type="checkbox" name="서울">서울</li>
							<li><input type="checkbox" name="인천">인천</li>
							<li><input type="checkbox" name="대전">대전</li>
							<li><input type="checkbox" name="대구">대구</li>
							<li><input type="checkbox" name="부산">부산</li>
							<li><input type="checkbox" name="광주">광주</li>
							<li><input type="checkbox" name="경기">경기</li>
							<li><input type="checkbox" name="강원">강원</li>
							<li><input type="checkbox" name="충남">충남</li>
							<li><input type="checkbox" name="충북">충북</li>
							<li><input type="checkbox" name="전북">전북</li>
							<li><input type="checkbox" name="전남">전남</li>
							<li><input type="checkbox" name="경북">경북</li>
							<li><input type="checkbox" name="경남">경남</li>
							<li><input type="checkbox" name="제주">제주</li>
						</ul>
					</div>
				</div>
				<div class="mobileGoodsReservation">
					<span>예약일</span> <input type="text" name="goodsReservation"
						placeholder="0000년00월00일~0000년00월00일">
				</div>
				<div class="mobileGoodsSearch">
					<span>검색어</span> <input type="text" name="goodsSearch">
					<button>
						<span class="glyphicon glyphicon-search"></span>
					</button>
				</div>
			</form>
		</div>
		
		<div class="saleProfile">
		<div class="saleProfileTitle">
		<span>프로필</span>
		<span class="material-icons saleProfileClose">&#xE5CD;</span>
		</div>
		  <div class="saleProfileImg">
			<img src="<c:url value='/resources/image/sampleProfile.png'/>" alt="프로필이미지">
		  </div>
		  <div class="saleProfileImformation">
		  		아이디 : <span>qsdxc123</span>	  	
		  </div>
		  <span></span>
		  <div class="saleReview">
		  <span>판매자 후기</span>
		  <table>
		  	<tr>
		  		<td>글번호</td>
		  		<td>내용</td>
		  		<td>작성일</td>
		  		<td>작성자</td>
		  	</tr>
		  	<tr>
		  		<td>1</td>
		  		<td>Oshare so good</td>
		  		<td>2016.12.12</td>
		  		<td>박신혜</td>
		  	</tr>
		  </table>
  			<div class="saleReviewPaging">
				<ul class="pagination">
					<li><a href="#">«</a></li>
					<li><a href="#">1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#">6</a></li>
					<li><a href="#">»</a></li>
				</ul>
			</div>
		  </div>
		  <div class="saleProduct">
		  <span>판매중인 제품</span>
		  <table>
		  	<tr>
		  		<td>글번호</td>
		  		<td>제품</td>
		  		<td>제품명</td>
		  	</tr>
		  	<tr>
		  		<td>1</td>
		  		<td><img src="<c:url value='/resources/image/book.jpg'/>" alt="이미지"></td>
		  		<td>노트북</td>
		  	</tr>
		  </table>
  			<div class="saleProductPaging">
				<ul class="pagination">
					<li><a href="#">«</a></li>
					<li><a href="#">1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#">6</a></li>
					<li><a href="#">»</a></li>
				</ul>
			</div>
		  </div>
		</div>
		<div class="saleMessage">
			<div class="saleMessageTitle">
				<span>쪽지쓰기</span>
				<span class="material-icons saleMessageClose">&#xE5CD;</span>
			</div>
		  <form action="" method="">
		  	<div class="saleMessageRecipient">
			<span>받는이 </span><input type="text">
			</div>
			<div class="saleMessageContent">
			<span>쪽지내용</span>
			<textarea></textarea>
			</div>
			<div class="saleMessageBtn">
			<input type="submit" value="쪽지보내기">
		  	</div>
		  </form>
		</div>
		<div class="declarationDialog">
			<div class="declarationTitle">
				<span>신고하기</span>
				<span class="material-icons declarationClose">&#xE5CD;</span>
			</div>
			<form action="" method="">
				<div class="declarationList">
					<span>신고사유</span>
					<select name="">
						<option value=""></option>
					</select>
				</div>
				<div class="">
					<span>신고이유</span>
					<textarea></textarea>
				</div>
				<div class="declarationBtn">
				</div>
			</form>	
		</div>
</body>
</html>