<%@page import="member.MemberVO"%>
<%@page import="member.MemberDAO"%>
<jsp:useBean id="mdao" class="member.MemberDAO"></jsp:useBean>
<jsp:useBean id="vo" class="member.MemberVO"></jsp:useBean>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	String phone = request.getParameter("pwd_phone");

	System.out.print("아이디" + id);
	System.out.print("전화번호" + phone);

	vo = mdao.findPwd(id, phone);
	String pwd = vo.getPwd();
	out.println(pwd);
	System.out.print(pwd);
%>
