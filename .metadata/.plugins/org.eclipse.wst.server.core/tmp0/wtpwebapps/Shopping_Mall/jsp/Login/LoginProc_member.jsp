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
		String type = request.getParameter("type");

		System.out.println("로그인 실패11  ");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
	
		
		
		int result = mdao.LoginCheck(id, pwd);
		
		if (result == 1) {
			//로그인 성공
			session.setAttribute("id", id);
			if (id.equals("admin")) {

				session.setAttribute("role", "admin");
				String nickname = mdao.findNickname(id);
				session.setAttribute("nickname", nickname);
				
				
			} else {
				session.setAttribute("role", "member");
				String nickname = mdao.findNickname(id);
				session.setAttribute("nickname", nickname);
			}

			response.sendRedirect("../Main/MainPage.jsp");
		} else {
	%>
	<script>
		alert('가입하지 않은 아이디이거나, 잘못된 비밀번호입니다.');
		history.go(-1);
	</script>
	<%
		}
	%>
</body>
</html>