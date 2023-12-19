
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Implicit Objects Demo</title>
</head>
<body>

<h1>JSP Implicit Objects Demo</h1>

<%
    // Implicit Object: request
    String name = (String) request.getAttribute("name");
    
    // Implicit Object: response
    response.setContentType("text/html;charset=UTF-8");
    
    // Implicit Object: out
    out.println("<p>Hello, " + name + "!</p>");
    
    // Implicit Object: session
    session.setAttribute("user", name);
%>

<p>Session Attribute 'user': <%= session.getAttribute("user") %></p>

</body>
</html>
