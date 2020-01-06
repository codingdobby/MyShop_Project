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
<title></title>
</head>
<body>
	<%
		int count = 0;
		count = dao.getEventCount();
		System.out.print(count);
		ArrayList<EventVO> list = dao.getEndEvent();
	%>
	<jsp:include page="../Fix/Header.jsp" flush="true" />
	<div align="center">
		<jsp:include page="menu_bar.jsp" flush="true" />
	
		<div id="end_event">
			<table width="1200px;" border="1">
		
				<tr>
				<th  width="600">이벤트 명</th>
				<th width="600">이벤트 기간</th>
				
				</tr>
				
				<%for(EventVO vo : list){ %>
				<tr>
				<td><a href="EventEnd_Content.jsp?num=<%=vo.getEvent_num()%>"><%=vo.getEvent_title() %></a></td>
				<td><%=vo.getStart_date() %>~<%=vo.getEnd_date() %></td>
				
				</tr>
				<%} %>
				
				
			</table>
		</div>

	</div>
	<!-- align center -->
	<jsp:include page="../Fix/Footer.jsp" flush="true" />
</body>
</html>