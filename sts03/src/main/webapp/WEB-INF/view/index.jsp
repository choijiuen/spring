<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="../css/bootstrap-theme.min.css" />
<style type="text/css">
	.item>img{
		margin: 0px auto;
	}
</style>
<script type="text/javascript" src="../js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
	<div class="row">
		<div class="col-md-12">
			<nav class="navbar navbar-default">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <a class="navbar-brand" href="/">
      	
       		 <div>비트 교육센터</div>
		      </a>
		    </div>
		   <p class="navbar-text"><a href="/" class="navbar-link">HOME</a></p>
		   <p class="navbar-text"><a href="/bbs/list.bit" class="navbar-link">LIST</a></p>
		  <p class="navbar-text navbar-right">
                     <a href="#" class="navbar-link">/ JOINT</a>
                  </p>
                  <p class="navbar-text navbar-right">
                     <a href="#" class="navbar-link">LOGIN</a>
                  </p>
		  </div>
		</nav>
		</div>
	</div>
  <div class="row">
	  <div class="col-md-12">
	  	
	  </div>
	  <div class="row">
				  	<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
			  <!-- Indicators -->
			  <ol class="carousel-indicators">
			    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
			    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
			    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
			  </ol>
			
			  <!-- Wrapper for slides -->
			  <div class="carousel-inner" role="listbox">
			    <div class="item active">
			      <img src="/imgs/b1.jpg" alt="b1">
			      <div class="carousel-caption">
			      	첫 번째 이미지
			      </div>
			    </div>
			    <div class="item">               
			      <img src="/imgs/b2.jpg" alt="b2">
			      <div class="carousel-caption">
			      	두 번째 이미지
			      </div>
			    </div>
			    <div class="item">
			      <img src="/imgs/b3.jpg" alt="b3">
			      <div class="carousel-caption">
			      	세 번째 이미지
			      </div>
			    </div>
			    
			  </div>
			
			  <!-- Controls -->
			  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
			    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
			    <span class="sr-only">Previous</span>
			  </a>
			  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
			    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			    <span class="sr-only">Next</span>
			  </a>
			</div>
	  </div>

	</div>	
</div>
</body>
</html>