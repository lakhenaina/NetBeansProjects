// create a servlet that reads two numbers from html form and print all numbers between them.
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadNumbers")
public class ReadNumbers extends HttpServlet {

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

        int n1 = Integer.parseInt(request.getParameter("n1"));
        int n2 = Integer.parseInt(request.getParameter("n2"));

        out.println("<html><body>");
        out.println("<h2>Numbers Between " + n1 + " and " + n2 + "</h2>");

        if (n1 <= n2) {
            for (int i = n1; i <= n2; i++) {
                out.print(i + " ");
            }
        } else {
            for (int i = n1; i >= n2; i--) {
                out.print(i + " ");
            }
        }

        out.println("</body></html>");
    }
}
