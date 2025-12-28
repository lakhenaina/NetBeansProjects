import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login implements ActionListener {
        JFrame jf;
        JLabel l1,l2;
        JTextField t1;
        JPasswordField p1;
        JButton b1;
        
        Login(){
            jf=new JFrame();
            jf.setSize(300,150);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setLayout(new FlowLayout());
            
            l1 = new JLabel("Username");
            jf.add(l1);
            t1 = new JTextField(30);
            jf.add(t1);
            
            l2 = new JLabel("Password");
            jf.add(l2);
            p1 = new JPasswordField(30);
            jf.add(p1);
            
            b1 = new JButton("Login");
            jf.add(b1);
            b1.addActionListener(this);
            jf.setVisible(true);
            
            }
        public static void main(String[]args){
            new Login();
        }
        public void actionPerformed(ActionEvent e){
            String url = "jdbc:mysql://localhost:3306/bca62082";
            String username = "root";
            String password = "";
            
            String uname = t1.getText();
            String pwd = new String(p1.getPassword());
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(url,username ,password);
                String sql =" Select*from users where username =? and password=?";
               PreparedStatement pst = con.prepareStatement(sql);

                pst.setString(1, uname);
                pst.setString(2, pwd);
                ResultSet rs= pst.executeQuery();
                if(rs.next())
                    JOptionPane.showMessageDialog(null,"Login Succesfully .....");
                else
                    JOptionPane.showMessageDialog(null,"Login Failed....");
                con.close();
                
            }catch(Exception ex){
                System.out.println(ex);
            }
        }
             
    }

