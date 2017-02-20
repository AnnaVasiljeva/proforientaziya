package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_005f2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"newcss.css\" type=\"text/css\"/>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP form</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <title>Форма</title>\n");
      out.write("   \n");
      out.write("<body>\n");
      out.write(" <ul id=\"navbar\">\n");
      out.write("            <li><a href=\"index_1.jsp\">Главная</a></li>\n");
      out.write("                            <li><a href=\"index_2.jsp\">Добавить вопрос</a></li>\n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"#\"> Библиотека профессий </a></li>\n");
      out.write("           <li><a href=\"registraziy_jsp.jsp\">Регистрация</a></li>\n");
      out.write("                </ul>\t\n");
      out.write("         \n");
      out.write("   <br>\n");
      out.write("<form action=\"question_jsp.jsp\" method=post>\n");
      out.write("<center>\n");
      out.write("<table cellpadding=4 cellspacing=2 border=0>\n");
      out.write("<th bgcolor=\"#CCCCFF\" colspan=2>\n");
      out.write("<font size=5>Форма</font>\n");
      out.write("<br>\n");
      out.write("<font size=1><sup></sup></font>\n");
      out.write("</th>\n");
      out.write("<tr bgcolor=\"#C0C0C0\">\n");
      out.write("<td valign=top colspan=2>\n");
      out.write("<b>Добавить вопрос: <sup></sup></b>\n");
      out.write("<br>\n");
      out.write("<input type=\"text\" name=\"text\"  size=50  maxlength=10 pageEncoding=\"UTF-8\">\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor=\"#C0C0C0\">\n");
      out.write("<td valign=top colspan=2>\n");
      out.write("<b>Вариант ответа: <sup></sup></b>\n");
      out.write("<br>\n");
      out.write("<input type=\"text\" name=\"text\"  size=50  maxlength=10 pageEncoding=\"UTF-8\">\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor=\"#C0C0C0\">\n");
      out.write("<td valign=top colspan=2>\n");
      out.write("<b>Вариант ответа: <sup></sup></b>\n");
      out.write("<br>\n");
      out.write("<input type=\"text\" name=\"text\"  size=50  maxlength=10 pageEncoding=\"UTF-8\">\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor=\"#C0C0C0\">\n");
      out.write("<td valign=top colspan=2>\n");
      out.write("<b>Вариант ответа: <sup></sup></b>\n");
      out.write("<br>\n");
      out.write("<input type=\"text\" name=\"text\"  size=50  maxlength=10 pageEncoding=\"UTF-8\">\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor=\"#C0C0C0\">\n");
      out.write("<td  valign=top colspan=2>\n");
      out.write("<b> Тест № : </b>\n");
      out.write("<br>\n");
      out.write("<input type=\"radio\" name=\"test_1\" value=\"test_1\" > Test 2  \n");
      out.write("<br></td>\n");
      out.write("</tr>\n");
      out.write("<tr bgcolor=\"#FFE4E1\">\n");
      out.write("<td  align=center colspan=2><a href=\"index_2.jsp\">Test 1</a></td>\n");
      out.write("<tr bgcolor=\"#c8d8f8\">\n");
      out.write("\n");
      out.write("<td  align=center colspan=2>\n");
      out.write("<input type=\"submit\" value=\"Отправить\"><input type=\"reset\"  \n");
      out.write("value=\"Сброс\">\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("</form>\n");
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
