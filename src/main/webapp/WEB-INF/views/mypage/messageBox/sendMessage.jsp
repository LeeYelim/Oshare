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
			<li><a data-toggle="tab" href="#inbox">받은쪽지함</a></li>
			<li><a data-toggle="tab" href="#sent">보낸쪽지함</a></li>
		</ul>

		<div class="tab-content">

			<div id="writeNote" class="tab-pane fade in active">
				<div class="sendMessageTabForm">
					<form action="" metohd="">
						<div class="recipient">
							<span>받는이</span> <input type="text" name="">
						</div>
						<div class="noteContent">
							<span>쪽지내용</span>
							<textarea name=""></textarea>
						</div>
					</form>
					<div class="sendMessageBtn">
						<input type="submit" value="쪽지보내기">
					</div>
				</div>
			</div>
			<div id="inbox" class="tab-pane fade">받은쪽지</div>
			<div id="sent" class="tab-pane fade">보낸쪽지</div>
		</div>
	</div>
</body>
</html>
