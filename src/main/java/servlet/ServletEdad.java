package servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/formulario")
public class ServletEdad extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //capturamos los valores o los parametros de la solicitud
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String direccion = req.getParameter("direccion");
        int cedula = Integer.parseInt(req.getParameter("cedula"));
        int fechaNacimiento = Integer.parseInt(req.getParameter("fechaNacimiento"));



        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();//el servidor nos responde con el metodo "getWriter

        out.println("<!DOCTYPE html>");

        out.println("<html>");

        out.println("<head>");
        out.println("<title>Calculadora de edades super pro uwu</title>");
        out.println("</head>");

        out.println("<body>");
        out.println("<h1>Nombre:" + nombre +"</h1>");
        out.println("<h1>Apellido:" + apellido +"</h1>");
        out.println("<h1>Direccion:" + direccion +"</h1>");
        out.println("<h1>Cedula:" + cedula +"</h1>");

        out.println("<br>");
        out.println("</body>");

        out.println("</html>");
    }
}
