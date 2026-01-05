import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.sql.*;
@WebServlet("/ViewEmployeeServlet")
public class ViewEmployeeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
           {   

        response.setContentType("text/html");
       

        try {
             PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Employee List</h2>");
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee_list",
                    "root",
                    "password"
            );

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            out.println("<table border='1' cellpadding='10'>");
            out.println("<tr>");
            out.println("<th>Emp ID</th>");
            out.println("<th>Name</th>");
            out.println("<th>Address</th>");
            out.println("<th>Post</th>");
            out.println("<th>Salary</th>");
            out.println("</tr>");

            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getInt("emp_id") + "</td>");
                out.println("<td>" + rs.getString("name") + "</td>");
                out.println("<td>" + rs.getString("address") + "</td>");
                out.println("<td>" + rs.getString("post") + "</td>");
                out.println("<td>" + rs.getDouble("salary") + "</td>");
                out.println("</tr>");
            }

            out.println("</table>");
            out.println("<br><a href='emp.html'>Add New Employee</a>");
            out.println("</body></html>");
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
}