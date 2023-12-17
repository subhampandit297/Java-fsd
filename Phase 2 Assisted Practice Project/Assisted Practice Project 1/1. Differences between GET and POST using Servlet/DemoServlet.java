package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;



import java.io.PrintWriter;



@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response, "GET");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response, "POST");
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response, String method)
            throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet GET vs POST Demo</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>HTTP " + method + " Request</h1>");

        // Displaying parameters received in both GET and POST requests
        out.println("<h2>Parameters:</h2>");
        out.println("<ul>");
        for (String paramName : request.getParameterMap().keySet()) {
            out.println("<li>" + paramName + ": " + request.getParameter(paramName) + "</li>");
        }
        out.println("</ul>");

        out.println("</body>");
        out.println("</html>");
    }
}

