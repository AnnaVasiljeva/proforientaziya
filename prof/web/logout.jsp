<%-- 
    Document   : logout
    Created on : 13.02.2017, 23:51:03
    Author     : Анна
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
session.setAttribute("userid", null);
session.invalidate();
response.sendRedirect("registraziy_jsp.jsp");
%>
