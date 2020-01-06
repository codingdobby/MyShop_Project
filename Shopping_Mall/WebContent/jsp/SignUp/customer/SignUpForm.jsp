<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>

<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="//code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<!-- <script src="https://code.jquery.com/jquery-1.12.4.js"></script>

 -->

<link rel="stylesheet" href="../../../css/SignUp.css?after">
<script type="text/javascript" src="../../../js/MemberCheck.js"></script>
<script type="text/javascript">
	window.history.forward();

	function noBack() {

		window.history.forward();

	}
</script>
<script>
	$(function() {
		$("#testDatepicker").datepicker(
				{
					changeYear : true,
					changeMonth : true,
					showMonthAfterYear : true,
					dateFormat : "yy-mm-dd",
					minDate : "-80Y",
					maxDate : "-14Y",
					dayNames : [ '월요일', '화요일', '수요일', '목요일', '금요일', '토요일',
							'일요일' ],
					dayNamesMin : [ '월', '화', '수', '목', '금', '토', '일' ],
					monthNamesShort : [ '1', '2', '3', '4', '5', '6', '7', '8',
							'9', '10', '11', '12' ],
					monthNames : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월',
							'8월', '9월', '10월', '11월', '12월' ]

				});
	});
</script>
</head>
<body>
	<jsp:include page="../../Fix/Header.jsp" flush="true" />


	<div align="center">
		<div id="step">
			회원 정보 입력 <img src="../../../image/step2.png" width="400px"
				height="50px;" id="step2">
		</div>
		<div id="SignUpForm">

			<form method="post" action="SignUpProc.jsp"
				onsubmit="return JoinCheck();" name="form">
				<table align="center">
					<tr>
						<td><p>아이디</p> <input type="text" placeholder="ID를 입력하세요"
							name="id" maxlength="20" onblur="onblur_text()"><br>
							<span id="id_text"></span></td>
					</tr>

					<tr>
						<td><p>비밀번호</p> <input type="password"
							placeholder="비밀번호를 입력하세요" name="pwd" maxlength="20"
							onblur="onblur_text()"> <br> <span id="pwd_text"></span></td>
					</tr>

					<tr>
						<td><p>비밀번호 확인</p> <input type="password"
							placeholder="비밀번호를 다시 입력하세요" name="pwdchk" maxlength="20"
							onblur="onblur_text()"> <br> <span id="pwdchk_text"></span></td>
					</tr>

					<tr>
						<td>
							<p>이름</p> <input type="text" placeholder="이름을 입력하세요" name="name"
							maxlength="20">
						</td>
						
						
					</tr>
					
						<tr>
						<td>
							<p>닉네임</p> <input type="text" placeholder="사용할 닉네임을 입력하세요" name="nickname"
							maxlength="10">
						</td>
						
						
					</tr>

					<tr>
						<td><p>전화번호</p> <select name="phone1">
								<option selected="selected">010</option>
								<option>011</option>
								<option>016</option>
								<option>017</option>
								<option>018</option>
								<option>019</option>
						</select><span id="hyp">-</span> <input type="text" name="phone2"
							maxlength="4" id="phone2" onkeypress="filterKey('[0-9]')">
							<span id="hyp">-</span> <input type="text" name="phone3"
							maxlength="4" id="phone3" onkeypress="filterKey('[0-9]')">
							<br> <span id="phone_text"></span></td>
					</tr>

					<tr>
						<td><p>이메일</p> <input type="text" placeholder="이메일을 입력하세요"
							name="email" onblur="onblur_text()"> <br> <span
							id="email_text"></span></td>
					</tr>

					<tr>
						<td><p>주소</p> <input type="text" name="zipcode" maxlength="7"
							readonly="readonly" id="zipcode"> <input type="button"
							value="우편번호찾기" id="btnZip" onclick="zipCheck()"></td>
					</tr>

					<tr>
						<td><input type="text" name="address1" readonly="readonly"
							id="address1"></td>
					</tr>


					<tr>
						<td><input type="text" placeholder="상세 주소를 입력하세요"
							name="address2"></td>
					</tr>

					<tr>
						<td><p>생년월일 (선택)</p>
							<input type="text" id="testDatepicker" name="birth"></td>
					</tr>


				</table>

				<div id="btns">
					<input type="button" value="처음으로"
						onclick="location.href='../../Main/MainPage.jsp'"><input
						type="reset" value="초기화"><input type="submit" value="확인">
				</div>
			</form>
		</div>
		<jsp:include page="../../Fix/Footer.jsp" flush="true" />
	</div>
</body>
</html>