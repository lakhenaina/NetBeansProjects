import java.sql.*;
public class InsertRecord {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/bca62082";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  

            Connection con = DriverManager.getConnection(url, username, password);

            String query = "INSERT INTO student(name, faculty, address) VALUES ('Ram', 'BBA', 'Kavre'),('Sita','BCA','KTM')";

            Statement st = con.createStatement();
            st.execute(query);

            con.close();
//            System.out.println("Record inserted successfully!");

        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }
}