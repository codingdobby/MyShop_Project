/**
 * 
 */

// 우편번호찾기 새창열기
function zipCheck() {
	// 새창열기
	url = "../zipcode.jsp?check=y";
	window
			.open(
					url,
					"post",
					"toolbar=no, width=500,height=300,top=200,left=300.status=yes,scrollbars=yes,menubar=no");
}

// 동 확인하기 빈칸체크
function dongCheck() {
	if (document.zipForm.dong.value == "") {
		alert('동이름을 입력하세요');
		document.zipForm.dong.focus();
		return;

	}
	document.zipForm.submit;

}

// 주소 전송
function sendAddress(zipcode, sido, gugun, dong, ri, bunji) {
	alert("번지 값" + bunji);
	var address = sido + " " + gugun + " " + dong + " " + ri + " " + bunji;

	opener.document.form.zipcode.value = zipcode;
	opener.document.form.address1.value = address;
	self.close();

}

function onblur_text() {

	if (form.id.value == "") {
		document.getElementById('id_text').innerHTML = "아이디가 공백입니다.";
		form.id.focus();
		return false;

	}

	if (form.id.value.length < 4 || form.id.value.length > 20) {
		document.getElementById('id_text').innerHTML = "4-20자리 사이로 입력하세요";
		form.id.focus();
		return false;

	}

	if (form.id.value.length >= 4 || form.id.value.length <= 20) {
		document.getElementById('id_text').innerHTML = "";

	}

	if (form.pwd.value == "") {
		document.getElementById('pwd_text').innerHTML = "비밀번호가 공백입니다.";
		form.pwd.focus();
		return false;
	}

	if (form.pwd.value.length < 8 || form.pwd.value.length > 20) {
		document.getElementById('pwd_text').innerHTML = "비밀번호는 8-20자리 입니다...";
		form.pwd.focus();
		return false;
	}

	if (form.pwd.value.length >= 8 || form.pwd.value.length <= 20) {
		document.getElementById('pwd_text').innerHTML = "";
	}

	if (form.pwdchk.value == "") {
		document.getElementById('pwdchk_text').innerHTML = "비밀번호를 확인해주세요.";
		form.pwdchk.focus();
		return false;
	}

	if (form.pwdchk.value != form.pwd.value) {
		document.getElementById('pwdchk_text').innerHTML = "비밀번호가 일치하지 않습니다.";

		return false;
	}

	if (form.pwdchk.value == form.pwd.value) {
		document.getElementById('pwdchk_text').innerHTML = "";

	}

	var reg = /([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
	if (form.email.value == '' || form.email.value == 'undefined')
		return;

	if (!reg.test(form.email.value)) {
		document.getElementById('email_text').innerHTML = "잘못된 형식";
		form.email.focus();
		return false;
	}
	if (reg.test(form.email.value)) {
		document.getElementById('email_text').innerHTML = "";

	}
}

function filterKey(filter) {
	if (filter) {
		var sKey = String.fromCharCode(event.keyCode);
		var re = new RegExp(filter);
		if (!re.test(sKey)) {
			alert('숫자만 입력');
			event.returnValue = false;
		}
	}
}

function seller_onblur_text() {

	var form = document.seller_form;

	if (form.reg_num1.value == "" || form.reg_num2.value == ""
			|| form.reg_num3.value == "") {
		document.getElementById('id_text').innerHTML = "사업자 등록 번호가 공백입니다.";

		return false;

	}

	if (form.reg_num1.value != "" && form.reg_num2.value != ""
			&& form.reg_num3.value != "") {

		document.getElementById('id_text').innerHTML = "";

	}
	if (form.company.value == "") {
		document.getElementById('comp_text').innerHTML = "상호명이 공백입니다.";
		form.company.focus();
		return false;
	}
	
	if (form.company.value != "") {

	document.getElementById('comp_text').innerHTML = "";

}
	

	if (form.pwd.value == "") {
		document.getElementById('pwd_text').innerHTML = "비밀번호가 공백입니다.";
		form.pwd.focus();
		return false;
	}

	if (form.pwd.value.length < 8 || form.pwd.value.length > 20) {
		document.getElementById('pwd_text').innerHTML = "비밀번호는 8-20자리 입니다...";
		form.pwd.focus();
		return false;
	}

	if (form.pwd.value.length >= 8 || form.pwd.value.length <= 20) {
		document.getElementById('pwd_text').innerHTML = "";
	}

	if (form.pwdchk.value == "") {
		document.getElementById('pwdchk_text').innerHTML = "비밀번호를 확인해주세요.";
		form.pwdchk.focus();
		return false;
	}

	if (form.pwdchk.value != form.pwd.value) {
		document.getElementById('pwdchk_text').innerHTML = "비밀번호가 일치하지 않습니다.";

		return false;
	}

	if (form.pwdchk.value == form.pwd.value) {
		document.getElementById('pwdchk_text').innerHTML = "";

	}

	var reg = /([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
	if (form.email.value == '' || form.email.value == 'undefined')
		return;

	if (!reg.test(form.email.value)) {
		document.getElementById('email_text').innerHTML = "잘못된 형식";
		form.email.focus();
		return false;
	}
	if (reg.test(form.email.value)) {
		document.getElementById('email_text').innerHTML = "";

	}
}