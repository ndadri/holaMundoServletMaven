package servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

//anotacion -> es una llave para conectarse desde cualquier parte
//de mi programa al servlet

@WebServlet("/holaServlet")
public class Servlet extends HttpServlet {
    //Usamos los metodos predefinidos para que se nos haga mas corto la implementacion, y para que nos aseguremos
    //que esta implementado de manera correcta
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //tipo de documento/archivo que me va a devolver el servlet
        resp.setContentType("text/html");
        //inicializamos el objeto PrintWriter para escribir en pantalla
        PrintWriter out = resp.getWriter();//el servidor nos responde con el metodo "getWriter

        //escribimos la respuesta del servidor
        out.println("<!DOCTYPE html>");

        out.println("<html>");

            out.println("<head>");
                out.println("<title>Head del Servlet</title>");
            out.println("</head>");

            out.println("<body>");
                out.println("<h1>Saludos desde el Servlet</h1>");
            out.println("</body>");

        out.println("</html>");
    }
}
