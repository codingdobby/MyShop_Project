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
<link rel="stylesheet" href="../../css/TodaySale.css?after">
</head>
<body>
	<%
		
		
		
		ArrayList<ProductVO> list = dao.getBestProduct();
	int count = dao.getBestCount();
	%>
	<jsp:include page="../Fix/Header.jsp" flush="false" />
	<div align="center">
		<h1>Best 상품</h1>
		<div id="order">
			<ul>
				<li>조회수</li>
				<li>판매량</li>
			</ul>
		</div>
		<div id="today_item">

			<ul id="ul_box" style="-webkit-padding-start: 0px;">

				<%
					
					if(count>0){
					for(ProductVO vo:list){ %>
				<li><img src="../../uploadFile/<%=vo.getProduct_img()%>"
					id="product_img">
					<div id="details">
						<ul style="-webkit-padding-start: 0px;">
							<li><%=vo.getProduct_name() %></li>
							<li><%=vo.getPrice() %>원</li>
							<li><%=vo.getSize() %></li>
							<li><%=vo.getColor() %></li>
						</ul>

					</div></li>
				<%}
					}%>
			</ul>
			<%if(count==0){ %>
			<table width="1000px" border="1" style="border-collapse: collapse;">
				<tr>
					<td style="text-align: center"> 상품 준비중</td>
				</tr>
			</table>
			<%} %>
		</div>

	</div>
	<jsp:include page="../Fix/Footer.jsp" flush="false" />
</body>
</html>