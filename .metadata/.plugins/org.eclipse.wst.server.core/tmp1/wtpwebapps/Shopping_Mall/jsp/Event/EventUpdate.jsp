<%@page import="java.util.ArrayList"%>
<%@page import="Admin.EventVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<jsp:useBean id="dao" class="Admin.EventDAO"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
#event_reg_form table {
	text-align: center;
	border-collapse: collapse;
}

#event_reg_form table td {
	padding: 10px;
}

#event_reg_form input[type="text"] {
	outline: none;
	width: 250px;
	height: 40px;
	font-size: 15pt;
	padding: 20px;
	outline: none;
	border: 1px solid lightgray;
}

#event_reg_form input[type="text"]:focus {
	border: 1px solid blue;
}

#event_reg_form input[type="submit"] {
	outline: none;
	width: 250px;
	height: 20px;
	padding:10px;
	outline: none;
	border: 1px solid lightgray;
}
</style>

  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">

<title>Insert title here</title>
</head>
<body>

	<jsp:include page="../Fix/Header.jsp" flush="true" />
	<div align="center">
		<jsp:include page="menu_bar.jsp" flush="true" />


		<div id="event_reg_form">
			<% String num = request.getParameter("num");
			ArrayList<EventVO> list = dao.getEventDetail(num);
if(num!=null){
	for(EventVO vo:list){
%>
			
			<form action="EventUpdate_proc.jsp" method="post" enctype="multipart/form-data">
			
				<table border="1" width="500px">
					<tr>
						<td><p>이벤트 명</p> <input type="text" name="EVENT_title" value="<%=vo.getEvent_title()%>">
						<input type="hidden" value="<%=num %>" name="num">
						</td>
						
					</tr>
					<tr>
						<td><p>이벤트 시작 기간</p> <input type="text" name="start_term" id="StartDatePicker" value="<%=vo.getStart_date()%>"></td>
					</tr>

					<tr>
						<td><p>이벤트 종료 기간</p> <input type="text" id="EndDatePicker" name="END_date" value="<%=vo.getEnd_date()%>"></td>
					</tr>
					<tr>
						<td><p>이벤트 이미지</p> <input type="file" name="event_content_img" value="<%=vo.getEvent_title()%>"></td>
					</tr>

					
					<tr>
						<td><input type="submit" value="등록"></td>


					</tr>
				</table>
				<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>

<script src="http://code.jquery.com/ui/1.8.18/jquery-ui.min.js"></script>



<script>
	$(document).ready(
			function() {
				$("#StartDatePicker")
						.datepicker(
								{
									changeYear : true,
									changeMonth : true,
									showMonthAfterYear : true,
									dateFormat : "yy-mm-dd",
									minDate : "0",
									maxDate : "+1Y",
									dayNames : [ '월요일', '화요일', '수요일', '목요일',
											'금요일', '토요일', '일요일' ],
									dayNamesMin : [ '월', '화', '수', '목', '금',
											'토', '일' ],
									monthNamesShort : [ '1', '2', '3', '4',
											'5', '6', '7', '8', '9', '10',
											'11', '12' ],
									monthNames : [ '1월', '2월', '3월', '4월',
											'5월', '6월', '7월', '8월', '9월',
											'10월', '11월', '12월' ]

								});

				$("#EndDatePicker")
						.datepicker(
								{
									changeYear : true,
									changeMonth : true,
									showMonthAfterYear : true,
									dateFormat : "yy-mm-dd",
									minDate : "0",
									maxDate : "+1Y",
									dayNames : [ '월요일', '화요일', '수요일', '목요일',
											'금요일', '토요일', '일요일' ],
									dayNamesMin : [ '월', '화', '수', '목', '금',
											'토', '일' ],
									monthNamesShort : [ '1', '2', '3', '4',
											'5', '6', '7', '8', '9', '10',
											'11', '12' ],
									monthNames : [ '1월', '2월', '3월', '4월',
											'5월', '6월', '7월', '8월', '9월',
											'10월', '11월', '12월' ]

								});

			});
</script>
				
			</form><%}//end for
	
}//end if %>
		</div>
		
	</div>
	<jsp:include page="../Fix/Footer.jsp" flush="true" />
</body>
</html>