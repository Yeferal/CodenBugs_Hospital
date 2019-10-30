

<%@page import="com.hospital.conexiones.Conexion"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hospital</title>
        
    </head>
    <body>
        <%
        Conexion conect = new Conexion();
        
        %>
        <c:if test="${requestScope['error'] != null}">
            <script type="text/javascript">
                alert("Contraseña o Usuario INCORRECTOS");
            </script>
        </c:if>
        <%conect.conectar();%>
        <div class="login-box">
            <h1>Inicio</h1>
            <form action="LoginSesion" method="POST">
                <!-- USERNAME INPUT -->
                <label for="username">CUI</label>
                <input type="text" name="nombre" placeholder="Ingresar Nombre" required>
                <!-- PASSWORD INPUT -->
                <label for="password">Codigo</label>
                <input type="password" name="passwrd" placeholder="Ingresar Constraseña" required>
                <input type="submit" value="Ingresar">
                
            </form>
        </div>
    </body>
</html>
