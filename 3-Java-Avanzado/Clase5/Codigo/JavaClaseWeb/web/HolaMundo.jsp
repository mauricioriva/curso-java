<%-- 
    Document   : HolaMundo
    Created on : Jan 25, 2019, 8:54:56 AM
    Author     : mauricio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.Random" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <% System.out.println("Hola Mundo"); 
            Random rd = new Random();
        
        %>
        <% for(int i = 0; i < 10; i++){%>
        <h3>Hola Mundo</h3>
        <%}%>
        
        <h2><%= rd.nextInt(10) %></h2>
        
        <h2>Hagamos una multiplicacion</h2>
        
        <form action="Resultado.jsp" method="post">
            
            <h3>Dame un numero</h3>
            <input type = "text" name ="x">
            <h3>Dame otro numero</h3>
            <input type = "text" name ="y"><br>
            
            <input type="submit" value ="Enviar">
            
        </form>
        
    </body>
</html>
