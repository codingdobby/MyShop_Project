<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.Timestamp"%>

<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="cdao" class="seller.CouponDAO"></jsp:useBean>
<jsp:useBean id="vo" class="seller.CouponVO">

</jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		
		
		request.setCharacterEncoding("UTF-8");
		String coupon_name = request.getParameter("coupon_name");
		String startdate = request.getParameter("startdate");
		String enddate = request.getParameter("enddate");
		String discount = request.getParameter("discount");
		int discount1 = Integer.parseInt(discount);
		String seller_id = (String) session.getAttribute("id");

		cdao.insertCoupon(coupon_name, startdate, enddate, discount1, seller_id);
		response.sendRedirect("Seller_Coupon.jsp");
	%>
</body>
</html>