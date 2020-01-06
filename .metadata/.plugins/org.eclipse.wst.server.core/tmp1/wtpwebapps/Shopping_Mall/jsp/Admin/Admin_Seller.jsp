<%@page import="seller.SellerVO"%>
<%@page import="java.util.ArrayList"%>
<jsp:useBean id="dao" class="Admin.AdminDAO"></jsp:useBean>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MY Shop</title>
<link rel="stylesheet" href="../../css/Admin.css?after">
</head>
<body>
	<%
		ArrayList<SellerVO> list = dao.getAllSeller();
		int count = 0;
		count = dao.countSeller();
		int newCus = 0;
		newCus = dao.countNewSeller();
	%>
	<jsp:include page="../Fix/Header.jsp" flush="false" />
	<div align="center">
		<h1>관리자 페이지</h1>
		<hr>
		<div id="container">


			<div id="content">
				<h2>판매자 관리</h2>
				<div id="list">
					<h2>
						<a href="Admin_Verify_Seller.jsp">미인증 판매자</a>
					</h2>
					<h2>
						<a href="Admin_Seller.jsp">총회원 목록</a>
					</h2>
				</div>
				<!-- list end -->
				<div id="info">
					총 회원수 :
					<%=count%>
					신규 가입자 :
					<%=newCus%></div>
				<!-- info end -->

				<div id="border_line">
					<jsp:include page="Menu_bar.jsp" flush="false" />
					<table border="1">
						<tr>
							<th></th>
							<th>ID</th>
							<th>상호명</th>
							<th>전화번호</th>
							<th>등록일자</th>
							<th>인증상태</th>
							<th>인증하기</th>

						</tr>
						<%
							for (SellerVO vo : list) {
						%>
						<tr>


							<td><input type="checkbox"></td>
							<td><%=vo.getSeller_id()%></td>
							<td><%=vo.getSeller_company()%></td>
							<td><%=vo.getPhone()%></td>
							<td><%=vo.getReg_date()%></td>
							<td><%=vo.getVerify()%></td>
							<td><input type="button" value="확인"></td>
						</tr>
						<%
							}
						%>
					</table>






				</div>

			</div>
		</div>
	</div>

	<jsp:include page="../Fix/Footer.jsp" flush="false" />
</body>
</html>