
<%@page import="Board.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="Board.BoardDAO"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="Ilsang.css?after">
<title>Insert title here</title>
</head>
<body>
	<%
		String num = request.getParameter("num");
		dao.UpdateHit(num);
		ArrayList<BoardVO> list = dao.getIlsangContent(num);
	%>
	<jsp:include page="../../Fix/Header.jsp" flush="true" />

	<div align="center">

		<!-- 내용 -->

		<div id="content">
			<%
				for (BoardVO vo : list) {
			%>
			<div id="content_text">
				<div id="content_title"><span><%=vo.getTITLE()%></span></div>
					<div id="content_title_right">
					작성자 : <%=vo.getWRITER() %> 	<br>등록일 : <%=vo.getREGDATE()%> &#124; 조회수 : <%=vo.getREADCOUNT()%>
					</div>

				</div>
				<div id="content_">
				<Br>
					<%=vo.getCONTENT()%>
					<br> <br> <br>
				</div>
				<%
					}
				%>
			</div>
			<br>
			<!-- 내용  end-->


			<input type="button" value="목록" onclick="history.go(-1)">

			<%
				String role = (String) session.getAttribute("role");
				System.out.print("role" + role);
				if (role != null && role.equals("admin")) {
			%>

			<input type="button" value="이벤트 수정"
				onclick="location.href='EventUpdate.jsp?num=<%=num%>'"> <input
				type="button" value="삭제"
				onclick="location.href='EventDelete.jsp?num=<%=num%>'">

			<%
				}
			%>

		</div>
		<!-- align center -->
		<jsp:include page="../../Fix/Footer.jsp" flush="true" />
</body>
</html>