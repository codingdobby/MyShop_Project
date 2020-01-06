<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="sdao" class="seller.SellerDAO"></jsp:useBean>
<jsp:useBean id="vo" class="seller.FormVO"></jsp:useBean>
<jsp:setProperty property="*" name="vo" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String brand_site = request.getParameter("brand_site");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");

		String[] category = request.getParameterValues("category");
		String text = "";
		if (category != null) {
			for (int i = 0; i < category.length; i++) {
				text += (category[i]+",");
				System.out.println(text);
			} // for 
		} // if  
		vo.setCategory(text);
		String seller_id_fk = (String) session.getAttribute("id");
		vo.setSeller_id_fk(seller_id_fk);
		System.out.println("proc" + seller_id_fk);
		sdao.insertForm(vo);
		response.sendRedirect("../../Main/MainPage.jsp");
	%>
</body>
</html>