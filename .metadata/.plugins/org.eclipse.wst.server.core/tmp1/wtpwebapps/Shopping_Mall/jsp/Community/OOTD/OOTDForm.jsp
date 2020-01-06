<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../../Fix/Header.jsp" flush="false" />
	<div align="center">
	<form action="OOTD_Reg_proc.jsp" method="post" enctype="multipart/form-data">
		<table border="1">
			<tr>
				<td>글제목</td>
				<td><input type="text" name="title" maxlength="20"></td>
			</tr>

			<tr>
				<td>글내용</td>
				<td><textarea name="OOTD_content" cols="80" rows="20"
						maxlength="1000">
				
				</textarea></td>
			</tr>


			<tr>
				<td>이미지</td>
				<td><input type="file" name="OOTD_img"><br> <input
					type="file" name="OOTD_img2"><br> <input type="file"
					name="OOTD_img3"><br></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="확인"></td>
			</tr>

		</table>
		</form>
	</div>
	<jsp:include page="../../Fix/Footer.jsp" flush="false" />
</body>
</html>