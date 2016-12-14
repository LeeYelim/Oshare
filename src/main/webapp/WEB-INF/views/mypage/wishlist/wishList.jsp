<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<div class="wishListForm">
		<span>WishList</span>
		<table>
			<tr>
				<td>제품</td>
				<td>제품명</td>
			</tr>
			<tr>
				<td><img src="<c:url value='/resources/image/book.jpg'/>"
					alt="asd"></td>
				<td><span class="material-icons close wishListClose ">&#xE5CD;</span>
					<h3>컴퓨터 I-7 5세대 RAM 8G</td>
			</tr>

		</table>
	</div>
	<div class="wishListPaging">
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