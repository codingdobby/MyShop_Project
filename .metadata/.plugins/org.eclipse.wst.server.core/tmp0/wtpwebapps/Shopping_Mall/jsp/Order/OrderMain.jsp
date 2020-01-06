<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MY Shop</title>

<link rel="stylesheet" href="../../css/Order.css?after">


</head>
<body>
	<jsp:include page="../Fix/Header.jsp" flush="false" />
	<div align="center">
		<h1>주문 배송</h1>
		<div id="container">
			<div id="Order">
				<input type="text" name="start_date" id="StartDatePicker"> -
				<input type="text" name="end_date" id="EndDatePicker"> <input
					type="button" value="검색">
			</div>

			<div id="content">
			<table border="1">
				<tr></tr>
				<tr></tr>
			
			</table>
			</div><!-- end content -->
		</div>
		<!-- end container -->

	</div>
	<!-- end align center -->


	<jsp:include page="../Fix/Footer.jsp" flush="false" />
</body>
</html>