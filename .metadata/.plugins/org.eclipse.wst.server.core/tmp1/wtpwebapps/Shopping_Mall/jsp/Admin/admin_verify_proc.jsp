<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="Admin.AdminDAO"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String seller_id = request.getParameter("seller_id");
dao.admit(seller_id);
response.sendRedirect("Admin_Verify_Seller.jsp");
%>
</body>
</html>