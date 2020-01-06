<%@page import="member.MemberVO"%>
<%@page import="member.MemberDAO"%>
<jsp:useBean id="dao" class="Product.CartDAO"></jsp:useBean>
<jsp:useBean id="vo" class="Product.cartVO"></jsp:useBean>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");

	int amount = Integer.parseInt(request.getParameter("re_amount"));
	
	String num = request.getParameter("num");
	System.out.print(amount + "번호"+num);
	dao.updateAmount(amount, num); 

	
	/*  response.sendRedirect("CartMain.jsp");   */

%>
