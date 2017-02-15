<%-- 
    Document   : respons_jsp
    Created on : 11.02.2017, 20:42:09
    Author     : Анна
--%>

<%@page import="java.util.Enumeration"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.File"%>
<%@page import="java.io.InputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<HTML>
    <HEAD>
        <TITLE>Reading Radio Buttons</TITLE>
    </HEAD>

    <BODY>
    <center>
<h2>HTTP Header Request Example</h2>
<table width="100%" border="1" align="center">
<tr bgcolor="#949494">
<th>Param Name</th><th>Param Value(s)</th>
</tr>
<%
    
    
    
   Enumeration paramNames = request.getParameterNames();

   while(paramNames.hasMoreElements()) {
      String paramName = (String)paramNames.nextElement();
      out.print("<tr><td>" + paramName + "</td>\n");
      String paramValue = request.getHeader(paramName);
      out.println("<td> " + paramValue + "</td></tr>\n");
      
   }
%>   
  <% int j=1,k=1,temp; // Set j and k to 1.
for (int i=1; i <=10; i++) { // Iterate ten times.
%>
<tr>
<td><% out.println(i); %> </td>
<td><% temp=j; out.println(j);
j=j+k; // Set j to sum of last two numbers.
k=temp; // Set k to earlier value of j. %>
</td>
</tr>
<% } // Close the for loop here %>


</table>
</center>

    </body>
</html>

