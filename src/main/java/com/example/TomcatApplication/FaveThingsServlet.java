package com.example.TomcatApplication;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FaveThingsServlet", value = "/FaveThingsServlet")
public class FaveThingsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("This resource is not available directly.");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head></head><body>");
        String color = request.getParameter("color");
        String automaker = request.getParameter("automaker");
        String model = request.getParameter("model");
        out.println("<h1>Your dream car would be a(n):</h1>");
        out.println("<p>" + color +" " + automaker +" "+ model + "</p>");
        out.println("<p>Am I right?!?!?! or am I right?</p>");
        out.println("</body></html>");
    }
}
