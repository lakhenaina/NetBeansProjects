//create a servlet that displays welcome to servlet and also creatw web.xml (deployment descriptor) file.
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;
@WebServlet("/hello")
    public class HelloServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request,HttpServletResponse response){
      response.setContentType("text/html");
      try{
         PrintWriter out = response.getWriter();
         out.println("<html><body><h1>Welcome to Servlet</h1></body></html>");
         out.close();
      }catch(Exception ex){
          ex.printStackTrace();
         }
    }
 }

