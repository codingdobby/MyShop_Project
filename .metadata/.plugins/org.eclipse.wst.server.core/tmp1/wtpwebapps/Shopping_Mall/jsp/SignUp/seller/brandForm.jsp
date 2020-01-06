<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
width: 600px;
height: auto;
border-collapse: collapse;
text-align: center;

}
#notice_Table table tr td{
	
	margin-top:30px;
	margin-bottom: 30px;
}


#notice_Table input[type="text"]{
	outline: none;
	width: 300px;
	height: 20px;
	font-size: 15pt;
	padding: 20px;
	border-radius: 5px;
	border: 1px solid #BDBDBD;
	margin-top:30px;
	margin-bottom: 30px;
}
#notice_Table input[type="reset"] {
	outline: none;
	width: 150px;
	height: 30px;
	font-size: 13pt;
	border-radius: 5px;
	border: 1px solid #BDBDBD;
	margin-right: 100px;
}

#notice_Table input[type="submit"] {
	outline: none;
	width: 150px;
	height: 30px;
	font-size: 13pt;
	border-radius: 5px;
	border: 1px solid #BDBDBD;
	
}

</style>
<title>브랜드 입점 신청서</title>
</head>
<body>

	<div align="center">
		<h2>브랜드 입점 신청서</h2>
		<div id="notice">
			<h3>관리자 인증까지 신청서 작성 후 2-3일정도 소요될수 있습니다.</h3>
			담당자 연락처 : 010-1234-5678
			담당자 email : test@test.com
		</div>
		<div id="notice_Table">
		<form action="brandFormProc.jsp" method="post">

		<table>
			<tr>
				<td>브랜드 공식 사이트<br> <input type="text" name="brand_site">
				</td>
			</tr>
			<tr>
				<td>담당자 성함<br> <input type="text" name="name">
				</td>
			</tr>

			<tr>
				<td>담당자 전화번호<br><input type="text" name="tel">
				</td>
			</tr>

			<tr>

				<td>담당자 메일 주소<br> <input type="text" name="email">
				</td>
			</tr>
			
			<tr>

				<td>취급 품목<br><br> <input type="checkbox" name="category" id="cloth" value="total_fashion">
				<label for="cloth">토탈 의류</label>
				<input type="checkbox" name="category" id="acc" value="acc">
				<label for="acc">악세사리</label>
				
				</td>
			</tr>
			<tr>
			<td><input type="reset" value="다시 작성"><input type="submit" value="제출하기"></td>
			</tr>
		</table>
		</form>
		</div>
	</div>
</body>
</html>