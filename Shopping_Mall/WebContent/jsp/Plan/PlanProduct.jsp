<%@page import="Product.categoryVO"%>
<%@page import="Product.ProductVO"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="Product.ProductDAO"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../../css/Plan.css?after">
<script src="//code.jquery.com/jquery-3.4.1.min.js"></script>
<%
	String value = request.getParameter("category");
%>
<script>
	$(document).ready(
			function() {

				$.urlParam = function(name) {
					var results = new RegExp('[\?&amp;]' + name
							+ '=([^&amp;#]*)').exec(window.location.href);
					return results[1] || 0;
				}

				$("#test").val($.urlParam('category')).attr("selected","selected");

			});
</script>

<title>MY Shop</title>
</head>
<body>

	<jsp:include page="../Fix/Header.jsp" flush="false" />
	<h1>기획 상품</h1>
	<div align="center" id="all">

		<div id="ad">
			<img src="../../image/ad1.png">
			<!-- 이미지 첨부하기 -->
		</div>
		<div id="content">


			<div id="plan_selectbox">
				<form>
					<select name="category" id="test">
						<option value="all">all</option>
						<%
							ArrayList<categoryVO> cate = dao.getPlanCategory();
							for (categoryVO vo : cate) {
						%>
						<option value="<%=vo.getCateCode()%>"><%=vo.getCateName()%></option>

						<%
							}
						%>

					</select>
				</form>
			</div>
			<script>
				$(document).ready(function() {
									$("#test").change(function() {
														var value = $("#test option:selected").val();
														location.href = "PlanProduct.jsp?category="+ value;

														$.urlParam = function(
																name) {
															var results = new RegExp(
																	'[\?&amp;]'
																			+ name
																			+ '=([^&amp;#]*)')
																	.exec(window.location.href);
															return results[1] || 0;
														}
														$("#test")
																.val(
																		$
																				.urlParam('category'))
																.attr(
																		"selected",
																		"selected");
													});

								});
			</script>

			<ul id="ul_box" style="-webkit-padding-start: 0px;">
				<%
					
				%>
				<%
					String cateCode = request.getParameter("category");
					if (cateCode == null) {
						cateCode = "all";
					}
					ArrayList<ProductVO> list = dao.getPlan(cateCode);
					for (ProductVO vo : list) {
				%>

				<li><a
					href="../Product/Product_Detail.jsp?num=<%=vo.getProduct_num()%>"><img
						src="../../uploadFile/<%=vo.getProduct_img()%>" id="product_img"></A>
					<div id="details">
						<ul style="-webkit-padding-start: 0px;">
							<li><%=vo.getProduct_name()%></li>
							<li><%=vo.getColor()%>색</li>
							<li><fmt:formatNumber value="<%=vo.getPrice()%>"
									pattern="#,###" />원</li>
							<li>test</li>
						</ul>

					</div></li>

				<%
					}
				%>

			</ul>


		</div>

	</div>
	<jsp:include page="../Fix/Footer.jsp" flush="false" />

</body>
</html>