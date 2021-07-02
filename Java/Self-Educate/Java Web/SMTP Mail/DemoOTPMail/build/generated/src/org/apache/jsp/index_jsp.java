package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      out.write("        <title>User Email Verification</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            h1{\n");
      out.write("                text-align: center;\n");
      out.write("                color: blueviolet;\n");
      out.write("                padding-top: 30px;\n");
      out.write("            }\n");
      out.write("            form{\n");
      out.write("                width: 250px;\n");
      out.write("                height: 300px;\n");
      out.write("                padding: 20px;\n");
      out.write("                position: absolute;\n");
      out.write("                background-color: blueviolet;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                width: 100%;\n");
      out.write("                display: inline-block;\n");
      out.write("                margin: 20px 0;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("                color: #fff;\n");
      out.write("                font-weight: 700;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>User Email Verification</h1>\n");
      out.write("        <form action=\"UserVerify\" method=\"post\">\n");
      out.write("            <label>User Name</label>\n");
      out.write("            <input type=\"text\" name=\"username\">\n");
      out.write("            <label>User Email</label>\n");
      out.write("            <input type=\"email\" name=\"useremail\">\n");
      out.write("            <input type=\"submit\" value=\"Register\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" ");
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
