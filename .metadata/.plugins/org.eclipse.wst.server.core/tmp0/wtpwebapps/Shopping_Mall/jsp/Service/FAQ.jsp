<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MY Shop</title>
<style>
.toggle_button {
    cursor:pointer;
    display:block;
    background:#eee;
    text-align:center;
    border:1px solid #ccc;

}
#toggle_button,
#toggle_contents {
    height:0;
    overflow:hidden;
    position:absolute;
   
}
#toggle_button:checked + #toggle_contents {
    height:auto;
    position:relative;
    border:1px solid #ccc;
   
    padding:10px;
}



</style>
<link rel="stylesheet" href="../../css/Service.css?after">
</head>
<body>
	<jsp:include page="../Fix/Header.jsp" flush="false" />
	<div align="center">
		<h1>FAQ</h1>
		<div id="container">



			<div id="menu_order">
				<ul>
					<li>조회순</li>
					<li>최근 등록순</li>
				</ul>
			</div>
			<!--  end menu -->
			<div id="content">
				<jsp:include page="Menu_bar.jsp" flush="false" />
				<div id="Question">
					<table border="1">
						<tr>
							<td>
							<label
								for="toggle_button" class="toggle_button">대충 질문한다는 내용</label>
								<input type="checkbox" id="toggle_button"> 
								
								<div id="toggle_contents">
									저히 홈페이지는 jsp로 만들었습니다. <label for="toggle_button" class="close_button">X</label>
								</div></td>
						</tr>

					</table>
					<div id="btns">
						<%
							String role = (String) session.getAttribute("role");
							if (role == "admin") {
						%>
						<input type="submit" value="글쓰기"
							onclick="location.href='Notice/NoticeWrite.jsp'">
						<%
							}
						%>

					</div>
				</div>
			</div>
			<!-- end content -->
		</div>
	</div>

	<jsp:include page="../Fix/Footer.jsp" flush="false" />
</body>
</html>