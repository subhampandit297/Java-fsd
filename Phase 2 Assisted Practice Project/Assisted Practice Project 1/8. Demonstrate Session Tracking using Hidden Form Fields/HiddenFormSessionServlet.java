package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("serial")
@WebServlet("/hiddenFormSession")
public class HiddenFormSessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the current session or create a new one if it doesn't exist
        HttpSession session = request.getSession(true);

        // Set the session attribute (a counter in this case)
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = 1;
        } else {
            counter++;
        }
        session.setAttribute("counter", counter);

        // Set the content type of the response
        response.setContentType("text/html");

        // Create a PrintWriter to write the HTML response
        PrintWriter out = response.getWriter();

        // Write the HTML content
        out.println("<html><head><title>Hidden Form Session Tracking</title></head><body>");
        out.println("<h2>Session Information</h2>");
        out.println("<p>Session ID: " + session.getId() + "</p>");
        out.println("<p>Page Visits: " + counter + "</p>");

        // Create a hidden form field with the session ID
        out.println("<form action=\"hiddenFormSession\" method=\"post\">");
        out.println("<input type=\"hidden\" name=\"sessionID\" value=\"" + session.getId() + "\">");
        out.println("<input type=\"submit\" value=\"Refresh\">");
        out.println("</form>");

        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle the form submission (if needed)
        // For simplicity, we are just redirecting to the doGet method
        doGet(request, response);
    }
}
