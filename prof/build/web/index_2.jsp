

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<html>
    <head>
        <link rel="stylesheet" href="newcss.css" type="text/css"/>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
   
        <title>Форма</title>
   
<body>
 <ul id="navbar">
            <li><a href="index_1.jsp">Главная</a></li>
            <li><a href="index_2.jsp">Добавить вопрос</a></li>
            <li><a href="progress_jsp.jsp"> Тест Кетелла </a></li>
            <li><a href="#"> Библиотека профессий </a></li>
           <li><a href="registraziy_jsp.jsp">Регистрация</a></li>
                </ul>	
         
   <br>
<form action="question_jsp.jsp" method=post>
<center>
<table cellpadding=2 cellspacing=2 border=0>
<th bgcolor="#CCCCFF" colspan=2>
<font size=5>Форма</font>
<br>
<font size=1><sup></sup></font>
</th>
<tr bgcolor="#C0C0C0">
<td valign=top colspan=2>
<b>Добавить вопрос: <sup></sup></b>
<br>
<input type="text" name="text"  size=50  maxlength=10 pageEncoding="UTF-8">
</td>
</tr>
<tr bgcolor="#C0C0C0">
<td  valign=top colspan=2>
<b>Выбрать № теста: </b>
<br>
<input type="radio" name="test_1" value="test_1" > Test 1  
<br></td>
</tr>
<tr bgcolor="#FFE4E1">
<td  align=center colspan=2><a href="form_2.jsp">Test 2</a></td>
<tr bgcolor="#c8d8f8">
<td  align=center colspan=2>
<input type="submit" value="Отправить"><input type="reset"  
value="Сброс">
</td>
</tr>
</table>
</center>
</form>
</body>
</html>


