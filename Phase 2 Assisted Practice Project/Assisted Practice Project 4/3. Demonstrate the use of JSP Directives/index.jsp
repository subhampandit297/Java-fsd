<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Directives Example</title>
</head>
<body>
    <h1>JSP Directives Example</h1>
    
    <%-- This is a JSP comment --%>
    
    <%-- Setting a variable using page directive --%>
    <%@ page import="java.util.Date" %>
    <%@ page import="java.text.SimpleDateFormat" %>
    
    <%-- Using the variable in the JSP page --%>
    <%
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format(currentDate);
    %>
    
    <p>Current Date and Time: <%= formattedDate %></p>

    <%-- Including another JSP file using include directive --%>
    <%@ include file="included.jsp" %>

</body>
</html>
