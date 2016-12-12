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
					<td>판매상태</td>
					<td>비용청구</td>
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
		
		
				<%-- <tr>
					<td>사진</td>
					<td>제품명</td>
					<td>대여자 ID</td>
					<td>대여자 연락처</td>
					<td>판매상태</td>
					<td>비용청구</td>
				</tr>
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
					<td>대여중..</td>
					<td><input type="button" value="비용청구"></td>
				</tr> --%>
				
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
	<form action="" method="">
		<div class="saleItemAddMoney">
			<span>추가비용</span><input number="number" name="">원
		</div>
		<div class="saleItemAddMoneyReason">
			<span>추가비용사유</span><textarea name=""></textarea>
		</div>
		<div class="saleItemBtn">
			<input type="submit" value="신청">
			<input type="button" value="취소">
		</div>
		</form>
		

</body>
</html>