<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="../../css/Login.css">
<script type="text/javascript">
	function check() {
		var form = document.form;
		if (form.id.value.length <= 0) {
			alert('아이디 입력!');
			form.id.focus();
			return false;
		}

		if (form.pwd.value.length <= 0) {
			alert('비밀번호 입력!');
			form.pwd.focus();
			return false;
		} else
			return true;
	}
</script>


<script src="//code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
	$(document).ready(function() {
		$("#Login_Member").css("display", "block");

		$("#Login_non_Member").css("display", "none");
		$("#Login_Seller").css("display", "none");

		// 저장된 쿠키값을 가져와서 ID 칸에 넣어준다. 없으면 공백으로 들어감.
		var key = getCookie("key");
		$("#userId").val(key);

		if ($("#userId").val() != "") { // 그 전에 ID를 저장해서 처음 페이지 로딩 시, 입력 칸에 저장된 ID가 표시된 상태라면,
			$("#idSaveCheck").attr("checked", true); // ID 저장하기를 체크 상태로 두기.
		}

		$("#idSaveCheck").change(function() { // 체크박스에 변화가 있다면,
			if ($("#idSaveCheck").is(":checked")) { // ID 저장하기 체크했을 때,
				setCookie("key", $("#userId").val(), 7); // 7일 동안 쿠키 보관
			} else { // ID 저장하기 체크 해제 시,
				deleteCookie("key");
			}
		});

		// ID 저장하기를 체크한 상태에서 ID를 입력하는 경우, 이럴 때도 쿠키 저장.
		$("#userId").keyup(function() { // ID 입력 칸에 ID를 입력할 때,
			if ($("#idSaveCheck").is(":checked")) { // ID 저장하기를 체크한 상태라면,
				setCookie("key", $("#userId").val(), 7); // 7일 동안 쿠키 보관
			}
		});

	});

	$(function() {

		$("#member").click(function() {

			$("#Login_Member").css("display", "block");
			$("#Login_non_Member").css("display", "none");
			$("#Login_Seller").css("display", "none");

		});
		$("#non_member").click(function() {
			$("#Login_Member").css("display", "none");
			$("#Login_non_Member").css("display", "block");
			$("#Login_Seller").css("display", "none");
		});

		$("#seller").click(function() {

			$("#Login_Member").css("display", "none");
			$("#Login_non_Member").css("display", "none");
			$("#Login_Seller").css("display", "block");
		});

	})

	function setCookie(cookieName, value, exdays) {
		var exdate = new Date();
		exdate.setDate(exdate.getDate() + exdays);
		var cookieValue = escape(value)
				+ ((exdays == null) ? "" : "; expires=" + exdate.toGMTString());
		document.cookie = cookieName + "=" + cookieValue;
	}

	function deleteCookie(cookieName) {
		var expireDate = new Date();
		expireDate.setDate(expireDate.getDate() - 1);
		document.cookie = cookieName + "= " + "; expires="
				+ expireDate.toGMTString();
	}

	function getCookie(cookieName) {
		cookieName = cookieName + '=';
		var cookieData = document.cookie;
		var start = cookieData.indexOf(cookieName);
		var cookieValue = '';
		if (start != -1) {
			start += cookieName.length;
			var end = cookieData.indexOf(';', start);
			if (end == -1)
				end = cookieData.length;
			cookieValue = cookieData.substring(start, end);
		}
		return unescape(cookieValue);
	}
</script>

</head>
<body>
	<jsp:include page="../Fix/Header.jsp" flush="true" />

	<div align="center">
		<h1>로그인</h1>
		<div id="Box">

			<div id="MemberType">
				<input type="radio" name="member" id="member" checked="checked">회원
				<input type="radio" id="non_member" name="member">비회원 <input
					type="radio" name="member" id="seller">판매 회원

				<div id="Login_Box">

					<div id="Login_Member">
						<form action="LoginProc_member.jsp" method="post"
							onsubmit="return check();" name="form">
							<p>아이디</p>
							<input type="text" name="id" placeholder="아이디를 입력하세요" id="userId"
								maxlength="20"><br>
							<p>비밀번호</p>
							<input type="password" name="pwd" placeholder="비밀번호를 입력하세요"
								maxlength="20"><br> <br> <input
								type="checkbox" name="cb1" id="idSaveCheck">아이디 저장 <input
								type="checkbox" name="cn2"> 자동 로그인 <br> <br>
							<hr>
							<a href="FindInfo.jsp?type=member">아이디 / 비밀번호 찾기</a> <a
								href="../SignUp/Distinct_member.jsp">회원가입</a><br> <br>

							<input type="submit" value="로그인">
						</form>
					</div>





					<form action="LoginProc_non_member.jsp" method="post"
						onsubmit="return check();" name="form">
						<div id="Login_non_Member">
							<p>전화번호</p>
							<select name="non_phone1">
								<option selected="selected">010</option>
								<option>011</option>
								<option>016</option>
								<option>017</option>
								<option>018</option>
								<option>019</option>
							</select> - <input type="text" id="phone" name="non_phone2" maxlength="4"> - <input type="text"
								id="phone" name="non_phone3"
								maxlength="4">
							<p>주문자명</p>
							<input type="text" name="non_name" placeholder="이름을 입력하세요"
								maxlength="20"><br>
							<p>주문 비밀번호</p>
							<input type="password" name="non_pwd" placeholder="비밀번호를 입력하세요"><br>
							<br> <input type="submit" value="로그인">
						</div>
					</form>




					<form action="LoginProc_seller.jsp" method="post"
						onsubmit="return check();" name="form">
						<div id="Login_Seller">
							<p>아이디</p>
							<input type="text" name="seller_id"
								placeholder="-를 제외한 사업자 번호를 입력하세요" maxlength="10"><br>
							<p>비밀번호</p>
							<input type="password" name="seller_pwd"
								placeholder="비밀번호를 입력하세요" maxlength="20"><br> <br> <input
								type="checkbox" name="cb1">아이디 저장 <input type="checkbox"
								name="cn2"> 자동 로그인 <br> <br>
							<hr>
							<a href="FindInfo.jsp?type=seller">아이디/비밀번호 찾기</a> <a
								href="../SignUp/Distinct_member.jsp">회원가입</a><br> <br>
							<input type="submit" value="로그인">
						</div>
					</form>


				</div>
				<!-- LoginBox -->
			</div>
			<!-- Distint member -->
			<div id="coupon_banner">
				<ul style="-webkit-padding-start: 0px;">
					<li><a href="${pageContext.request.contextPath}/jsp/Plan/PlanProduct.jsp"><IMG src="../../image/배너.png"></a></li>
				</ul>
			</div>

		</div>
	</div>
	<jsp:include page="../Fix/Footer.jsp" flush="true" />

</body>
</html>