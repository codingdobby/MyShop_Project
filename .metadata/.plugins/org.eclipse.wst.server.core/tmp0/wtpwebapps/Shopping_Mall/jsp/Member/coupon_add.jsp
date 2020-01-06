<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="member.MemberDAO"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
		String coupon_name = request.getParameter("coupon_name");
		int result = dao.find_Coupon(coupon_name);

		if (result == 1) {
			int user_coupon_result = dao.find_Coupon_user(coupon_name);
			if (user_coupon_result == 1) {
	%>
	<script>
		alert('이미 등록된 쿠폰입니다.');
		location.href="CouponMain.jsp"
	</script>
	<%
		} //end user_coupon result if
			else {
				String id = (String)session.getAttribute("id");
				dao.addCoupon(id, coupon_name);
	%>

	<script>
		alert('쿠폰 등록 완료');
		location.href="CouponMain.jsp"
	</script>

	<%
		} //end else 
		} //seller 쿠폰 찾기 end

		else if (result == 0) {
	%>
	<script>
		alert('존재하지 않는 쿠폰입니다!');
		history.go(-1);
	</script>
	<%
		} //end else if seller coupon
	%>



</body>
</html>