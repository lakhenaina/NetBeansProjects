<%-- 
    Document   : emp
    Created on : Jan 12, 2026, 9:01:31 AM
    Author     : Naina Lakhe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="emp" class="com.example.Employee"/>
        <jsp:setProperty name="emp" property="name" value="Ram"/>
        <jsp:setProperty name="emp" property="post" value="Manager"/>
        <jsp:setProperty name="emp" property="salary" value="25000"/>
        <jsp:getProperty name="emp" property="name"/>
        <jsp:getProperty name="emp" property="post"/>
        <jsp:getProperty name="emp" property="salary"/>
        
    </body>
</html>
