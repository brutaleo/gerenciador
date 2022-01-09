package br.com.alura.gerenciador;

import br.com.alura.gerenciador.modelo.db.DBMemoria;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "removeEmpresaServlet", value = "/removeEmpresa")
public class removeEmpresaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String paramId = request.getParameter("id");
        Long id = Long.valueOf(paramId);

        DBMemoria dbMemoria = new DBMemoria();
        dbMemoria.removeEmpresaUtilizandoIterator(id);

        response.sendRedirect("listaEmpresas");
    }

}
