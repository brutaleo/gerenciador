package br.com.alura.gerenciador;

import br.com.alura.gerenciador.modelo.Empresa;
import br.com.alura.gerenciador.modelo.db.DBMemoria;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListaEmpresasServlet", value = "/listaempresas")
public class ListaEmpresasServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DBMemoria dbMemoria = new DBMemoria();
        List<Empresa> lista = dbMemoria.getEmpresas();

        request.setAttribute("empresas", lista);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/listaEmpresas.jsp");
        dispatcher.forward(request, response);
    }

}
