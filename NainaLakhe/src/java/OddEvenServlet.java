//create a servlet that reads a numbers from HTML form and then check odd/even.
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OddEvenServlet")
public class OddEvenServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int number = Integer.parseInt(request.getParameter("num"));

        out.println("<html><body>");
        out.println("<h2>Result</h2>");

        if (number % 2 == 0) {
            out.println(number + " is <b>Even</b>");
        } else {
            out.println(number + " is <b>Odd</b>");
        }

        out.println("</body></html>");
    }
}
