
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

    <h2>Welcome Page</h2>

    <% 
        String username = (String) session.getAttribute("username");
        if (username != null) {
    %>
        <p>Welcome, <%= username %>!</p>
        <form action="logout" method="get">
            <button type="submit">Logout</button>
        </form>
    <%
        } else {
            response.sendRedirect("login.jsp");
        }
    %>

</body>
</html>
