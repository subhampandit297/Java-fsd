<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    // Invalidate the session to logout the user
    session.invalidate();
    response.sendRedirect("index.jsp");
%>
