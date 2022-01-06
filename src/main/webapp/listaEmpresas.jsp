<%@ page import="java.util.List" %>
<%@ page import="br.com.alura.gerenciador.modelo.Empresa" %><%--
  Created by IntelliJ IDEA.
  User: bruta
  Date: 06/01/2022
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Lista de Empresas:</h1>
<br>
<ul>
    <%
        List<Empresa> lista = (List<Empresa>) request.getAttribute("empresas");
        for (Empresa empresa : lista) {
    %>
    <li><%= empresa.getNome() %>
    </li>
    <%
        }
    %>
</ul>
<a href="index.jsp">voltar</a>

</body>
</html>
