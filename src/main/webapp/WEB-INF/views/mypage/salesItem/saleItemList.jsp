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

	<div class="saleItemListForm">
		<span>판매물품목록</span>
		<table>
			<tr>
					<td>사진</td>
					<td>제품명</td>
					<td>대여자 ID</td>
					<td>대여자 연락처</td>
					<td>거래상태</td>
			</tr>
			<c:forEach items="${requestScope.saleslist}" var="board">
				<c:forEach items="${board.sharing}" var="sharing">
					<tr><td>
						<img src="<c:url value='/resources/image/book.jpg'/>"alt="asd">
					</td>
					<td>
						${board.productName} 
					</td>
					<td>
						${sharing.buyerId}
					</td>
					<td>
						${sharing.member.memberPhone}
					</td>
					<td>
						${sharing.transactionState}
					</td>
					<td>
						<input type="button" value="비용청구">
					</td></tr>
				</c:forEach>
			</c:forEach>	
				<tr>
					<td><img src="<c:url value='/resources/image/book.jpg'/>"
						alt="asd"></td>
					<td>
						Apple 
					</td>
					<td>
						abc1234
					</td>
					<td>123456</td>
					<td>
					<div class="saleItemListTransactionStatus">
					<span>대여중</span>
					<input type="button" value="비용청구">
					</div>
					</td>
				</tr>
				
			</table>
		</div>
		<div class="saleItemListPaging">
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
	<div class="saleItemListDialog">
	<div class="saleItemListDialogTitle">
	<span>비용청구</span>
	<span class="material-icons saleItemListClose ">&#xE5CD;</span>
	</div>	
	<form action="" method="" onsubmit="return saleItemAddMoneyValidityCheck()">
		<div class="rentalFee">
			<span>대여료</span>
			<ul>
			<li>1일 대여비 : <span>500원/일</span></li>
			<li>대여기간 : <span>2016.12.09 ~ 2016.12.23일</span></li>
			<li>총 대여료 : <span>5만원</span></li>
			</ul>
		</div>
		<div class="annualFee">
			<span>연채료</span>
			<ul>
				<li>연채일 : <span>1일</span></li>
				<li>연채료(패널티) <span>150%비용원</span></li>
				<li>총연재료 <span>5000000000원</span></li>
			</ul>
		</div>
		<div class="saleItemAddMoney">
			<span>추가비용</span>
			<ul>
				<li><span>사유 :</span> <textarea name=""></textarea></li>
				<li><span>청구 비용 : </span><input type="number" name="">
			</ul>
		</div>
		<div class="totalAmount">
			<ul>
				<li>총액 : <span>500000원</span></li>
				<li>결제한 금액 : <span>500000원</span></li>
			</ul>
		</div>
		<div class="totalCharges">
			<span>총 청구 금액 : </span> <span>5500000원</span>
		</div>
		<div class="saleItemBtn">
			<input type="submit" value="신청">
			<input type="button" value="취소">
		</div>
		</form>
		

</body>
</html>