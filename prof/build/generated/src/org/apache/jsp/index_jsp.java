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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"newcss.css\">\n");
      out.write("        <title>Профориентация</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <ul id=\"navbar\">\n");
      out.write("        <li><a href=\"#\">Главная</a></li>\n");
      out.write("        <li><a href=\"html_form.html\">Форма</a></li>\n");
      out.write("        <li><a href=\"#\">Тесты</a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\">Холланда</a></li>\n");
      out.write("                <li><a href=\"#\">Климова</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"#\"> Библиотека профессий </a></li>\n");
      out.write("        \n");
      out.write("       <li> <a onclick=\"document.getElementById('id01').style.display = 'block'\" style=\"width:auto; padding: 10px; \" >Регистрация</a></li>\n");
      out.write("        <div id=\"id01\" class=\"modal\">\n");
      out.write("\n");
      out.write("            <form class=\"modal-content animate\" action=\"ReadParams\">\n");
      out.write("               <div class=\"imgcontainer\">\n");
      out.write("                    <span onclick=\"document.getElementById('id01').style.display = 'none'\" class=\"close\" title=\"Close Modal\">&times;</span>\n");
      out.write("                    <img src=\"group.png\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <label><b>Username</b></label>\n");
      out.write("                    <input type=\"text\" placeholder=\"Enter Username\" name=\"uname\" required>\n");
      out.write("\n");
      out.write("                    <label><b>Password</b></label>\n");
      out.write("                    <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n");
      out.write("\n");
      out.write("                    <button type=\"submit\">Login</button>\n");
      out.write("                    <input type=\"checkbox\" checked=\"checked\"> Remember me\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"container\" style=\"background-color:#f1f1f1\">\n");
      out.write("                    <button type=\"button\" onclick=\"document.getElementById('id01').style.display = 'none'\" class=\"cancelbtn\">Cancel</button>\n");
      out.write("                    <span class=\"psw\">Forgot <a href=\"#\">password?</a></span>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("        // Get the modal\n");
      out.write("            var modal = document.getElementById('id01');\n");
      out.write("\n");
      out.write("        // When the user clicks anywhere outside of the modal, close it\n");
      out.write("            window.onclick = function (event) {\n");
      out.write("                if (event.target === modal) {\n");
      out.write("                    modal.style.display = \"none\";\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("<center><h1>Тест Холланда</h1></center>\n");
      out.write("<br>\n");
      out.write("<form action=\"ReadParams\" method=\"POST\" target=\"_blank\">\n");
      out.write("    <center><table border=\"1\">\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <th>№</th>\n");
      out.write("                <th colspan=\"2\">Ответ \"A\"</th>\n");
      out.write("\n");
      out.write("                <th colspan=\"2\">Ответ \"Б\"</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr><td>1</td><td><abbr title=\"рабочий, выполняющий ремонт и техническое обслуживание\">Автомеханик</abbr></td><td>\n");
      out.write("                    <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a1\" >\n");
      out.write("                </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b1\" >\n");
      out.write("                </td><td>Физиотерапевт</td></tr>\n");
      out.write("            <tr><td>2</td><td>Специалист по защите информации</td><td>\n");
      out.write("                    <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a2\" >\n");
      out.write("                </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b2\" >\n");
      out.write("                </td><td>Логистик</td></tr>\n");
      out.write("            <tr><td>3</td><td>Оператор связи</td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form>\n");
      out.write("                    <input type=\"checkbox\" name=\"option1\" value=\"a3\">\n");
      out.write("                </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b3\" >\n");
      out.write("                </td><td>Кинооператор</td></tr>\n");
      out.write("            <tr><td>4</td><td>Водитель</td><td>\n");
      out.write("                    <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a4\" >\n");
      out.write("                </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b4\" >\n");
      out.write("                </td><td>Продавец</td></tr>\n");
      out.write("            <tr><td>5</td><td>Инженер-конструктор</td><td>\n");
      out.write("                    <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a5\" >\n");
      out.write("                </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b5\" >\n");
      out.write("                </td><td>Менеджер по продажам</td></tr>\n");
      out.write("            <tr><td>6</td><td>Диспетчер</td><td>\n");
      out.write("                    <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a6\" >\n");
      out.write("                </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b6\" >\n");
      out.write("                </td><td>Дизайнер компьютерных программ</td></tr>\n");
      out.write("            <tr><td>7</td><td>Ветеринар</td><td>\n");
      out.write("                    <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a7\" >\n");
      out.write("                </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b7\" >\n");
      out.write("                </td><td>Эколог</td></tr>\n");
      out.write("            <tr><td>8</td><td>Биолог-исследователь</td><td>\n");
      out.write("                    <input type=\"checkbox\" name=\"option1\" value=\"a8\" ></form>\n");
      out.write("                </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b8\" >\n");
      out.write("\n");
      out.write("                </td><td>Фермер</td></tr>\n");
      out.write("            <tr><td>9</td><td>Лаборант</td><td>\n");
      out.write("                    <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a9\" >\n");
      out.write("                </td><td><form><input type=\"checkbox\" name=\"option1\" value=\"b9\" >\n");
      out.write("                    </td><td>Дрессировщик</td></tr>\n");
      out.write("    <tr><td>10</td><td>Агроном</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a11\" >\n");
      out.write("        </td><td> <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b11\" >\n");
      out.write("        </td><td>Санитарный врач</td></tr>\n");
      out.write("    <tr><td>11</td><td>Селекционер</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a12\" >\n");
      out.write("        </td><td> <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b12\" >\n");
      out.write("        </td><td>Заготовитель сельхозпродуктов</td></tr>\n");
      out.write("    <tr><td>12</td><td>Массажист</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a13\" >\n");
      out.write("        </td><td> <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b13\" >\n");
      out.write("        </td><td>Воспитатель</td></tr>\n");
      out.write("    <tr><td>13</td><td>Преподаватель</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a13\" >\n");
      out.write("        </td><td> <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b13\" >\n");
      out.write("        </td><td>Предприниматель</td></tr>\n");
      out.write("    <tr><td>14</td><td>Администратор</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a14\" >\n");
      out.write("        </td><td> <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b14\" >\n");
      out.write("        </td><td>Режиссер театра и кино</td></tr>\n");
      out.write("    <tr><td>15</td><td>Официант </td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a15\" >\n");
      out.write("        </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b15\" >\n");
      out.write("        </td><td>Врач</td></tr>\n");
      out.write("    <tr><td>16</td><td>Психолог</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a16\" >\n");
      out.write("        </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b16\" >\n");
      out.write("        </td><td>Торговый агент</td></tr>\n");
      out.write("    <tr><td>17</td><td>Страховой агент</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a17\" >\n");
      out.write("        </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b17\" >\n");
      out.write("        </td><td>Хореограф</td></tr>\n");
      out.write("    <tr><td>18</td><td>Ювелир-гравер</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a18\" >\n");
      out.write("        </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b18\" >\n");
      out.write("        </td><td>Журналист</td></tr>\n");
      out.write("    <tr><td>19</td><td>Искусствовед</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a19\" >\n");
      out.write("        </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b19\" >\n");
      out.write("        </td><td>Продюсер</td></tr>\n");
      out.write("    <tr><td>20</td><td>Редактор</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a20\" >\n");
      out.write("        </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b20\" >\n");
      out.write("        </td><td>Музыкант</td></tr>\n");
      out.write("    <tr><td>21</td><td>Дизайнер интерьера</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a21\" >\n");
      out.write("        </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b21\" >\n");
      out.write("        </td><td>Экскурсовод</td></tr>\n");
      out.write("    <tr><td>22</td><td>Композитор</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a22\" >\n");
      out.write("        </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b22\" >\n");
      out.write("        </td><td>Арт-директор</td></tr>\n");
      out.write("    <tr><td>23</td><td>Музейный работник</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"a23\" >\n");
      out.write("        </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b23\" >\n");
      out.write("        </td><td>Актер театра и кино</td></tr>\n");
      out.write("    <tr><td>24</td><td>Верстальщик</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form>\n");
      out.write("            <input type= \"checkbox\" name=\"option1\" value=\"a24\">\n");
      out.write("        </td>\n");
      out.write("        <td> <form action=\"ReadParams\" method=\"POST\" target=\"_blank\">\n");
      out.write("            </form> <input type= \"checkbox\" name=\"option1\" value=\"b24\" >\n");
      out.write("        </td><td>Гид-переводчик</td></tr>\n");
      out.write("    <tr><td>25</td><td>Лингвист</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form> <input type=\"checkbox\" name=\"option1\" value=\"a25\" >\n");
      out.write("        </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form> <input type=\"checkbox\" name=\"option1\" value=\"b25\" >\n");
      out.write("        </td><td>Антикризисный управляющий</td></tr>\n");
      out.write("    <tr><td>26</td><td>Корректор</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form> <input type=\"checkbox\" name=\"option1\" value=\"a26\" >\n");
      out.write("        </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form> <input type=\"checkbox\" name=\"option1\" value=\"b26\" >\n");
      out.write("        </td><td>Художественный редактор</td></tr>\n");
      out.write("    <tr><td>27</td><td>Наборщик текстов</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form> <input type=\"checkbox\" name=\"option1\" value=\"a27\" >\n");
      out.write("        </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form> <input type=\"checkbox\" name=\"option1\" value=\"b27\" >\n");
      out.write("        </td><td>Юрисконсульт</td></tr>\n");
      out.write("    <tr><td>28</td><td>Программист</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type= \"checkbox\" name=\"option1\" value=\"a28\">\n");
      out.write("        </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\">\n");
      out.write("            </form><input type=\"checkbox\" name=\"option1\" value=\"b28\" >\n");
      out.write("        </td><td>Брокер</td></tr>\n");
      out.write("    <tr><td>29</td><td>Бухгалтер</td><td>\n");
      out.write("            <form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form> <input type=\"checkbox\" name=\"option1\" value=\"a29\" >\n");
      out.write("        </td><td><form action=\"ReadParams\" method=\"POST\" target=\"_blank\"></form><input type=\"checkbox\" name=\"option1\" value=\"b29\" >\n");
      out.write("        </td><td>Литературный переводчик</td></tr>\n");
      out.write("\n");
      out.write("</table> <br>\n");
      out.write("<p><input type=\"submit\" value=\"Отправить\" ><font style=\"margin-right: 10%;padding:2em\"> \n");
      out.write("    <input type=\"submit\" value=\"Следующий\" ><font style=\"margin-left: -10%;padding:-2em\"></p><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>  \n");
      out.write("        \n");
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
