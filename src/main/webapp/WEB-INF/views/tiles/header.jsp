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
		<div class="headerNavactionUser">
			<ul>
				<c:choose>
					<c:when test="${empty sessionScope.loginMemberName}">
						<li>			
							<a href="<c:url value='/member/loginForm'/>">Login</a>
						</li>
						<li>
							<a href="#">Join us</a>
						</li>
					</c:when>
					<c:otherwise>
						<li>
							<div class="myPageList">
								<a href="#">My Page</a>
								<ul>
									<li><a href="<c:url value='/mypage/wishList'/>">WishList</a></li>
									<li><a href="<c:url value='/mypage/salesItem'/>">판매물품목록</a></li>
									<li><a href="<c:url value='/mypage/rentalItem'/>">대여물품목록</a></li>
									<li><a href="<c:url value='/mypage/message'/>">쪽지함</a></li>
									<li><a href="<c:url value='/mypage/billingManagement'/>">결제관리</a></li>
									<li><a href="#">회원정보수정</a></li>
									<li><a href="<c:url value='/member/logout'/>">로그아웃</a></li>
								</ul>
							</div>
						</li>
					</c:otherwise>
				</c:choose>
			</ul>
		</div>
		<div class="headerNavaction container">
			<div class="headerIcon">
				<a href="<c:url value='/'/>">Logo</a>
			</div>
			<ul>
				<li><a href="<c:url value='/'/>">Home</a></li>
				<li><a href="<c:url value='/board/goodsList'/>">Sharing</a></li>
				<li><a href="<c:url value='/board/goodsList'/>">Rental</a></li>
				<div class="headerIconNavaction">
					<li><a href="#"><span class="material-icons">search</span></a></li>
					<li><a href="#"><span class="material-icons">shopping_cart</span></a></li>
					<li><a href="#"><span class="material-icons">notifications_none</span></a></li>
					<li><a href="#"><span class="material-icons">attach_money</span></a></li>
				</div>
			</ul>
		</div>
		<div class="mobileHeaderNavaction">
			<a href="<c:url value='/'/>">Logo</a> <span class="material-icons">&#xE5D2;</span>
		</div>

	</div>

</body>
</html>