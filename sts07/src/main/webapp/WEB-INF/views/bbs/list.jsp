<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/day06/css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
   href="/day06/css/bootstrap-theme.css" />
<script type="text/javascript" src="/day06/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="/day06/js/bootstrap.js"></script>
<style type="text/css">
nav img {
   height: 100%;
}
</style>
</head>
<body>
   <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
         <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed"
               data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
               aria-expanded="false">
               <span class="sr-only">Toggle navigation</span> <span
                  class="icon-bar"></span> <span class="icon-bar"></span> <span
                  class="icon-bar"></span>
            </button>

            <a class="navbar-brand" href="/day06/"> <img alt="Brand"
               src="/day06/imgs/logo.png">
            </a>
         </div>
         <!-- menu header end -->
         <div class="collapse navbar-collapse"
            id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
               <li><a href="/day06/">HOME</a></li>
               <li><a href="/day06/intro">INTRO</a></li>
               <li class="dropdown active"><a href="#"
                  class="dropdown-toggle" data-toggle="dropdown" role="button"
                  aria-haspopup="true" aria-expanded="false">BBS<span
                     class="caret"></span></a>
                  <ul class="dropdown-menu">
                     <li><a href="#">LIST</a></li>
                     <li role="separator" class="divider"></li>
                     <li><a href="/day06/bbs/add">ADD</a></li>
                  </ul></li>
            </ul>
         </div>
         <!-- /navbar-collapse -->
      </div>
      <!-- menu container-fluid end -->
   </nav>

   <div class="container-fluid">
      <div id="header" class="row">
         <div class="col-md-12">

            <div class="jumbotron">
               <h1>List Page</h1>
               <a href="/day06/bbs/add">입력페이지</a>
            </div>

         </div>
      </div>
      <div id="content" class="row">
         <div class="col-md-12">

            <div class="list-group">
               <c:forEach items="${alist }" var="bean">
                  <a href="/day06/bbs/${bean.num }" class="list-group-item"> <span
                     class="badge">${bean.cnt }</span>
                     <h4 class="list-group-item-heading">${bean.sub }</h4>
                     <p class="list-group-item-text">${bean.name }</p>
                  </a>
               </c:forEach>
            </div>

         </div>
      </div>
      <div id="footer" class="row">
         <div class="col-md-12">
            <address>
               <strong>(주)비트컴퓨터 서초본원</strong><br>비트캠프 서울시 서초구 강남대로 459 (서초동,
               백암빌딩)<br>
            </address>

            <address>
               <strong>Copyright &copy; 비트캠프 All rights reserved.</strong><br>
               <a href="mailto:ililil9482@naver.com">문의 : 02-3486-9600</a>

            </address>
         </div>
      </div>
   </div>

</body>
</html>