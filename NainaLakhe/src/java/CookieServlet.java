

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie cookie = new Cookie("user", "Lab4User");
        cookie.setMaxAge(3600); // 1 hour
        response.addCookie(cookie);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Cookies stored:</h1>");
        Cookie[] cookies = request.getCookies();
        if(cookies != null){
            for(Cookie c : cookies)
                out.println(c.getName() + " = " + c.getValue() + "<br>");
        }
        out.println("<a href='cookieTest.html'>Go Back</a>");
    }
}
