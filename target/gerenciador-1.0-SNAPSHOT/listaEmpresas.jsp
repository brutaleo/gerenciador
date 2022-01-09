<%--
  Created by IntelliJ IDEA.
  User: bruta
  Date: 06/01/2022
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" %>


<html>
<head>
    <title>Lista de Empresas</title>
</head>
<body>
<c:if test="${not empty empresa}">
    <h1>Empresa ${ empresa } cadastrada com sucesso!</h1><br>
</c:if>

<h1>Lista de Empresas:</h1>
<br>
<ul>
    <c:forEach items="${empresas}" var="empresa">
        <li>${empresa.nome} - data de abertura: <fmt:formatDate value="${empresa.dataAbertura}"
                                                                pattern="dd/MM/yyyy"/></li>
    </c:forEach>
</ul>
<br>

<a href="index.jsp">voltar</a>

</body>
</html>
