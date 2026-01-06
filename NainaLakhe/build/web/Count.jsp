<%-- 
    Document   : Count
    Created on : Jan 6, 2026, 12:26:39 PM
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
        <%! int count = 0; %>
        <%
            out.println("Page has been visited"+ ++count +"times");
            %>
    </body>
</html>
