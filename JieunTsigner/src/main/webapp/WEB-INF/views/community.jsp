<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css" />
<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
<script type="text/javascript">
</script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="template/header.jsp"></jsp:include>
	<%
		String root = request.getContextPath();
	%>
	<!-- 여기서부터 컨텐츠입니다 -->
	<div id="content">
		<div class="row">
			<div class="col-md-12">

				<!-- 컨텐츠의 내용을 입력하세요 -->
				<div class="col-md-offset-2 col-md-8">
					<h1>커뮤니티</h1>

						<div class="btn-group btn-group-justified" role="group" aria-label="...">
						  <div class="btn-group" role="group">
						    <button type="button" class="btn btn-default">플래너</button>
						  </div>
						  <div class="btn-group" role="group">
						    <a href="<%=root %>/community/bbs"><button type="button" class="btn btn-default">자유게시판</button></a>
						  </div>
						  <div class="btn-group" role="group">
						    <button type="button" class="btn btn-default">투게더</button>
						  </div>
						  <div class="btn-group" role="group">
						    <button type="button" class="btn btn-default">여행후기</button>
						  </div>
						  <div class="btn-group" role="group">
						    <button type="button" class="btn btn-default">질문</button>
						  </div>
						</div>
				</div>
				
				
				
			</div>
		</div>
	</div>
	<!-- 여기까지 컨텐츠입니다 -->

	<jsp:include page="template/footer.jsp"></jsp:include>


</body>
</html>