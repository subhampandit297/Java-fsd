<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

    <h2>Login Page</h2>

    <% if(request.getParameter("error") != null && request.getParameter("error").equals("1")) { %>
        <p style="color: red;">Invalid username or password. Please try again.</p>
    <% } %>

    <form action="login" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
        <br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <br>
        <button type="submit">Login</button>
        
    </form>

</body>
</html>
