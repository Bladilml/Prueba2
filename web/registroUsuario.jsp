<%-- 
    Document   : registroUsuario
    Created on : 06-11-2017, 18:07:08
    Author     : Bladi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registor</title>
    </head>
    <body>
        <h1>Registro de usuarios</h1>
        <form action="#">
            Usuario:<br>
            <input type="text" name="username" >
            <br>
            Contraseña:<br>
            <input type="text" name="password" >
            <br>
            Perfil:<br>
            <input type="text" name="perfil" value="normal">
            <br><br>
            <input type="submit" value="Submit">
            <input type="button" onclick="location.href='index.jsp';" value="Cancelar" />
        </form> 
    </body>
</html>
