package com.example.TomcatApplication;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "FavoriteThings", urlPatterns = "/FavoriteThings")
public class FavoriteThings extends HttpServlet{

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head></head><body>");
        String color = request.getParameter("color");
        String automaker = request.getParameter("automaker");
        String model = request.getParameter("model");
        out.println("<h1>Your dream car would be a:</h1>");
        out.println("<p>" + color +" " + automaker +" "+ model + "</p>");
        out.println("<p>Am I right?!?!?! or am I right?</p>");
        out.println("</body></html>");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("This resource is not available directly.");
    }

    public void destroy() {
    }

}
