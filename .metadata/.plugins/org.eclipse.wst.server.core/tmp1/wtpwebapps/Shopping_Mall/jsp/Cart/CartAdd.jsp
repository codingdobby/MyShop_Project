
<%@page import="Product.cartVO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="Product.CartDAO"></jsp:useBean>
<jsp:useBean id="vo" class="Product.cartVO"></jsp:useBean>
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

		int num = Integer.parseInt(request.getParameter("num"));

		int amount = Integer.parseInt(request.getParameter("amount"));

		String cus_id = (String) session.getAttribute("id");

		vo.setAmount(amount);
		vo.setProduct_num(num);
		vo.setCus_id(cus_id);

		int check = dao.ProductCheck(cus_id, num);
		if (check == 0) {//같은 값이 없을때 등록 가능
			dao.insertCart(vo);
			response.sendRedirect("CartMain.jsp");
		} //end check 0 if

		else if (check == 1) {//같은 이름의 값이 있을때 수정

			int count = dao.ProductAmountCheck(cus_id, num);
			if (count < 10) {//값이 10보다 작을때
				System.out.print("수량" + (count + amount));
				if (count + amount > 10) {
					System.out.print("수량" + (count + amount));
	%>

	<script>
		alert('10개 초과 구매 불가능');
		history.go(-1);
	</script>
	<%
		} //end 10보다 작을때 더하는값 다시 돌아가기
				else {
					dao.update(amount, num);
					response.sendRedirect("CartMain.jsp");
				} //end else 값 수정하기
			} //end count
			else {
	%>
	<script>
		alert('10개 초과 구매 불가능');
		history.go(-1);
	</script>
	<%
		}
		} //end else if
	%>

</body>
</html>