<%-- 
    Document   : index
    Created on : 31.01.2017, 20:04:29
    Author     : sf2015
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
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
            <li><a href="html_form.html">Форма</a></li>
            <li><a href="#">Тесты</a>
                <ul>
                    <li><a href="#">Холланда</a></li>
                    <li><a href="#">Климова</a></li>
                </ul>
            </li>
            <li><a href="#"> Библиотека профессий </a></li>

            <li> <a onclick="document.getElementById('id01').style.display = 'block'" style="width:auto; padding: 20px; "> Регистрация </a></li>
            <div id="id01" class="modal">

                <form class="modal-content animate" action="ReadParams">
                    <div class="imgcontainer">
                        <span onclick="document.getElementById('id01').style.display = 'none'" class="close" title="Close Modal">&times;</span>
                        <img src="group.png" alt="Avatar" class="avatar">
                    </div>

                    <div class="container">
                        <label><b>Username</b></label>
                        <input type="text" placeholder="Enter Username" name="uname" required>

                        <label><b>Password</b></label>
                        <input type="password" placeholder="Enter Password" name="psw" required>

                        <button type="submit">Login</button>
                        <input type="checkbox" checked="checked"> Remember me
                    </div>

                    <div class="container" style="background-color:#f1f1f1">
                        <button type="button" onclick="document.getElementById('id01').style.display = 'none'" class="cancelbtn">Cancel</button>
                        <span class="psw">Forgot <a href="#">password?</a></span>
                    </div>
                </form>
            </div>
            <script>
                // Get the modal
                var modal = document.getElementById('id01');

                // When the user clicks anywhere outside of the modal, close it
                window.onclick = function (event) {
                    if (event.target === modal) {
                        modal.style.display = "none";
                    }
                };
            </script>

        </ul>
        <br><br>

    <br> <center><h2>Тест Холланда на определение профессионального типа личности <br>
            <p>Из каждой пары профессий выберите одну, наиболее привлекательную для вас.</p></h1></center>

                    <br>

<form action="ReadParams" method="POST" target="_blank"> 
    
    <script>
        
        
    </script>
         
                        <center><table border="1">

                                <tr>
                                    <th>№</th>
                               <th colspan="2">Ответ "A"</th>

                                 <th colspan="2">Ответ "Б"</th>
                                </tr>
                                 <tr><td>1</td><td><abbr title="рабочий, выполняющий ремонт и техническое обслуживание">
                                                Автомеханик<br></abbr></td><td>
                                           <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="1" name="option1" value="a1" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="1" name="option1" value="b1" onclick="this.form.checked();"></form>
                            </td><td>Физиотерапевт<br></td></tr>


<form action="ReadParams" method="POST" target="_blank">
                        <tr><td>2</td><td><abbr title="">
                                        Специалист по защите информации</abbr></td><td>                                              
                                      
                    <input type="radio" id="2" name="option1" value="a2" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b2" onclick="this.form.checked();"></form></td><td>Логистик</td></tr>


                               <tr> <td>3</td> <td> Оператор связи </td> <td>


                                                         <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a3" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b3" onclick="this.form.checked();"></form>
                                        </td><td>Кинооператор</td></tr> 


                        <tr><td>4</td><td>Водитель</td><td>
                                  <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a4" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b4" onclick="this.form.checked();"></form>
                                                   
                    </td><td>Продавец</td></tr>


                            
                        <tr><td>5</td><td><lable for=""> Инженер-конструктор</lable></td><td>
    <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a5" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b5" onclick="this.form.checked();"></form>
</td><td>Менеджер по продажам</td></tr>

                          <tr><td>6</td><td><lable for="">Диспетчер</lable></td><td>
                 <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id=""    name="option1" value="a6" onclick="this.form.check();">
            </td><td> 
                    <input type="radio" id="" name="option1" value="b6"onclick="this.form.check();"></form>
            </td><td>Дизайнер компьютерных программ</td></tr>

        <tr><td>7</td><td>Ветеринар</td><td><form>
                    <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a7" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b7" onclick="this.form.checked();"></form>
            </td><td>Эколог</td></tr>

        <tr><td>8</td><td>Биолог-исследователь</td><td><form>
                      <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a8" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b8" onclick="this.form.checked();"></form>
            </td><td>Фермер</td></tr>
        <tr><td>9</td><td>Лаборант</td><td>
                    <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a9" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b9" onclick="this.form.checked();"></form>
    </td><td>Дрессировщик</td></tr>
