<%-- 
    Document   : success
    Created on : 13.02.2017, 23:50:15
    Author     : Анна
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if ((session.getAttribute("userid") == null) || (session.getAttribute("userid") == "")) {
%>
You are not logged in<br/>
<a href="registraziy_jsp.jsp">Please Login</a>
<%} else {
%>
Welcome <%=session.getAttribute("userid")%>
<a href='logout.jsp'>Log out</a>
<%
    }
%>