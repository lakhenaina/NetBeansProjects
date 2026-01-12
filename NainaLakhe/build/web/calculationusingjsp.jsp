<%-- 
    Document   : calculation
    Created on : Jan 12, 2026, 8:27:33 AM
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
        <form method="get" action="#">
            <input type ="text" name="num1"/>
            <input type ="text" name="num2"/>
            <input type ="submit" name="submit"/>
        </form>
        <%
        String w = request.getParameter("num1");
        String y = request.getParameter("num2");
        if(w!=null && y!=null){
        int a=Integer.parseInt(w);
        int b=Integer.parseInt(y);
        out.println("Addition is:"+ (a+b));
        out.println("<br>Subtraction is:"+ (a-b));
        out.println("<br>Multiplication is:" + (a*b));
        out.println("<br>Division is:" + (a/b));
            }
        %>
    </body>
</html>
