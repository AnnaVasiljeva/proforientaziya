package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class question_005fjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("            input [type=radio]{\n");
      out.write("                width: 50%;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                margin:20px 40em;\n");
      out.write("                display: inline-block;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("               \n");
      out.write("            }          \n");
      out.write("\n");
      out.write("            input[name=text] {\n");
      out.write("                width: 50%;\n");
      out.write("                padding: 12px 20px;\n");
      out.write("                margin: 20px 0;\n");
      out.write("                display: inline-block;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            input[type=reset] {\n");
      out.write("                width: 10%;\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            input[type=submit] {\n");
      out.write("                width: 10%;\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=submit]:hover {\n");
      out.write("                background-color: #45a049;\n");
      out.write("            }\n");
      out.write("            div {\n");
      out.write("    border-radius: -5em;\n");
      out.write("    background-color: #f2f2f2;\n");
      out.write("    padding: 40px;\n");
      out.write("    margin-left: 10em;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("             \n");
      out.write("     <form action=\"ReadParams\" method=\"POST\" target=\"_blank\">\n");
      out.write("            <p><b>Выбрать тест:</b><br>\n");
      out.write("                <input type=\"radio\" name=\"test1\" value=\"1\" > Тест 1<Br>\n");
      out.write("                <input type=\"radio\" name=\"test2\" value=\"2\" > Тест 2\n");
      out.write("\n");
      out.write("            <p><b>Вопрос:</b>\n");
      out.write("                <br>\n");
      out.write("                <input name=\"text\" size=\"40\" pageEncoding=\\\"UTF-8\">\n");
      out.write("                <br>\n");
      out.write("            <p> <input type=\"submit\" value=\"Отправить\">\n");
      out.write("                <input type=\"reset\" value=\"Очистить\"></p>\n");
      out.write("        </form>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write(" \n");
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
