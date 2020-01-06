<%@page import="java.sql.Timestamp"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="vo" class="Admin.EventVO">
	<jsp:setProperty property="*" name="vo" /></jsp:useBean>
<jsp:useBean id="dao" class="Admin.EventDAO"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	
	
	%>

	<%
		int fileSize = 1024 * 1024 * 3; //3mb로 파일 크기를 제한 
		ServletContext context = getServletContext();
		String uploadPath = context.getRealPath("/uploadFile");
	%>
	업로드 경로 확인 :
	<%=uploadPath%><br>
	<%
		MultipartRequest multi = null;

		try {
			multi = new MultipartRequest(request, uploadPath, fileSize, "UTF-8", new DefaultFileRenamePolicy());
			String EVENT_title = multi.getParameter("EVENT_title");
			String event_content = multi.getParameter("event_content");
			String event_content_img = multi.getFilesystemName("event_content_img");
			String start_term = multi.getParameter("start_term");
			String END_date = multi.getParameter("END_date");

		
			dao.insertEvent(EVENT_title, event_content, event_content_img, start_term, END_date);
			System.out.println("등록");
			
			
			response.sendRedirect("EventMain.jsp");
	%>
	<Br>
	<h3>업로드된 파일 불러오기</h3>
	<img src="../../uploadFile/<%=event_content_img%>">
	<%
		} catch (Exception e) {
			out.write("업로드 용량 오류 또는 그 이외..." + e.getMessage());
		}
	%>
</body>
</html>