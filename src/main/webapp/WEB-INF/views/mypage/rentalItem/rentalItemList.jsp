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
	<div class="rentalItemListForm">
		<div class="rentalItemListTitle">
		<span>대여물품목록</span>
		</div>
		<table id="rentalItemTable" class="display" cellspacing="0" width="100%" >
		<thead>
			<tr>
				<th>사진</th>
				<th>제품명</th>
				<th>대여자 ID</th>
				<th>대여자 연락처</th>
				<th>대여일</th>
				<th>반납일</th>
				<th>거래상태</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requestScope.rentallist}" var="board">
				<c:forEach items="${board.sharing}" var="sharing">
					<tr>
						<td><img src="<c:url value='/resources/image/book.jpg'/>"alt="asd"></td>
						<td>${board.productName}</td>
						<td>${sharing.buyerId}</td>
						<td>${sharing.member.memberPhone}</td>
						<td>${sharing.start} - ${sharing.end}</td>
						<td><input type="button" value="반납신청"></td>
					</tr>
				</c:forEach>
			</c:forEach>
		
			<tr>
				<td><img src="<c:url value='/resources/image/book.jpg'/>"alt="asd"></td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>123</td>
				<td>5</td>
				<td>
					<div class="rentalItemListTransactionStatus">
						<span>반납신청 중</span> <input type="button" value="">
					</div>
				</td>
			</tr>
			</tbody>
		
		</table>
	</div>
	<div class="rentalItemListDialog">
		<form action="" method="" onsubmit="return rentalItemValidityCheck()">
			<div class="rentalItemListDialogTitle">
				<span>반납신청</span> <span class="material-icons rentalItemListClose ">&#xE5CD;</span>
			</div>
			<div class="rentalItemListDialogForm">
				<div class="rentalItemList">
					<select name="rentalItemList">
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
					<input type="submit" value="신청"><input type="button"
						value="취소">
				</div>
			</div>
		</form>
	</div>
</body>
</html>
