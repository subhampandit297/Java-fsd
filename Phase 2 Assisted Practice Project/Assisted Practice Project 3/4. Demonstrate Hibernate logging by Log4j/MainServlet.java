package com.example.webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

@WebServlet("/main")
public class MainServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();

            // Create a sample user and save it to the database
            User user = new User();
            user.setUsername("john_doe");
            user.setEmail("john@example.com");

            session.save(user);

            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.getWriter().println("Data added to the database!");
    }
}
