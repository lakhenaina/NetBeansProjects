

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/FactorialServlet")
public class FactorialServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int num = Integer.parseInt(request.getParameter("num"));
        long fact = 1;
        for(int i=1;i<=num;i++) fact *= i;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Factorial of " + num + " is " + fact + "</h1>");
        out.println("<a href='factorial.html'>Go Back</a>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("factorial.html");
    }
}
