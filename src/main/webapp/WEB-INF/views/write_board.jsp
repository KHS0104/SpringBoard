<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시글 작성</title>
	<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
	<script>
		$(function() {
			$(".submit").click(function() {
				alert("게시글이 등록되었습니다.");
			})
		})
	</script>
	<style>
		div {
			text-align: center;
		}
	</style>
</head>
<body>
	<h1 style="text-align: center;">게시글 작성</h1>
	<div>
		<form action="board_write_action" method="post">
			<p><h3>작성자</h3></p>
			<input type="text" id="writer" name="writer" required><br/>
			<p><h3>제목</h3></p>
			<input type="text" id="title" name="title" required><br/><br/>
			<p><h3>내용</h3></p>
			<textarea cols="50" rows="10" id="content" name="content" required></textarea><br/>
			<input type="submit" class="submit" value="등록">
		</form>
	</div>
</body>
</html>