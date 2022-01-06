<%--
  Created by IntelliJ IDEA.
  User: bruta
  Date: 06/01/2022
  Time: 09:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>

<% String nomeEmpresa = (String) request.getAttribute("empresa");%>

<html>
<head>
    <title>Nova Empresa Criada</title>
</head>
<body>
<h1>Empresa <%=nomeEmpresa%> cadastrada com sucesso!</h1>
<a href="formNovaEmpresa.jsp">Cadastrar nova</a>
<br>
<a href="listaempresas">Listar Empresas cadastradas</a>
<br>
<a href="index.jsp">voltar</a>
</body>
</html>


