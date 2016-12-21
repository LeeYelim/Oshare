<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
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
						<td>제품명</td>
						<td>예약일</td>
						<td>총액</td>
					</tr>
	<c:choose>
    <c:when test="${empty requestScope.cartList}">
	<tr>
        <td colspan="5">
            <p align="center"><b><span>등록된 상품이 없습니다.</span></b></p>
        </td>
    </tr>
    </c:when>
    <c:otherwise>
	<c:forEach items="${requestScope.cartList}" var="cartDTO">
		    <tr>
		    	
		     	<td>
		            <input type="checkbox" name="check">
		        </td>
		        <td>
					<p><span>
							<a href="<c:url value='/board/goodsDetail?boardNo=${cartDTO.boardNo}'/>">
					<img src="<c:url value='/resources/image/book.jpg'/>"alt="장바구니 이미지">
					</a>
					</span></p>
		        </td>
		         <td>
		            <p align="center"><span>${cartDTO.productName}</span></p>
		        </td>
		        <td>
		            <p align="center"><span>${cartDTO.cartStart}~${cartDTO.cartEnd }</span></p>
		        </td>
		         
		        <td>
		            <p align="center"><span>
		            <fmt:formatNumber value="${cartDTO.cartPrice}"/></span></p>
		        </td>
		    </tr>
    </c:forEach>
	</c:otherwise>
    </c:choose>
</table>
			</div>
			<div class="shoppingBasketTotalAmountForm">
				<div class="shoppingBasketTotalAmount">
					<span>총액 : <span>${total}원</span></span>
				</div>
				<div class="shoppingBasketTotalAmountBtn">
					<input type="button" name="" value="취소하기">
					<input type="button" name="paymen" value="결제하기">
					<input type="button" name="" value="삭제하기">
				</div>
			</div>
		</form>
	</div>
	<br>
</body>
</html>