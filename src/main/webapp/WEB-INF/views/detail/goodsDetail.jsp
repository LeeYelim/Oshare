<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here!!</title>
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
					<li><a href="#">취미</a> / <a href="#">도서</a> / <a href="#">티켓</a></li>
					<li><a href="#">가구</a> / <a href="#">생활</a> / <a href="#">주방</a>
					</li>
					<li><a href="#">출산</a> / <a href="#">유아</a></li>
					<li><a href="#">가전</a> / <a href="#">디지털</a> / <a href="#">컴퓨터</a></li>
					<li><a href="#">패션</a> / <a href="#">뷰티</a></li>
					<li><a href="#">스포츠</a> / <a href="#">레져용품</a></li>
					<li><a href="#">명품</a></li>
				</ul>
			</div>
		</div>
		<div class="col-xs-10">

			<div class="goodsAdd">
				<span class="material-icons">&#xE87D;</span> <span
					class="material-icons">&#xE8CC;</span>
			</div>

			<!-- mobile goodsListCategory + goodsDetailSearch -->
			<div class="mobileGoodsListForm">
				<div class="mobileGoodsListCategory">
					<span class="material-icons goodsListPrev">&#xE408;</span>
					<ul class="owl-carousel">
						<li class="item">취미 / 도서 / 티켓</li>
						<li class="item">가구 / 생활 / 주방</li>
						<li class="item">출산 / 유아</li>
						<li class="item">가전 / 디지털 / 컴퓨터</li>
						<li class="item">패션 / 뷰티</li>
						<li class="item">스포츠 / 레져용품</li>
						<li class="item">명품</li>
					</ul>
					<span class="material-icons goodsListNext">&#xE409;</span>
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
							</div></li>
						<li><div class="sellerSub">
								<span>프로필보기</span><span>쪽지보내기</span>
							</div></li>
					</ul>
				</div>

				<div class="goodsDetailChage">
					<span>수정하기</span><span>삭제하기</span>
				</div>
	
					<div class="goodsPayment">
						<button type="button">결제하기</button>
					</div>
			</div>
			<div class="col-xs-6">
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
					<li><a data-toggle="tab" href="#gooodsReview">상품후기</a></li>
					<li><a data-toggle="tab" href="#goodsQuestion">Q &amp; A</a></li>
					<li><a data-toggle="tab" href="#instructionsResume">안내사항</a></li>
				</ul>

				<div class="tab-content">
					<div id="goodsInformation" class="tab-pane fade in active">
						<h3>상품정보</h3>
					</div>
					<div id="gooodsReview" class="tab-pane fade">
						<div class="panel-group" id="accordion">
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<a data-toggle="collapse" data-parent="#accordion"
											href="#gooodsReviewcollapse">제품 조금 쓸만하네요</a>
									</h4>
								</div>
								<div id="gooodsReviewcollapse" class="panel-collapse collapse">
									<div class="panel-body">Lorem ipsum dolor sit amet,
										consectetur adipisicing elit, sed do eiusmod tempor incididunt
										ut labore et dolore magna aliqua. Ut enim ad minim veniam,
										quis nostrud exercitation ullamco laboris nisi ut aliquip ex
										ea commodo consequat.</div>
								</div>
							</div>
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
						<div class="panel-group" id="accordion">
							<div class="panel panel-default">
								<div class="panel-heading">
									<h4 class="panel-title">
										<span class="goodsQuestionNo">10</span>
										<a data-toggle="collapse" data-parent="#accordion"
											href="#goodsQuestioncollapse">제품을 살살살려고하는데?</a>
										<span class="goodsQuestionDate">2016-12-05</span>
										<span class="goodsQuestionId">cfrqw1234</span>
										
									</h4>
								</div>
								<div id="goodsQuestioncollapse" class="panel-collapse collapse">
									<div class="panel-body">Lorem ipsum dolor sit amet,
										consectetur adipisicing elit, sed do eiusmod tempor incididunt
										ut labore et dolore magna aliqua. Ut enim ad minim veniam,
										quis nostrud exercitation ullamco laboris nisi ut aliquip ex
										ea commodo consequat.  <span class="goodsChattingAdd">댓글달기</span>
									
									</div>
															
								</div>
							</div>
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

		<!-- goodsListDetailSearchDialog  -->
		<div id="goodsListDetailSearchDialog">
			<form action="" method="post" name="goodsListDetailSearchDialog">
				<div class="goodsCategory">
					<span>카테고리</span> <select>
						<option value="0">ComboBox</option>
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
			<form action="" method="post"
				name="mobileGoodsListDetailSearchDialog">
				<div class="mobileGoodsCategory">
					<span>카테고리</span> <select>
						<option value="0">ComboBox</option>
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
</body>
</html>