package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class progress_005fjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.easing.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Progressbar</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write(" <style>\n");
      out.write("body {font-family: \"Lato\", sans-serif;}\n");
      out.write("\n");
      out.write("ul.tab {\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    background-color: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Float the list items side by side */\n");
      out.write("ul.tab li {float: left;}\n");
      out.write("\n");
      out.write("/* Style the links inside the list items */\n");
      out.write("ul.tab li a {\n");
      out.write("    display: inline-block;\n");
      out.write("    color: black;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    transition: 0.3s;\n");
      out.write("    font-size: 17px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change background color of links on hover */\n");
      out.write("ul.tab li a:hover {\n");
      out.write("    background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Create an active/current tablink class */\n");
      out.write("ul.tab li a:focus, .active {\n");
      out.write("    background-color: #ccc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the tab content */\n");
      out.write(".tabcontent {\n");
      out.write("    display: none;\n");
      out.write("    padding: 6px 12px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-top: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topright {\n");
      out.write(" float: right;\n");
      out.write(" cursor: pointer;\n");
      out.write(" font-size: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topright:hover {color: red;}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<p>Click on the x button in the top right corner to close the current tab:</p>\n");
      out.write("\n");
      out.write("<ul class=\"tab\">\n");
      out.write("  <li><a href=\"javascript:void(0)\" class=\"tablinks\" onclick=\"openCity(event, 'London')\" id=\"defaultOpen\">London</a></li>\n");
      out.write("  <li><a href=\"javascript:void(0)\" class=\"tablinks\" onclick=\"openCity(event, 'Paris')\">Paris</a></li>\n");
      out.write("  <li><a href=\"javascript:void(0)\" class=\"tablinks\" onclick=\"openCity(event, 'Tokyo')\">Tokyo</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("<div id=\"London\" class=\"tabcontent\">\n");
      out.write("  <span onclick=\"this.parentElement.style.display='none'\" class=\"topright\">x</span>\n");
      out.write("  <h3>London</h3>\n");
      out.write("  <p>London is the capital city of England.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"Paris\" class=\"tabcontent\">\n");
      out.write("  <span onclick=\"this.parentElement.style.display='none'\" class=\"topright\">x</span>\n");
      out.write("  <h3>Paris</h3>\n");
      out.write("  <p>Paris is the capital of France.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"Tokyo\" class=\"tabcontent\">\n");
      out.write("  <span onclick=\"this.parentElement.style.display='none'\" class=\"topright\">x</span>\n");
      out.write("  <h3>Tokyo</h3>\n");
      out.write("  <p>Tokyo is the capital of Japan.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function openCity(evt, cityName) {\n");
      out.write("    var i, tabcontent, tablinks;\n");
      out.write("    tabcontent = document.getElementsByClassName(\"tabcontent\");\n");
      out.write("    for (i = 0; i < tabcontent.length; i++) {\n");
      out.write("        tabcontent[i].style.display = \"none\";\n");
      out.write("    }\n");
      out.write("    tablinks = document.getElementsByClassName(\"tablinks\");\n");
      out.write("    for (i = 0; i < tablinks.length; i++) {\n");
      out.write("        tablinks[i].className = tablinks[i].className.replace(\" active\", \"\");\n");
      out.write("    }\n");
      out.write("    document.getElementById(cityName).style.display = \"block\";\n");
      out.write("    evt.currentTarget.className += \" active\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Get the element with id=\"defaultOpen\" and click on it\n");
      out.write("document.getElementById(\"defaultOpen\").click();\n");
      out.write("</script>\n");
      out.write("     \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
