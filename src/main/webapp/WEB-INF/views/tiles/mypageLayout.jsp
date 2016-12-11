<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"href="<c:url value='/resources/css/bootstrap.min.css'/>">
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/style.css'/>">
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/owl.carousel.css'/>">
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/jquery.rateyo.css'/>">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"rel="stylesheet">

<title>Oshare</title>
<style>

#contentTiles {
	width: 80%;
	float: left;
}
</style>
</head>
<body>
	<div id="main">
		<header>
			<tiles:insertAttribute name="header" />
		</header>
	
		<div class="container">
			
		<div id="mypageLeftMenuTiles">
			<tiles:insertAttribute name="mypageMenu" />
		</div>
		<div id="contentTiles">
			<tiles:insertAttribute name="mypageContent" />
			
		</div>
	</div>
		<footer>
			<tiles:insertAttribute name="footer" />
		</footer> 
	</div>
	<div class="dialogBlack"></div>
	<div class="mobileHeaderNavactionMenu">
		<ul>
			<li><span class="material-icons close">close</span></li>
			<li><a href="#">My Page</a></li>
			<li><a href="<c:url value='/'/>">Home</a></li>
			<li><a href="<c:url value='/board/goodsList'/>">Sharing</a></li>
			<li><a href="<c:url value='/board/goodsList'/>">Rental</a></li>
			<li><a href="#"><span class="material-icons">search</span></a></li>
			<li><a href="#"><span class="material-icons">shopping_cart</span></a></li>
			<li><a href="#"><span class="material-icons">notifications_none</span></a></li>
			<li><a href="#"><span class="material-icons">attach_money</span></a></li>
			<li><a href="<c:url value='/member/loginForm'/>">Login</a></li>
			<li><a href="#">Join us</a></li>
		</ul>

	</div>

	<script type="text/javascript" src="<c:url value='/resources/js/jquery-2.2.4.min.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/resources/js/owl.carousel.min.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/resources/js/jquery.rateyo.min.js'/>" ></script>
	<script type="text/javascript" src="<c:url value='/resources/js/index_js.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/resources/js/validityCheck.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/resources/js/SmoothScroll.js'/>"></script>
</body>
</html>