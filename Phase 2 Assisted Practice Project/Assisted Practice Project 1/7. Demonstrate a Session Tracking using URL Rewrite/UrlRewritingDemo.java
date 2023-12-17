package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/urlRewritingDemo")
public class UrlRewritingDemo extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the current session or create a new one if it doesn't exist
        HttpSession session = request.getSession(true);

        // Set session attribute
        Integer visitCount = (Integer) session.getAttribute("visitCount");
        if (visitCount == null) {
            visitCount = 1;
        } else {
            visitCount++;
        }
        session.setAttribute("visitCount", visitCount);

        // Create or update a cookie with the session ID
        Cookie sessionCookie = new Cookie("JSESSIONID", session.getId());
        sessionCookie.setMaxAge(30 * 60); // 30 minutes
        response.addCookie(sessionCookie);

        // Set content type
        response.setContentType("text/html");

        // Get the PrintWriter
        PrintWriter out = response.getWriter();

        // Build the response content
        out.println("<html>");
        out.println("<head><title>URL Rewriting Demo</title></head>");
        out.println("<body>");
        out.println("<h2>Session Tracking using URL Rewriting</h2>");
        out.println("<p>Session ID: " + session.getId() + "</p>");
        out.println("<p>Visit Count: " + visitCount + "</p>");
        out.println("<p><a href='" + response.encodeURL("urlRewritingDemo") + "'>Reload</a></p>");
        out.println("</body>");
        out.println("</html>");
    }
}
