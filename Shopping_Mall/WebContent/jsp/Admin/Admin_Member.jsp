<%@page import="member.MemberVO"%>
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
		ArrayList<MemberVO> list = dao.getAllCustomer();
		int count = 0;
		count = dao.countCustomer();
		int newCus = 0;
		newCus = dao.countNewCustomer();
	%>
	<jsp:include page="../Fix/Header.jsp" flush="false" />
	<div align="center">
		<h1>관리자 페이지</h1>
		<div id="container">


			<div id="content">

				<h2>회원 관리</h2>
					
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
							<th>이름</th>
							<th>전화번호</th>
							<th>가입 일자</th>
							<th>포인트</th>
							<th>탈퇴</th>

						</tr>
						<%
							for (MemberVO vo : list) {
						%>
						<tr>


							<td><input type="checkbox"></td>
							<td><%=vo.getId()%></td>
							<td><%=vo.getName()%></td>
							<td><%=vo.getPhone()%></td>
							<td><%=vo.getReg_date()%></td>
							<td><%=vo.getPOINT()%></td>
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