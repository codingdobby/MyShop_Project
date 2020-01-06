/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.46
 * Generated at: 2019-11-26 06:35:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.Cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Product.cartVO;
import java.util.ArrayList;

public final class CartMain2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      Product.CartDAO dao = null;
      dao = (Product.CartDAO) _jspx_page_context.getAttribute("dao", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (dao == null){
        dao = new Product.CartDAO();
        _jspx_page_context.setAttribute("dao", dao, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../css/Cart.css\">\r\n");
      out.write("<title>장바구니</title>\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

		String id = (String) session.getAttribute("id");
		ArrayList<cartVO> arr = dao.getAllCart(id);
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Fix/Header.jsp", out, true);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<div id=\"product\">\r\n");
      out.write("\t\t\t<table border=\"1\" width=\"1000px\" height=\"80%\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th></th>\r\n");
      out.write("\t\t\t\t\t<th id=\"brand\" colspan=\"2\">상품 정보</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<th>수량</th>\r\n");
      out.write("\t\t\t\t\t<th>금액</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"100px;\">삭제</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

					int total = 0;
					if (arr != null) {
						for (cartVO vo : arr) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"checkbox\" value=\"");
      out.print(vo.getCart_id());
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"../../uploadFile/");
      out.print(vo.getProduct_img());
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t이름 : ");
      out.print(vo.getProduct_name() );
      out.write("<Br>\r\n");
      out.write("\t\t\t\t\t\t사이즈 : ");
      out.print(vo.getSize() );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t색상 : ");
      out.print(vo.getColor() );
      out.write("<br>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(vo.getAmount() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(vo.getPro_price() );
      out.write("</td>\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

					} //for end
					} else {
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"6\" align=\"center\">상품 없음</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"product_total\">\r\n");
      out.write("\t\t\t");
ArrayList<cartVO> cart_total = dao.getTotal(id);
			for(cartVO vo:cart_total){
			
      out.write("\r\n");
      out.write("\t\t\t총 수량 : ");
      out.print(vo.getTotal_amount() );
      out.write(" 총 금액 : ");
      out.print(vo.getTotal_price() );
      out.write("\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"btn_List\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"삭제하기\"><input type=\"button\"\r\n");
      out.write("\t\t\t\tvalue=\"결제하기\" onclick=\"location.href='../Pay/PayMain.jsp'\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Fix/Footer.jsp", out, true);
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
