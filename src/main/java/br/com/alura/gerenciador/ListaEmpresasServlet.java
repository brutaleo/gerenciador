package br.com.alura.gerenciador;

import br.com.alura.gerenciador.modelo.Empresa;
import br.com.alura.gerenciador.modelo.db.DBMemoria;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ListaEmpresasServlet", value = "/listaempresas")
public class ListaEmpresasServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DBMemoria dbMemoria = new DBMemoria();
        List<Empresa> lista = dbMemoria.getEmpresas();

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<ul>");
        for (Empresa empresa : lista) {
            out.println("<li>" + empresa.getNome() + "</li>");
        }
        out.println("</ul>");
        out.println("<a href= \"index.jsp\">voltar</a>");
        out.println("</body></html>");
    }

}
