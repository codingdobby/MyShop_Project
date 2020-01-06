<%@page import="Board.QuestionVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<jsp:useBean id="dao" class="Board.QuestionDAO"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MY Shop</title>

<link rel="stylesheet" href="../../css/Service.css?after">
</head>
<body>
	<jsp:include page="../Fix/Header.jsp" flush="false" />
	<div align="center">
		<h1>1:1질문</h1>
		<div id="container">


			
				<div id="menu_order">
					<ul>
						<li><input type="button" value="글쓰기" onclick="location.href='Question/QuestionWrite.jsp'"></li>
						
					</ul>
				</div>
				<!--  end menu -->
				<div id="content">
				<jsp:include page="Menu_bar.jsp" flush="false" />
				<div id="Question">
					<table border="1">
						<tr>
							<th>글 번호</th>
							<th>제목</th>
							<th>작성 시간</th>
							<th>조회수</th>
						</tr>
						<%
						ArrayList<QuestionVO> list =dao.getNotice();
						for(QuestionVO vo : list) {%>
							<td><%=vo.getNum() %></td>
							<td><a href="Question/QuestionDetail.jsp?num=<%=vo.getNum()%>">
									<%=vo.getTitle() %>
							</a></td>
							<td><%=vo.getRegdate() %></td>
							<td><%=vo.getReadcount() %></td>
						</tr>
						<%} %>

					</table>
					<div id="btns">
						<%
							String role = (String) session.getAttribute("role");
							if (role == "admin") {
						%>
						<input type="submit" value="글쓰기"
							onclick="location.href='Notice/NoticeWrite.jsp'">
						<%
							}
						%>

					</div>
				</div>
			</div>
			<!-- end content -->
		</div>
	</div>

	<jsp:include page="../Fix/Footer.jsp" flush="false" />
</body>
</html>