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
		ArrayList<EventVO> list = dao.getAllEvent();
	%>
	<jsp:include page="../Fix/Header.jsp" flush="true" />
	<div align="center">
		<jsp:include page="menu_bar.jsp" flush="true" />
		<%
			String role = (String) session.getAttribute("role");
			System.out.print("role" + role);
			if (role != null && role.equals("admin")) {
		%>
		<div id="btns">
			<input type="button" value="이벤트 등록"
				onclick="location.href='eventReg.jsp'">
		</div>
		<%
			}
		%>


	

			<ul id="ul_box" style="-webkit-padding-start: 0px;">

				<%
					if (count > 0) {
						for (EventVO vo : list) {
				%>
				<li><a href="EventDetail.jsp?num=<%=vo.getEvent_num()%>"><img
						src="../../uploadFile/<%=vo.getEvent_content_img()%>"
						id="product_img"></a>
					<ul style="-webkit-padding-start: 0px;">
						<li id="event_title_space"><a
							href="EventDetail.jsp?num=<%=vo.getEvent_num()%>"><span
								id="event_title"><%=vo.getEvent_title()%></span></a></li>
						<li id="event_term_space"><%=vo.getStart_date()%> ~ <%=vo.getEnd_date()%></li>


					</ul></li>
			
	<%
					} //for end

					} 
				%>



			</ul>
			<%if (count == 0) { %>
				<table border="1" width="1050px;" id="ready_Event">
				<tr><td style="text-align: center;"><h1>이벤트 준비중입니다</h1></td></tr>
				</table>
				<%
					}
				%>
			<!-- end ul_box -->


		</div>


		<!-- content event end -->


	<!-- align center -->
	<jsp:include page="../Fix/Footer.jsp" flush="true" />
</body>
</html>