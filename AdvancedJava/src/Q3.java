import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Q3 implements ActionListener {
     JFrame jf;
      JButton b1;
      TextField t1;
      
      Q3(){
           jf = new JFrame();
        jf.setSize(300,300);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1= new JButton("Check");
        jf.add(b1);
        t1 = new TextField(20); 
        jf.add(t1);
        b1.addActionListener(this);
        jf.setVisible(true);
      }
      public static void main(String[]args){
          Q3 ob = new Q3();
      }
      public void actionPerformed(ActionEvent e){
          int num = Integer.parseInt(t1.getText());
          if(num%2==0)
              JOptionPane.showMessageDialog(null,"Even");
          else
              JOptionPane.showMessageDialog(null,"Odd");
      }
      
}
