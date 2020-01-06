<%@page import="Product.categoryVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="pdao" class="Product.ProductDAO"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MY Shop</title>
<link rel="stylesheet" href="../../css/Seller.css">
</head>
<body>
	<jsp:include page="../Fix/Header.jsp" flush="false" />
	<form action="add_Product_proc.jsp" method="post"
		enctype="multipart/form-data">
		<div align="center">
			<h1>상품 등록</h1>
			<div id="product_content">

				<table border="1">
					<tr>
						<td>
							<p>상품 이미지</p> <input type="file" name="product_img">
						</td>

					</tr>

					<tr>
						<td>
							<p>상품 상세 이미지</p> <input type="file" name="product_img_detail">
						</td>
					</tr>
					

					<tr>
						<td>
							<p>카테고리</p> <select name="category">

								<%
									ArrayList<categoryVO> cate = pdao.getAddCategory();

									for (categoryVO vo : cate) {
								%>
									<option value="<%=vo.getCateName() %>"><%=vo.getCateName() %></option>

								<%
									}
								%>

						</select>
						</td>
					</tr>

					<tr>
						<td>
							<p>상품명</p> <input type="text" name="product_name" maxlength="50">
						</td>
					</tr>

					<tr>
						<td>
							<p>사이즈</p> <input type="checkbox" name="size" id="sizeS"
							value="s"> <label for="sizeS">S 사이즈</label> <input
							type="checkbox" name="size" id="sizeM" value="m"> <label
							for="sizeM">M 사이즈</label> <input type="checkbox" name="size"
							id="sizeL" value="l"> <label for="sizeL">L 사이즈</label> <input
							type="checkbox" name="size" id="sizeXL" value="xl"> <label
							for="sizeXL">XL 사이즈</label>
						</td>
					</tr>


					<tr>
						<td>
							<p>색상</p> <input type="text" name="color" maxlength="10">
						</td>
					</tr>

					<tr>
						<td>
							<p>가격</p> <input type="text" name="price" maxlength="8">
						</td>
					</tr>
					<tr>
						<td>
							<p>수량</p> <input type="text" name="product_amount" maxlength="3">
						</td>
					</tr>

					<tr>
						<td><input type="reset" value="초기화"> <input
							type="submit" value="등록"></td>
					</tr>
				</table>

			</div>
		</div>
	</form>
	<jsp:include page="../Fix/Footer.jsp" flush="false" />
</body>
</html>