<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="pdao" class="Product.ProductDAO"></jsp:useBean>
<jsp:useBean id="vo" class="Product.ProductVO"></jsp:useBean>
<jsp:setProperty property="*" name="vo" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이미지 업로드 연습</title>
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

			String product_img = multi.getFilesystemName("product_img");

			String product_img_detail = multi.getFilesystemName("product_img_detail");

			String product_name = multi.getParameter("product_name");

			String size = multi.getParameter("size");

			String color = multi.getParameter("color");

		

			String priceS = multi.getParameter("price");
			int price = Integer.parseInt(priceS);
			String product_amountS = multi.getParameter("product_amount");
			int product_amount = Integer.parseInt(product_amountS);

			String product_seller = (String) session.getAttribute("id");

			String category = multi.getParameter("category");

			pdao.insertProduct(product_name, size, color, price, product_img, product_img_detail,
					product_amount, product_seller, category);
			response.sendRedirect("Seller_Product.jsp");
	%>
	<Br>
	<h3>업로드된 파일 불러오기</h3>
	<img src="../../uploadFile/<%=product_img%>">
	<%
		} catch (Exception e) {
			out.write("업로드 용량 오류 또는 그 이외..." + e.getMessage());
		}
	%>


</body>
</html>