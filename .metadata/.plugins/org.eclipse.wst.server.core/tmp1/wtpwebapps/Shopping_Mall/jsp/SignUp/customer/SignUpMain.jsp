<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">


<script src="//code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
	$(document).ready(function() {
		
	});

	$(function() {

		$("#chk_all").click(function() {
			var chk = $(this).is(":checked");//.attr('checked');
			if (chk) {
				$(".check_check input").prop('checked', true);
				$("#iframe1").css("display", "none");
				$("#iframe2").css("display", "none");
			} else {
				$(".check_check input").prop('checked', false);
				$("#iframe1").css("display", "block");
				$("#iframe2").css("display", "block");

			}
		});

		$("#cb1").click(function() {

			$("#iframe1").css("display", "block");
			$("input:checkbox[id='chk_all']").prop("checked", false);		

		});
		$("#cb2").click(function() {

			$("#iframe2").css("display", "block");
			$("input:checkbox[id='chk_all']").prop("checked", false);		
		});

		$("#cb1").click(function() {
			if ($("#cb1").is(":checked")) {
				$("#iframe1").css("display", "none");
			}
		});

		$("#cb2").click(function() {
			if ($("#cb2").is(":checked")) {
				$("#iframe2").css("display", "none");
			}
		});
		
		if($("input:checkbox[name='cb1']").length>4){
			$("input:checkbox[id='chk_all']").prop("checked", false);
			
		}

	})


	

	function check() {
		if ($("#cb1").is(":checked") == false) {
			alert("필수 항목에 동의 해주세요");
			return false;
		}

		if ($("#cb2").is(":checked") == false) {
			alert("필수 항목에 동의 해주세요");
			return false;
		}

		if ($("#cb3").is(":checked") == false) {
			alert("필수 항목에 동의 해주세요");
			return false;
		}

		else {
			location.href = "SignUpForm.jsp";
		}
	}
</script>


<title>회원가입</title>
<link rel="stylesheet" href="../../../css/SignUp.css">
</head>
<body>
	<jsp:include page="../../Fix/Header.jsp" flush="false" />
	<div align="center">
		<div id="step">
			이용 약관 동의 <img src="../../../image/step1.png" width="400px"
				height="50px;" id="step1">
		</div>
		<div id="agreeBox">

			<br> <br> <br> <input type="checkbox" name="chk_all"
				id="chk_all">전체 동의
			<ul class="check_check">
				<li><input type="checkbox" name="cb1" id="cb1"> <label
					for="cb1">서비스 약관 동의</label> <iframe src="../serviceAgree.html"
						width="900px" height="300px" id="iframe1"></iframe></li>

				<li><input type="checkbox" name="cb1" id="cb2"> <label
					for="cb2">개인정보 수집 및 이용에 대한 안내</label> <iframe
						src="../infoAgree.html" width="900px" height="300px" id="iframe2"></iframe></li>
				<li><input type="checkbox" name="cb1" id="cb3">만 14세
					이상입니다.</li>
				<li><input type="checkbox" name="cb1">마켓팅 수신 동의(선택)</li>
			</ul>

			<div id="btn">
				<input type="button" onclick="location.href='../Main/MainPage.jsp'"
					value="처음으로"> <input type="button" onclick="check()"
					value="다음 단계">
			</div>
		</div>
	</div>
	<!-- center div end -->
	<jsp:include page="../../Fix/Footer.jsp" flush="false" />
</body>
</html>