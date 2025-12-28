import javax.swing.*;
import java.awt.*;
public class UsingTable {
     JFrame jf;
     JTable tb;
     UsingTable() {
         jf=new JFrame();
         jf.setSize(400,400);
         jf.setLayout(new FlowLayout());
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         Object[][]data={{1,"Ram","Manager",35000},{2,"Hari","Director",40000}};
         String[] cols={"ID","NAME","POST","SALARY"};
         tb=new JTable(data,cols);
         JScrollPane jp=new JScrollPane(tb);
         tb=new JTable(data,cols);
         jf.add(jp);
         jf.setVisible(true);
     }
     public static void main(String[] args) {
         new UsingTable();
     }
}