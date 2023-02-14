<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.hs.dto.BoardDto" %>    
<%@ page import="java.util.ArrayList" %>
<% 
	ArrayList<BoardDto> listAllBoard = (ArrayList<BoardDto>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>스프링 게시판</title>
	<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
	<script>
		$(function() {
			$("tr").click(function(){
				var bno = $(this).attr('bno');
				location.href = "board_detail?bno="+bno;
			})
		})
	</script>
	<style>
		table {
			border-collapse: collapse;
			margin: 0 auto;
		}
		th {
			background: #73685d;
			color: #fff;
			text-align: center;
			border: 1px solid #000;
		}
		td {
			text-align: center;
			border: 1px solid grey;
			background: #f6f6f6;
			cursor: pointer;
		}
		th, td { 
			padding: 10px; 
			font-size: 16px;
			width: 200px; 
		}
		form {
			text-align: center;
		}
	</style>
</head>
<body>
	<table>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일시</th>
		</tr>
		<%
			for(BoardDto dto : listAllBoard) {
		%>
		<tr bno="<%=dto.getBno()%>">
			<td><%=dto.getBno() %></td>
			<td><%=dto.getTitle() %></td>
			<td><%=dto.getWriter() %></td>
			<td><%=dto.getWriteDate() %></td>
		</tr>
		<%
			}
		%>
	</table>
	<br/>
	<div style="text-align: center;">
		<button type="button" onclick="location.href='write_board'">게시글 작성</button>
	</div>
</body>
</html>