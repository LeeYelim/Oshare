<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main OnShare</title>
</head>
<body>
	<div class="container">
		<div id="carousel-example-generic" class="carousel slide"
			data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#carousel-example-generic" data-slide-to="0"
					class="active"></li>
				<li data-target="#carousel-example-generic" data-slide-to="1"></li>
				<li data-target="#carousel-example-generic" data-slide-to="2"></li>
				<li data-target="#carousel-example-generic" data-slide-to="3"></li>
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				<div class="item active">
					<img src="<c:url value='/resources/image/book.jpg'/>" alt="book">
					<div class="carousel-caption"></div>
				</div>
				<div class="item">
					<img src="<c:url value='/resources/image/NoteBook.jpg'/>"
						alt="book">
					<div class="carousel-caption"></div>
				</div>
				<div class="item">
					<img src="<c:url value='/resources/image/camera.jpg'/>" alt="book">
					<div class="carousel-caption"></div>
				</div>
				<div class="item">
					<img src="<c:url value='/resources/image/Stand.jpg'/>" alt="book">
					<div class="carousel-caption"></div>
				</div>
			</div>

			<!-- Controls -->
			<a class="left carousel-control" href="#carousel-example-generic"
				role="button" data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#carousel-example-generic"
				role="button" data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
	</div>

	<!-- indexSharing Start -->
	<div id="indexSharigForm">
		<div class="container">
			<div class="indexSharingTitle">
				<span>Sharing</span>

				<div class="indexSharingBtn">
					<span class="material-icons SharingPrev">&#xE5CB;</span> <span
						class="material-icons SharingNext">&#xE409;</span>
				</div>
			</div>
			<div class="indexSharingList owl-carousel">
				<div class="item">
					<ul>
						<li><img src="<c:url value='/resources/image/NoteBook.jpg'/>"
							alt="book"><a href="<c:url value='/board/goodsDetail'/>"><span
								class="material-icons goodsDetailViewSee">&#xE8F4;</span></a></li>
						<li>제품명 : IOS</li>
						<li>가격 : 0원 / 0 일</li>
						<li><span class="material-icons heartWish">&#xE87D;</span></li>
					</ul>
				</div>
				<div class="item">
					<ul>
						<li><img src="<c:url value='/resources/image/NoteBook.jpg'/>"
							alt="book"></li>
						<li>제품명 : IOS2</li>
						<li>가격 : 0원 / 0 일</li>
						<li><span class="material-icons heartWish">&#xE87D;</span></li>
					</ul>
				</div>
				<div class="item">
					<ul>
						<li><img src="<c:url value='/resources/image/NoteBook.jpg'/>"
							alt="book"></li>
						<li>제품명 : IOS3</li>
						<li>가격 : 0원 / 0 일</li>
						<li><span class="material-icons heartWish">&#xE87D;</span></li>
					</ul>
				</div>
				<div class="item">
					<ul>
						<li><img src="<c:url value='/resources/image/NoteBook.jpg'/>"
							alt="book"></li>
						<li>제품명 : IOS4</li>
						<li>가격 : 0원 / 0 일</li>
						<li><span class="material-icons heartWish">&#xE87D;</span></li>
					</ul>
				</div>
				<div class="item">
					<ul>
						<li><img src="<c:url value='/resources/image/NoteBook.jpg'/>"
							alt="book"></li>
						<li>제품명 : IOS5</li>
						<li>가격 : 0원 / 0 일</li>
						<li><span class="material-icons heartWish">&#xE87D;</span></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- indexSharing End -->

	<!-- indexRental Start -->
	<div id="indexRentalForm">
		<div class="container">
			<div class="indexRentalTitle">
				<span>Rental</span>
				<div class="indexRentalBtn">
					<span class="material-icons RentalPrev">&#xE5CB;</span> <span
						class="material-icons RentalNext">&#xE409;</span>
				</div>
			</div>
			<div class="indexRentalList owl-carousel">
				<div class="item">
					<ul>
						<li><img src="<c:url value='/resources/image/NoteBook.jpg'/>"
							alt="book"><a href="<c:url value='/board/goodsDetail'/>"><span
								class="material-icons goodsDetailViewSee">&#xE8F4;</span></a></li>
						<li>제품명 : IOS</li>
						<li>가격 : 0원 / 0 일</li>
						<li><span class="material-icons heartWish">&#xE87D;</span></li>
					</ul>
				</div>
				<div class="item">
					<ul>
						<li><img src="<c:url value='/resources/image/NoteBook.jpg'/>"
							alt="book"></li>
						<li>제품명 : IOS2</li>
						<li>가격 : 0원 / 0 일</li>
						<li><span class="material-icons heartWish">&#xE87D;</span></li>
					</ul>
				</div>
				<div class="item">
					<ul>
						<li><img src="<c:url value='/resources/image/NoteBook.jpg'/>"
							alt="book"></li>
						<li>제품명 : IOS3</li>
						<li>가격 : 0원 / 0 일</li>
						<li><span class="material-icons heartWish">&#xE87D;</span></li>
					</ul>
				</div>
				<div class="item">
					<ul>
						<li><img src="<c:url value='/resources/image/NoteBook.jpg'/>"
							alt="book"></li>
						<li>제품명 : IOS4</li>
						<li>가격 : 0원 / 0 일</li>
						<li><span class="material-icons heartWish">&#xE87D;</span></li>
					</ul>
				</div>
				<div class="item">
					<ul>
						<li><img src="<c:url value='/resources/image/NoteBook.jpg'/>"
							alt="book"></li>
						<li>제품명 : IOS5</li>
						<li>가격 : 0원 / 0 일</li>
						<li><span class="material-icons heartWish">&#xE87D;</span></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<!-- indexRental End -->
</body>
</html>