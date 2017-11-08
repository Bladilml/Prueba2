<%-- 
    Document   : index
    Created on : 06-11-2017, 18:06:40
    Author     : Bladi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido a MTT</title>
    </head>
    <body>
        <form action="login.do" method="POST">
            Usuario:<br>
            <input type="text" name="username">
            <br>
            Contraseña:<br>
            <input type="text" name="password">
            <br><br>
            <input type="submit" value="Iniciar">
            <a href="registroUsuario.jsp">Si quieres registrarte, tocame :D</a>
        </form> 
    </body>
</html>
