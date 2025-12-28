import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Q1 implements ActionListener{
    JFrame jf;
      JButton b1;
      
      Q1(){
        jf = new JFrame();
        jf.setSize(300,300);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1= new JButton("OK");
        jf.add(b1);
        b1.addActionListener(this);
        jf.setVisible(true);
}
      public static void main(String[]args){
          Q1 ob = new Q1();
      }
      public void actionPerformed(ActionEvent e){
          JOptionPane.showMessageDialog(null, "You clicked the button");
      }
}
