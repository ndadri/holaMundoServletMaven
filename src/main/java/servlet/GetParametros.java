package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/parametros")
public class GetParametros extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //tipo de documento/archivo que me va a devolver el servlet
        resp.setContentType("text/html");

        //capturamos los valores o los parametros de la solicitud
        /* String id = req.getParameter("id");

        //convertimos el caracter definido a un caracter deseado
        int ide = Integer.parseInt(id);
        float   valor = Float.parseFloat(id);*/

        //parseo significa convertir el parametro en otro
        int id = Integer.parseInt(req.getParameter("id"));

        //creamos el objeto printwriter
        PrintWriter out = resp.getWriter();

        //escribimos la respuesta del servidor
        out.println("<!DOCTYPE html>");

        out.println("<html>");

        out.println("<head>");
        out.println("<title>Head del Servlet</title>");
        out.println("</head>");

        out.println("<body>");
        out.println("<h1>Saludos desde getParametros</h1>");
        out.println("<br>");
        out.println("<h2>El Id es: " + id + "</h2>");
        out.println("</body>");

        out.println("</html>");
    }
}
