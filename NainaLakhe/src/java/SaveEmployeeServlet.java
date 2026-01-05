import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.sql.*;

@WebServlet("/SaveEmployeeServlet")
public class SaveEmployeeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
           {  

        response.setContentType("text/html");
        
        try{
        PrintWriter out = response.getWriter();

        int empId =Integer.parseInt(request.getParameter("empId"));
        String name = request.getParameter("name");
        String post = request.getParameter("post");
        String address=request.getParameter("address");
        int salary = Integer.parseInt(request.getParameter("salary"));

        out.println("<html><body>");
        out.println("<h2>Employee Saved Successfully</h2>");
        out.println("<p><b>Employee ID:</b> " + empId + "</p>");
        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<p><b>Post:</b> " + post + "</p>");
        out.println("<p><b>Address:</b> " + address + "</p>");

        out.println("<p><b>Salary:</b> " + salary + "</p>");
        out.println("<br><a href='emp.html'>Add New Employee</a>");
        out.println("</body></html>");
        
        
          Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee_list",
                    "root",
                    "password"
            );
            String sql="insert into employee(emp_id,name,address,post,salary)values(?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setInt(1,empId);
            pst.setString(2,name);
            pst.setString(3,address);
            pst.setString(4, post);
            pst.setInt(5,salary);
            pst.execute();
            con.close();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}