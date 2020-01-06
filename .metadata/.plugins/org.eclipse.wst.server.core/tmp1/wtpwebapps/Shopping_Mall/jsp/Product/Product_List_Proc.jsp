<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String type=request.getParameter("type");
if(type.equals("select")){
	String text = "product_hit";
	
}
else if(type.equals("regdate")){
	String text = "regdate";
	
}
%>
</body>
</html>