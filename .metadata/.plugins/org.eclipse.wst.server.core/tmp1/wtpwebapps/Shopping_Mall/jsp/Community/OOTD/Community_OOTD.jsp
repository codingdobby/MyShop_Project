<%@page import="java.util.ArrayList"%>
<%@page import="Board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<jsp:useBean id="dao" class="Board.BoardDAO"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MY Shop</title>

<link rel="stylesheet" href="../../../css/Community.css?after">
</head>
<body>
	<jsp:include page="../../Fix/Header.jsp" flush="false" />
	<div align="center">
		<h1>OOTD</h1>
<%
		
		ArrayList<BoardVO> list = dao.getOOTD();
				
	%>


		<div id="content">
			<div id="menu_comuinty">
				<ul>
					<li>조회순</li>
					<li>최근 등록순</li>
				</ul>
			</div>
			<!--  end menu -->
			<div id="OOTD">
				<jsp:include page="../Menu_bar.jsp" flush="false" />

				<ul id="ul_box" style="-webkit-padding-start: 0px;">
				
				<%for(BoardVO vo:list){ %>
					<li><a href="Ootd_Detail.jsp?num=<%=vo.getNUM()%>"><img src="../../../uploadFile/<%=vo.getImage1()%>"></a>
						<ul style="-webkit-padding-start: 0px;">
							<li id="event_title_space"><a href="Ootd_Detail.jsp?num=<%=vo.getNUM()%>"><span id="event_title">
							<%=vo.getTITLE() %>
							</span></a></li>
							<li id="event_term_space"><%=vo.getWRITER() %></li>


						</ul></li>
						
						<%} %>
				</ul>


			</div>
			<input type="button" value="글쓰기" onclick="location.href='OOTDForm.jsp'">
		</div>
		<!-- end content -->

	</div>

	<jsp:include page="../../Fix/Footer.jsp" flush="false" />
</body>
</html>