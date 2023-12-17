package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@SuppressWarnings("serial")
@WebServlet("/sessionDemo")
public class SessionTrackingHTTP extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the current session. If it doesn't exist, a new one will be created.
        HttpSession session = request.getSession();

        // Check if this is a new session
        boolean isNewSession = session.isNew();

        // Get the session ID
        String sessionId = session.getId();

        // Set some session attributes
        session.setAttribute("username", "JohnDoe");
        session.setAttribute("userRole", "admin");

        // Output HTML to the client
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");

        if (isNewSession) {
            response.getWriter().println("<h2>New session created with ID: " + sessionId + "</h2>");
        } else {
            response.getWriter().println("<h2>Session ID: " + sessionId + "</h2>");
            response.getWriter().println("<p>Welcome back, " + session.getAttribute("username") + "!</p>");
            response.getWriter().println("<p>Your role: " + session.getAttribute("userRole") + "</p>");
        }

        response.getWriter().println("</body></html>");
    }
}
