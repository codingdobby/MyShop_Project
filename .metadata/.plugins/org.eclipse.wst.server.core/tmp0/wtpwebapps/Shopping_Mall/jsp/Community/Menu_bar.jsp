<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#menu_Bar ul {
	margin-top: 300px; width : 200px;
	height: 243px;
	border: 1px solid lightgray;
	display: inline-block;
	margin: 0px;
	padding: 0px;
	margin-right: 30px;
	width: 200px;
}

#menu_Bar a {
	text-decoration: none;
}

#menu_Bar ul li {
	margin-bottom: 10px;
	padding: 22px;
	border-bottom: 1px solid lightgray;
	list-style: none;
	height: 30px;
	text-align: center;
}
</style>
</head>
<body>
	<div id="menu_Bar">
		<ul style="-webkit-padding-start: 0px;">

			<li><a href="${pageContext.request.contextPath}/jsp/Community/OOTD/Community_OOTD.jsp">오늘의 옷</a></li>
			<li><a href="${pageContext.request.contextPath}/jsp/Community/BestDresser/Community_BestDresser.jsp">Best Dresser</a></li>
			<li><a href="${pageContext.request.contextPath}/jsp/Community/Ilsang/Community_Ilsang.jsp">소소한 일상</a></li>
		</ul>
	</div>
</body>
</html>