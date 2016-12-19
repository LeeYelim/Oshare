<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
	<div class="rentalItemListForm">
	<span>대여물품목록</span>
		<table id="rentalItemTable" class="display" cellspacing="0" width="100%" >
				<thead><tr>
					<th>사진</th>
					<th>제품명</th>
					<th>판매자 ID</th>
					<th>판매자 연락처</th>
					<th>반납일</th>
					<th>거래상태</th>
				</tr></thead>
			<tbody>
				<c:forEach items="${requestScope.rentallist}" var="board">
					<c:forEach items="${board.sharing}" var="sharing" >
						<tr><td>
							<img src="<c:url value='/resources/image/book.jpg'/>"alt="asd">
						</td>
						<td> 
							${board.productName} 
						</td>
						<td>
							${sharing.sellerId}
						</td>
						<td>
							${sharing.member.memberPhone}
						</td>
						<td>
							${sharing.sharingEnd}
						</td>
						<td>
							<div class="rentalItemListTransactionStatus">
							<span>${sharing.transactionState}</span>
							<input type="hidden" id="'sharingNo" value="${sharing.sharingNo}">
							<input type="button" value="반납신청" id="${sharing.sharingNo}">
							</div>
						</td></tr>
					</c:forEach>
				</c:forEach>
				</tbody>
			</table>
		</div>
	<div class="rentalItemListDialog">
	
	<form action="<c:url value="/reservation/applyReturn"/>" method="post" id="returnForm">
     	<div class="rentalItemListDialogTitle">
		<span>반납신청</span>
		<span class="material-icons rentalItemListClose ">&#xE5CD;</span>
		</div>
		<div class="rentalItemListDialogForm">
		<div class="rentalItemList">
			<select name="returnState">
				<option value="반납">반납</option>
				<option value="파손">파손</option>
				<option value="분실">분실</option>
			</select>
		</div>
		<div class="rentalItemEvaluation">
			<div id="rateYo"></div>
		</div>
		<div class="sellerEvaluation">
		<span>판매자평가 </span>
		<textarea name=""></textarea>
		</div>
		<div class="rentalItemListBtn">
	    	<input type="button" value="신청"><input type="button" value="취소">
	    </div>
    </div>
	   </form>
	</div>
	</body>
</html>
