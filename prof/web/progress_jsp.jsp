<%-- 
    Document   : progress_jsp
    Created on : 04.02.2017, 23:52:31
    Author     : Анна
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="js/jquery.easing.min.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Progressbar</title>
    </head>
    <body>
 <style>
body {font-family: "Lato", sans-serif;}

ul.tab {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    border: 1px solid #ccc;
    background-color: #f1f1f1;
}

/* Float the list items side by side */
ul.tab li {float: left;}

/* Style the links inside the list items */
ul.tab li a {
    display: inline-block;
    color: black;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    transition: 0.3s;
    font-size: 17px;
}

/* Change background color of links on hover */
ul.tab li a:hover {
    background-color: #ddd;
}

/* Create an active/current tablink class */
ul.tab li a:focus, .active {
    background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
    display: none;
    padding: 6px 12px;
    border: 1px solid #ccc;
    border-top: none;
}

.topright {
 float: right;
 cursor: pointer;
 font-size: 20px;
}

.topright:hover {color: red;}
</style>
<body>

<p>Предлагаемый тест состоит из 105 вопросов, на каждой из которых предлагается три варианта ответа. 
    При ответе на вопросы в процессе работы нужно придерживаться следующих правил:
    не терять времени на обдумывание, а давать пришедший в голову ответ; не давать неопределенных ответов;
    не пропускать вопросов; быть искренним.</p>
<br>

<ul class="tab">
  <li><a href="javascript:void(0)" class="tablinks" onclick="openCity(event, '1')" id="defaultOpen">1</a></li>
  <li><a href="javascript:void(0)" class="tablinks" onclick="openCity(event, '2')">2</a></li>
  <li><a href="javascript:void(0)" class="tablinks" onclick="openCity(event, '3')">3</a></li>
</ul>

<div id="1" class="tabcontent">
  <span onclick="this.parentElement.style.display='none'" class="topright">x</span>
  <h3>Я думаю, что моя память сейчас лучше, чем раньше:</h3>
  <input type="radio" name="gender" value="other"> Да<br>
  <input type="radio" name="gender" value="other"> Трудно сказать<br>
  <input type="radio" name="gender" value="other"> Нет
  <br>
</div>

<div id="2" class="tabcontent">
  <span onclick="this.parentElement.style.display='none'" class="topright">x</span>
  <h3>Я мог бы счастливо жить один, вдалеке от людей, как отшельник:</h3>
  <input type="radio" name="gender" value="other">Да <br>
  <input type="radio" name="gender" value="other">Иногда <br>
  <input type="radio" name="gender" value="other">Нет <br>
</div>

<div id="3" class="tabcontent">
  <span onclick="this.parentElement.style.display='none'" class="topright">x</span>
  <h3>Если бы я говорил, что небо «находится снизу» и что зимой «жарко», я должен был бы назвать преступника:</h3>
  <input type="radio" name="gender" value="other">Гангстером <br>
  <input type="radio" name="gender" value="other">Святым <br>
  <input type="radio" name="gender" value="other">Тучей <br>
</div>


<script>
function openCity(evt, cityName) {
    var i, tabcontent, tablinks;
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }
    tablinks = document.getElementsByClassName("tablinks");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
    }
    document.getElementById(cityName).style.display = "block";
    evt.currentTarget.className += " active";
}

// Get the element with id="defaultOpen" and click on it
document.getElementById("defaultOpen").click();
</script>
     
    </body>
</html>

