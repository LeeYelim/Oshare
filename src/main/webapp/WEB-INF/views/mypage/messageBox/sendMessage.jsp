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
	<div class="sendMessageForm">
		<ul class="nav nav-tabs">
			<li class="active"><a data-toggle="tab" href="#writeNote">쪽지쓰기</a></li>
			<li><a data-toggle="tab" href="#inbox" class="receiverMessage">받은쪽지함</a></li>
			<li><a data-toggle="tab" href="#sent" class="senderMessage">보낸쪽지함</a></li>
		</ul>

		<div class="tab-content">

			<div id="writeNote" class="tab-pane fade in active">
				<div class="sendMessageTabForm">
					<form action="<c:url value='/mypage/sendMessageInsert'/>" metohd=""
						onsubmit="return sendMessageValidityCheck()">
						<input type="text" value="${sessionScope.loginMemberId}"
							name="sender" hidden>
						<div class="sender">
							<span>송신자 ${sessionScope.loginMemberId}</span>
						</div>
						<div class="recipient">
							<span>수신자</span> <input type="text" name="receiver">
						</div>
						<div class="noteContent">
							<span>쪽지내용</span>
							<textarea name="content"></textarea>
						</div>

						<div class="sendMessageBtn">
							<input type="submit" value="쪽지보내기">
						</div>
					</form>
				</div>
			</div>
			<div id="inbox" class="tab-pane fade">
				<div class="inMessage">
					<span>받은쪽지</span>
					<form action="" method="">
						<table>
							<tr>
								<td><input type="checkbox" class="allCheck"></td>
								<td>내용</td>
								<td>보낸사람</td>
								<td>시간</td>
							</tr>
						
						</table>
					</form>
				</div>
				<div class="inSendMessagePaging">
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
					<div class="inSendMessageBtn">
						<input type="button" value="삭제">
					</div>
				</div>
			</div>
			<div id="sent" class="tab-pane fade">
				<div class="outMessage">
					<span>보낸쪽지</span>
					<form action="" method="">
						<table>
							<tr>
								<td><input type="checkbox" class="allCheck"></td>
								<td>내용</td>
								<td>받는사람</td>
								<td>시간</td>
							</tr>
							
						</table>
					</form>
				</div>
				<div class="outSendMessagePaging">
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
					<div class="outSendMessageBtn">
						<input type="button" value="삭제">
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
