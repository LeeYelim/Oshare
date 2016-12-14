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
	<form action="" method="">
		<div class="container">
			<div class="goodsPaymentForm">
				<table>
					<tr>
						<td>대여제품</td>
						<td>거래방식</td>
						<td>수량</td>
						<td>기간</td>
						<td>대여비</td>
						<td>총액</td>
					</tr>
					<tr>
						<td>유모차</td>
						<td><select name="">
								<option>택배</option>
								<option>직거래</option>
						</select></td>
						<td><input type="number" name=""></td>
						<td><span>7일</span></td>
						<td>10,000원</td>
						<td>70,000원</td>
					</tr>
				</table>
			</div>
			<div class="userInformation">
				<span>주문자 정보</span>
				<ul>
					<li>이름 : <span>박신혜</span></li>
					<li>아이디 : <span>oshare@gmail.com</span></li>
					<li>휴대폰 : <span>010-1234-5678</span></li>
					<li>카드번호 : <span>8492-2478-1123-8465</span></li>
				</ul>
			</div>
			<div class="shippingInformation">
				<span>배송지 정보</span>
				<ul class="nav nav-tabs">
					<li class="active"><a data-toggle="tab" href="#latelyShipping">쪽지쓰기</a></li>
					<li><a data-toggle="tab" href="#newShipping">받은쪽지함</a></li>
				</ul>

				<div class="tab-content">

					<div id="latelyShipping" class="tab-pane fade in active">
						<div class="latelyShippingForm">
							<ul>
								<li>수령인 : <span>김태희</span></li>
								<li>배송지 : <span>경기도 성남시 분당구 삼평동 대왕판교로 670길 유스페이스B동</span></li>
								<li>연락처 : <span> 010-3241-3378</span></li>
								<li>카드정보 : <select name="">
										<option value="321-1234-5512">농협 321-1234-5512</option>
								</select>
								</li>
							</ul>
						</div>
					</div>
					<div id="newShipping" class="tab-pane fade">
						<div class="newShippingForm">
							<form action="" method="">
								<ul>
									<li><span>수령인 :</span> <input type="text" name=""></li>
									<li><span>배소지명 :</span> <input type="text" name="">
										<input type="button" value="찾기"></li>
									<li><span>배송지 :</span> <input type="text" name=""></li>
									<li><span>연락처 :</span> <select name="">
											<option value="010">010</option>
									</select> <input type="number" name=""> <input type="number"
										name=""></li>
								</ul>
							</form>
						</div>
					</div>
				</div>
				<div class="paymentMoney">
					<span>결제금액</span>
					<ul>
						<li>대여비 : <span>10,000원</span></li>
						<li>대여기간 : <span>7일</span></li>
						<li>결제예정 금액 : <span>70,000원</span></li>
					</ul>
				</div>
				<div class="goodsPaymentBtn">
					<input type="submit" value="결제"> <input type="button"
						value="취소">
				</div>

			</div>
	</form>
</body>
</html>