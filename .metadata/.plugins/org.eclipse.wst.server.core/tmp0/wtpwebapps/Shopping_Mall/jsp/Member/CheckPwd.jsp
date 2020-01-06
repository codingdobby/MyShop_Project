<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="member.MemberDAO"></jsp:useBean>>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = (String) session.getAttribute("id");
		String pwd = request.getParameter("pwd");
		int chk = dao.LoginCheck(id, pwd);

		if (chk == 1) {
			response.sendRedirect("Info_Update.jsp");

		} else {
	%>
	<Script>
		alert('비밀번호가 일치하지 않습니다!');
		history.go(-1);
	</Script>
	<%
		}
	%>
</body>
</html>