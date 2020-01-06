<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../../css/SignUp.css?after">
</head>

<script>
	var num = 5;
	var time = setInterval(function() {
		if (num > 0) {
			document.getElementById("count").innerHTML =num+"초뒤에 메인으로 이동합니다.";

			num--;
		}
	}, 1000);
	
	setTimeout(function(){
		location.href="../Main/MainPage.jsp";
		
		
	},5000);
</script>
<body>
	<jsp:include page="../Fix/Header.jsp" flush="false" />
	<div align="center">

		<div id="step">
			가입 완료! <img src="../../image/step3.png" width="400px" height="50px;"
				id="step3">
		</div>
		<br> <h1><a href="../Main/MainPage.jsp">메인으로 이동</a></H1>
		<p id="count"></p>
	</div>
	<jsp:include page="../Fix/Footer.jsp" flush="false" />
</body>
</html>