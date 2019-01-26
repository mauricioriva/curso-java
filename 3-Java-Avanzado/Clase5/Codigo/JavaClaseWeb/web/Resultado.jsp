<%-- 
    Document   : Resultado
    Created on : Jan 25, 2019, 9:16:17 AM
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
        
        <% int opcion = Integer.parseInt(request.getParameter("operacion"));
            int x = Integer.parseInt(request.getParameter("x"));
            int y = Integer.parseInt(request.getParameter("y"));
        switch(opcion){
            case 1:
                %><h1>El resultado de la suma es: <%= x+y %></h1><%                    
                break;
            case 2:
                %><h1>El resultado de la resta es: <%= x-y %></h1><%
                break;
            case 3:
                %><h1>El resultado de la multiplicacion es: <%= x*y %></h1><%
                break;
            case 4:
                %><h1>El resultado de la division es: <%= x/y %></h1><%
                break;
        }       
        %>
        
    </body>
</html>
