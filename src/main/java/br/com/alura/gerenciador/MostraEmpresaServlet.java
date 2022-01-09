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

@WebServlet(name = "MostraEmpresaServlet", value = "/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String paramId = request.getParameter("id");
        Long id = Long.valueOf(paramId);

        DBMemoria dbMemoria = new DBMemoria();
        Empresa empresa = dbMemoria.buscarEmpresaPorId(id);

        request.setAttribute("empresa", empresa);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/formAlteraEmpresa.jsp");
        dispatcher.forward(request, response);

    }
}
