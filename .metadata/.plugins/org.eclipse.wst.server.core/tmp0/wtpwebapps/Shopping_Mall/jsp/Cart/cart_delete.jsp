<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:useBean id="dao" class="Product.CartDAO"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String[] id =null; 
		id = request.getParameterValues("chk_value");
		
		for(String ids: id ){
			dao.multidelete(ids);
			
		}
	
		
		response.sendRedirect("CartMain.jsp");
		
	%>
</body>
</html>