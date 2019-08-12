<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css" />
<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<title>T singer</title>
</head>
<body>
	<%
		String root = request.getContextPath();
	%>
	<div id="header">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-12">
					<nav class="navbar navbar-default">
						<div class="container-fluid">
							<!-- Brand and toggle get grouped for better mobile display -->
							<div class="navbar-header">
								<button type="button" class="navbar-toggle collapsed"
									data-toggle="collapse"
									data-target="#bs-example-navbar-collapse-1">
									<span class="sr-only">Toggle navigation</span> <span
										class="icon-bar"></span> <span class="icon-bar"></span> <span
										class="icon-bar"></span>
								</button>
								<a class="navbar-brand" href="<%=root%>/">T signer</a>
							</div>

							<!-- Collect the nav links, forms, and other content for toggling -->
							<div class="collapse navbar-collapse"
								id="bs-example-navbar-collapse-1">

								<ul class="nav navbar-nav">
									<li><a class="edit" href="<%=root%>/">HOME</a></li>
									<li><a class="edit" href="<%=root%>/notice">NOTICE</a></li>
									<li><a class="edit" href="<%=root%>/planer">PLANER</a></li>
									<li><a class="edit" href="<%=root%>/booking">BOOKING</a></li>
									<li><a class="edit" href="<%=root%>/community">COMMUNITY</a></li>
								</ul>
								<ul class="nav navbar-nav navbar-right">
									<li><a class="edit" href="#">로그인&nbsp;&nbsp;회원가입</a></li>
								</ul>


							</div>
							<!-- /.navbar-collapse -->
						</div>
						<!-- /.container-fluid -->
					</nav>
				</div>
			</div>
		</div>

	</div>
</body>
</html>