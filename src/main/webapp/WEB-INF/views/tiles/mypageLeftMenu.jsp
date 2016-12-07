<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div class="mypageMenu">
		<ul>
			<li>myPage</li>
			<li><a href="<c:url value='/mypage/wishList'/>">WishList</a></li>
			<li><a href="<c:url value='/mypage/salesItem'/>">판매물품목록</a></li>
			<li><a href="<c:url value='/mypage/rentalItem'/>">대여물품목록</a></li>
			<li><a href="<c:url value='/mypage/billingManagement'/>">결제관리</a></li>
			<li><a href="<c:url value='/mypage/message'/>">쪽지함</a></li>
			<li><a href="<c:url value='/'/>">회원정보수정</a></li>
		</ul>
	</div>
</body>
</html>