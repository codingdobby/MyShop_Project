<%@page import="Product.cartVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<jsp:useBean id="dao" class="Pay.PayDAO"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../../css/Pay.css">
<script src="//code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
	$(document).ready(function() {
		$("#content1").css("display", "block");

		$("#content2").css("display", "none");
		$("#content3").css("display", "none");

	});

	$(function() {

		$("#card").click(function() {

			$("#content1").css("display", "block");

			$("#content2").css("display", "none");
			$("#content3").css("display", "none");

		});
		$("#mutong").click(function() {
			$("#content1").css("display", "none");

			$("#content2").css("display", "block");
			$("#content3").css("display", "none");

		});

		$("#phone").click(function() {

			$("#content1").css("display", "none");

			$("#content2").css("display", "none");
			$("#content3").css("display", "block");

		});

	})
</script>


<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../Fix/Header.jsp" flush="false" />
	<%String type=request.getParameter("type");
	
	if(type==null||type.length()==0){
		response.sendRedirect("../Main/MainPage.jsp");
		
	}

		
	
	
	%>
	<div align="center">
		<h1>주문 / 결제</h1>
		<div id="product">
			<table border="1">
				<tr>
					<th colspan="2">상품 정보</th>
					<th>판매자</th>
					<th>배송비</th>
					<th>수량</th>
					<th>금액</th>
				</tr>
				<%	
				if(type.equals("cart")){
				
				
				
				ArrayList<cartVO> arr = (ArrayList<cartVO>)session.getAttribute("productList");
				for(cartVO vo : arr){
				
									%>
				<tr>
					<td width="100"></td>
					<td><%=vo.getProduct_name() %></td>
					<td width="100px;"><%=vo.getSize() %></td>
					<td width="100px;">2500원</td>
					<td width="100px;"></td>
					<td width="100px;"></td>
				</tr>
				<%}} %>
			</table>
		</div>
		<div id="wrapper">
			<div id="info">
				<table border="1">
					<tr>
						<th colspan="2">주문자 정보</th>
					</tr>

					<tr>
						<td width="200px;">주문자</td>
						<td width="500px;"><input type="text" name="name"></td>
					</tr>

					<tr>
						<td>주소</td>
						<td><input type="text" name="zipcode"><br> <input
							type="text" name="address1"><br> <input type="text"
							name="address2"></td>
					</tr>

					<tr>
						<td width="200px;">전화번호</td>
						<td width="600px;"><input type="text" name="name"></td>
					</tr>

					<tr>
						<td width="200px;">주문자</td>
						<td width="600px;"><input type="text" name="name"></td>
					</tr>


				</table>
				<!-- 주문 정보 -->

				<table border="1">
					<tr>
						<th colspan="2">배송지 정보</th>
					</tr>

					<tr>
						<td width="200px;">받는분</td>
						<td width="500px;"><input type="text" name="name"></td>
					</tr>

					<tr>
						<td>주소</td>
						<td><input type="text" name="zipcode"><br> <input
							type="text" name="address1"><br> <input type="text"
							name="address2"></td>
					</tr>

					<tr>
						<td width="200px;">전화번호</td>
						<td width="600px;"><input type="text" name="name"></td>
					</tr>

					<tr>
						<td width="200px;">배송 메세지</td>
						<td width="600px;"><textarea cols="50" rows="2"
								style="resize: none; overflow: hidden;" maxlength="50"></textarea>
						</td>
					</tr>


				</table>
				<!-- 배송 정보 -->

				<table border="1">
					<tr>
						<th colspan="2">할인 및 포인트</th>
					</tr>

					<tr>
						<td width="200px;">쿠폰 할인</td>
						<td width="500px;"><input type="text" name="coupon">
						<input type="button" value="쿠폰 찾기">
						</td>
					</tr>

					<tr>
						<td width="200px;">포인트 할인</td>
						<td width="500px;"><input type="text" name="point">
						<input type="button" value="포인트 적용">
						</td>
					</tr>



				</table>



				<div id="pay">
					<input type="radio" name="type" id="card" checked="checked">카드
					<input type="radio" name="type" id="mutong">무통장 입금 <input
						type="radio" name="type" id="phone">휴대폰 결제

					<div id="content1">
						<table>
							<tr>
								<td>카드 종류</td>
								<td><input type="radio" name="card_type">개인 카드 <input
									type="radio" name="card_type">법인카드</td>
							</tr>

							<tr>
								<td>카드 종류</td>
								<td><select name="card_brand">
										<option>국민</option>
								</select></td>
							</tr>
							<tr>
								<td>할부 기간</td>
								<td><select><option>일시불</option></select></td>
							</tr>
						</table>
					</div>
					<!-- 카드 -->
					<div id="content2">
						<p>무통장 입금의 경우 주문자의 이름으로 입금해 주세요</p>
						<table>

							<tr>
								<td>입금 은행</td>
								<td><select name="bank_brand">
										<option>국민</option>
								</select></td>
							</tr>
							<tr>
								<td>할부 기간</td>
								<td><select><option>일시불</option></select></td>
							</tr>
						</table>
					</div>
					<!-- 무통장 입금 -->
					<div id="content3">
						<table>

							<tr>
								<td>휴대폰 번호</td>
								<td><select name="card_brand">
										<option>국민</option>
								</select>-<input type="text"></td>
							</tr>

						</table>

					</div>
					<!-- 휴대폰 결제 -->

				</div>
				<div id="agree">
				<input type="checkbox" name="chk_agree">위 상품의 구매조건 확인 및 결제진행
				동의</div>
			</div>
			<div id="pay_info">
				<p>결제 금액</p>
				<h1>금액!</h1>
				<hr>
				<table>
					<tr>
						<td>총 상품 금액</td>
						<td>대략 얼마</td>

					</tr>

					<tr>
						<td>배송비</td>
						<td>0</td>

					</tr>

					<tr>
						<td>할인 금액</td>
						<td>606406</td>

					</tr>

					<tr>
						<td>포인트 사용금액</td>
						<td>606406</td>

					</tr>
				</table>
				<input type="submit" value="결제하기" onclick="location.href='../Main/MainPage.jsp'">
			</div>

		</div>
	</div>
	<jsp:include page="../Fix/Footer.jsp" flush="false" />
</body>
</html>