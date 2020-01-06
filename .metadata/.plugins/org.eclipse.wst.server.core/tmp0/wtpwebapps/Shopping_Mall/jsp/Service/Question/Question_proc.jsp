<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="Board.QuestionDAO"></jsp:useBean>
<jsp:useBean id="vo" class="Board.QuestionVO"></jsp:useBean>
<jsp:setProperty property="*" name="vo" />
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
		String writer = (String)session.getAttribute("id");
		
		String content = request.getParameter("content");
		dao.insertQuestion(title, writer, content);

	%>
	<script>
		location.replace("../Question.jsp");
	</script>
</body>
</html>