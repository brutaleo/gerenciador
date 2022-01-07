<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: bruta
  Date: 05/01/2022
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<c:url value="/novaempresa" var="linkServeletNovaEmpresa"/>
<html>
<head>
    <title>Cadastro de Nova empresa</title>
</head>
<body>
<form action="${linkServeletNovaEmpresa}" method="post">
    <label> Nome:
        <input type="text" name="nome">
    </label>
    <input type="submit">
</form>
<a href="index.jsp">voltar</a>
</body>
</html>
