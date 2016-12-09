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
<form action="" method="">
	<div class="shoppingBasketForm">
		<span>장바구니</span>
		<table>
			<tr>
				<td><input type="checkbox" disabled></td>
				<td>제품</td>
				<td>예약일</td>
				<td>총액</td>
			</tr>
			<tr>
				<td><input type="checkbox" name=""></td>
				<td><img src="<c:url value='/resources/image/book.jpg'/>" alt="장바구니 이미지"><p>노트북</p></td>
				<td>2016-12-01</td>
				<td>76,000원</td>
			</tr>
		</table>
	</div>
	<div class="shoppingBasketTotalAmountForm">
		<div class="shoppingBasketTotalAmount"><span>총액 : <span>37000원</span></span></div>
		<div class="shoppingBasketTotalAmountBtn">
		<input type="button" name="" value="취소하기">
		<input type="button" name="" value="결제하기">
		</div>
	</div>
</form>
</div>
</body>
</html>