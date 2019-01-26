<%-- 
    Document   : PaginaUsuario
    Created on : Jan 25, 2019, 11:21:11 AM
    Author     : mauricio
--%>

<%@page import="WEB.Registro"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="WEB.Usuario"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario</title>
    </head>
    <body>
        <h1>Bienvenido</h1>
        <%
            for(Usuario u : Registro.lista){
                %>
                <h2>Nombre: <%=u.getNombre()%></h2>
                <%
            }
        
        %>
    </body>
</html>
