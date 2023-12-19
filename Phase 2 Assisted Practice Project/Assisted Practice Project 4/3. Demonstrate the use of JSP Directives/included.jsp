<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Random" %>

<%
    // Using the included file to generate a random number
    Random random = new Random();
    int randomNumber = random.nextInt(100);
%>

<p>Random Number from Included File: <%= randomNumber %></p>
