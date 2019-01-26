<%-- 
    Document   : Calculadora
    Created on : Jan 25, 2019, 9:22:05 AM
    Author     : mauricio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculadora</h1>
        <h2>Que operacion deseas hacer</h2>
        <h3>1: Sumar</h3>
        <h3>2: Restar</h3>
        <h3>3: Multiplicar</h3>
        <h3>4: Dividir</h3>
        
        <form action="Resultado" method="post">
            
            <input type="text" name="operacion" required>
            <h3>Dame un numero</h3>
            <input type = "text" name ="x">
            <h3>Dame otro numero</h3>
            <input type = "text" name ="y"><br>
            
            <input type="submit" value ="Enviar">
            
        </form>
    </body>
</html>
