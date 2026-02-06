

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ReverseServlet")
public class ReverseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int num = Integer.parseInt(request.getParameter("num"));
        int reversed = 0, temp = num;
        while(temp != 0){
            reversed = reversed*10 + temp%10;
            temp /= 10;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Reversed Number: " + reversed + "</h1>");
        out.println("<a href='reverseNumber.html'>Go Back</a>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("reverseNumber.html");
    }
}
