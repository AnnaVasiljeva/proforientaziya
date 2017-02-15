<%-- 
    Document   : index
    Created on : 31.01.2017, 20:04:29
    Author     : sf2015
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@ page import="java.io.*,java.util.*" %>
<html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8"/>  
        <meta charset="ISO-8859-1">  
        <meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">   <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <link rel="stylesheet" href="newcss.css">
        <title>Профориентация</title>
    </head>
    <body>

        <ul id="navbar">
            <li><a href="#">Главная</a></li>
            <li><a href="index.html">Добавить вопрос</a></li>
            <li><a href="#"> Тесты </a>
                <ul><li><a href="#">Холланда</a></li>
                    <li><a href="#">Климова</a></li>
                </ul>
            </li>
            <li><a href="#"> Библиотека профессий </a></li>
           <li><a href="registraziy_jsp.jsp">Регистрация</a></li>
                </ul>
		
        <br><br>

    <br> <center><h2>Тест Холланда на определение профессионального типа личности <br>
            <p>Из каждой пары профессий выберите одну, наиболее привлекательную для вас.</p></h1></center>
                    <br>
 <form action="ReadParams.jsp" method="post" name="test">

<table align="center" border="1" cellpadding="3" width="70%">
<tr><th>№</th> <th colspan="2">Ответ "А"</th> <th colspan="2">Ответ "Б"</th></tr>
<tr align="center">
<td>1</td>
<td>Автомеханик</td>
<td width="30"><input name="q1" value="11" type="radio"></td>
<td width="30"><input name="q1" value="12" type="radio"></td>
<td>Физиотерапевт</td>
</tr><tr align="center">
<td>2</td>
<td>Специалист по защите информации</td>
<td><input name="q2" value="21" type="radio"></td>
<td><input name="q2" value="22" type="radio"></td>
<td>Логистик</td>
</tr><tr align="center">
<td>3</td>
<td>Оператор связи</td>
<td><input name="q3" value="31" type="radio"></td>
<td><input name="q3" value="32" type="radio"></td>
<td>Кинооператор</td>
</tr><tr align="center">
<td>4</td>
<td>Водитель</td>
<td><input name="q4" value="41" type="radio"></td>
<td><input name="q4" value="42" type="radio"></td>
<td>Продавец</td>
</tr><tr align="center">
<td>5</td>
<td>Инженер-конструктор	</td>
<td><input name="q5" value="51" type="radio"></td>
<td><input name="q5" value="52" type="radio"></td>
<td>Менеджер по продажам</td>
</tr><tr align="center">
<td>6</td>
<td>Диспетчер</td>
<td><input name="q6" value="61" type="radio"></td>
<td><input name="q6" value="62" type="radio"></td>
<td>Дизайнер компьютерных программ</td>
</tr><tr align="center">
<td>7</td>
<td>Ветеринар	</td>
<td><input name="q7" value="71" type="radio"></td>
<td><input name="q7" value="72" type="radio"></td>
<td>Эколог</td>
</tr><tr align="center">
<td>8</td>
<td>Биолог-исследователь</td>	
<td><input name="q8" value="81" type="radio"></td>
<td><input name="q8" value="82" type="radio"></td>
<td>Фермер</td>
</tr><tr align="center">
<td>9</td>
<td>Лаборант</td>
<td><input name="q9" value="91" type="radio"></td>
<td><input name="q9" value="92" type="radio"></td>
<td>Дрессировщик</td>
</tr><tr align="center">
<td>10</td>
<td>Агроном</td>
<td><input name="q10" value="101" type="radio"></td>
<td><input name="q10" value="102" type="radio"></td>
<td>Санитарный врач</td>
</tr><tr align="center">
<td>11</td>
<td>Селекционер</td>
<td><input name="q11" value="111" type="radio"></td>
<td><input name="q11" value="112" type="radio"></td>
<td>Заготовитель сельхозпродуктов</td>
</tr><tr align="center">
<td>12</td>
<td>Микробиолог</td>
<td><input name="q12" value="121" type="radio"></td>
<td><input name="q12" value="122" type="radio"></td>
<td>Ландшафтный дизайнер</td>
</tr><tr align="center">
<td>13</td>
<td>Массажист</td>
<td><input name="q13" value="131" type="radio"></td>
<td><input name="q13" value="132" type="radio"></td>
<td>Воспитатель</td>
</tr><tr align="center">
<td>14</td>
<td>Преподаватель</td>
<td><input name="q14" value="141" type="radio">
<td><input name="q14" value="142" type="radio">
<td>Предприниматель</td>
</tr><tr align="center">
<td>15</td>
<td>Администратор</td>
<td><input name="q15" value="151" type="radio">
<td><input name="q15" value="152" type="radio">
<td>Режиссер театра и кино</td>
</tr><tr align="center">
<td>16</td> 
<td>Официант </td> 
<td><input name="q16" value="161" type="radio"></td>
<td><input name="q16" value="162" type="radio"></td>
<td>Врач</td>
</tr><tr align="center">
<td>17</td>
<td>Психолог</td>
<td><input name="q17" value="171" type="radio"></td>
<td><input name="q17" value="172" type="radio"></td>
<td>Торговый агент</td>
</tr><tr align="center">
<td>18</td>
<td>Страховой агент</td>
<td><input name="q18" value="181" type="radio"></td>
<td><input name="q18" value="182" type="radio"></td>
<td>Хореограф</td>
</tr><tr align="center">
<td>19</td>
<td>Ювелир-гравер</td>
<td><input name="q19" value="191" type="radio"></td>
<td><input name="q19" value="192" type="radio"></td>
<td>Журналист</td>
</tr><tr align="center">
<td>20</td>
<td>Искусствовед</td>
<td><input name="q20" value="201" type="radio"></td>
<td><input name="q20" value="202" type="radio"></td>
<td>Продюсер</td>
</tr><tr align="center">
<td>21</td>
<td>Редактор</td>
<td><input name="q21" value="211" type="radio"></td>
<td><input name="q21" value="212" type="radio"></td>
<td>Музыкант</td>
</tr><tr align="center">
<td>22</td>
<td>Дизайнер интерьера</td>
<td><input name="q22" value="221" type="radio"></td>
<td><input name="q22" value="222" type="radio"></td>
<td>Экскурсовод</td>
</tr><tr align="center">
<td>23</td>
<td>Композитор</td>
<td><input name="q23" value="231" type="radio"></td>
<td><input name="q23" value="232" type="radio"></td>
<td>Арт-директор</td>
</tr><tr align="center">
<td>24</td>
<td>Музейный работник</td>
<td><input name="q24" value="241" type="radio"></td>
<td><input name="q24" value="242" type="radio"></td>
<td>Актер театра и кино</td>
</tr><tr align="center">
<td>25</td>
<td>Верстальщик</td>
<td><input name="q25" value="251" type="radio"></td>
<td><input name="q25" value="252" type="radio"></td>
<td>Гид-переводчик</td>
</tr><tr align="center">
<td>26</td>
<td>Лингвист</td>
<td><input name="q26" value="261" type="radio"></td>
<td><input name="q26" value="262" type="radio"></td>
<td>Антикризисный управляющий</td>
</tr><tr align="center">
<td>27</td>
<td>Корректор</td>
<td><input name="q27" value="271" type="radio"></td>
<td><input name="q27" value="272" type="radio"></td>
<td>Художественный редактор</td>
</tr><tr align="center">
<td>28</td>
<td>Наборщик текстов</td>
<td><input name="q28" value="281" type="radio"></td>
<td><input name="q28" value="282" type="radio"></td>
<td>Юрисконсульт</td>
</tr><tr align="center">
<td>29</td>
<td>Программист</td>
<td><input name="q29" value="291" type="radio"></td>
<td><input name="q29" value="292" type="radio"></td>
<td>Брокер</td>
</tr><tr align="center">
<td>30</td>
<td>Бухгалтер</td>
<td><input name="q30" value="301" type="radio"></td>
<td><input name="q30" value="302" type="radio"></td>
<td>Литературный переводчик</td>
</tr>


</table>
     
    
 
<center><p><input type="submit" value="Отправить" ><font style="margin-right: 10%;padding:2em"> 
        <input type="button" value="Следующий тест"onclick="location.href='progress_jsp.jsp'"/><font style="margin-left: - 10%;padding:-2em"></p><br></center></form>  


</body>
</html>
