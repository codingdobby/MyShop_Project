/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.46
 * Generated at: 2019-11-25 07:24:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.SignUp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUpForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>회원가입</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("<!-- <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("\r\n");
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../../css/SignUp.css?after\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"../../../js/MemberCheck.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\twindow.history.forward();\r\n");
      out.write("\r\n");
      out.write("\tfunction noBack() {\r\n");
      out.write("\r\n");
      out.write("\t\twindow.history.forward();\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#testDatepicker\").datepicker(\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tchangeYear : true,\r\n");
      out.write("\t\t\t\t\tchangeMonth : true,\r\n");
      out.write("\t\t\t\t\tshowMonthAfterYear : true,\r\n");
      out.write("\t\t\t\t\tdateFormat : \"yy-mm-dd\",\r\n");
      out.write("\t\t\t\t\tminDate : \"-80Y\",\r\n");
      out.write("\t\t\t\t\tmaxDate : \"-14Y\",\r\n");
      out.write("\t\t\t\t\tdayNames : [ '월요일', '화요일', '수요일', '목요일', '금요일', '토요일',\r\n");
      out.write("\t\t\t\t\t\t\t'일요일' ],\r\n");
      out.write("\t\t\t\t\tdayNamesMin : [ '월', '화', '수', '목', '금', '토', '일' ],\r\n");
      out.write("\t\t\t\t\tmonthNamesShort : [ '1', '2', '3', '4', '5', '6', '7', '8',\r\n");
      out.write("\t\t\t\t\t\t\t'9', '10', '11', '12' ],\r\n");
      out.write("\t\t\t\t\tmonthNames : [ '1월', '2월', '3월', '4월', '5월', '6월', '7월',\r\n");
      out.write("\t\t\t\t\t\t\t'8월', '9월', '10월', '11월', '12월' ]\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../Fix/Header.jsp", out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<div id=\"step\">\r\n");
      out.write("\t\t\t회원 정보 입력 <img src=\"../../../image/step2.png\" width=\"400px\"\r\n");
      out.write("\t\t\t\theight=\"50px;\" id=\"step2\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"SignUpForm\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<form method=\"post\" action=\"SignUpProc.jsp\"\r\n");
      out.write("\t\t\t\tonsubmit=\"return JoinCheck();\" name=\"form\">\r\n");
      out.write("\t\t\t\t<table align=\"center\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><p>아이디</p> <input type=\"text\" placeholder=\"ID를 입력하세요\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"id\" maxlength=\"20\" onblur=\"onblur_text()\"><br>\r\n");
      out.write("\t\t\t\t\t\t\t<span id=\"id_text\"></span></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><p>비밀번호</p> <input type=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"비밀번호를 입력하세요\" name=\"pwd\" maxlength=\"20\"\r\n");
      out.write("\t\t\t\t\t\t\tonblur=\"onblur_text()\"> <br> <span id=\"pwd_text\"></span></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><p>비밀번호 확인</p> <input type=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"비밀번호를 다시 입력하세요\" name=\"pwdchk\" maxlength=\"20\"\r\n");
      out.write("\t\t\t\t\t\t\tonblur=\"onblur_text()\"> <br> <span id=\"pwdchk_text\"></span></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<p>이름</p> <input type=\"text\" placeholder=\"이름을 입력하세요\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\tmaxlength=\"20\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<p>닉네임</p> <input type=\"text\" placeholder=\"사용할 닉네임을 입력하세요\" name=\"nickname\"\r\n");
      out.write("\t\t\t\t\t\t\tmaxlength=\"10\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><p>전화번호</p> <select name=\"phone1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option selected=\"selected\">010</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>011</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>016</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>017</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>018</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option>019</option>\r\n");
      out.write("\t\t\t\t\t\t</select><span id=\"hyp\">-</span> <input type=\"text\" name=\"phone2\"\r\n");
      out.write("\t\t\t\t\t\t\tmaxlength=\"4\" id=\"phone2\" onkeypress=\"filterKey('[0-9]')\">\r\n");
      out.write("\t\t\t\t\t\t\t<span id=\"hyp\">-</span> <input type=\"text\" name=\"phone3\"\r\n");
      out.write("\t\t\t\t\t\t\tmaxlength=\"4\" id=\"phone3\" onkeypress=\"filterKey('[0-9]')\">\r\n");
      out.write("\t\t\t\t\t\t\t<br> <span id=\"phone_text\"></span></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><p>이메일</p> <input type=\"text\" placeholder=\"이메일을 입력하세요\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"email\" onblur=\"onblur_text()\"> <br> <span\r\n");
      out.write("\t\t\t\t\t\t\tid=\"email_text\"></span></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><p>주소</p> <input type=\"text\" name=\"zipcode\" maxlength=\"7\"\r\n");
      out.write("\t\t\t\t\t\t\treadonly=\"readonly\" id=\"zipcode\"> <input type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"우편번호찾기\" id=\"btnZip\" onclick=\"zipCheck()\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"address1\" readonly=\"readonly\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"address1\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" placeholder=\"상세 주소를 입력하세요\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"address2\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><p>생년월일 (선택)</p>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"testDatepicker\" name=\"birth\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"btns\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"처음으로\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"location.href='../../Main/MainPage.jsp'\"><input\r\n");
      out.write("\t\t\t\t\t\ttype=\"reset\" value=\"초기화\"><input type=\"submit\" value=\"확인\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../Fix/Footer.jsp", out, true);
      out.write("\r\n");
      out.write("\t</div>\r\n");
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
