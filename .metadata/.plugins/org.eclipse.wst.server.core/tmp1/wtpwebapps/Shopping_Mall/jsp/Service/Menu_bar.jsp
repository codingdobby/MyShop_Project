<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
		#menu_Bar ul {
				width:200px;
				height:243px;
				border:2px solid black;
				display:inline-block;
				margin:0px;
				padding:0px;
				border: 2px solid black;
				
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
</style>
</head>
<body>
	<div id="menu_Bar">
						<ul style="-webkit-padding-start: 0px;">
						
							<li>
								<a href="ServiceMain.jsp">공지사항</a>
							</li>
							<li>
								<a href="FAQ.jsp">(FAQ)자주 묻는 질문 </a>
							</li>
							<li>
								<a href="Question.jsp">1:1질문</a>
							</li>	
						</ul>
					</div>
</body>
</html>