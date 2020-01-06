<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="UTF-8">
<title>MY Shop</title>



<link rel="stylesheet" href="../../css/Seller.css">

<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css"
	type="text/css" />



</head>
<body>
	<jsp:include page="../Fix/Header.jsp" flush="false" />
	<div align="center">
		<h1>쿠폰 등록</h1>



		<div id="product_content">
			<form action="add_Coupon_proc.jsp" method="post">

				<table border="1">

					<tr>
						<td>
							<p>쿠폰 번호</p> <input type="text" name="coupon_name" maxlength="16">
						</td>

					</tr>

					<tr>
						<td>
							<p>기간</p> <input type="text" name="startdate"
							id="StartDatePicker"> - <input type="text" name="enddate"
							id="EndDatePicker">
						</td>
						
					</tr>
					<tr>
						<td>
							<p>할인</p> <input type="text" name="discount" maxlength="2">
						</td>
					</tr>


					<tr>
						<td><input type="reset" value="초기화"> <input
							type="submit" value="등록"></td>
					</tr>

				</table>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>

<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>



<script>
	$(document).ready(
			function() {
				$("#StartDatePicker")
						.datepicker(
								{
									changeYear : true,
									changeMonth : true,
									showMonthAfterYear : true,
									dateFormat : "yy-mm-dd",
									minDate : "0",
									maxDate : "+1Y",
									dayNames : [ '월요일', '화요일', '수요일', '목요일',
											'금요일', '토요일', '일요일' ],
									dayNamesMin : [ '월', '화', '수', '목', '금',
											'토', '일' ],
									monthNamesShort : [ '1', '2', '3', '4',
											'5', '6', '7', '8', '9', '10',
											'11', '12' ],
									monthNames : [ '1월', '2월', '3월', '4월',
											'5월', '6월', '7월', '8월', '9월',
											'10월', '11월', '12월' ]

								});

				$("#EndDatePicker")
						.datepicker(
								{
									changeYear : true,
									changeMonth : true,
									showMonthAfterYear : true,
									dateFormat : "yy-mm-dd",
									minDate : "0",
									maxDate : "+1Y",
									dayNames : [ '월요일', '화요일', '수요일', '목요일',
											'금요일', '토요일', '일요일' ],
									dayNamesMin : [ '월', '화', '수', '목', '금',
											'토', '일' ],
									monthNamesShort : [ '1', '2', '3', '4',
											'5', '6', '7', '8', '9', '10',
											'11', '12' ],
									monthNames : [ '1월', '2월', '3월', '4월',
											'5월', '6월', '7월', '8월', '9월',
											'10월', '11월', '12월' ]

								});

			});
</script>

			</form>
		</div>
	</div>
	<jsp:include page="../Fix/Footer.jsp" flush="false" />
</body>
</html>