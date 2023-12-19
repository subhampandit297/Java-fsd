<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Session Handling in JSP</title>
</head>
<body>
    <h1>Session Handling in JSP</h1>

    <%-- Check if the user is already logged in --%>
    <% if (session.getAttribute("username") != null) { %>
        <p>Welcome, <%= session.getAttribute("username") %>! (<a href="logout.jsp">Logout</a>)</p>
    <% } else { %>
        <form action="login.jsp" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
            <input type="submit" value="Login">
        </form>
    <% } %>
</body>
</html>
