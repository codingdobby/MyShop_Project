/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.46
 * Generated at: 2019-11-26 00:47:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.Community.BestDresser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Board.BoardVO;

public final class Community_005fBestDresser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("Board.BoardVO");
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
      Board.BoardDAO dao = null;
      dao = (Board.BoardDAO) _jspx_page_context.getAttribute("dao", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (dao == null){
        dao = new Board.BoardDAO();
        _jspx_page_context.setAttribute("dao", dao, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>MY Shop</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../../../css/Community.css?after\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../Fix/Header.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<h1>OOTD</h1>\r\n");

		
		ArrayList<BoardVO> list = dao.getBestDresser();
				
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t<div id=\"menu_comuinty\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li>조회순</li>\r\n");
      out.write("\t\t\t\t\t<li>최근 등록순</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--  end menu -->\r\n");
      out.write("\t\t\t<div id=\"OOTD\">\r\n");
      out.write("\t\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Menu_bar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<ul id=\"ul_box\" style=\"-webkit-padding-start: 0px;\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t");
for(BoardVO vo:list){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"../OOTD/Ootd_Detail.jsp?num=");
      out.print(vo.getNUM());
      out.write("\"><img src=\"../../../uploadFile/");
      out.print(vo.getImage1());
      out.write("\"></a>\r\n");
      out.write("\t\t\t\t\t\t<ul style=\"-webkit-padding-start: 0px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<li id=\"event_title_space\"><a href=\"Ootd_Detail.jsp?num=");
      out.print(vo.getNUM());
      out.write("\"><span id=\"event_title\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.print(vo.getTITLE() );
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li id=\"event_term_space\">");
      out.print(vo.getWRITER() );
      out.write("</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- end content -->\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
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
