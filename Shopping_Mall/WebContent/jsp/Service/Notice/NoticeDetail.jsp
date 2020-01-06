<%@page import="Board.NoticeVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="Board.NoticeDAO"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MY Shop</title>
<link rel="stylesheet" href="NoticeForm.css?after">
</head>
<body>
	<jsp:include page="../../Fix/Header.jsp" flush="false" />
	<div align="center">
		<div id="writeForm">
			<form action="Notice_Proc.jsp">

				<table border="1" width="1000px" height="600px">
					<%
						String num = request.getParameter("num");
						ArrayList<NoticeVO> list = dao.getNoticeDetail(num);
						for (NoticeVO vo : list) {
					%>
					<tr>
						<td>글제목</td>
						<td><%=vo.getTitle()%></td>
					</tr>
					<tr>
						<td><%=vo.getRegdate()%></td>
						<td><%=vo.getReadcount()%></td>
					</tr>


					<tr>
						<td colspan="2"><textarea rows="30" cols="100"
								style="resize: none;" maxlength="1000" name="content"><%=vo.getContent()%></textarea></td>
					</tr>


					<%
						}
					%>
				</table>
			</form>
		</div>
	</div>
	<jsp:include page="../../Fix/Footer.jsp" flush="false" />

</body>
</html>