package com;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // In a real application, you would validate the username and password
        // against a database or some authentication mechanism.
        boolean isValidUser = authenticateUser(username, password);

        if (isValidUser) {
            // Create a session and store user information
            HttpSession session = request.getSession(true);
            session.setAttribute("username", username);

            response.sendRedirect("welcome.jsp"); // Redirect to welcome page
        } else {
            response.sendRedirect("login.jsp?error=1"); // Redirect to login page with error parameter
        }
    }

    private boolean authenticateUser(String username, String password) {
        // In a real application, implement your authentication logic here
        // For simplicity, let's assume a hardcoded username and password
        return "user".equals(username) && "password".equals(password);
    }
}
