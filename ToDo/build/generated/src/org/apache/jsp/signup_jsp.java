package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Sign Up</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"log.jpg\">\n");
      out.write("        <h1 align=\"center\"><font color=\"white\">My ToDo's<br/>Registration Details</font></h1>\n");
      out.write("        <form>\n");
      out.write("            <center>\n");
      out.write("                <br/>First Name<input type=\"text\" name=\"fname\">\n");
      out.write("                <br/>Last Name<input type=\"text\" name=\"lname\">\n");
      out.write("                <br/>Date of Birth<input type=\"date\" name=\"dob\">\n");
      out.write("                <br/>Email ID<input type=\"text\" name=\"email\">\n");
      out.write("                <br/>City<input type=\"text\" name=\"city\">\n");
      out.write("                <br/>State<input type=\"text\" name=\"state\">\n");
      out.write("                <br/>Country<input type=\"text\" name=\"country\">\n");
      out.write("                <br/>User ID<input type=\"text\" name=\"userid\">\n");
      out.write("                <br/>Password<input type=\"password\" name=\"pass\">\n");
      out.write("            </center>\n");
      out.write("        </form>>\n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
