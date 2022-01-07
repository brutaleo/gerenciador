<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: bruta
  Date: 06/01/2022
  Time: 09:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>Nova Empresa Criada</title>
</head>
<body>
<c:if test="${not empty empresa}">
    <h1>Empresa ${ empresa } cadastrada com sucesso!</h1>
</c:if>

<c:if test="${empty empresa}">
    <h1>Nenhuma Empresa cadastrada!</h1>
</c:if>

<a href="formNovaEmpresa.jsp">Cadastrar nova</a>
<br>
<a href="listaempresas">Listar Empresas cadastradas</a>
<br>
<a href="index.jsp">voltar</a>
</body>
</html>


