<%@page import="Admin.EventVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="Admin.EventDAO"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../../css/Event.css?after">
<title>Insert title here</title>
</head>
<body>
	<%
		String num = request.getParameter("num");
		dao.UpdateHit(num);
		ArrayList<EventVO> list = dao.getEventDetail(num);
	%>
	<jsp:include page="../Fix/Header.jsp" flush="true" />

	<div align="center">

		<!-- 내용 -->

		<div id="content">
			<%
			
				for (EventVO vo : list) {
			%>
			<div id="content_text">
			
				<h2><%=vo.getEvent_title()%></h2>
				등록일 :
				<%=vo.getRegdate()%>
				조회수 :
				<%=vo.getReadcount()%>
				이벤트 기간 :
				<%=vo.getStart_date()%>
				~
				<%=vo.getEnd_date()%>
			</div>
			<div id="content_img">
			<%if (vo.getEvent_content()==null){  %>
					
				<%}else{ %>
				
					<%=vo.getEvent_content() %><br>
				<%} %>
			<br> <br>
			</div>
			<%
				}
			%>
		</div>
		<br>
		<!-- 내용  end-->


		<input type="button" value="목록"
			onclick="history.go(-1)">
	<%
			String role = (String) session.getAttribute("role");
			System.out.print("role" + role);
			if (role != null && role.equals("admin")) {
		%>
	
			<input type="button" value="이벤트 당첨자 등록"
				onclick="location.href='eventResultReg.jsp?num=<%=num%>'">
	
		<%
			}
		%>







	</div>
	<!-- align center -->
	<jsp:include page="../Fix/Footer.jsp" flush="true" />
</body>
</html>