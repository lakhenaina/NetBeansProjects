import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.sql.*;
@WebServlet("/validate")

public class ValidateUserServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request,HttpServletResponse
           response){   
      response.setContentType("text/html");
      String uname=request.getParameter("uname");
      String pwd=request.getParameter("pwd");
      
      String url = "jdbc:mysql://localhost:3306/bca62082";
        String username = "root";
        String password = "";

      try{
          PrintWriter out=response.getWriter();
          
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection(url,username,password);
          String sql="select * from login where username=? and password=?";
          PreparedStatement pst=con.prepareStatement(sql);
          pst.setString(1, uname);
          pst.setString(2,pwd);
          ResultSet rs=pst.executeQuery();
          if(rs.next()){
             //valid user
             //create a sesssion and set username in its attribute
             HttpSession session=request.getSession();
             session.setAttribute("name",uname);
              RequestDispatcher rd=request.getRequestDispatcher("home");
              rd.forward(request, response);
          }
          else {
              out.println("<h3>Incorred details</h3>");
              RequestDispatcher rd=request.getRequestDispatcher("Login.html");
              rd.include(request, response);
          }
          out.close();
      }
      catch(Exception ex){
          ex.printStackTrace();
      }
  }
}
