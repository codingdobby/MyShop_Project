/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.46
 * Generated at: 2019-11-19 05:07:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.SignUp.seller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SellerAgree_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#chk_all\").click(function() {\r\n");
      out.write("\t\t\tvar chk = $(this).is(\":checked\");//.attr('checked');\r\n");
      out.write("\t\t\tif (chk) {\r\n");
      out.write("\t\t\t\t$(\".check_check input\").prop('checked', true);\r\n");
      out.write("\t\t\t\t$(\"#iframe1\").css(\"display\", \"none\");\r\n");
      out.write("\t\t\t\t$(\"#iframe2\").css(\"display\", \"none\");\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\t$(\".check_check input\").prop('checked', false);\r\n");
      out.write("\t\t\t\t$(\"#iframe1\").css(\"display\", \"block\");\r\n");
      out.write("\t\t\t\t$(\"#iframe2\").css(\"display\", \"block\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#cb1\").click(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#iframe1\").css(\"display\", \"block\");\r\n");
      out.write("\t\t\t$(\"input:checkbox[id='chk_all']\").prop(\"checked\", false);\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"#cb2\").click(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#iframe2\").css(\"display\", \"block\");\r\n");
      out.write("\t\t\t$(\"input:checkbox[id='chk_all']\").prop(\"checked\", false);\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#cb1\").click(function() {\r\n");
      out.write("\t\t\tif ($(\"#cb1\").is(\":checked\")) {\r\n");
      out.write("\t\t\t\t$(\"#iframe1\").css(\"display\", \"none\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#cb2\").click(function() {\r\n");
      out.write("\t\t\tif ($(\"#cb2\").is(\":checked\")) {\r\n");
      out.write("\t\t\t\t$(\"#iframe2\").css(\"display\", \"none\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif($(\"input:checkbox[name='cb1']\").length>4){\r\n");
      out.write("\t\t\t$(\"input:checkbox[id='chk_all']\").prop(\"checked\", false);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t})\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\tfunction check() {\r\n");
      out.write("\t\tif ($(\"#cb1\").is(\":checked\") == false) {\r\n");
      out.write("\t\t\talert(\"필수 항목에 동의 해주세요\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tif ($(\"#cb2\").is(\":checked\") == false) {\r\n");
      out.write("\t\t\talert(\"필수 항목에 동의 해주세요\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tif ($(\"#cb3\").is(\":checked\") == false) {\r\n");
      out.write("\t\t\talert(\"필수 항목에 동의 해주세요\");\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\telse {\r\n");
      out.write("\t\t\tlocation.href = \"SellerReg.jsp\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>회원가입</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../../css/SignUp.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../Fix/Header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<div id=\"step\">\r\n");
      out.write("\t\t\t이용 약관 동의 <img src=\"../../../image/step1.png\" width=\"400px\"\r\n");
      out.write("\t\t\t\theight=\"50px;\" id=\"step1\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"agreeBox\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<br> <br> <br> <input type=\"checkbox\" name=\"chk_all\"\r\n");
      out.write("\t\t\t\tid=\"chk_all\">전체 동의\r\n");
      out.write("\t\t\t<ul class=\"check_check\">\r\n");
      out.write("\t\t\t\t<li><input type=\"checkbox\" name=\"cb1\" id=\"cb1\"> <label\r\n");
      out.write("\t\t\t\t\tfor=\"cb1\">서비스 약관 동의(필수)</label> <iframe src=\"../serviceAgree.html\"\r\n");
      out.write("\t\t\t\t\t\twidth=\"900px\" height=\"300px\" id=\"iframe1\"></iframe></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li><input type=\"checkbox\" name=\"cb1\" id=\"cb2\"> <label\r\n");
      out.write("\t\t\t\t\tfor=\"cb2\">개인정보 수집 및 이용에 대한 안내(필수)</label> <iframe\r\n");
      out.write("\t\t\t\t\t\tsrc=\"../infoAgree.html\" width=\"900px\" height=\"300px\" id=\"iframe2\"></iframe></li>\r\n");
      out.write("\t\t\t\t<li><input type=\"checkbox\" name=\"cb1\" id=\"cb3\">만 14세\r\n");
      out.write("\t\t\t\t\t이상입니다.(필수)</li>\r\n");
      out.write("\t\t\t\t<li><input type=\"checkbox\" name=\"cb1\">마켓팅 수신 동의(선택)</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"btn\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" onclick=\"location.href='../../Main/MainPage.jsp'\"\r\n");
      out.write("\t\t\t\t\tvalue=\"처음으로\"> <input type=\"button\" onclick=\"check()\"\r\n");
      out.write("\t\t\t\t\tvalue=\"다음 단계\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- center div end -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../Fix/Footer.jsp", out, false);
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