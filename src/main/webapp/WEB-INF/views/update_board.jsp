<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.hs.dto.BoardDto" %>

<%
	int bno = Integer.parseInt(request.getParameter("bno"));
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시글 수정</title>
	<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
	<style>
		div:first-child {
			margin: 0 700px;
			pading: 10px;
		}
		form {
			text-align: left;
		}
		#update {
			width: 100px;
			font-size: 15px;
			padding: 5px;
		}
		h1 {
			background: #73685d;
    		color: #fff;
    		text-align: center;
    		margin: 0 auto;
    		width: 504px;
    		border-radius: 10px;
		}
		input[type=text] {
			width: 200px;
			padding: 10px;
			border-radius: 30px;
			background: rgb(233,233,233);
			border: 0;
			outline: none;
		}
		textarea {
			border-radius: 10px;
			background: rgb(233,233,233);
			outline: none;
		}
		input[type=submit] {
			background: #73685d;
			color: #fff;
			border-radius: 10px;
			border: 0;
		}
	</style>
</head>
<body>
	<h1>게시글 수정</h1>
	<div>
		<div>
			<form action="board_update_action?bno=<%=bno%>" method="post">
				<h3>작성자</h3>
				<input type="text" id="writer" name="writer" placeholder="이름을 입력하세요." required><br/>
				<h3>제목</h3>
				<input type="text" id="title" name="title" placeholder="제목을 입력하세요." required><br/><br/><br/>
				<h3>내용</h3>
				<textarea cols="68" rows="10" id="content" name="content" placeholder="내용을 입력하세요." required></textarea>
				<br/><br/>
				<input type="submit" id="update" value="수정">
			</form>
		</div>
	</div>
</body>
</html>