<%@page import="seller.CouponVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="seller.CouponDAO"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MY Shop</title>
<link rel="stylesheet" href="../../css/Seller.css">
</head>
<body>
	<%
		int count = 0;
		String id = (String) session.getAttribute("id");
		count = dao.getCouponCount(id);
		System.out.print(id);
		ArrayList<CouponVO> list = dao.getAllCoupon(id);
	%>
	<jsp:include page="../Fix/Header.jsp" flush="false" />
	<div align="center">

		<h1>판매자 페이지</h1>
		<div id="container">


			<div id="content">

				<h2>쿠폰 관리</h2>



				<!-- info end -->

				<div id="border_line">
					<jsp:include page="Menu_bar.jsp" flush="false" />
					<table border="1">
						<tr>
							<th></th>
							<th>쿠폰 번호</th>
							<th>쿠폰 시작일</th>
							<th>쿠폰 종료일</th>
							<th>쿠폰 할인률</th>
							<th>판매자</th>
							<th>삭제</th>


						</tr>
						<%
							if (count == 0) {
						%>
						<tr>
							<td colspan="7">등록된 쿠폰이 없습니다.</td>

						</tr>

						<%
							} else {

								for (CouponVO vo : list) {
						%>
						<tr>


							<td><input type="checkbox"></td>
							<td><%=vo.getCoupon_name()%></td>
							<td><%=vo.getStartdate()%></td>
							<td><%=vo.getEnddate()%></td>
							<td><%=vo.getDiscount()%></td>
							<td><%=vo.getSeller_id()%></td>
							<td><input type="button" value="확인"></td>
						</tr>
						<%
							}
							}
						%>
					</table>






				</div>
				<div id="add" align="right">
					<input type="button" value="등록"
						onclick="location.href='add_Coupon.jsp'">
				</div>
			</div>
		</div>





	</div>

	<jsp:include page="../Fix/Footer.jsp" flush="false" />
</body>
</html>