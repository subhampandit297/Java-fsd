package com;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SessionTrackingCookies")
public class SessionTrackingCookies extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the current session ID from the request
        String sessionID = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("sessionID")) {
                    sessionID = cookie.getValue();
                    break;
                }
            }
        }

        // If the session ID is not present, generate a new one
        if (sessionID == null) {
            sessionID = "SessionID_" + System.currentTimeMillis();

            // Create a new cookie and set the session ID
            Cookie sessionCookie = new Cookie("sessionID", sessionID);
            sessionCookie.setMaxAge(30 * 60); // Set the cookie's max age to 30 minutes
            response.addCookie(sessionCookie);
        }

        // Set response content type
        response.setContentType("text/html");

        // Create a PrintWriter for writing the HTML response
        PrintWriter out = response.getWriter();

        // HTML content
        out.println("<html><head><title>Session Tracking using Cookies</title></head><body>");
        out.println("<h2>Session ID: " + sessionID + "</h2>");
        out.println("<p>This session is being tracked using cookies.</p>");
        out.println("</body></html>");

        // Close the PrintWriter
        out.close();
    }
}


