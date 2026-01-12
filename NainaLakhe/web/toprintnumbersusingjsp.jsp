<%-- 
    Document   : toprintnumbersusingjsp
    Created on : Jan 12, 2026, 8:29:59 AM
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
            <input type="text" name="n1"/>
            <input type="text" name="n2"/>
            <input type="submit" name="submit"/>
        </form>
        <%
        String w=request.getParameter("n1");
        String x=request.getParameter("n2");
        if(w!=null && x!=null){
        int a = Integer.parseInt(w);
        int b = Integer.parseInt(x);
        
        for(int i=a; i<=b; i++){
            out.println(i);
            }
            }
        %>
    </body>
</html>
