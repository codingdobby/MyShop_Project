<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MY Shop</title>
<link rel="stylesheet" href="NoticeForm.css?after">
</head>
<body>
	<jsp:include page="../../Fix/Header.jsp" flush="false" />
	<div align="center">
		<div id="writeForm">
			<form action="Notice_Proc.jsp">
				<h1>공지사항 작성</h1>
				<table border="1" width="1000px" height="600px">
					<tr>
						<td>글제목</td>
						<td><input type="text" name="title"></td>
					</tr>

					<tr>
						<td colspan="2"><textarea rows="30" cols="100"
								style="resize: none;" maxlength="1000" name="content"></textarea></td>
					</tr>
					<tr><td colspan="2"><input type="file"></tr>
					<tr>
						<td colspan="2"><input type="reset" value="다시쓰기">
						<input 	type="submit" value="작성"></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<jsp:include page="../../Fix/Footer.jsp" flush="false" />

</body>
</html>