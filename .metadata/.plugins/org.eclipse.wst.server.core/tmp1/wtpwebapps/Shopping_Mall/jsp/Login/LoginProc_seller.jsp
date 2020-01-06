<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="sdao" class="seller.SellerDAO" />


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		request.setCharacterEncoding("UTF-8");
		String type = request.getParameter("type");


		System.out.println("로그인 실패11");
		String id = request.getParameter("seller_id");
		String pwd = request.getParameter("seller_pwd");
		System.out.println(id);
		System.out.println(pwd);
		int result = sdao.LoginCheck(id, pwd);
	
		if (result == 1) {
			//로그인 성공
			session.setAttribute("id", id);
			session.setAttribute("role", "seller");
			response.sendRedirect("../Main/MainPage.jsp");
		} else {
	%>
	<script>
		
		alert('아이디 또는 비밀번호가 일치하지 않습니다.');
		history.go(-1);
	</script>
	<%
		}
	%>
</body>
</html>