
<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="dao" class="member.MemberDAO" />
<jsp:useBean id="vo" class="member.MemberVO" />
<jsp:setProperty property="*" name="vo" />



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp Proc</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pwd = request.getParameter("pwd");
		String nickname = request.getParameter("nickname");
		
		String phone1 =		request.getParameter("phone1");
		String phone2 =		request.getParameter("phone2");
		String phone3 =		request.getParameter("phone3");
		String zipcode = request.getParameter("zipcode");
		String birth = request.getParameter("birth");
		int result = dao.insertInfo(vo);

		if (result != 0) {

			out.println("<script>");
			out.println("location.href='../SignUpOk.jsp'");
			out.println("</script>");
		} else {
			out.println("<script>");
			out.println("location.href='SignUpForm.jsp'");
			out.println("</script>");
		}
	%>
</body>
</html>