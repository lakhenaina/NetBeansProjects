import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

// Map this servlet to the URL /AddServlet
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {

    // Handles POST requests from HTML form
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get parameters safely
        String n1 = request.getParameter("num1");
        String n2 = request.getParameter("num2");
        int num1 = 0, num2 = 0;
        String message;

        try {
            num1 = Integer.parseInt(n1);
            num2 = Integer.parseInt(n2);
            int sum = num1 + num2;
            message = "Sum of " + num1 + " and " + num2 + " is " + sum;
        } catch (NumberFormatException e) {
            message = "Invalid input! Please enter valid integers.";
        }

        // Send response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<a href='addNumbers.html'>Go Back</a>");
        out.println("</body></html>");
    }

    // Optional: handle GET requests (redirect to form)
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("addNumbers.html");
    }
}
