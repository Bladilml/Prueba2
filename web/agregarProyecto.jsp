<%-- 
    Document   : agregarProyecto
    Created on : 06-11-2017, 18:07:27
    Author     : Bladi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crear Proyecto</title>
    </head>
    <body>
        <form action="mostrar.do" method="POST">
            <table border="1">
                <tbody>
                    <tr>
                        <td>Nombre del proyecto</td>
                        <td><input type="text" name="nombre" placeholder="Ingrese nombre del proyecto" /><br></td>
                    </tr>
                    <tr>
                        <td>Descripcion</td>
                        <td><input type="text" name="descripcion" value="" /><br></td>
                    </tr>
                    <tr>
                        <td>Region</td>
                        <td>
                        <select name="region" id="region" onchange="buscarProvincia(this.value);">
                            <option value="" selected>Seleccione</option>
                        <c:forEach var="region" items="${listaRegiones}">
                            <option value="${region.regionId}">${region.regionNombre} (${region.regionOrdinal})</option>
                        </c:forEach>
                        </select><br/>
                        </td>
                    </tr>
                     <tr>
                        <td>Provincia</td>
                        <td>
                            <select name="provincia" id="provincia" onchange="buscarComuna(this.value);">
                                <option value="" selected>Seleccione</option>
                            </select><br/>
                        </td>
                    </tr>
                     <tr>
                        <td>Comuna</td>
                        <td>
                            <select name="comuna" id="comuna">
                                <option value="" selected>Seleccione</option>
                            </select><br/>
                        </td>
                    </tr>
                    <tr>
                        <td>Fecha de inicio</td>
                        <td><input type="date" name="fechaInicio"/></td>
                    </tr>
                    <tr>
                        <td>Estado</td>
                        <td>
                            <select>
                                <option value="">Seleccione...</option>
                                <option value="aprobado">Aprobado</option>
                                <option value="encurso">En curso</option>
                                <option value="finalzizado">Finalizado</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>Presupuesto Inicial</td>
                        <td><input type="text" name="presupuestoIni" value="" /><br></td>
                    </tr>
                    <tr>
                        <td>Presupuesto Gastado</td>
                        <td><input type="text" name="presupuestoGast" value="" /><br></td>
                    </tr>
                </tbody>
            </table>            
            <input type="button" onclick="location.href='mostrarProyecto.jsp'" value="Crear Proyecto" />
            
        </form>
    </body>
</html>
