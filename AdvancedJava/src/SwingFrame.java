import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class SwingFrame implements ActionListener {
    JFrame jf;
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JComboBox cb;
    JButton b1;
    
    SwingFrame(){
        jf=new JFrame();
        jf.setSize(300,300);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        l1=new JLabel("ID");
//        jf.add(l1);
//        t1=new JTextField(20);
//        jf.add(t1);
        
        l1=new JLabel("Name");
        jf.add(l1);
        t1=new JTextField(20);
        jf.add(t1);
        
        l2=new JLabel("Faculty");
        jf.add(l2);
        String[]Faculty={"BCA","BBA","BSW","MIT","MBA","BIT"};
        cb=new JComboBox(Faculty);
        jf.add(cb);
        cb.setMaximumRowCount(3);
        
        l3=new JLabel("Address");
        jf.add(l3);
        t2=new JTextField(20);
        jf.add(t2);
        
        b1=new JButton("Save");
        jf.add(b1);
        b1.addActionListener(this);
        jf.setVisible(true);
        
    }
    public static void main(String[]args){
        new SwingFrame();
    }
    public void actionPerformed(ActionEvent e){
//        int id=Integer.parseInt(t1.getText());
       String name=t1.getText();
       String Address=t2.getText();
       String faculty=cb.getSelectedItem().toString();
        
        String url = "jdbc:mysql://localhost:3306/bca62082";
        String username="root";
        String password = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);  
            String query="insert into student(name,faculty,address)values(?,?,?)";
            PreparedStatement st = con.prepareStatement(query);
            //st.setInt(1, id);
            st.setString(1,name);
            st.setString(2,faculty);
            st.setString(3, Address);
            st.execute();
            con.close();
            JOptionPane.showMessageDialog(null, "Record Saved Successfully");
        }catch(Exception ex){
            System.out.println(ex);
        }

       
    }
}
