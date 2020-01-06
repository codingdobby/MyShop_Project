<%@page import="Product.cartVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
		String product = request.getParameter("product_name");
		String ids = request.getParameterValues("chk_value").toString();
		String size = request.getParameter("size");
		String color = request.getParameter("color");
		int price = Integer.parseInt(request.getParameter("promoney"));
	%>

	<%
		ArrayList<cartVO> arr = (ArrayList<cartVO>) (session.getAttribute("productList"));
	%>
	<!-- "arr"이라는 속성을 세션에서 받아온다 -->

	<%
	if(arr == null) {
	      // ArrayList 객체를 생성하여 setAttribute로 해당 속성에 list값을 지정
	  		arr = new ArrayList();
	  		session.setAttribute("productList", arr);}

		cartVO vo = new cartVO();
		vo.setColor(color);
		vo.setPro_price(price);
		vo.setProduct_name(product);
		arr.add(vo);

		session.setAttribute("arr", arr); /* 세션에 "arr"이름으로 arr을 속성으로 추가한다  */
	%>

	<script>
		alert("상품이 추가되었습니다");
		location.href = "../Pay/PayMain.jsp?type=cart"
	</script>

 --%>

</body>
</html>