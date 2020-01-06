<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 구분</title>
<link rel="stylesheet" href="../../css/SignUp.css?after">
</head>
<body>
<jsp:include page="../Fix/Header.jsp" flush="false"/>
	<div align="center">
		<h1>회원  구분</h1>
		<div id="Distinct_Box">
		<div>
		<a href="customer/SignUpMain.jsp"><img src="../../image/btn_member.png"></a></div>
		<div><a href="seller/SellerAgree.jsp"><img src="../../image/btn_seller.png"></a></div>
		</div>
		</div>
		<jsp:include page="../Fix/Footer.jsp" flush="false"/>
</body>
</html>