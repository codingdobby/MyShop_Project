<%@page import="Product.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="Product.ProductDAO"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>

<style>
#product_img{
width: 300px;
height: 300px;
}
</style>
<meta charset="UTF-8">
<title>MY Shop</title>
<link rel="stylesheet" href="../../css/Seller.css">
</head>
<body>
	<%
		int count = 0;
		String id = (String) session.getAttribute("id");
		count = dao.getProductCount(id);
		System.out.print(id);
		ArrayList<ProductVO> list = dao.getAllProduct(id);
	%>
	<jsp:include page="../Fix/Header.jsp" flush="false" />
	<div align="center">

		<h1>판매자 페이지</h1>
		<div id="container">


			<div id="content">

				<h2>상품 관리</h2>



				<!-- info end -->

				<div id="border_line">
					<jsp:include page="Menu_bar.jsp" flush="false" />
					
						<table border="1">

							<%
								if (count == 0) {
							%>
							<tr>
								<td colspan="7">등록된 상품이 없습니다.</td>

							</tr>

							<%
								} else {

									for (ProductVO vo : list) {
							%>
							<tr><td colspan="5"><%=vo.getProduct_num()%></td></tr>
								
							<tr>
								<td rowspan="5"><input type="checkbox" value="chk"></td>
								<td rowspan="5"><img
									src="../../uploadFile/<%=vo.getProduct_img()%>" id="product_img"></td>
								<td>카테고리</td>
								<td><%=vo.getCategory()%></td>
								<td rowspan="5"><input type="button" value="확인"></td>
							</tr>
							
							<tr>
								<th>상품명</th>
								<td><%=vo.getProduct_name()%></td>
							</tr>
							<tr>
								<td>가격</td>
								<td><%=vo.getSize()%></td>
							</tr>


							<tr>
								<td>사이즈</td>
								<td><%=vo.getPrice()%></td>
							</tr>
							<tr>
								<td>조회수</td>
								<td><%=vo.getProudct_hit()%></td>
							</tr>


							<%
								}
								}
							%>
						</table>



				</div>
				<div id="add" align="right">
					<input type="button" value="등록"
						onclick="location.href='add_product.jsp'">
				</div>
			</div>
		</div>





	</div>

	<jsp:include page="../Fix/Footer.jsp" flush="false" />
</body>
</html>