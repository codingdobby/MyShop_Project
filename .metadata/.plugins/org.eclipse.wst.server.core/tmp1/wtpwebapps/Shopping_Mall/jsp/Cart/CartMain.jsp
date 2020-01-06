<%@page import="Product.cartVO"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="Product.CartDAO"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<style>
#product table {
	text-align: center;
}

#cart_info {
	text-align: left;
	padding-left: 10px;
}
</style>
<script src="//code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	function cartdelete() {
		document.cart.action = "cart_delete.jsp";
		document.cart.submit();

	}

	function cartToPay() {
		document.cart.action = "AddPay.jsp";
		document.cart.submit();

	}
</script>



<meta charset="UTF-8">
<link rel="stylesheet" href="../../css/Cart.css">
<title>장바구니</title>


</head>
<body>



	<%
		String id = (String) session.getAttribute("id");
		System.out.print("아이디" + id);
		if (id == null || id.length() == 0) {
	%>
	<script>
		alert('로그인 하세요');
		history.go(-1);
	</script>

	<%
		}
	%>
	<%
		ArrayList<cartVO> arr = dao.getAllCart(id);
	%>
	<jsp:include page="../Fix/Header.jsp" flush="true" />
	<div align="center">
		<h1 id="test"></h1>
		<div id="product">
			<form name="cart">
				<table border="1" width="1000px" height="80%">
					<tr>
						<th></th>
						<th id="brand" colspan="2">상품 정보</th>

						<th>수량</th>
						<th>금액</th>

					</tr>
					<%
						int i = 0;

						int total = 0;
						if (arr != null) {
							for (cartVO vo : arr) {
					%>


					<tr>
						<td width="10px;"><input type="checkbox" name="chk_value"
							value="<%=vo.getCart_id()%> "></td>
						<td width="100px;">
						<img src="../../uploadFile/<%=vo.getProduct_img()%>">
						</td>
						<td id="cart_info">
						이름 : <%=vo.getProduct_name()%><Br>
						<input type="hidden" name="product_name" value="<%=vo.getProduct_name()%>">
							사이즈 : <%=vo.getSize()%><br> 
						<input type="hidden" name="size"  value=" <%=vo.getSize()%>">	
							색상 : <%=vo.getColor()%><br>
						<input type="hidden" name="color" value="<%=vo.getColor()%>">
						</td>
						<td width="100px;">
						<form action="cartAmount.jsp" method="post">
						<input type="hidden" name="num" value="<%=vo.getProduct_num()%>"><%=vo.getAmount()%>개<br>
						 <input type="text" name="re_amount"> 
						 <input type="submit" name="btn" value="수정">
							</form>
							</td>
						<td><fmt:formatNumber value="<%=vo.getPro_price()%>" pattern="#,###" />원
						<input type="hidden" name="promoney" value="<%=vo.getPro_price()%>">
						</td>
						

					</tr>


					<%
						i++;
							}
							//for end
						} else {
					%>

					<tr>
						<td colspan="6" align="center">상품 없음</td>
					</tr>
					<%
						}
					%>
				</table>
		</div>

		<div id="product_total">
			<%
				ArrayList<cartVO> cart_total = dao.getTotal(id);
				for (cartVO vo : cart_total) {
			%>
			총 수량 :
			<%=vo.getTotal_amount()%>개 &nbsp;&nbsp;&nbsp;&nbsp; 총 금액 :

			<fmt:formatNumber value="<%=vo.getTotal_price()%>" pattern ="#,###" />
			원


			<%
				}
			%>
		</div>
		<div id="btn_List">
			<input type="button" value="삭제하기" onclick="cartdelete();">
			<input type="button" onclick="cartToPay()" value="결제하기">
		</div>
		</form>
	</div>
	<jsp:include page="../Fix/Footer.jsp" flush="true" />
</body>
</html>