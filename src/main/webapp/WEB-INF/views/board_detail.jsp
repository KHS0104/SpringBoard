<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.hs.dto.BoardDto" %>
<%
	BoardDto dto = (BoardDto)request.getAttribute("dto");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시글 상세 보기</title>
	<script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
	<script>
		$(function() {
			$("#delete").click(function() {
				alert("해당 게시글이 삭제되었습니다.");
			})
		})
	</script>
	<style>
		table {
			border-collapse: collapse;
			margin: 0 auto;
		}
		td {
			padding: 10px;
			border: solid 1px black;
		}
		td:first-child {
			background: #73685d;
			color: #fff;
		}
		button {
			padding: 5px;
		}
	</style>
</head>
<body>
	<table>
		<tr>
			<td><%=dto.getBno() %></td>
			<td><%=dto.getTitle() %></td>
			<td><%=dto.getContent() %></td>
			<td><%=dto.getWriter() %></td>
			<td><%=dto.getWriteDate() %></td>
		</tr>
	</table>
	<br/><br/>
	<div style="text-align: center;">
		<a href="update_board?bno=<%=dto.getBno()%>" bno="<%=dto.getBno()%>"><%=dto.getBno()%>번 게시글 수정</a>
		<%-- <form action="board_delete_action?bno=<%=dto.getBno()%>" style="display: inline;">
			<input bno="<%=dto.getBno() %>" type="submit" value="삭제" style="padding: 5px;"/>
		</form> --%>
		<a href="board_delete_action?bno=<%=dto.getBno()%>" id="delete"><%=dto.getBno()%>번 게시글 삭제</a>
	</div>
</body>
</html>