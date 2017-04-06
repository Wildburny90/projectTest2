<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "./CheckJSP/homeCheck.jsp" %>  
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">
	
	<title>Home - CheeseMap</title>
	
	<!-- Bootstrap Core CSS -->
	<link href="./resources/vendor/bootstrap/css/bootstrap.min.css"	rel="stylesheet">
	
	<!-- Theme CSS -->
	<link href="./resources/css/freelancer.css" rel="stylesheet">
	
	<!-- board_list -->
	<link href="./resources/css/board_list.css" rel="stylesheet">
	
	<!-- my_menu -->
	<link href="./resources/css/my_menu.css" rel="stylesheet">
	
	<!-- joinForm -->
	<link href="./resources/css/joinForm.css" rel="stylesheet">
	
	<!-- map -->
	<link href="./resources/css/map.css" rel="stylesheet">
	
	<!-- Custom Fonts -->
	<link href="./resources/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">

</head>

<body id="page-top" class="index">
	<!-- Navigation -->
	<nav id="mainNav" class="navbar navbar-default navbar-fixed-top navbar-custom">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header page-scroll">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span>
					Menu<i class="fa fa-bars"></i>
				</button>
				<a class="navbar-brand" href="#page-top">We Are Cheese</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li class="page-scroll">
						<a href="#login">login</a>
					</li>
					<li class="page-scroll">
						<a href="#about">about</a>
					</li>
					<li class="page-scroll">
						<a href="#join">join</a>
					</li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>

    <!-- Header -->
	<header>
		<div class="container" id="maincontent" tabindex="-1">
			<div class="row">
				<div class="col-lg-12">
					<img class="img-responsive" src="./resources/img/logo.png" alt="">
					<div class="intro-text">
						<h1 class="name">Cheese</h1>
						<hr class="star-light">
					</div>
				</div>
			</div>
		</div>
	</header>

	<!-- login Grid Section -->
	<section id="login">
		<div class="container">
			<jsp:include page="login.jsp" flush="true"></jsp:include>
		</div>
	</section>

	<!-- About Section -->
	<section class="success" id="about">
		<div class="container">
			<div class="row">
				<div class="col-lg-12 text-center">
					<h2>About</h2>
					<hr class="star-light">
				</div>
			</div>
			<div class="row">
				<div class="col-lg-4 col-lg-offset-2">
					<p>Freelancer is a free bootstrap theme created by Start Bootstrap. The download includes the complete source files including HTML, CSS, and JavaScript as well as optional LESS stylesheets for easy customization.</p>
				</div>
				<div class="col-lg-4">
					<p>Whether you're a student looking to showcase your work, a professional looking to attract clients, or a graphic artist looking to share your projects, this template is the perfect starting point!</p>
				</div>
			</div>
		</div>
	</section>
	
	<!-- join Grid Section -->
	<section id="join">
		<div class="row">
			<jsp:include page="joinForm.jsp" flush="true"></jsp:include>
		</div>
	</section>
	
	<!-- Footer -->
	<footer class="text-center">
		<div class="footer-above">
			<div class="container">
				<div class="row">
					<div class="footer-col col-md-4">
						<h3>Location</h3>
						<p>Seoul Gangnam-gu Samseong-dong Trade Center COEX </p>
					</div>
					<div class="footer-col col-md-4">
						<h3>Around the Web</h3>
						<ul class="list-inline">
							<li>
								<a href="http://facebook.com/" class="btn-social btn-outline"><span class="sr-only">Facebook</span><i class="fa fa-fw fa-facebook"></i></a>
							</li>
							<li>
								<a href="http://plus.google.com/" class="btn-social btn-outline"><span class="sr-only">Google Plus</span><i class="fa fa-fw fa-google-plus"></i></a>
							</li>
							<li>
								<a href="http://twitter.com/" class="btn-social btn-outline"><span class="sr-only">Twitter</span><i class="fa fa-fw fa-twitter"></i></a>
							</li>
							<li>
								<a href="http://www.instagram.com/" class="btn-social btn-outline"><span class="sr-only">Linked In</span><i class="fa fa-fw fa-linkedin"></i></a>
							</li>
						</ul>
					</div>
					<div class="footer-col col-md-4">
						<h3>About Cheese Member</h3>
						<p>Namkung JI-woong / Lee Soo Kyoung / Oh Tae Gwan / Choi Seon Hee</p>
					</div>
				</div>
			</div>
		</div>
		<div class="footer-below">
            <div class="container">
				<div class="row">
					<div class="col-lg-12">
						Copyright &copy; Your Website 2017
					</div>
				</div>
			</div>
		</div>
	</footer>

	<!-- jQuery -->
	<script src="./resources/vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="./resources/vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Plugin JavaScript -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>

	<!-- Contact Form JavaScript -->
	<script src="./resources/js/jqBootstrapValidation.js"></script>
	<script src="./resources/js/contact_me.js"></script>
	
	<!-- login.js -->
	<script src="./resources/js/login.js"></script>

	<!-- Theme JavaScript -->
	<script src="./resources/js/freelancer.js"></script>
	
	<!-- joinForm.js -->
	<script src="./resources/js/joinForm.js"></script>

</body>

</html>
