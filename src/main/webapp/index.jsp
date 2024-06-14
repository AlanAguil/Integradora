<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form method="post" action="login">
    <label>Ingrese su nombre de usuario</label>
    <input type="text" name="user_name"><br><br>
    <label>Ingrese su constraseña</label>
    <input type="password" name="pass"><br><br>
    <%
        HttpSession sesion = request.getSession();
        String mensaje = (String) sesion.getAttribute("mensaje");

        if (mensaje != null) {
    %>
    <p style="color: red"><%=mensaje%>Mensaje</p>
    <%
        }
    %>
    <input type="submit" value="Iniciar sesion">
</form>
</body>
</html>