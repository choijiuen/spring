<%@ page language="java" contentType="text/html; charset=utf-8" 
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<meta charset="utf-8">
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
	<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.css" />
	<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<script type="text/javascript">
	$(document).ready(function(){

		pageIdx();
		$('nav a').click(function(e){
			e.preventDefault();
			//alert("event");
		});

		$('nav a').eq(0).click(function(e){
			e.preventDefault();
			pageIdx();
		});

		$('nav a').eq(1).click(function(e){
			e.preventDefault();
			pageIdx();
		});

		$('nav a').eq(2).click(function(e){
			e.preventDefault();
			pageIntro();
		});

		$('nav a').eq(4).click(function(e){
			//list
			e.preventDefault();
			getList();
		});

		$('nav a').eq(5).click(function(e){
			//add
			e.preventDefault();
			getAdd();
		});
		
		
		$(document).on('click','#content table tr td>a',function(e){
			e.preventDefault();

			$.getJSON('json/obj',$(this).attr('href')
					, function(data){

				 myModal();
					 $('#myModal .modal-header h4').text("수정 페이지");
					$('#myModal form input').eq(0).val(data.num);
					$('#myModal form input').eq(1).val(data.sub);
					$('#myModal form input').eq(2).val(data.name);
					$('#myModal form textarea').val(data.content);
					 $('#myModal .modal-footer button').eq(2).show();
			});

		});
		
	});

	function updateOne(){
		$.ajax({
			url:'json/obj',
			type:'put',
			data:'idx=1',
			//dataType:   이거 put 필터 설정해야한다 지금은 작동안함 
			success:function(data){
				
			}
		});
	}
	
//	function insertOne(){
//		var params= $('#myModal form').serialize();
//		$.post('json/add',params, function(){
//			$('#myModal form input').val("");
//			$('#myModal form textarea').val("");
//				getList();
//		});	//통신
//	}

	function insertOne(){
        
        if(document.getElementById('num').value=="" || document.getElementById('num').value==null){
           document.getElementById('num').value=0;
        }
        
        var param=$('#myModal form').serialize();
        $.post('json/add',param,function(){
           $('#myModal form input').val('');
           $('#myModal form textarea').val('');
           getList();   //통신 성공시 함수
           
        });
        
     }

	function myModal(){
			$('#myModal .modal-header h4').text("입력 페이지");
			$('#myModal form input').eq(0).val('');
			$('#myModal form input').eq(1).val('');
			$('#myModal form input').eq(2).val('');
			$('#myModal form textarea').val('');
			
			var options={show:true};
			$('#myModal').modal(options);
			 $('#myModal .modal-footer button').hide().eq(0).show();
		}

	function getAdd(){

		 getList();
		 myModal();
		 $('#myModal .modal-footer button').eq(1).show();
		
	}
	
	function getList(){
		$('nav a').eq(3).parent().addClass('active');
		$('nav a').eq(1).parent().removeClass('active');
		$('nav a').eq(2).parent().removeClass('active');
		var eles = $('<h1>리스트 페이지</h1>');
		var table= $('<table class="table"></table>').appendTo(eles);
		$('<tr></tr>').appendTo(table).append('<th>글번호</th>').append('<th>글제목</th>')
										.append('<th>글쓴이</th>').append('<th>조회수</th>');


		
		 $.getJSON('json/list', function(data) {
	         var arr = data;

	         for (var i = 0; i < arr.length; i++) {
	            $('<tr></tr>').appendTo(table).append(
	                  '<td><a href="idx='+arr[i].num+'">' + arr[i].num + '</a></td>').append(
	                  '<td><a href="idx='+arr[i].num+'">' + arr[i].sub +  '</a></td>').append(
	                  '<td><a href="idx='+arr[i].num+'">' + arr[i].name +  '</a></td>').append(
	                  '<td><a href="idx='+arr[i].num+'">' + arr[i].cnt +  '</a></td>');

	         }
	         $('#content').html(eles);
	      });

	   }


	function pageIdx(){
		$('nav a').eq(1).parent().addClass('active');
		$('nav a').eq(2).parent().removeClass('active');
		$('nav a').eq(3).parent().removeClass('active');
		var ele ='<img alt="" src="imgs/main.jpg" class="img-thumbnail"/>';
		ele+=	'<img alt="" src="imgs/comming.jpg" class="img-thumbnail"/>';
		$('#content').html(ele);
	}

	function pageIntro(){
		$('nav a').eq(2).parent().addClass('active');
		$('nav a').eq(1).parent().removeClass('active');
		$('nav a').eq(3).parent().removeClass('active');
		var ele ='<img alt="" src="imgs/b1.jpg" class="img-thumbnail"/>';
		ele+=	'<img alt="" src="imgs/b2.jpg" class="img-thumbnail"/>';
		$('#content').html(ele);
		
	}
	</script>
</head>
<body>
<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">입력 페이지</h4>
      </div>
     
      <form class="form-horizontal">
      		<input type="hidden" id="num" name="num"/>
      <div class="modal-body">
 			<div class="form-group">
  				 <label for="sub"  class="col-sm-offset-2 control-label">제목</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="sub" id="sub" placeholder="제목을 입력">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="name" class="col-sm-offset-2 control-label">글쓴이</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="name" id="name" placeholder="글쓴이를 입력">
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <label for="content" class="col-sm-offset-2 control-label"></label>
			    <div class="col-sm-10">
			      <textarea class="form-control" name="content" id="cntnt" placeholder="내용"></textarea>
			    </div>
			  </div>
  
       </div>
      
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="insertOne();">입력</button>
        <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="updateOne();">수정</button>
      </div>
      </form>
    </div>
  </div>
</div>
<!-- 모달 끝 -->

	<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">비트교육센터</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">HOME <span class="sr-only">(current)</span></a></li>
        <li><a href="#">INTRO</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">BBS <span class="caret"></span></a>
          <ul class="dropdown-menu">
         
            <li><a href="#">LIST</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">ADD</a></li>
          
          </ul>
        </li>
      </ul>
     </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<div class="jumbotron">
			  <h1>Hello, world!</h1>
			  <p>...</p>
			  <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
			</div>
		</div>
	</div>
	<div class="row">
		<div id="content" class="col-md-12">
		</div>
	</div>
	<div class="row">
		<div id="footer" class="col-md-12">
			<address>
			  <strong>(주)비트캠프</strong><br>
			 비트주소<br>
			  <abbr title="Phone">P:</abbr> (123) 456-7890
			</address>
			
			<address>
			  <strong>비트캠프</strong><br>
			  <a href="mailto:#">관리자에게 문의</a>
		</address>
		</div>
	</div>
</div>
</body>
</html>
