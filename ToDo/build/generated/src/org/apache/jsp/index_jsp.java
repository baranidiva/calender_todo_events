package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html >\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Online Ticket Reservation</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">  \n");
      out.write("    <link rel=\"icon\" href=\"http://example.com/favicon.png\">  \n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"body\"></div>\n");
      out.write("\t\t<div class=\"grad\"></div>\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<div>Book<span>Tickets</span></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<div class=\"login\">\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"username\" name=\"user\" id=\"userName\"><br>\n");
      out.write("\t\t\t\t<input type=\"password\" placeholder=\"password\" name=\"password\" id=\"pass\"><br>\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"Login\" onclick=\"validate()\">\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t    function validate(text1,text2)\n");
      out.write("    \t{\n");
      out.write("    \t\tvar text1 = document.getElementById(\"userName\");\n");
      out.write("    \t\tvar text2 = document.getElementById(\"pass\");\n");
      out.write("  \t\t\t\tif(text1.value==\"fazrul\" && text2.value==\"rahman\" || text1.value==\"vidya\" && text2.value==\"sagar\" ) \n");
      out.write("  \t\t\t\t{\n");
      out.write("        \t\tload(\"home.html\");\n");
      out.write("    \t\t\t}\n");
      out.write("    \t\t\telse \n");
      out.write("    \t\t\t{\n");
      out.write("        \t\tload(\"index.html\");\n");
      out.write("    \t\t\t}\n");
      out.write("\n");
      out.write("    \t\tfunction load(url) \n");
      out.write("    \t\t{\n");
      out.write("    \t\t\tlocation.href = url;\n");
      out.write("    \t\t}\n");
      out.write("    \t}\n");
      out.write("\t</script>\n");
      out.write("  </body>\n");
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
