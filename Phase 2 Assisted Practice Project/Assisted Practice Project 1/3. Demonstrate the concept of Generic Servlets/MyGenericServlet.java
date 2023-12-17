package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/MyServletServlet")
public class MyGenericServlet extends GenericServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6276895469118493259L;

	@Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        // Set the content type of the response
        response.setContentType("text/html");

        // Get a PrintWriter object to send HTML response
        PrintWriter out = response.getWriter();

        // Write the HTML response
        out.println("<html>");
        out.println("<head><title>Generic Servlet Example</title></head>");
        out.println("<body>");
        out.println("<h2>Hello from MyGenericServlet!</h2>");
        out.println("<p>This is a simple example of a Generic Servlet.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}

