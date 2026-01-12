<%-- 
    Document   : oddandevenusingjsp
    Created on : Jan 12, 2026, 8:28:42 AM
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
        <form method="get" action="#" >
            <input type="text" name="num"/>
            <input type="submit" name="submit"/>
        </form>
        <%
        String n = request.getParameter("num");
        if(n!=null){
        int a = Integer.parseInt(n);
        if(a%2==0){
        out.println("even");
            }
            else{
            out.println("odd");
            }
            }
        %>
    </body>
</html>
