<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보 수정</title>
<link rel="stylesheet" href="../../css/Info.css?after">
</head>
<body>
	<jsp:include page="../Fix/Header.jsp" flush="true" />
	<form action="CheckPwd.jsp" method="post">
		<div align="center">

			<div id="Info">
				<div id="info_text">
					<h1>비밀 번호 확인</h1>
				</div>


				<div id="check_info">

					정보 확인을 위해 비밀번호를 입력해주세요<br>
					 <input type="password" name="pwd" 	maxlength="20"><br> <input type="submit" name="확인">

				</div>

			</div>
		</div>
	</form>
	<jsp:include page="../Fix/Footer.jsp" flush="true" />
</body>
</html>