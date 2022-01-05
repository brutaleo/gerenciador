<%--
  Created by IntelliJ IDEA.
  User: bruta
  Date: 05/01/2022
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro de Nova empresa</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/novaempresa" method="post">
    <label> Nome:
        <input type="text" name="nome">
    </label>
    <input type="submit">
</form>
<a href="index.jsp">voltar</a>
</body>
</html>
