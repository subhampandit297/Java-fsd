<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Action Tags Example</title>
</head>
<body>

    <!-- Use of jsp:include to include another JSP page -->
    <jsp:include page="header.jsp" />

    <h2>Welcome to JSP Action Tags Example!</h2>

    <!-- Use of jsp:useBean to create a JavaBean -->
    <jsp:useBean id="user" class="com.User" scope="request" />

    <!-- Use of jsp:setProperty to set properties of the JavaBean -->
    <jsp:setProperty name="user" property="firstName" value="John" />
    <jsp:setProperty name="user" property="lastName" value="Doe" />

    <!-- Use of jsp:getProperty to retrieve and display JavaBean properties -->
    <p>Name: <jsp:getProperty name="user" property="fullName" /></p>

    <!-- Use of jsp:forward to forward the request to another JSP page -->
    <jsp:forward page="footer.jsp" />

</body>
</html>
