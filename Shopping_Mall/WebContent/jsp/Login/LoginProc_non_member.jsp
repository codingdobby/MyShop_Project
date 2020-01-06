<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="mdao" class="member.MemberDAO" />
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
		
		String phone1 = request.getParameter("non_phone1");
		String phone2 = request.getParameter("non_phone2");
		String phone3 = request.getParameter("non_phone3");
		
		String phone= phone1 + phone2 + phone3;
		String non_name = request.getParameter("non_name");
		String non_pwd = request.getParameter("non_pwd");

		int result = mdao.non_member_check(non_pwd,non_name, phone);
		System.out.print(result);
		if (result == 1) {
			//로그인 성공
				session.setAttribute("role", "non_member");
			session.setAttribute("id", non_name);
			response.sendRedirect("../Main/MainPage.jsp");
		} else {
	%>
	<script>
		consol.log('test');
		alert('오류 있음');
		history.go(-1);
	</script>
	<%
		}
	%>
</body>
</html>