/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.46
 * Generated at: 2019-11-28 02:24:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginMain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>로그인</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../css/Login.css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction check() {\r\n");
      out.write("\t\tvar form = document.form;\r\n");
      out.write("\t\tif (form.id.value.length <= 0) {\r\n");
      out.write("\t\t\talert('아이디 입력!');\r\n");
      out.write("\t\t\tform.id.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tif (form.pwd.value.length <= 0) {\r\n");
      out.write("\t\t\talert('비밀번호 입력!');\r\n");
      out.write("\t\t\tform.pwd.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t} else\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#Login_Member\").css(\"display\", \"block\");\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#Login_non_Member\").css(\"display\", \"none\");\r\n");
      out.write("\t\t$(\"#Login_Seller\").css(\"display\", \"none\");\r\n");
      out.write("\r\n");
      out.write("\t\t// 저장된 쿠키값을 가져와서 ID 칸에 넣어준다. 없으면 공백으로 들어감.\r\n");
      out.write("\t\tvar key = getCookie(\"key\");\r\n");
      out.write("\t\t$(\"#userId\").val(key);\r\n");
      out.write("\r\n");
      out.write("\t\tif ($(\"#userId\").val() != \"\") { // 그 전에 ID를 저장해서 처음 페이지 로딩 시, 입력 칸에 저장된 ID가 표시된 상태라면,\r\n");
      out.write("\t\t\t$(\"#idSaveCheck\").attr(\"checked\", true); // ID 저장하기를 체크 상태로 두기.\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#idSaveCheck\").change(function() { // 체크박스에 변화가 있다면,\r\n");
      out.write("\t\t\tif ($(\"#idSaveCheck\").is(\":checked\")) { // ID 저장하기 체크했을 때,\r\n");
      out.write("\t\t\t\tsetCookie(\"key\", $(\"#userId\").val(), 7); // 7일 동안 쿠키 보관\r\n");
      out.write("\t\t\t} else { // ID 저장하기 체크 해제 시,\r\n");
      out.write("\t\t\t\tdeleteCookie(\"key\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t// ID 저장하기를 체크한 상태에서 ID를 입력하는 경우, 이럴 때도 쿠키 저장.\r\n");
      out.write("\t\t$(\"#userId\").keyup(function() { // ID 입력 칸에 ID를 입력할 때,\r\n");
      out.write("\t\t\tif ($(\"#idSaveCheck\").is(\":checked\")) { // ID 저장하기를 체크한 상태라면,\r\n");
      out.write("\t\t\t\tsetCookie(\"key\", $(\"#userId\").val(), 7); // 7일 동안 쿠키 보관\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#member\").click(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#Login_Member\").css(\"display\", \"block\");\r\n");
      out.write("\t\t\t$(\"#Login_non_Member\").css(\"display\", \"none\");\r\n");
      out.write("\t\t\t$(\"#Login_Seller\").css(\"display\", \"none\");\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"#non_member\").click(function() {\r\n");
      out.write("\t\t\t$(\"#Login_Member\").css(\"display\", \"none\");\r\n");
      out.write("\t\t\t$(\"#Login_non_Member\").css(\"display\", \"block\");\r\n");
      out.write("\t\t\t$(\"#Login_Seller\").css(\"display\", \"none\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#seller\").click(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#Login_Member\").css(\"display\", \"none\");\r\n");
      out.write("\t\t\t$(\"#Login_non_Member\").css(\"display\", \"none\");\r\n");
      out.write("\t\t\t$(\"#Login_Seller\").css(\"display\", \"block\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t})\r\n");
      out.write("\r\n");
      out.write("\tfunction setCookie(cookieName, value, exdays) {\r\n");
      out.write("\t\tvar exdate = new Date();\r\n");
      out.write("\t\texdate.setDate(exdate.getDate() + exdays);\r\n");
      out.write("\t\tvar cookieValue = escape(value)\r\n");
      out.write("\t\t\t\t+ ((exdays == null) ? \"\" : \"; expires=\" + exdate.toGMTString());\r\n");
      out.write("\t\tdocument.cookie = cookieName + \"=\" + cookieValue;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction deleteCookie(cookieName) {\r\n");
      out.write("\t\tvar expireDate = new Date();\r\n");
      out.write("\t\texpireDate.setDate(expireDate.getDate() - 1);\r\n");
      out.write("\t\tdocument.cookie = cookieName + \"= \" + \"; expires=\"\r\n");
      out.write("\t\t\t\t+ expireDate.toGMTString();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction getCookie(cookieName) {\r\n");
      out.write("\t\tcookieName = cookieName + '=';\r\n");
      out.write("\t\tvar cookieData = document.cookie;\r\n");
      out.write("\t\tvar start = cookieData.indexOf(cookieName);\r\n");
      out.write("\t\tvar cookieValue = '';\r\n");
      out.write("\t\tif (start != -1) {\r\n");
      out.write("\t\t\tstart += cookieName.length;\r\n");
      out.write("\t\t\tvar end = cookieData.indexOf(';', start);\r\n");
      out.write("\t\t\tif (end == -1)\r\n");
      out.write("\t\t\t\tend = cookieData.length;\r\n");
      out.write("\t\t\tcookieValue = cookieData.substring(start, end);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn unescape(cookieValue);\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Fix/Header.jsp", out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<h1>로그인</h1>\r\n");
      out.write("\t\t<div id=\"Box\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"MemberType\">\r\n");
      out.write("\t\t\t\t<input type=\"radio\" name=\"member\" id=\"member\" checked=\"checked\">회원\r\n");
      out.write("\t\t\t\t<input type=\"radio\" id=\"non_member\" name=\"member\">비회원 <input\r\n");
      out.write("\t\t\t\t\ttype=\"radio\" name=\"member\" id=\"seller\">판매 회원\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"Login_Box\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"Login_Member\">\r\n");
      out.write("\t\t\t\t\t\t<form action=\"LoginProc_member.jsp\" method=\"post\"\r\n");
      out.write("\t\t\t\t\t\t\tonsubmit=\"return check();\" name=\"form\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>아이디</p>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"id\" placeholder=\"아이디를 입력하세요\" id=\"userId\"\r\n");
      out.write("\t\t\t\t\t\t\t\tmaxlength=\"20\"><br>\r\n");
      out.write("\t\t\t\t\t\t\t<p>비밀번호</p>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"pwd\" placeholder=\"비밀번호를 입력하세요\"\r\n");
      out.write("\t\t\t\t\t\t\t\tmaxlength=\"20\"><br> <br> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"checkbox\" name=\"cb1\" id=\"idSaveCheck\">아이디 저장 <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"checkbox\" name=\"cn2\"> 자동 로그인 <br> <br>\r\n");
      out.write("\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"FindInfo.jsp?type=member\">아이디 / 비밀번호 찾기</a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"../SignUp/Distinct_member.jsp\">회원가입</a><br> <br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"로그인\">\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form action=\"LoginProc_non_member.jsp\" method=\"post\"\r\n");
      out.write("\t\t\t\t\t\tonsubmit=\"return check();\" name=\"form\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"Login_non_Member\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>전화번호</p>\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"non_phone1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option selected=\"selected\">010</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>011</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>016</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>017</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>018</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>019</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select> - <input type=\"text\" id=\"phone\" name=\"non_phone2\" maxlength=\"4\"> - <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\tid=\"phone\" name=\"non_phone3\"\r\n");
      out.write("\t\t\t\t\t\t\t\tmaxlength=\"4\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>주문자명</p>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"non_name\" placeholder=\"이름을 입력하세요\"\r\n");
      out.write("\t\t\t\t\t\t\t\tmaxlength=\"20\"><br>\r\n");
      out.write("\t\t\t\t\t\t\t<p>주문 비밀번호</p>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"non_pwd\" placeholder=\"비밀번호를 입력하세요\"><br>\r\n");
      out.write("\t\t\t\t\t\t\t<br> <input type=\"submit\" value=\"로그인\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<form action=\"LoginProc_seller.jsp\" method=\"post\"\r\n");
      out.write("\t\t\t\t\t\tonsubmit=\"return check();\" name=\"form\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"Login_Seller\">\r\n");
      out.write("\t\t\t\t\t\t\t<p>아이디</p>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"seller_id\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"-를 제외한 사업자 번호를 입력하세요\" maxlength=\"10\"><br>\r\n");
      out.write("\t\t\t\t\t\t\t<p>비밀번호</p>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"seller_pwd\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"비밀번호를 입력하세요\" maxlength=\"20\"><br> <br> <input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"checkbox\" name=\"cb1\">아이디 저장 <input type=\"checkbox\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"cn2\"> 자동 로그인 <br> <br>\r\n");
      out.write("\t\t\t\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"FindInfo.jsp?type=seller\">아이디/비밀번호 찾기</a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"../SignUp/Distinct_member.jsp\">회원가입</a><br> <br>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"로그인\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- LoginBox -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- Distint member -->\r\n");
      out.write("\t\t\t<div id=\"coupon_banner\">\r\n");
      out.write("\t\t\t\t<ul style=\"-webkit-padding-start: 0px;\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/jsp/Plan/PlanProduct.jsp\"><IMG src=\"../../image/배너.png\"></a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Fix/Footer.jsp", out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}