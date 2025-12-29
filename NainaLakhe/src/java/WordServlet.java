//Create a servlet that reads a word from HTML form and print its length,convert into uppercase and then reverse it.
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WordServlet")
public class WordServlet extends HttpServlet {

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

        String word = request.getParameter("word");

        int length = word.length();
        String upper = word.toUpperCase();

        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        out.println("<html><body>");
        out.println("<h2>Word Operations Result</h2>");
        out.println("Word: " + word + "<br>");
        out.println("Length: " + length + "<br>");
        out.println("Uppercase: " + upper + "<br>");
        out.println("Reverse: " + reverse);
        out.println("</body></html>");
    }
}
