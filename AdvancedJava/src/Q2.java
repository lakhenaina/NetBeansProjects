import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Q2 implements ActionListener{
    JFrame jf;
      JButton b1,b2;
      TextField t1;
      
      Q2(){
        jf = new JFrame();
        jf.setSize(300,300);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1= new JButton("OK");
        jf.add(b1);
        b2 = new JButton("Clear");
        jf.add(b2);
        t1 = new TextField(20); 
        jf.add(t1);
        b1.addActionListener(this);
        b2.addActionListener(this);
        jf.setVisible(true);
}
      public static void main(String[]args){
          Q2 ob = new Q2();
      }
      public void actionPerformed(ActionEvent e){
          if(e.getSource()==b1)
              t1.setText("You clicked the button");
          else if(e.getSource()==b2)
              t1.setText(" ");
      }

}
