<%@page import="org.json.simple.JSONObject"%>
<%@page import="member.MemberVO"%>
<%@page import="member.test"%>



<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="mdao" class="member.MemberDAO"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<script src="//code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		if ($('#tab1:checked')) {
			$("#content1").css("display", "block");
			$("#content2").css("display", "none");
			$("#content3").css("display", "none");
			$("#content4").css("display", "none");

		} else {
			$("#content1").css("display", "none");
			$("#content2").css("display", "block");
			$("#content3").css("display", "none");
			$("#content4").css("display", "none");
		}
	});

	$(function() {

		$("#tab1").click(function() {

			$("#content1").css("display", "block");
			$("#content2").css("display", "none");
			$("#content3").css("display", "none");
			$("#content4").css("display", "none");

		});
		$("#tab2").click(function() {
			$("#content1").css("display", "none");
			$("#content2").css("display", "block");
			$("#content3").css("display", "none");
			$("#content4").css("display", "none");

		});

	})

	function id_check() {
		if ($("#name").val() == "") {
			alert("이름이 빈칸입니다.");
			$("#name").focus();
			return false;
		}

		if ($("#phone").val() == "") {
			alert("전화번호 빈칸");
			$("#phone").focus();
			return false;
		}

		else {
			$("#content1").css("display", "none");
			$("#content2").css("display", "none");
			$("#content3").css("display", "block");
			$("#content4").css("display", "none");

		}
	}

	function pwd_check() {
		if ($("#id").val() == "") {
			alert("아이디 빈칸");
			$("#id").focus();
			return false;
		}

		if ($("#pwd_phone").val() == "") {
			alert("전화번호 빈칸");
			$("#pwd_phone").focus();
			return false;
		}

		else {
			$("#content1").css("display", "none");
			$("#content2").css("display", "none");
			$("#content3").css("display", "none");
			$("#content4").css("display", "block");
		}
	}
</script>



<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../../css/Login.css">
</head>
<body>
	<jsp:include page="../Fix/Header.jsp" flush="true" />
	<div align="center">
		<h1>아이디/비밀번호 찾기</h1>
		<div id="tab">
			<div id="tab_label">

				<input type="radio" name="tabs" id="tab1" checked="checked">
				<label for="tab1">아이디</label> <input type="radio" name="tabs"
					id="tab2"> <label for="tab2">비밀번호</label>

			</div>

			<div id="content1">
				<div id="member_id_box">
					<form>
						이름 <input type="text" placeholder="이름을 입력하세요" id="name"
							name="name"> 전화번호 <input type="text"
							placeholder="전화번호를 입력하세요" id="phone" name="phone">
					</form>
					<input type="button" value="다음 단계" id="execute"
						onclick='id_check()'>



					<script src="//code.jquery.com/jquery-3.4.1.min.js"></script>
					<script>
						$('#execute').click(function() {
							$.ajax({
								url : 'FindID.jsp', //통신할 서버 페이지
								type : 'post', //기본형식은 get post면 따로 써주기
								//form에 잇는 데이터를 name:value 값으로 매칭시켜보내줌
								data : $('form').serialize(),
								success : function(data) {
									$('#result_id').text(data); //받아온 data 실행
								}
							})

						})
					</script>
				</div>
			</div>

			<div id="content2">
				<div id="member_pwd_box">
					<form>
						아이디 <input type="text" placeholder="아이디를 입력하세요" id="id" name="id">
						전화번호 <input type="text" maxlength="11" placeholder="전화번호를 입력하세요"
							name="pwd_phone">
					</form>
					<input type="button" onclick="pwd_check()" value="다음 단계" id="findPWd">
					<script src="//code.jquery.com/jquery-3.4.1.min.js"></script>
					<script>
						$('#findPWd').click(function() {
							$.ajax({
								url : 'FindPwd.jsp', //통신할 서버 페이지
								type : 'post', //기본형식은 get post면 따로 써주기
								//form에 잇는 데이터를 name:value 값으로 매칭시켜보내줌
								data : $('form').serialize(),
								success : function(data) {
									$('#result_pwd').text(data); //받아온 data 실행
								}
							})

						})
					</script>
				</div>


			</div>


			<div id="content3">

				아이디는<label id="result_id"></label>입니다.

			</div>

			<div id="content4">
				비밀번호는<label id="result_pwd"></label>입니다.


			</div>

		</div>
	</div>
	<jsp:include page="../Fix/Footer.jsp" flush="true" />
</body>
</html>