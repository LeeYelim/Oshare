<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="col-xs-2">
			<div class="goodsListDetailSearch">
				<span class="material-icons">&#xE8B6; </span>세부검색
			</div>
			<div class="goodsListCategory">
				<ul>
				
					<c:choose>
						<c:when test="${boardType == 'sharing'}">
							<li><a href="<c:url value='/board/goodsList'/>">${boardType}</li>	
							<li><a href="<c:url value='/board/goodsList?productCategory=취미/도서/티켓'/>">취미 / 도서 / 티켓</a></li>
							<li><a href="<c:url value='/board/goodsList?productCategory=가구/생활/주방/식품'/>">가구 / 생활 / 주방</a></li>
							<li><a href="<c:url value='/board/goodsList?productCategory=출산/유아동'/>">출산 / 유아</a></li>
							<li><a href="<c:url value='/board/goodsList?productCategory=가전/디지털/컴퓨터'/>">가전 / 디지털 / 컴퓨터</a></li>
							<li><a href="<c:url value='/board/goodsList?productCategory=패션/뷰티'/>">패션 / 뷰티</a></li>
							<li><a href="<c:url value='/board/goodsList?productCategory=스포츠/레저용품'/>">스포츠 / 레져용품</a></li>
							<li><a href="<c:url value='/board/goodsList?productCategory=명품'/>">명품</a></li>
						</c:when>
						<c:otherwise>
							<li><a href="<c:url value='/board/goodsRentalList'/>">${boardType}</li>	
							<li><a href="<c:url value='/board/goodsRentalList?productCategory=취미/도서/티켓'/>">취미 / 도서 / 티켓</a></li>
							<li><a href="<c:url value='/board/goodsRentalList?productCategory=가구/생활/주방/식품'/>">가구 / 생활 / 주방</a></li>
							<li><a href="<c:url value='/board/goodsRentalList?productCategory=출산/유아동'/>">출산 / 유아</a></li>
							<li><a href="<c:url value='/board/goodsRentalList?productCategory=가전/디지털/컴퓨터'/>">가전 / 디지털 / 컴퓨터</a></li>
							<li><a href="<c:url value='/board/goodsRentalList?productCategory=패션/뷰티'/>">패션 / 뷰티</a></li>
							<li><a href="<c:url value='/board/goodsRentalList?productCategory=스포츠/레저용품'/>">스포츠 / 레져용품</a></li>
							<li><a href="<c:url value='/board/goodsRentalList?productCategory=명품'/>">명품</a></li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
		</div>
		<div class="col-xs-10">

			<!-- mobile goodsListCategory + goodsDetailSearch -->
			<div class="mobileGoodsListForm">
				<div class="mobileGoodsListCategory">
					<span class="material-icons goodsListPrev">&#xE408;</span>
					<ul class="owl-carousel">
					<c:choose>
						<c:when test="${boardType == 'sharing'}">
							<li class="item"><a href="<c:url value='/board/goodsList'/>">${boardType}</a></li>	
							<li class="item"><a href="<c:url value='/board/goodsList?productCategory=취미/도서/티켓'/>">취미 / 도서 / 티켓</a></li>
							<li class="item"><a href="<c:url value='/board/goodsList?productCategory=가구/생활/주방/식품'/>">가구 / 생활 / 주방</a></li>
							<li class="item"><a href="<c:url value='/board/goodsList?productCategory=출산/유아동'/>">출산 / 유아</a></li>
							<li class="item"><a href="<c:url value='/board/goodsList?productCategory=가전/디지털/컴퓨터'/>">가전 / 디지털 / 컴퓨터</a></li>
							<li class="item"><a href="<c:url value='/board/goodsList?productCategory=패션/뷰티'/>">패션 / 뷰티</a></li>
							<li class="item"><a href="<c:url value='/board/goodsList?productCategory=스포츠/레저용품'/>">스포츠 / 레져용품</a></li>
							<li class="item"><a href="<c:url value='/board/goodsList?productCategory=명품'/>">명품</a></li>
						</c:when>
						<c:otherwise>
							<li class="item"><a href="<c:url value='/board/goodsRentalList'/>">${boardType}</a></li>	
							<li class="item"><a href="<c:url value='/board/goodsRentalList?productCategory=취미/도서/티켓'/>">취미 / 도서 / 티켓</a></li>
							<li class="item"><a href="<c:url value='/board/goodsRentalList?productCategory=가구/생활/주방/식품'/>">가구 / 생활 / 주방</a></li>
							<li class="item"><a href="<c:url value='/board/goodsRentalList?productCategory=출산/유아동'/>">출산 / 유아</a></li>
							<li class="item"><a href="<c:url value='/board/goodsRentalList?productCategory=가전/디지털/컴퓨터'/>">가전 / 디지털 / 컴퓨터</a></li>
							<li class="item"><a href="<c:url value='/board/goodsRentalList?productCategory=패션/뷰티'/>">패션 / 뷰티</a></li>
							<li class="item"><a href="<c:url value='/board/goodsRentalList?productCategory=스포츠/레저용품'/>">스포츠 / 레져용품</a></li>
							<li class="item"><a href="<c:url value='/board/goodsRentalList?productCategory=명품'/>">명품</a></li>
						</c:otherwise>
					</c:choose>
					</ul>
					<span class="material-icons goodsListNext">&#xE409;</span>
				</div>
				<div class="mobileDetailSearch">
					<span class="material-icons mobilegoodsListDetailSearch">&#xE8B6;</span>
				</div>
			</div>
			<div id="goodsListItemForm">
			<c:forEach items="${list}" var="sharingItem">
				<div class="goodsListItem">
					<ul>
						<li><img src="<c:url value='${sharingItem.filePath}'/>" alt="book">
						<a href="<c:url value='/board/goodsDetail?boardNo=${sharingItem.boardNo}'/>">
						<span class="material-icons goodsDetailViewSee">&#xE8F4;</span>
						</a></li>
						<li>제품명 : ${sharingItem.productName}</li>
						<li>가격 : ${sharingItem.price}원 / 일</li>
						<li>
						<script type="text/javascript">
							var className="material-icons heartWish";
						</script>
						
						<c:choose>
							<c:when test="${empty wishs}">
								<span class="material-icons heartWish" id="${sharingItem.boardNo}" >&#xE87D;</span>
							</c:when>
							<c:otherwise>
								<span class="material-icons heartWish" id="${sharingItem.boardNo}">&#xE87D;</span>
								<c:forEach items="${wishs}" var="wish">
									<c:choose>
									<c:when test="${sharingItem.boardNo eq wish.boardNo}">
										<script type="text/javascript">
											$(function() {
												$("#${sharingItem.boardNo}").css({"color":"#ff0000"});
											})									
										</script>						
									</c:when> 
									</c:choose>
								</c:forEach>
							</c:otherwise> 
						</c:choose>
							
						</li>
					</ul>
				</div>
				</c:forEach>
				<c:if test="${!empty sessionScope.loginMemberId}">
				<div class="goodsListInsertBtn">
				<a href="<c:url value='/editor/insertProduct'/>?boardType=${requestScope.boardType}"><span class="glyphicon glyphicon-pencil">제품등록</span></a>
				</div>
				</c:if>
				
				<div class="goodsListNavaction">
					<c:if test="${count>0}">${pagingHtml}</c:if>
				</div>		
			</div>
		</div>
	</div>

	<!-- goodsListDetailSearchDialog  -->
	<div id="goodsListDetailSearchDialog">
		<form action="" method="post" name="goodsListDetailSearchDialog"
			onsubmit="return detailSearchValidityCheck()">
			<div class="goodsCategory">
				<span>카테고리</span> <select>
					<option value="취미도서티켓">취미 / 도서 / 티켓</option>
					<option value="가구생활주방">가구 / 생활 / 주방</option>
					<option value="출산유아">출산 / 유아</option>
					<option value="가전디지털컴퓨터">가전 / 디지털 / 컴퓨터</option>
					<option value="패션뷰티">패션 / 뷰티</option>
					<option value="스포츠레져용품">스포츠 / 레져용품</option>
					<option value="명품">명품</option>
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
		<form action="" method="post" name="mobileGoodsListDetailSearchDialog"
			onsubmit="return mobileDetailSearchValidityCheck()">
			<div class="mobileGoodsCategory">
				<span>카테고리</span> <select>
					<option value="취미도서티켓">취미 / 도서 / 티켓</option>
					<option value="가구생활주방">가구 / 생활 / 주방</option>
					<option value="출산유아">출산 / 유아</option>
					<option value="가전디지털컴퓨터">가전 / 디지털 / 컴퓨터</option>
					<option value="패션뷰티">패션 / 뷰티</option>
					<option value="스포츠레져용품">스포츠 / 레져용품</option>
					<option value="명품">명품</option>
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