<%@page import="Board.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<jsp:useBean id="dao" class="Board.BoardDAO"></jsp:useBean>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MY Shop</title>
<link rel="stylesheet" href="../../../css/Admin.css?after">
</head>
<body>
	<%
		ArrayList<BoardVO> list = null;
		String id = (String) session.getAttribute("id");
		list = dao.getIlsang();
	%>
	<jsp:include page="../../Fix/Header.jsp" flush="false" />
	<div align="center">

		<div id="container">


			<div id="content">
				<h2>OOTD</h2>


				<div id="border_line">
					<jsp:include page="../Menu_bar.jsp" flush="false" />
					<table border="1">
						<tr>
							
							<th>글번호</th>
							<th>제목</th>
							<th>닉네임</th>
							<th>등록 일자</th>
							<th>조회수</th>

						</tr>
						<%
							for (BoardVO vo : list) {
						%>
						<tr>
							<td><%=vo.getNUM()%></td>

							<td><a href="Ilsang_Detail.jsp?num=<%=vo.getNUM()%>"><%=vo.getTITLE()%></a></td>

							<td><%=vo.getWRITER()%></td>

							<td><%=vo.getREGDATE()%></td>

							<td><%=vo.getREADCOUNT()%></td>
						</tr>

						<%
							}
						%>
					</table>






				</div>
				<!-- end borderLine -->
				<input type="button" onclick="location.href='IlsangForm.jsp'"
					value="글쓰기">
			</div>
		</div>
	</div>

	<jsp:include page="../../Fix/Footer.jsp" flush="false" />
</body>
</html>