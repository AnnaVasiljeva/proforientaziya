<%-- 
    Document   : question_jsp
    Created on : 12.02.2017, 19:53:40
    Author     : Анна
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" pageEncoding="UTF-8">
        
        <title>JSP Page</title>
    </head>
    <body>
        <%
         
   request.setCharacterEncoding("UTF-8");
   
    
%>    
     <center>
<h1>Reading Checkbox Data</h1>
<ul>
<li><p><b> Flag:</b>
   <%= request.getParameter("test_1")%>
</p></li>
<li><p><b> Flag:</b>
   <%= request.getParameter("test_2")%>
</p></li>
<li><p><b> Flag:</b>
   <%= request.getParameter("text") %>
            
</p></li>
</ul>

       
 
    </body>
</html>