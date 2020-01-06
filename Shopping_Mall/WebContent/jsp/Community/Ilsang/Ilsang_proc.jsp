<jsp:useBean id="dao" class="Board.BoardDAO"></jsp:useBean>
<jsp:useBean id="vo" class="Board.BoardVO"></jsp:useBean>
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
		request.setCharacterEncoding("utf-8");

		String title = request.getParameter("title");
		String id = (String) (session.getAttribute("id"));

		String content = request.getParameter("content");
		dao.insertNotice(title, id, content);
		System.out.print(id);
		System.out.print("제목" + title);
		System.out.print("내용" + content);
	%>
	 <script>
		location.replace("Community_Ilsang.jsp");
	</script>
</body>
</html>