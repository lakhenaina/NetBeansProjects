import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import javax.servlet.annotation.*;
@WebServlet("/save")
public class SaveStudent extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html");
        int id=Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        String faculty=request.getParameter("faculty");
        String address=request.getParameter("address");
        
        String url = "jdbc:mysql://localhost:3306/bca62082";
        String username = "root";
        String password = "";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,username,password);
            String sql="insert into student(id,name,faculty,address)values(?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3,faculty);
            pst.setString(4,address);
            pst.execute();
            con.close();
        }catch(Exception ex){
            ex.printStackTrace();
            
        }

    }
}
