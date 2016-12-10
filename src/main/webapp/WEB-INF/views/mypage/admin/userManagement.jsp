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
	<div id="userManagement">
		 <ul class="nav nav-tabs">
    <li class="active"><a data-toggle="tab" href="#userManagementAllUser">전체회원</a></li>
    <li><a data-toggle="tab" href="#userManagementDeclaration">신고당한 회원</a></li>
    <li><a data-toggle="tab" href="#userManagementStop">정지회원</a></li>
  </ul>

  <div class="tab-content">
    <div id="userManagementAllUser" class="tab-pane fade in active">
	<form action="" method="">
  		<table>
  			<tr>
  				<td><input type="checkbox" disabled></td>
  				<td>아이디</td>
  				<td>비밀번호</td>
  				<td>이름</td>
  				<td>생년월일</td>
  				<td>주소</td>
  				<td>계좌번호</td>
  				<td>계정</td>
  				<td>유효한 달</td>
  				<td>유효한 년도</td>
  				<td>공유수</td>
  				<td>전화번호</td>
  			</tr>
  		
   			<tr>
  				<td><input type="checkbox" name=""></td>
  				<td>DEOND1234</td>
  				<td>awec8745</td>
  				<td>아이유</td>
  				<td>1993.05.16</td>
  				<td>경기 성남시 분당구 판교동</td>
  				<td>205-4588-4755-6421</td>
  				<td>일반</td>
  				<td>12</td>
  				<td>22</td>
  				<td>14</td>
  				<td>010-4843-5484</td>
  			</tr>
 
  		</table>
	</form>
    </div>
    <div id="userManagementDeclaration" class="tab-pane fade">
     		<form action="" method="">
  		<table>
  			<tr>
  				<td><input type="checkbox" disabled></td>
  				<td>아이디</td>
  				<td>비밀번호</td>
  				<td>이름</td>
  				<td>생년월일</td>
  				<td>주소</td>
  				<td>계좌번호</td>
  				<td>계정</td>
  				<td>유효한 달</td>
  				<td>유효한 년도</td>
  				<td>공유수</td>
  				<td>전화번호</td>
  			</tr>
  		
   			<tr>
  				<td><input type="checkbox" name=""></td>
  				<td>DEOND1234</td>
  				<td>awec8745</td>
  				<td>아이유</td>
  				<td>1993.05.16</td>
  				<td>경기 성남시 분당구 판교동</td>
  				<td>205-4588-4755-6421</td>
  				<td>일반</td>
  				<td>12</td>
  				<td>22</td>
  				<td>14</td>
  				<td>010-4843-5484</td>
  			</tr>
 
  		</table>
	</form>
    </div>
    <div id="userManagementStop" class="tab-pane fade">
      	<form action="" method="">
  		<table>
  			<tr>
  				<td><input type="checkbox" disabled></td>
  				<td>아이디</td>
  				<td>비밀번호</td>
  				<td>이름</td>
  				<td>생년월일</td>
  				<td>주소</td>
  				<td>계좌번호</td>
  				<td>계정</td>
  				<td>유효한 달</td>
  				<td>유효한 년도</td>
  				<td>공유수</td>
  				<td>전화번호</td>
  			</tr>
  		
   			<tr>
  				<td><input type="checkbox" name=""></td>
  				<td>DEOND1234</td>
  				<td>awec8745</td>
  				<td>아이유</td>
  				<td>1993.05.16</td>
  				<td>경기 성남시 분당구 판교동</td>
  				<td>205-4588-4755-6421</td>
  				<td>일반</td>
  				<td>12</td>
  				<td>22</td>
  				<td>14</td>
  				<td>010-4843-5484</td>
  			</tr>
 
  		</table>
	</form>
    </div>
  </div>
</div>
<div class="userManagementPaging">
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
<div class="userManagementSearch">
<form>
	<select name="">
		<option value="아이디">아이디</option>
		<option value="이름">이름</option>
		<option value="주소">주소</option>
	</select>
	<input type="text" name="">
	<input type="button" value="검색">
</form>
</div>

</body>
</html>
 