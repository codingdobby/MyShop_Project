<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="Board.NoticeDAO"></jsp:useBean>
<jsp:useBean id="vo" class="Board.NoticeVO"></jsp:useBean>
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
		String writer = "관리자";
		
		String content = request.getParameter("content");
		dao.insertNotice(title, writer, content);
		System.out.print(writer);
		System.out.print("제목"+title);
		System.out.print("내용"+content);
	%>
	<script>
		location.replace("../ServiceMain.jsp");
	</script>
</body>
</html>