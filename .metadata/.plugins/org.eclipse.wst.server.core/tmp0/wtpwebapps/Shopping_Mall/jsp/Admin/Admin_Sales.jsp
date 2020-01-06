<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
			<title>MY Shop</title>
			<style>
				#container {
				display:flex;
				width:1000px;
				height:auto;
				
				}
				#menu_Bar ul {
				width:200px;
				height:243px;
				border:2px solid black;
				display:inline-block;
				margin:0px;
				padding:0px;
				margin-right:30px;
				}
				
				#menu_Bar a {
					text-decoration:none;
				}
				#menu_Bar ul li{
				margin-bottom:10px;

				padding:22px;
				border-bottom:1px solid black;
				list-style:none;
				height:30px;
				text-align:center;
				}

				#content {
				width:750px;
				height:auto;
				border:1px solid lightgray;
				background-color:white;}
				
				#content table {
				width:100%;
				border-collapse:collapse;
				text-align:center;
				border-right:transparent;
				border-left:transparent;
				}
				
				
			</style>
		</head>
		<body>
		<jsp:include page="../Fix/Header.jsp" flush="false"/>
			<div align="center">
				<h1>관리자 페이지</h1>
				<div id="container" >

					<jsp:include page="Menu_bar.jsp" flush="false"/>
					<div id="content">
					<h2>매출 관리</h2>
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