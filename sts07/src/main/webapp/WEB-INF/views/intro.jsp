<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/day06/css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" href="/day06/css/bootstrap-theme.css"/>
<style type="text/css">
	nav img{
		height: 100%;
	}
</style>
<script type="text/javascript" src="/day06/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="/day06/js/bootstrap.js"></script>
</head>
<body>
		<nav class="navbar navbar-inverse navbar-fixed-top">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
			        <span class="sr-only">Toggle navigation</span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
			        <span class="icon-bar"></span>
		      </button>
		    
		      <a class="navbar-brand" href="/day06/">
		        <img alt="Brand" src="/day06/imgs/logo.png">
		      </a>
		    </div><!-- 메뉴 헤더 끝 -->
		     <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
       	<li><a href="/day06/">HOME</a></li>
       	<li class="active"><a href="/day06/intro">INTRO</a></li>
       	<li class="dropdown">
       		<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">BBS<span class="caret"></a>
       		<ul class="dropdown-menu">
       			<li><a href="#">LIST</a></li>
       			<li><a a href="/day06/bbs/add">ADD</a></li>
       		</ul>
       	</li>
      </ul>
 </div><!-- /.navbar-collapse -->
		    
		  </div><!-- 메뉴 container-fluid 끝 -->
		</nav>
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="jumbotron">
					  <h1>Intro!</h1>
					</div>
				
				</div>
				
			</div>
			
			<div id="content" class="row">
				<div class="col-md-12">
				</div>
				
			</div>
		
			<div id="footer" class="row">
				<div class="col-md-12">
					<address>
						  <strong>Bitcamp, Inc.</strong><br>
						비트캠프<br>
						 서울 서초....<br>
						  <abbr title="Phone">P:</abbr> (123) 456-7890
					</address>
						
					<address>
						  <strong>Copyright</strong><br>
						  <a href="mailto:#">비트@example.com</a>
					</address>
				</div>
				
			</div>
		</div>

</body>
</html>