<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
			<title>MY Shop</title>
			<link rel="stylesheet" href="../../css/Seller.css">
		</head>
		<body>
		<jsp:include page="../Fix/Header.jsp" flush="false"/>
			<div align="center">
				<h1>관리자 페이지</h1>
				<div id="container" >

						<jsp:include page="Menu_bar.jsp" flush="false"/>
					<div id="content">
					<h2>회원 관리</h2>
						<table border="1">
							<tr>
							<th></th>
								<th>판매자 상호명</th>
								<th>회사 연락처</th>
								<th>email</th>
								<th>가입 일자</th>
								<th>인증 여부</th>
								<th>허가</th>
								
							</tr>
							<tr>
								<td><input type="checkbox"></td>
								<td>test</td>
								<td>010-1111-1111</td>
								<td>test@test.com</td>
								<td>2019-05-01</td>
								<td>X</td>
								<td><input type="button" value="확인"></td>
							</tr>
						</table>
					</div>
				</div>
			</div>
			
			<jsp:include page="../Fix/Footer.jsp" flush="false"/>
		</body>
	</html>