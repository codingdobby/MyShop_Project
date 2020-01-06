<%@page import="member.MemberVO"%>
<%@page import="member.MemberDAO"%>
<jsp:useBean id="mdao" class="member.MemberDAO"></jsp:useBean>
<jsp:useBean id="vo" class="member.MemberVO"></jsp:useBean>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");

	String name = request.getParameter("name");
	String phone = request.getParameter("phone");

	vo = mdao.findId(name, phone);
	String id = vo.getId();
	out.println(id);

%>
