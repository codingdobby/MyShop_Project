<%@page import="member.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="member.MemberDAO"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" href="../../css/Info.css?after">
<script type="text/javascript" src="../../js/MemberCheck.js"></script>

</head>
<body>
	<jsp:include page="../Fix/Header.jsp" flush="true" />
	<div align="center">
		<%
			String id = (String) session.getAttribute("id");
			MemberVO vo = dao.MemberInfo(id);
		%>
		<h1>회원 정보 수정</h1>
		<div id="content">
			<div id="menu_Bar">
				<ul>
					<li><a href="InfoMain.jsp">회원 정보 수정</a></li>
					<li><a href="../Cart/CartMain.jsp">장바구니</a></li>
					<li>주문 내역</li>
					<li><a href="${pageContext.request.contextPath}/jsp/Member/CouponMain.jsp">쿠폰 함</a></li>
				</ul>
			</div>



			<div id="UpdateForm">

				<form method="post" action="UpdateProc.jsp" onsubmit="JoinCheck()">
					<table align="center" border="1">
						<tr>
							<td>아이디<br> <input type="text" placeholder="ID를 입력하세요"
								name="id" disabled="disabled" value="<%=id%>"><br>
								
							</td>
						</tr>

						<tr>

							<td>비밀번호<br> <input type="password"
								placeholder="비밀번호를 입력하세요" name="pwd">
								<span id="test"></span>
								</td>
						</tr>

						<tr>
							<td>비밀번호 확인<br> <input type="password"
								placeholder="비밀번호를 다시 입력하세요" name="pwdchk"></td>
						</tr>

						<tr>
							<td>이름<br> <input type="text" placeholder="이름을 입력하세요"
								name="name" value="<%=vo.getName()%>"></td>
						</tr>

						<tr>
							<td>닉네임<br> <input type="text" placeholder="닉네임을 입력하세요"
								name="nickname" value="<%=vo.getNickname()%>"></td>
						</tr>

						<tr>
							<td>전화번호<br> <select name="phone1">
									<option selected="selected">010</option>
									<option>011</option>
									<option>016</option>
									<option>017</option>
									<option>018</option>
									<option>019</option>
							</select> - <input type="text"  name="phone2" maxlength="4" id="phone">-
								<input type="text"  name="phone3" maxlength="4" id="phone"></td>
						</tr>

						<tr>
							<td>이메일<br> <input type="text" placeholder="이메일을 입력하세요"
								name="email"></td>
						</tr>

						<tr>
							<td>주소<br> <input type="text" name="address1" size="7">
								<input type="button" value="우편번호찾기" id="btnZip"></td>
						</tr>

						<tr>
							<td><input type="text" placeholder="상세 주소를 입력하세요"
								name="address2"></td>
						</tr>
						<tr>
							<td>생일(선택사항)<br> <input type="text" 
								name="birth"></td>
						</tr>
					</table>

					<div id="btns">
						<input type="button" value="탈퇴하기"
							onclick="location.href='../Main/MainPage.jsp'"><input
							type="reset" value="초기화"><input type="submit" value="확인">
					</div>
				</form>
			</div>
		</div>
		<!-- content end -->
	</div>
	<!-- align center -->
	<jsp:include page="../Fix/Footer.jsp" flush="true" />
</body>
</html>