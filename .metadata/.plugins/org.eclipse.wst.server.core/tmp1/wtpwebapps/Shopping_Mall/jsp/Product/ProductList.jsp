<%@page import="Product.categoryVO"%>
<%@page import="Product.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="Product.ProductDAO"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MY Shop</title>
<link rel="stylesheet" href="../../css/Best.css?after">
</head>
<body>

	<%
		String type = request.getParameter("type");
		String urlcategory = request.getParameter("category");
		
		ArrayList<ProductVO> list = null;
		int count = 0;

		count = dao.getProductListCount(type);

		if (urlcategory != null) {
			list = dao.getDownProductList(urlcategory);
		} else {
			list = dao.getProductList(type);

		}
	%>
	<jsp:include page="../Fix/Header.jsp" flush="false" />
	<div align="center">
		<h1><%=type%></h1>
		<a href="ProductList.jsp?type=<%=type%>">all</a>
		<%
			dao.getProdcut_cate_list(type);
			ArrayList<categoryVO> category = dao.getProdcut_cate_list(type);

			for (categoryVO vo : category) {
		%>

		<a
			href="ProductList.jsp?type=<%=type%>&category=<%=vo.getCateCode()%>"><%=vo.getCateName()%></a>


		<%
			}
		%>


		<div id="order">
			<ul>
				<li>조회수</li>
				<li>판매량</li>
			</ul>
		</div>




		<div id="today_item">

			<ul id="ul_box" style="-webkit-padding-start: 0px;">
				<%
					for (ProductVO vo : list) {
						if (count > 0) {
				%>

				<li><a href="Product_Detail.jsp?num=<%=vo.getProduct_num()%>"><img
						src="../../uploadFile/<%=vo.getProduct_img()%>" id="product_img"></A>
					<div id="details">
						<ul style="-webkit-padding-start: 0px;">
							<li><%=vo.getProduct_name()%></li>
							<li><%=vo.getColor()%>색</li>
							<li><%=vo.getPrice()%>원</li>
							<li>test</li>
						</ul>

					</div></li>
				<%
					} else if (count == 0) {
				%>
				<li>상품 준비중</li>

				<%
					}
					}
				%>

			</ul>

		</div>
	</div>
	<jsp:include page="../Fix/Footer.jsp" flush="false" />
</body>
</html>