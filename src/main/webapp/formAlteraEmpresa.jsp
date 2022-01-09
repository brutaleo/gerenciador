<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: bruta
  Date: 05/01/2022
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<c:url value="/alteraEmpresa" var="linkServeletAlteraEmpresa"/>
<html>
<head>
    <title>Editar Empresa</title>
</head>
<body>
<form action="${linkServeletAlteraEmpresa}" method="post">
    <input type="hidden" name="id" value="${empresa.id}">
    <label> Nome:
        <input type="text" name="nome" value="${empresa.nome}">
    </label>
    <label> Data de Abertura:
        <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}"
                                                                pattern="dd/MM/yyyy"/>"
               placeholder="Formato dd/mm/aaaa">
    </label>
    <input type="submit">
</form>
<a href="listaEmpresas">voltar</a>
</body>
</html>
