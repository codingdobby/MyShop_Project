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

<script src="//code.jquery.com/jquery-3.4.1.min.js"></script>
<link rel="stylesheet" href="../../css/Product.css?after">
<script type="text/javascript" src="../../js/product_detail.js"></script>
<script>
	$(document).ready(function() {

		var value = $("#amount option:selected").val();
		var price = $("#price").val();

		var total = Number(price) * Number(value);
		total = parseInt(total);

		$("#total_money").html(total);

		$("#amount").change(function() {
			var value = $("#amount option:selected").val();
			var price = $("#price").val();

			var total_price = Number(price) * Number(value);
			total_price = parseInt(total_price);

			$("#total_money").html(total_price);
			$("#total_money_value").val(total_price);

		});

	});
</script>


</head>
<body>

	<%
		String num = request.getParameter("num");
		dao.UpdateHit(num);
		ArrayList<ProductVO> list = dao.getProductDetail(num);
	%>
	<jsp:include page="../Fix/Header.jsp" flush="false" />
	<div align="center">
		<form action="../Cart/CartAdd.jsp" method="post">

			<%
				for (ProductVO vo : list) {
			%>
			<div id="product_function">

				<div id="product_img">

					<img src="../../uploadFile/<%=vo.getProduct_img()%>"> <input
						type="hidden" name="image" value="<%=vo.getProduct_img()%>">
				</div>
				<!--end product_img-->
				<div id="product_detail">

					<table>
						<tr>
							<th colspan="2">상품명
								<h2><%=vo.getProduct_name()%>
									<input type="hidden" name="name"
										value="<%=vo.getProduct_name()%>">
										<input type="hidden" name="num" value="<%=vo.getProduct_num()%>">
								</h2>
							</th>
							<th></th>
						</tr>
						<tr>
							<td>가격</td>
							<td><%=vo.getPrice()%> 택배 배송 (2500원)<input type="hidden"
								value="<%=vo.getPrice()%>" id="price" name="price"></td>

						</tr>
						<tr>
							<td>수량</td>
							<td><select name="amount" id="amount">

									<%
										for (int i = 1; i <= 10; i++) {
									%>

									<option value="<%=i%>"><%=i%></option>
									<%
										}
									%>
							</select></td>
						</tr>
						<tr>
							<td>색상 선택</td>
							<td><select name="color">
									<option value="<%=vo.getColor()%>"><%=vo.getColor()%></option>
							</select> <input type="hidden" value="<%=vo.getColor()%>"></td>
						</tr>



						<tr>
							<td>size</td>
							<td><%=vo.getSize()%> <input type="hidden" name="size"
								value="<%=vo.getSize()%>"></td>
						</tr>
						<tr>
							<td>총 상품 금액</td>
							<td><span id="total_money"></span> <input type="hidden"
								name="tot_money" id="total_money_value"></td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" value="장바구니">

								<input type="button" value="결제하기"
								onclick="location.href='../Pay/PayMain.jsp'"></td>
						</tr>
					</table>

				</div>

				<!--end product_detail-->
			</div>
		</form>
		<!--end product_function-->



		<div id="tabbar"></div>

		<div id="tab">
			<div id="tab_label">

				<input type="radio" name="tabs" id="tab1" checked="checked">
				<label for="tab1">상세정보</label> <input type="radio" name="tabs"
					id="tab2"> <label for="tab2">리뷰(review)</label> <input
					type="radio" name="tabs" id="tab3"> <label for="tab3">문의</label>

			</div>

			<div id="content1">
				<div id="member_id_box">
					<img src="../../uploadFile/<%=vo.getProduct_detail_img()%>">
				</div>
			</div>

			<div id="content2">
				<div id="member_pwd_box">
					아이디 <input type="text" placeholder="아이디를 입력하세요" id="id">
					전화번호 <input type="text" placeholder="전화번호를 입력하세요" id="pwd_phone">
					<input type="button" onclick="pwd_check()" value="다음 단계">
				</div>


			</div>


			<div id="content3">
				<div id="result">
					<%
						out.print("아이디는 test 입니다.");
					%>

				</div>


			</div>

			<div id="content4">
				<div id="result">
					<%
						out.print("비밀번호는 test 입니다.");
					%>

				</div>


			</div>

		</div>
		<%
			}
		%>
	</div>
	<jsp:include page="../Fix/Footer.jsp" flush="false" />
</body>
</html>