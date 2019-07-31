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
<style type="text/css">
nav img {
   height: 100%;
}
</style>
<script type="text/javascript" src="/day06/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="/day06/js/bootstrap.js"></script>

</head>
<body>
   <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container-fluid">
         <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed"
               data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
               aria-expanded="false">
               <span class="sr-only">Toggle navigation</span> <span
                  class="icon-bar"></span> <span class="icon-bar"></span> <span
                  class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/day06/imgs/1.jpg"> <img
               alt="Brand" src="/day06/imgs/1.jpg">
            </a>
         </div>
         <!-- 메뉴 헤더 끝 -->
         <div class="collapse navbar-collapse"
            id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right">
               <li><a href="/day06/">HOME</a></li>
               <li><a href="/day06/intro">INTRO</a></li>
               <li class="dropdown active"><a href="#"
                  class="dropdown-toggle" data-toggle="dropdown" role="button"
                  aria-haspopup="true" aria-expanded="false">BBS<span
                     class="caret"></span></a>
                  <ul class="dropdown-menu">
                     <li><a>List</a></li>
                     <li role="separator" class="divider"></li>
                     <li><a a href="/day06/bbs/add">Add</a></li>
                  </ul></li>
            </ul>

         </div>
         <!-- /.navbar-collapse -->

         <!-- 메뉴 컨테이너 플루드 끝 -->
      </div>
   </nav>
   <div class="container">
      <div class="row">
         <div class="col-md-12">
            <div class="jumbotron">
               <h1>Insert Page</h1>
            </div>
         </div>
      </div>
      <div id="content" class="row">
         <div class="col-md-12">
            <form class="form-horizontal" action="../bbs" method="post">
               
               
               <div class="form-group">
                  <label for="sub" class="col-sm-2 control-label">제목</label>
                  <div class="col-sm-10">
                     <input type="text" class="form-control" id="sub" name="sub" placeholder="제목을 입력">
                  </div>
               </div>
               
               <div class="form-group">
                  <label for="name" class="col-sm-2 control-label">글쓴이</label>
                  <div class="col-sm-10">
                     <input type="text" class="form-control" id="name" name="name" placeholder="글쓴이" >
                  </div>
               </div>
              
               <div class="form-group">
                  <div class="col-sm-offset-2 col-sm-10">
                  <textarea name="content" class="form-control" id="content" placeholder="내용을 입력"></textarea>
                  </div>
               </div>
               <div class="form-group">
                  <div class="col-sm-offset-2 col-sm-10">
                     <button type="submit" class="btn btn-primary">SUBMIT</button>
                     <button type="reset" class="btn btn-default">RESET</button>
                     
                  </div>
               </div>

            </form>
         </div>
      </div>

      <div id="footer" class="row">
         <div class="col-md-12">
            <address>
               <strong>(주)비트컴퓨터 서초본원</strong><br> 비트캠프 서울시 서초구 강남대로 459 <br>
               (서초동, 백암빌딩)<br> <abbr title="Phone">P:</abbr> 02-3486-9600
            </address>

            <address>
               <strong>Copyright (c) 비트캠프 All rights reserved.</strong><br> <a
                  href="mailto:#">bitcamp@gmail.com</a>
            </address>

         </div>
      </div>

   </div>
</body>
</html>