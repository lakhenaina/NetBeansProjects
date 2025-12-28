import java.sql.*;
public class DisplayAllRecords {
    public static void main(String[]args){
        String url = "jdbc:mysql://localhost:3306/bca62082";
        String username = "root";
        String password = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//com.mysql.cj.jdbc.Driver
            Connection con = DriverManager.getConnection(url,username,password);
            String sql = "Select * from student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int cols =  rsmd.getColumnCount();
            while(rs.next()){
                for(int i=1;i<=cols;i++){
                    System.out.println(rs.getString(i));
                }
            }
            con.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
