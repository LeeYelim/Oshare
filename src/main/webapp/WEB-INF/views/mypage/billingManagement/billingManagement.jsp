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
	<div class="billingManagementForm">
	<span>대여물품목록</span>
		<table>
				<tr>
					<td>사진</td>
					<td>제품명</td>
					<td>일일대여비</td>
					<td>대여기간</td>
					<td>대여료</td>
					<td>추가비용</td>
					<td>총액</td>
					<td>확인</td>
				</tr>
				<tr>
					<td><img src="<c:url value='/resources/image/book.jpg'/>"
						alt="asd"></td>
					<td>
						Apple 
					</td>
					<td>500원</td>
					<td>2016.12.06 - 2016.12.23 </td>
					<td>
						5000원
					</td>
					<td>3000원</td>
					<td>5500원</td>
					<td><input type="button" value="확인"></td>
				</tr>
			</table>
		</div>
		<div class="billingManagementPaging">
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
	</body>
</html>
