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
	<span>대여물품목록</span>
		<table>
				<tr>
					<td>사진</td>
					<td>제품명</td>
					<td>대여자 ID</td>
					<td>대여자 연락처</td>
					<td>반납일</td>
					<td>반납신청</td>
				</tr>
				<c:forEach items="${requestScope.rentallist}" var="board">
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
							${sharing.start} - ${sharing.end}
						</td>
						<td>
							<input type="button" value="반납신청">
						</td></tr>
					</c:forEach>
				</c:forEach>
			</table>
		</div>
		<div class="rentalItemListPaging">
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
	<div class="rentalItemListDialog">
	<form action="" method="" onsubmit="return rentalItemValidityCheck()">
     	<div class="rentalItemListDialogTitle">
		<span>반납신청</span>
		<span class="material-icons rentalItemListClose ">&#xE5CD;</span>
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
	    	<input type="submit" value="신청"><input type="button" value="취소">
	    </div>
    </div>
	   </form>
	</div>
	</body>
</html>
