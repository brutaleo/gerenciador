package br.com.alura.gerenciador;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/oi")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "I'm alive!";
    }
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<a href= \"index.jsp\">voltar</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
