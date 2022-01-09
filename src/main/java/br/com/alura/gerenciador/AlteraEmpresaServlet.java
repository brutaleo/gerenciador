package br.com.alura.gerenciador;

import br.com.alura.gerenciador.modelo.Empresa;
import br.com.alura.gerenciador.modelo.db.DBMemoria;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "AlteraEmpresaServlet", value = "/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String paramId = request.getParameter("id");
        String paramNome = request.getParameter("nome");
        String paramDataCadastro = request.getParameter("data");

        Long empresaID = Long.valueOf(paramId);

        Date dataAberturaFormatada;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dataAberturaFormatada = dateFormat.parse(paramDataCadastro);
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        DBMemoria dbMemoria = new DBMemoria();
        Empresa empresa = dbMemoria.buscarEmpresaPorId(empresaID);
        empresa.setNome(paramNome);
        empresa.setDataAbertura(dataAberturaFormatada);

        response.sendRedirect("listaEmpresas");
    }
}
