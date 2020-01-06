<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="dao" class="Board.BoardDAO"></jsp:useBean>
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

			String image1 = multi.getFilesystemName("OOTD_img");
			String image2 = multi.getFilesystemName("OOTD_img2");
			String image3 = multi.getFilesystemName("OOTD_img3");
			

			String title = multi.getParameter("title");

			String OOTD_content = multi.getParameter("OOTD_content");

			

			String writer = (String) session.getAttribute("id");

			dao.inesertOOTD(title, writer, OOTD_content, image1, image2, image3);

			
			response.sendRedirect("Community_OOTD.jsp");
	%>
<%-- 	<Br>
	<h3>업로드된 파일 불러오기</h3>
	<img src="../../uploadFile/<%=product_img%>"> --%>
	<%
		} catch (Exception e) {
			out.write("업로드 용량 오류 또는 그 이외..." + e.getMessage());
		}
	%>

</body>
</html>