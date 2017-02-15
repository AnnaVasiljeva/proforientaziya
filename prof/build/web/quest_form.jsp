<%-- 
    Document   : quest_form
    Created on : 14.02.2017, 0:31:49
    Author     : Анна
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Page form</title>
    </head>
    <body>
         <div id="quest">
             
     <form action="question_jsp.jsp" method="POST" target="_blank">
            <p><b>Выбрать тест:</b><br>
                
                <p><input type="radio" name="test1" value="1" > Тест 1 </p><br>
                
                <p><input type="radio" name="test2" value="2" > Тест 2</p><br>

            <p><b>Вопрос:</b>
                <br>
                <input name="text" size="40" pageEncoding=\"UTF-8">
                <br>
            <p> <input type="submit" value="Отправить">
                <input type="reset" value="Очистить"></p>
        </form>
</div>
    </body>
</html>