<tr><td>10</td><td>Агроном</td><td>
         <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a10" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b10" onclick="this.form.checked();"></form>
    </td><td>Санитарный врач</td></tr>
<tr><td>11</td><td>Селекционер</td><td>
        <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a11" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b11" onclick="this.form.checked();"></form>
    </td><td>Заготовитель сельхозпродуктов</td></tr>
<tr><td>12</td><td>Массажист</td><td>
         <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option12" value="a1" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b12" onclick="this.form.checked();"></form>
    </td><td>Воспитатель</td></tr>
<tr><td>13</td><td>Преподаватель</td><td>
         <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option13" value="a1" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b13" onclick="this.form.checked();"></form>
    </td><td>Предприниматель</td></tr>
<tr><td>14</td><td>Администратор</td><td>
          <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option14" value="a1" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b14" onclick="this.form.checked();"></form>
    </td><td>Режиссер театра и кино</td></tr>
<tr><td>15</td><td>Официант </td><td>
         <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a15" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option15" value="b1" onclick="this.form.checked();"></form>
    </td><td>Врач</td></tr>
<tr><td>16</td><td>Психолог</td><td>
         <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a16" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b16" onclick="this.form.checked();"></form>
    </td><td>Торговый агент</td></tr>
<tr><td>17</td><td>Страховой агент</td><td>
          <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a17" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b17" onclick="this.form.checked();"></form>
    </td><td>Хореограф</td></tr>
<tr><td>18</td><td>Ювелир-гравер</td><td>
          <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option18" value="a1" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b18" onclick="this.form.checked();"></form>
    </td><td>Журналист</td></tr>
<tr><td>19</td><td>Искусствовед</td><td>
          <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a19" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b19" onclick="this.form.checked();"></form>
    </td><td>Продюсер</td></tr>
<tr><td>20</td><td>Редактор</td><td>
          <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a20" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b20" onclick="this.form.checked();"></form>
    </td><td>Музыкант</td></tr>
<tr><td>21</td><td>Дизайнер интерьера</td><td>
          <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a21" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b21" onclick="this.form.checked();"></form>
    </td><td>Экскурсовод</td></tr>
<tr><td>22</td><td>Композитор</td><td>
         <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a22" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b22" onclick="this.form.checked();"></form>
    </td><td>Арт-директор</td></tr>
<tr><td>23</td><td>Музейный работник</td><td>
          <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a23" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b23" onclick="this.form.checked();"></form>
    </td><td>Актер театра и кино</td></tr>
<tr><td>24</td><td>Верстальщик</td><td>
          <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a24" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b24" onclick="this.form.checked();"></form>
    </td><td>Гид-переводчик</td></tr>
<tr><td>25</td><td>Лингвист</td><td>
        <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a25" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b25" onclick="this.form.checked();"></form>
    </td><td>Антикризисный управляющий</td></tr>
<tr><td>26</td><td>Корректор</td><td>
         <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a26" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b26" onclick="this.form.checked();"></form>
    </td><td>Художественный редактор</td></tr>
<tr><td>27</td><td>Наборщик текстов</td><td>
         <form action="ReadParams" method="POST" target="_blank">
                    <input type="radio" id="" name="option1" value="a27" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b27" onclick="this.form.checked();"></form>
    </td><td>Юрисконсульт</td></tr>

 <form action="ReadParams" method="POST" target="_blank">
<tr><td>28</td><td>Программист</td><td>
                            <input type="radio" id="" name="option1" value="a28" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b28" onclick="this.form.checked();"></form>
    </td><td>Брокер</td></tr>


 <form action="ReadParams" method="POST" target="_blank">
<tr><td>29</td><td>Бухгалтер</td><td>
                           <input type="radio" id="" name="option1" value="a29" onclick="this.form.checked();">
                        </td><td>
<input type="radio" id="" name="option1" value="b29" onclick="this.form.checked();"></form>
    </td><td>Литературный переводчик</td></tr>
</table> <br>
<p><input type="submit" value="Отправить" ><font style="margin-right: 10%;padding:2em"> 
   <input type="button" value="Следующий тест"onclick="location.href='progress_jsp.jsp'" /><font style="margin-left: -10%;padding:-2em"></p><br></form>  
</body>
</html>
