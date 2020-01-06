<%@page import="Board.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="Board.BoardDAO"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="../../../css/Community.css?after">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../../Fix/Header.jsp" flush="false" />
	<%
		String num = request.getParameter("num");
		dao.UpdateHit(num);
		ArrayList<BoardVO> list = dao.getOOTDDetail(num);
	%>


	<div align="center">
		<div id="OOTD_Detail">
			<%
				for (BoardVO vo : list) {
					System.out.print(vo.getWRITER());
			%>
			<div id="OOTD_Detail_info">
				작성자 :
				<%=vo.getWRITER()%>
				작성날짜 :
				<%=vo.getREGDATE()%>
				조회수 :
				<%=vo.getREADCOUNT()%></div>
			<div id="OOTD_Detail_content">
				<h2><%=vo.getTITLE()%></h2>
				<%
					String image2 = vo.getImage2();
						if (image2 != null) {
				%>
				<img src="../../../uploadFile/<%=image2%>"><br>

				<%
					}
						String image3 = vo.getImage3();
						if (image3 != null) {
				%>
				<img src="../../../uploadFile/<%=image3%>">
				<%
					}else {
				
				
				%>
				
				
				<%} %>
				<img src="../../../uploadFile/<%=vo.getImage1()%>"><br> <br>


				<%=vo.getCONTENT()%>
			</div>
			<%
				}
			%>
		</div>
	</div>
	<jsp:include page="../../Fix/Footer.jsp" flush="false" />
</body>
</html>