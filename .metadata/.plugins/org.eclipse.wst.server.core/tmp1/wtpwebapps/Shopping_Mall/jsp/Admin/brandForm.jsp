<%@page import="java.util.ArrayList"%>
<%@page import="seller.FormVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="seller.SellerDAO"></jsp:useBean>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
#notice {
	border: 1px solid lightgray;
	background-color: #EAEAEA;
	width: 700px;
	height: 80px;
	text-align: center;
	margin-bottom: 50px;
}

#notice_Table table {
	width: 400px;
	height: auto;
	border-collapse: collapse;
	text-align: center;
}

#notice_Table table tr td {
	margin-top: 30px;
	margin-bottom: 30px;
}

#notice_Table input[type="text"] {
	outline: none;
	width: 300px;
	height: 20px;
	font-size: 15pt;
	padding: 20px;
	border-radius: 5px;
	border: 1px solid #BDBDBD;
	margin-top: 30px;
	margin-bottom: 30px;
}

#notice_Table input[type="button"] {
	margin-top: 50px;
	outline: none;
	width: 300px;
	height: 30px;
	font-size: 13pt;
	border: 1px solid #BDBDBD;
	outline: none;
}
</style>
<title>브랜드 입점 신청서</title>
</head>
<body>

	<div align="center">
		<h2>브랜드 입점 신청서</h2>
		<div id="notice">
			<h3>관리자 인증까지 신청서 작성 후 2-3일정도 소요될수 있습니다.</h3>
			담당자 연락처 : 010-1234-5678 담당자 email : test@test.com
		</div>
		<div id="notice_Table">
			<form action="brandFormProc.jsp" method="post">
				<%
					String brand_name = request.getParameter("name");
					ArrayList<FormVO> list = dao.getBrandForm(brand_name);

					for (FormVO vo : list) {
				%>
				<table border="1">
					<tr>
						<td>브랜드 공식 사이트<br> <%=vo.getBrand_site()%>
						</td>
					</tr>
					<tr>
						<td>담당자 성함<br> <%=vo.getName()%>
						</td>
					</tr>

					<tr>
						<td>담당자 전화번호<br> <%=vo.getTel()%>
						</td>
					</tr>

					<tr>

						<td>담당자 메일 주소<br> <%=vo.getEmail()%>
						</td>
					</tr>

					<tr>

						<td>취급 품목<br> <br> <input type="checkbox"
							name="category" id="cloth" value="total_fashion"> <label
							for="cloth">토탈 의류</label> <input type="checkbox" name="category"
							id="acc" value="acc"> <label for="acc">악세사리</label>

						</td>
					</tr>

				</table>
				<input type="hidden" value="<%=vo.getSeller_id_fk()%>"> <input
					type="button" value="승인"
					onclick="location.href='admin_verify_proc.jsp?seller_id=<%=vo.getSeller_id_fk()%>'">
				<%
					}
				%>


			</form>
		</div>
	</div>
</body>
</html>