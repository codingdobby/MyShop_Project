/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.46
 * Generated at: 2019-11-28 04:55:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.Seller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005fCoupon_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>MY Shop</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../css/Seller.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css\"\r\n");
      out.write("\ttype=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Fix/Header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<h1>쿠폰 등록</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"product_content\">\r\n");
      out.write("\t\t\t<form action=\"add_Coupon_proc.jsp\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<table border=\"1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<p>쿠폰 번호</p> <input type=\"text\" name=\"coupon_name\" maxlength=\"16\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<p>기간</p> <input type=\"text\" name=\"startdate\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"StartDatePicker\"> - <input type=\"text\" name=\"enddate\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"EndDatePicker\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<p>할인</p> <input type=\"text\" name=\"discount\" maxlength=\"2\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"reset\" value=\"초기화\"> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"submit\" value=\"등록\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://code.jquery.com/ui/1.8.18/jquery-ui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(\r\n");
      out.write("\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t$(\"#StartDatePicker\")\r\n");
      out.write("\t\t\t\t\t\t.datepicker(\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tchangeYear : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tchangeMonth : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tshowMonthAfterYear : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdateFormat : \"yy-mm-dd\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\tminDate : \"0\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmaxDate : \"+1Y\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdayNames : [ '월요일', '화요일', '수요일', '목요일',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'금요일', '토요일', '일요일' ],\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdayNamesMin : [ '월', '화', '수', '목', '금',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'토', '일' ],\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmonthNamesShort : [ '1', '2', '3', '4',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'5', '6', '7', '8', '9', '10',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'11', '12' ],\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmonthNames : [ '1월', '2월', '3월', '4월',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'5월', '6월', '7월', '8월', '9월',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'10월', '11월', '12월' ]\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#EndDatePicker\")\r\n");
      out.write("\t\t\t\t\t\t.datepicker(\r\n");
      out.write("\t\t\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tchangeYear : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tchangeMonth : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tshowMonthAfterYear : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdateFormat : \"yy-mm-dd\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\tminDate : \"0\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmaxDate : \"+1Y\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdayNames : [ '월요일', '화요일', '수요일', '목요일',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'금요일', '토요일', '일요일' ],\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdayNamesMin : [ '월', '화', '수', '목', '금',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'토', '일' ],\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmonthNamesShort : [ '1', '2', '3', '4',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'5', '6', '7', '8', '9', '10',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'11', '12' ],\r\n");
      out.write("\t\t\t\t\t\t\t\t\tmonthNames : [ '1월', '2월', '3월', '4월',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'5월', '6월', '7월', '8월', '9월',\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t'10월', '11월', '12월' ]\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Fix/Footer.jsp", out, false);
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
