<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String username = request.getParameter("username");

    if (username != null && !username.isEmpty()) {
        // Set username in session
        session.setAttribute("username", username);
        response.sendRedirect("index.jsp");
    } else {
        // Invalid username, redirect back to index.jsp
        response.sendRedirect("index.jsp");
    }
%>
