<%-- 
    Document   : factorialusingjsp
    Created on : Jan 12, 2026, 8:30:47 AM
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
            <input type="text" name="num"/>
            <input type="submit" name="submit"/>
        </form>
        <%
        String w = request.getParameter("num");
        if(w!=null){
        int a = Integer.parseInt(w);
        int fact = 1;
        for(int i=1; i<=a; i++){
        fact=fact*i;
            }
            out.println("Factoiral is:" + (fact));
            }
        %>
    </body>
</html>
