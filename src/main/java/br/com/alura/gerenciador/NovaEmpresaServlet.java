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

@WebServlet(name = "NovaEmpresaServlet", value = "/novaempresa")
public class NovaEmpresaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nomeDaEmpresa = request.getParameter("nome");

        Empresa empresa = new Empresa(nomeDaEmpresa);
        DBMemoria dbMemoria = new DBMemoria();
        dbMemoria.adiciona(empresa);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
        request.setAttribute("empresa", empresa.getNome());
        dispatcher.forward(request, response);

    }

}
