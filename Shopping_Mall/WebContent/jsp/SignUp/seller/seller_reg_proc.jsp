<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="seller.SellerDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");

		String seller_id = request.getParameter("reg_num1") + request.getParameter("reg_num2")
				+ request.getParameter("reg_num3");
		String pwd = request.getParameter("pwd");
		String phone = request.getParameter("phone1") + request.getParameter("phone2")
				+ request.getParameter("phone3");

		String email = request.getParameter("email");
		String company_name = request.getParameter("company");
		System.out.print("상호명 test : " + company_name);

		SellerDAO dao = new SellerDAO();
		int result = dao.insertInfo(seller_id, company_name, pwd, phone, email);
		if (result == 1) {
			session.setAttribute("brand", company_name);
	%>
	<script>
	location.replace('../../Main/MainPage.jsp');
	</script>
	<%
		} else {
	%>
	<script type="text/javascript">
		alert('가입 실패!');
		location.href = 'SellerReg.jsp';
	</script>
	<%
		}
	%>
</body>
</html>