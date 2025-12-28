 import java.sql.*;
public class DisplayRecord {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bca62082";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  

            Connection con = DriverManager.getConnection(url, username, password);

            String query ="select * from student";

            Statement st = con.createStatement();
            ResultSet rs= st.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("address"));
                System.out.println(rs.getString("faculty"));
                
            }

            con.close();
//            System.out.println("Record inserted successfully!");

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
}
