import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
   protected void doGet(HttpServletRequest request,HttpServletResponse
           response){
       try {
           response.sendRedirect("Login.html");
       } catch (Exception ex) {
           ex.printStackTrace();
       }
   }    
   
   protected void doPost(HttpServletRequest request,HttpServletResponse
           response){
       response.setContentType("text/html");
       HttpSession session=request.getSession(false);
       String username = session.getAttribute("name").toString();
       try {
            PrintWriter out=response.getWriter();
            out.println("<h1>This is Home Page</h1>");
            out.println("<h3>Welcome "+username+"</h3>");
            out.close();
           
       } catch (Exception ex) {
           ex.printStackTrace();
       }
   }    
}