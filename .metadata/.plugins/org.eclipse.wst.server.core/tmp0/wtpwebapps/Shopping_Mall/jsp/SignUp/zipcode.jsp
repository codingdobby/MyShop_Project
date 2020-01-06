<!-- 팝업창 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<jsp:useBean id="dao" class="member.MemberDAO"></jsp:useBean>
<%@ page import="member.*"%>

<%
	request.setCharacterEncoding("UTF-8");

	String check = request.getParameter("check");
	String dong = request.getParameter("dong");

	Vector<ZipCodeVO> zipcodeList = dao.zipcodeRead(dong);
	int totalList = zipcodeList.size();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>우편번호 검색</title>
<script type="text/javascript" src="../../js/MemberCheck.js"></script>
<style type="text/css">


#search_zipcode input[type="text"]{
width: 150px;
height: 30px;
margin-right: 10px;
}

#search_zipcode input[type="button"]{

height: 30px;

}
</style>
</head>

<body>
	<div align="center">
		<h1>우편 번호 찾기</h1>
		<form name="zipForm" method="post" action="zipcode.jsp">
		<div id="search_zipcode">
			<table>
				<tr>
					<td><span>동이름  </span> <input name="dong" type="text"><input
						type="button" value="검색" onclick="dongCheck()"></td>
				</tr>
			</table>
			<input type="hidden" name="check" value="n">
			</div>
		</form>





		<table>
			<%
				if (check.equals("n")) {
					if (zipcodeList.isEmpty()) {
			%>
			<tr>
				<td align="center"><br>검색된 결과가 없습니다.</td>
			</tr>
			<%
				} else {
			%>
			<tr>
				<td>* 검색 후 , 아래 우편번호를 클릭하면 자동으로 입력됩니다.</td>
			</tr>
			<%
				for (int i = 0; i < totalList; i++) {
							ZipCodeVO vo = zipcodeList.elementAt(i);
							String tempZipcode = vo.getZipcode();
							String tempSido = vo.getSido();
							String tempGugun = vo.getGugun();
							String tempDong = vo.getDong();
							String tempRi = vo.getRi();
							String tempBunji = vo.getBunji();

							
							if (tempRi == null){tempRi = "";}
							
							if (tempBunji == null){tempBunji = "";
						
							}
							
			%>
			<tr>
				<td><a
					href="javascript:sendAddress('<%=tempZipcode%>','<%=tempSido%>','<%=tempGugun%>','<%=tempDong%>','<%=tempRi%>','<%=tempBunji%>')">

						<%=tempZipcode%>&nbsp;<%=tempSido%>&nbsp;<%=tempGugun%>&nbsp;<%=tempDong%>&nbsp;<%=tempDong%>&nbsp;<%=tempRi%>&nbsp;<%=tempBunji%></a><br>



					<%
						} //for end
							} //else end
				}//first-if end
					%> </td>
			</tr>



			<tr>
				<td align="center"><a href="javascript:this.close();">닫기</a></td>
			</tr>
		</table>
	</div>
</body>
</html>