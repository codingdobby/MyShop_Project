/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.46
 * Generated at: 2019-11-27 07:57:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.Pay;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Product.cartVO;
import java.util.ArrayList;

public final class PayMain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Product.cartVO");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("\t");
      Pay.PayDAO dao = null;
      dao = (Pay.PayDAO) _jspx_page_context.getAttribute("dao", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (dao == null){
        dao = new Pay.PayDAO();
        _jspx_page_context.setAttribute("dao", dao, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../css/Pay.css\">\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#content1\").css(\"display\", \"block\");\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#content2\").css(\"display\", \"none\");\r\n");
      out.write("\t\t$(\"#content3\").css(\"display\", \"none\");\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#card\").click(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#content1\").css(\"display\", \"block\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#content2\").css(\"display\", \"none\");\r\n");
      out.write("\t\t\t$(\"#content3\").css(\"display\", \"none\");\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"#mutong\").click(function() {\r\n");
      out.write("\t\t\t$(\"#content1\").css(\"display\", \"none\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#content2\").css(\"display\", \"block\");\r\n");
      out.write("\t\t\t$(\"#content3\").css(\"display\", \"none\");\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"#phone\").click(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#content1\").css(\"display\", \"none\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(\"#content2\").css(\"display\", \"none\");\r\n");
      out.write("\t\t\t$(\"#content3\").css(\"display\", \"block\");\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t})\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Fix/Header.jsp", out, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
String type=request.getParameter("type");
	
	if(type==null||type.length()==0){
		response.sendRedirect("../Main/MainPage.jsp");
		
	}

		
	
	
	
      out.write("\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<h1>주문 / 결제</h1>\r\n");
      out.write("\t\t<div id=\"product\">\r\n");
      out.write("\t\t\t<table border=\"1\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th colspan=\"2\">상품 정보</th>\r\n");
      out.write("\t\t\t\t\t<th>판매자</th>\r\n");
      out.write("\t\t\t\t\t<th>배송비</th>\r\n");
      out.write("\t\t\t\t\t<th>수량</th>\r\n");
      out.write("\t\t\t\t\t<th>금액</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
	
				if(type.equals("cart")){
				
				
				
				ArrayList<cartVO> arr = (ArrayList<cartVO>)session.getAttribute("productList");
				for(cartVO vo : arr){
				
									
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td width=\"100\"></td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(vo.getProduct_name() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"100px;\">");
      out.print(vo.getSize() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"100px;\">2500원</td>\r\n");
      out.write("\t\t\t\t\t<td width=\"100px;\"></td>\r\n");
      out.write("\t\t\t\t\t<td width=\"100px;\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");
}} 
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"wrapper\">\r\n");
      out.write("\t\t\t<div id=\"info\">\r\n");
      out.write("\t\t\t\t<table border=\"1\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th colspan=\"2\">주문자 정보</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"200px;\">주문자</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"500px;\"><input type=\"text\" name=\"name\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>주소</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"zipcode\"><br> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" name=\"address1\"><br> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"address2\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"200px;\">전화번호</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"600px;\"><input type=\"text\" name=\"name\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"200px;\">주문자</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"600px;\"><input type=\"text\" name=\"name\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<!-- 주문 정보 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<table border=\"1\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th colspan=\"2\">배송지 정보</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"200px;\">받는분</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"500px;\"><input type=\"text\" name=\"name\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>주소</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"zipcode\"><br> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" name=\"address1\"><br> <input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"address2\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"200px;\">전화번호</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"600px;\"><input type=\"text\" name=\"name\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"200px;\">배송 메세지</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"600px;\"><textarea cols=\"50\" rows=\"2\"\r\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"resize: none; overflow: hidden;\" maxlength=\"50\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<!-- 배송 정보 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<table border=\"1\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th colspan=\"2\">할인 및 포인트</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"200px;\">쿠폰 할인</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"500px;\"><input type=\"text\" name=\"coupon\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" value=\"쿠폰 찾기\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"200px;\">포인트 할인</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"500px;\"><input type=\"text\" name=\"point\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" value=\"포인트 적용\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div id=\"pay\">\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"type\" id=\"card\" checked=\"checked\">카드\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"type\" id=\"mutong\">무통장 입금 <input\r\n");
      out.write("\t\t\t\t\t\ttype=\"radio\" name=\"type\" id=\"phone\">휴대폰 결제\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"content1\">\r\n");
      out.write("\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>카드 종류</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input type=\"radio\" name=\"card_type\">개인 카드 <input\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttype=\"radio\" name=\"card_type\">법인카드</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>카드 종류</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><select name=\"card_brand\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>국민</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>할부 기간</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><select><option>일시불</option></select></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- 카드 -->\r\n");
      out.write("\t\t\t\t\t<div id=\"content2\">\r\n");
      out.write("\t\t\t\t\t\t<p>무통장 입금의 경우 주문자의 이름으로 입금해 주세요</p>\r\n");
      out.write("\t\t\t\t\t\t<table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>입금 은행</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><select name=\"bank_brand\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>국민</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>할부 기간</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><select><option>일시불</option></select></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- 무통장 입금 -->\r\n");
      out.write("\t\t\t\t\t<div id=\"content3\">\r\n");
      out.write("\t\t\t\t\t\t<table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>휴대폰 번호</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><select name=\"card_brand\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option>국민</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>-<input type=\"text\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- 휴대폰 결제 -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"agree\">\r\n");
      out.write("\t\t\t\t<input type=\"checkbox\" name=\"chk_agree\">위 상품의 구매조건 확인 및 결제진행\r\n");
      out.write("\t\t\t\t동의</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"pay_info\">\r\n");
      out.write("\t\t\t\t<p>결제 금액</p>\r\n");
      out.write("\t\t\t\t<h1>금액!</h1>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>총 상품 금액</td>\r\n");
      out.write("\t\t\t\t\t\t<td>대략 얼마</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>배송비</td>\r\n");
      out.write("\t\t\t\t\t\t<td>0</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>할인 금액</td>\r\n");
      out.write("\t\t\t\t\t\t<td>606406</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>포인트 사용금액</td>\r\n");
      out.write("\t\t\t\t\t\t<td>606406</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"결제하기\" onclick=\"location.href='../Main/MainPage.jsp'\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
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
