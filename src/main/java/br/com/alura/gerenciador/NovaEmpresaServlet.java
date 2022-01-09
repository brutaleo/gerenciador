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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "NovaEmpresaServlet", value = "/novaempresa")
public class NovaEmpresaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nomeDaEmpresa = request.getParameter("nome");
        String dataCadastroDaEmpresa = request.getParameter("data");

        Date dataAberturaFormatada;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dataAberturaFormatada = dateFormat.parse(dataCadastroDaEmpresa);
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        Empresa empresa = new Empresa(nomeDaEmpresa, dataAberturaFormatada);
        DBMemoria dbMemoria = new DBMemoria();
        dbMemoria.adiciona(empresa);

        request.setAttribute("empresa", empresa.getNome());
        response.sendRedirect("listaEmpresas");



    }

}
