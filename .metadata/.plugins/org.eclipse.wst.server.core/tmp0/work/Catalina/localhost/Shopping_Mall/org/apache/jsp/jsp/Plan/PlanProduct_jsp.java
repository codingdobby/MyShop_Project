/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.47
 * Generated at: 2019-12-25 12:15:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.Plan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Product.categoryVO;
import Product.ProductVO;
import java.util.ArrayList;

public final class PlanProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1574054224000L));
    _jspx_dependants.put("jar:file:/F:/JSP_Project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Shopping_Mall/WEB-INF/lib/standard.jar!/META-INF/fmt.tld", Long.valueOf(1098678690000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("Product.categoryVO");
    _jspx_imports_classes.add("Product.ProductVO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody;

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
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      Product.ProductDAO dao = null;
      dao = (Product.ProductDAO) _jspx_page_context.getAttribute("dao", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (dao == null){
        dao = new Product.ProductDAO();
        _jspx_page_context.setAttribute("dao", dao, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../css/Plan.css?after\">\r\n");
      out.write("<script src=\"//code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");

	String value = request.getParameter("category");

      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(\r\n");
      out.write("\t\t\tfunction() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$.urlParam = function(name) {\r\n");
      out.write("\t\t\t\t\tvar results = new RegExp('[\\?&amp;]' + name\r\n");
      out.write("\t\t\t\t\t\t\t+ '=([^&amp;#]*)').exec(window.location.href);\r\n");
      out.write("\t\t\t\t\treturn results[1] || 0;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(\"#test\").val($.urlParam('category')).attr(\"selected\",\"selected\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<title>MY Shop</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Fix/Header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<h1>기획 상품</h1>\r\n");
      out.write("\t<div align=\"center\" id=\"all\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"ad\">\r\n");
      out.write("\t\t\t<img src=\"../../image/ad1.png\">\r\n");
      out.write("\t\t\t<!-- 이미지 첨부하기 -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"plan_selectbox\">\r\n");
      out.write("\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t<select name=\"category\" id=\"test\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"all\">all</option>\r\n");
      out.write("\t\t\t\t\t\t");

							ArrayList<categoryVO> cate = dao.getPlanCategory();
							for (categoryVO vo : cate) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<option value=\"");
      out.print(vo.getCateCode());
      out.write('"');
      out.write('>');
      out.print(vo.getCateName());
      out.write("</option>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");

							}
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t$(\"#test\").change(function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar value = $(\"#test option:selected\").val();\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tlocation.href = \"PlanProduct.jsp?category=\"+ value;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$.urlParam = function(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tname) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tvar results = new RegExp(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'[\\?&amp;]'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ name\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '=([^&amp;#]*)')\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.exec(window.location.href);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\treturn results[1] || 0;\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t$(\"#test\")\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.val(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t$\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.urlParam('category'))\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t.attr(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"selected\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\"selected\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<ul id=\"ul_box\" style=\"-webkit-padding-start: 0px;\">\r\n");
      out.write("\t\t\t\t");

					
				
      out.write("\r\n");
      out.write("\t\t\t\t");

					String cateCode = request.getParameter("category");
					if (cateCode == null) {
						cateCode = "all";
					}
					ArrayList<ProductVO> list = dao.getPlan(cateCode);
					for (ProductVO vo : list) {
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\thref=\"../Product/Product_Detail.jsp?num=");
      out.print(vo.getProduct_num());
      out.write("\"><img\r\n");
      out.write("\t\t\t\t\t\tsrc=\"../../uploadFile/");
      out.print(vo.getProduct_img());
      out.write("\" id=\"product_img\"></A>\r\n");
      out.write("\t\t\t\t\t<div id=\"details\">\r\n");
      out.write("\t\t\t\t\t\t<ul style=\"-webkit-padding-start: 0px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>");
      out.print(vo.getProduct_name());
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>");
      out.print(vo.getColor());
      out.write("색</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>");
      //  fmt:formatNumber
      org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_005fformatNumber_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
      boolean _jspx_th_fmt_005fformatNumber_005f0_reused = false;
      try {
        _jspx_th_fmt_005fformatNumber_005f0.setPageContext(_jspx_page_context);
        _jspx_th_fmt_005fformatNumber_005f0.setParent(null);
        // /jsp/Plan/PlanProduct.jsp(111,11) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_fmt_005fformatNumber_005f0.setValue(vo.getPrice());
        // /jsp/Plan/PlanProduct.jsp(111,11) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_fmt_005fformatNumber_005f0.setPattern("#,###");
        int _jspx_eval_fmt_005fformatNumber_005f0 = _jspx_th_fmt_005fformatNumber_005f0.doStartTag();
        if (_jspx_th_fmt_005fformatNumber_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005ffmt_005fformatNumber_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatNumber_005f0);
        _jspx_th_fmt_005fformatNumber_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatNumber_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatNumber_005f0_reused);
      }
      out.write("원</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>test</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Fix/Footer.jsp", out, false);
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
