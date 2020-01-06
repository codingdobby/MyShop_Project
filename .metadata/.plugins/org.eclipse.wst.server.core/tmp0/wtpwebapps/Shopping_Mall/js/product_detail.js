/**
 * 
 */

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
			alert("이름 빈칸");
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