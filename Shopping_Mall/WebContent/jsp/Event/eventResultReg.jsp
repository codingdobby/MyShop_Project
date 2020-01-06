<%@page import="Admin.EventVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="Admin.EventDAO"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../Fix/Header.jsp" flush="true" />
	<div align="center">
		<%
			String num = request.getParameter("num");

			ArrayList<EventVO> list = dao.getEventDetail(num);
		%>
		<form action="EventResult_reg_proc.jsp" method="post">
			<table border="1">
				<tr>
				<%for(EventVO vo: list){ %>
					<td>이벤트 제목<br> <input type="text" readonly="readonly"
						value=<%=vo.getEvent_title()%> name="title">
					</td>
					<%} %>
				</tr>
				<tr>
					<td><p>이벤트 당첨자</p> <textarea style="resize: none;" cols="50"
							rows="30" maxlength="1000" name="event_content">
					
					</textarea></td>
				</tr>
				
			</table>
			<input type="submit" value="등록">
		</form>
	</div>
	<jsp:include page="../Fix/Footer.jsp" flush="true" />
</body>
</html>