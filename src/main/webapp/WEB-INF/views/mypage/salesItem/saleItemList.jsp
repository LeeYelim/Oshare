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
		<table id="saleItemTable" class="display" cellspacing="0" width="100%";>
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
			<li>1일 대여비 : <span id="price"></span></li>
			<li>대여기간 : <span id="sharingDays"></span></li>
			<li>총 대여료 : <span id="totalPrice"></span></li>
			</ul>
		</div>
		<div class="annualFee">
			<span>연체료</span>
			<ul>
				<li>연체일 : <span id="overDue"></span></li>
				<li>연체료(1일 대여료*150%) : <span id="overDueFee"></span></li>
				<li>총 연체료 : <span id="totalOverDueFee"></span></li>
			</ul>
		</div>
		<div class="saleItemAddMoney">
			<span>추가비용</span>
			<ul>
				<li><span>사유 : </span><textarea name="demandReason"></textarea></li>
				<li><span>청구 비용 : </span><input type="text" name="demandFee">
			</ul>
		</div>
		<div class="totalAmount">
			<ul>
				<li>총액 : <span id="totalMoney"></span>원</li>
				<li>결제한 금액 : <span id="paidMoney"></span>원</li>
			</ul>
		</div>
		<div class="totalCharges">
			<span>총 청구 금액 : </span><span id="totalDemandPayment"></span>원
		</div>
		<div class="saleItemBtn">
			<input type="submit" value="신청">
			<input type="button" value="취소">
		</div>
		</form>
		

</body>
</html>