import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;
@WebServlet("/read")

public class ReadServlet {
    protected void doGet(HttpServletRequest request,HttpServletResponse response){
      response.setContentType("text/html");
      String n = request.getParameter("naam");
      try{
          PrintWriter out=response.getWriter();
          out.println("<h1>Welcome"+n+"</h1>");
          out.close();
      }catch(Exception ex){
          ex.printStackTrace();
      }
}
}
