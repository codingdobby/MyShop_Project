<%@page import="java.util.ArrayList"%>
<%@page import="seller.CouponVO"%>

<jsp:useBean id="dao" class="member.MemberDAO"></jsp:useBean>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보 수정</title>
<link rel="stylesheet" href="../../css/Info.css?after">
</head>
<body>
	<jsp:include page="../Fix/Header.jsp" flush="true" />
	<%
		String id = (String) session.getAttribute("id");
		ArrayList<CouponVO> list = dao.getCoupon(id);
	%>
	<div align="center">
	<h1>쿠폰함</h1>
		<div id="content_coupon">
			<div id="menu_Bar">
				<ul>
					<li><a
						href="${pageContext.request.contextPath}/jsp/Member/InfoMain.jsp">회원
							정보 수정</a></li>
					<li><a href="../Cart/CartMain.jsp">장바구니</a></li>
					<li>주문 내역</li>
					<li><a
						href="${pageContext.request.contextPath}/jsp/Member/CouponMain.jsp">쿠폰
							함</a></li>
				</ul>
			</div>
			<div id="coupon_list">
				<div id="add_coupon">
				<form action="coupon_add.jsp" method="post">
					<input type="text" name="coupon_name" maxlength="16"><input type="submit"
						value="등록"> <br>
				</form>
				</div>
				<table border="1" width="900px">
					<tr>
						<th>쿠폰 번호</th>
						<th>할인율</th>
						<th>사용 기간</th>
					</tr>

					<%
						for (CouponVO vo : list) {
					%>
					<tr>
						<td><%=vo.getCoupon_name()%></td>
						<td><%=vo.getDiscount()%>%</td>
						<td><%=vo.getStartdate()%> 
						<br>
						~ <br><%=vo.getEnddate()%></td>
					</tr>
					<%
						}
					%>
				</table>
			</div>
			<!-- end coupon table -->
		</div>
		<!-- end content_coupon -->
	</div>
	<!-- end div align center -->

	<jsp:include page="../Fix/Footer.jsp" flush="true" />
</body>
</html>