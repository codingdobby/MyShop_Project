<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Shop</title>
<link rel="stylesheet" href="../../../css/SignUp.css?after">
<script type="text/javascript" src="../../../js/MemberCheck.js"></script>
</head>
<body>


	<jsp:include page="../../Fix/Header.jsp" flush="true" />
	<div align="center">
		<h1>판매자 등록</h1>
		<div id="Seller_Box">
			<div id="seller_info">
				<form method="post" action="seller_reg_proc.jsp" name="seller_form">
					<table>
						<tr>
							<td>사업자 등록 번호<br> <input type="text" name="reg_num1" onkeypress="filterKey('[0-9]')"
								maxlength="3"><span id="hyp">-</span><input type="text" onkeypress="filterKey('[0-9]')"
								name="reg_num2" maxlength="2"><span id="hyp">-</span><input
								type="text" name="reg_num3" maxlength="5" onkeypress="filterKey('[0-9]')"
								onblur="seller_onblur_text()">
								<p id="id_text"></p>
								</td>
						</tr>
						<tr>
							<td>상호명<br> <input type="text" name="company"
								maxlength="30" id="input2" onblur="seller_onblur_text()">
								<p id="comp_text"></p>
								</td>
						</tr>


						<tr>
							<td>비밀번호<br> <input type="password" name="pwd"
								onblur="seller_onblur_text()" maxlength="20">
								<p id="pwd_text"></p>
								</td>
						</tr>
						
						<tr>
							<td>비밀번호 확인<br> <input type="password" name="pwdchk"
								onblur="seller_onblur_text()" maxlength="20">
								<p id="pwdchk_text"></p>
								</td>
						</tr>
						<tr>
							<td>대표 번호<br> <select name="phone1">
									<option selected="selected">010</option>
									<option>011</option>
									<option>016</option>
									<option>017</option>
									<option>018</option>
									<option>019</option>
							</select><span id="hyp">-</span> <input type="text" name="phone2"
								maxlength="4" id="phone2" onkeypress="filterKey('[0-9]')"
								onblur="seller_onblur_text()"> <span id="hyp">-</span> <input
								type="text" name="phone3" maxlength="4" id="phone3"
								onkeypress="filterKey('[0-9]')" onblur="seller_onblur_text()">
							</td>
						<tr>
							<td>이메일<br> <input type="text" name="email" id="input2"
								onblur="seller_onblur_text()">
								<p id="email_text"></p>
								</td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" value="입력"></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
	</div>
	<!-- align center end -->
	<jsp:include page="../../Fix/Footer.jsp" flush="true" />

</body>
</html>