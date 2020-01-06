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
<%
request.setCharacterEncoding("UTF-8");
String title = request.getParameter("title");
String event_content =request.getParameter("event_content");

System.out.print("제목:"+title);
System.out.print("내용:"+event_content);
dao.EnterResult(title, event_content);
response.sendRedirect("EventWinning.jsp");
%>
</body>
</html>