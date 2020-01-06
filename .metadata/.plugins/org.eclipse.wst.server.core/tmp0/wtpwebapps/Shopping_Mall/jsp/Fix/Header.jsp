<%@page import="Product.categoryVO"%>
<%@page import="seller.SellerVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="seller.SellerDAO"></jsp:useBean>
<jsp:useBean id="pdao" class="Product.ProductDAO"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<style>
.slide-box {
	width: 250px;
	height: 69px;
	margin: 20px auto;
	overflow: hidden;
	position: relative;
	border: 1px solid black;
}

.slide-box img {
	width: 100%;
	height: 100%;
	border: 0px;
	display: block;
	position: absolute;
	top: 0px;
	left: -100%;
}
</style>
<meta charset="UTF-8">
<%
	request.setCharacterEncoding("UTF-8");
%>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/Header.css?after">
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/image/shopping_icon.png">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">


<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/jquery.bxslider.css">
<script src="//code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.bxslider.js"></script>



<script src="${pageContext.request.contextPath}/js/topslide.js"></script>


<title>MyShop</title>
</head>
<body>

	<div id="function" align="right">
		<ul>
			<%
				String role = (String) session.getAttribute("role");
				String nickname = (String) session.getAttribute("nickname");

				if (role == null) {
					response.sendRedirect("../Login/logout.jsp");
					System.out.println("logout됨~!");
				}
				String LoginID = (String) session.getAttribute("id");
				if (role == "seller") {
			%>
			<li><%=LoginID%>님</li>
			<li><a href="${pageContext.request.contextPath}/jsp/Member/InfoMain.jsp">My 정보</a></li>
			<li><a href="${pageContext.request.contextPath}/jsp/Login/Logout.jsp">로그아웃</a></li>


			<%
				} else if (LoginID != null) {
			%>
			<li><%=nickname%>님</li>
			<li><a href="${pageContext.request.contextPath}/jsp/Member/InfoMain.jsp">My 정보</a></li>
			<li><a href="${pageContext.request.contextPath}/jsp/Login/Logout.jsp">로그아웃</a></li>
			<%
				} else {
			%>
			<li><a
				href="${pageContext.request.contextPath}/jsp/Login/LoginMain.jsp">로그인</a></li>
			<li><a
				href="${pageContext.request.contextPath}/jsp/SignUp/Distinct_member.jsp">회원가입</a></li>
			<%
				}
			%>
			<li><a
				href="${pageContext.request.contextPath}/jsp/Cart/CartMain.jsp">장바구니</a></li>
			<li><a
				href="${pageContext.request.contextPath}/jsp/Order/OrderMain.jsp">주문배송</a></li>
			<li><a
				href="${pageContext.request.contextPath}/jsp/Service/ServiceMain.jsp">고객센터</a></li>


		</ul>
	</div>
	<div align="center">
		<div id="top">
			<!-- 전체 틀 -->
			<div id="logo">
				<a href="${pageContext.request.contextPath}/jsp/Main/MainPage.jsp"><img
					src="${pageContext.request.contextPath}/image/logo.png"></a>
			</div>
			<div>

				<div class="search">
					<input type="text" class="searchTerm"
						placeholder="What are you looking for?">
					<button type="submit" class="searchButton">
						<i class="fa fa-search"></i>
					</button>
				</div>


			</div>




			<div class="slide-box">
				<a href="#"><img
					src="${pageContext.request.contextPath}/image/ad1.png" alt="slide"></a>
				<a href="#"><img
					src="${pageContext.request.contextPath}/image/logo.png" alt="slide"></a>
				<a href="#"><img
					src="${pageContext.request.contextPath}/image/test.PNG" alt="slide"></a>


			</div>







		</div>
	</div>
	<div align="center">

		<div id="menu">
			<ul class="nav" style="-webkit-padding-start: 0px;">
				<li  style="cursor:default">카테고리
					<ul id="submenu">
						<%
							ArrayList<categoryVO> cate = pdao.getUpCategory();

							for (categoryVO vo : cate) {
						%>

						<li><a
							href="../Product/ProductList.jsp?type=<%=vo.getCateName()%>"><%=vo.getCateName()%></a></li>


						<%
							}
						%>
					</ul>
				</li>

				<li  style="cursor:default">브랜드
					<ul id="submenu">
						<%
							ArrayList<SellerVO> list = dao.getBrand();

							for (SellerVO vo : list) {
								if (vo != null) {
						%>

						<li><a
							href="../Product/BrandProduct.jsp?brand=<%=vo.getSeller_company()%>"><%=vo.getSeller_company()%></a></li>


						<%
							}

								else {
						%>
						<li>결과가 존재하지 않음</li>
						<%
							}
							}
						%>

					</ul>

				</li>
				<li><a
					href="${pageContext.request.contextPath}/jsp/Best/Best_Product.jsp">Best
						상품</a></li>
				<li><a
					href="${pageContext.request.contextPath}/jsp/Best/TodaySale.jsp">특가</a></li>
				<li><a
					href="${pageContext.request.contextPath}/jsp/Event/EventMain.jsp">Event</a>
					<ul id="submenu" style="-webkit-padding-start: 0px;">
						<li><a
							href="${pageContext.request.contextPath}/jsp/Event/EventMain.jsp">진행중인
								이벤트</a></li>
						<li><a
							href="${pageContext.request.contextPath}/jsp/Event/EventEnd.jsp">지난
								이벤트</a></li>

						<li><a
							href="${pageContext.request.contextPath}/jsp/Event/EventWinning.jsp">이벤트
								당첨</a></li>
					</ul></li>
				<li><a
					href="${pageContext.request.contextPath}/jsp/Plan/PlanProduct.jsp">기획상품</a></li>
				<li><a
					href="${pageContext.request.contextPath}/jsp/Community/OOTD/Community_OOTD.jsp">커뮤니티</a>
					<ul id="submenu" style="-webkit-padding-start: 0px;">
						<li><a
							href="${pageContext.request.contextPath}/jsp/Community/OOTD/Community_OOTD.jsp">OOTD</a></li>
						<li><a
							href="${pageContext.request.contextPath}/jsp/Community/BestDresser/Community_BestDresser.jsp">Best
								Dresser</a></li>
						<li><a
							href="${pageContext.request.contextPath}/jsp/Community/Ilsang/Community_Ilsang.jsp">소소한
								일상</a></li>
					</ul></li>


				<%
					if (role == "admin") {
				%>
				<li><a
					href="${pageContext.request.contextPath}/jsp/Admin/Admin_Verify_Seller.jsp">관리자</a></li>
				<%
					}
				%>


				<%
					String id = (String) session.getAttribute("id");

					String verify = dao.getVerify(id);
					if (role == "seller" && verify.equals("o")) {
				%>
				<li><a
					href="${pageContext.request.contextPath}/jsp/Seller/Seller_Product.jsp">판매자</a></li>
				<%
					} else if (verify.equals("x")) {
				%>
				<li><a
					href="${pageContext.request.contextPath}/jsp/SignUp/seller/brandForm.jsp">입점신청</a></li>
				<%
					}
				%>

			</ul>


		</div>


	</div>

</body>
</html>