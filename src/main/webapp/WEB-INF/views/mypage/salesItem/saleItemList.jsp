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
		<div class="saleItemListTitle">
  		<span>판매물품목록</span>		  		
  		</div>		  		
		<table id="saleItemTable" class="display" cellspacing="0" width="100%">
			<thead>
				<tr>
					<th>사진</th>
					<th>제품명</th>
					<th>대여자 ID</th>
					<th>대여자 연락처</th>
					<th>반납일</th>
					<th>거래상태</th>
				</tr>
			</thead>
			<tbody>
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
						${sharing.sharingEnd}
					</td>
					<td><div class="saleItemListTransactionStatus">
					<span>${sharing.transactionState}</span>
					<input type="hidden" id="'sharingNo" value="${sharing.sharingNo}">
					<input type="button" value="비용청구">
					</div>
					</td></tr>
				</c:forEach>
			</c:forEach>
	
			</tbody>
			</table>
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