package br.com.alura.gerenciador;

import br.com.alura.gerenciador.modelo.Empresa;
import br.com.alura.gerenciador.modelo.db.DBMemoria;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "NovaEmpresaServlet", value = "/novaempresa")
public class NovaEmpresaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nomeDaEmpresa = request.getParameter("nome");

        Empresa empresa = new Empresa(nomeDaEmpresa);
        DBMemoria dbMemoria = new DBMemoria();
        dbMemoria.adiciona(empresa);

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1> Envio de parâmetros via url. Ex.: ?nome=</h1><br>");
        if (!nomeDaEmpresa.isEmpty()) {
            out.println("<h1> Empresa " + nomeDaEmpresa + " cadastrada com sucesso!!</h1>");
        }
        out.println("<a href= \"formNovaEmpresa.jsp\">cadastrar nova</a><br>");
        out.println("<a href= \"listaempresas\">Listar Empresas cadastradas</a><br>");
        out.println("<a href= \"index.jsp\">voltar</a>");

        out.println("</body></html>");
    }

}
