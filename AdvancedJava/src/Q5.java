import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Q5 implements ActionListener {
      JFrame jf;
    JButton b1,b2,b3,b4;
    JTextField t1,t2,t3;
    
    
     Q5(){
         
         jf=new JFrame( " ");
        jf.setSize(300,300);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        t1=new JTextField(10);
        jf.add(t1);
        
        t2=new JTextField(10);
        jf.add(t2);
        
        t3=new JTextField(10);
        jf.add(t3);
        
        b1 = new JButton("Add");
        jf.add(b1);
        b1.addActionListener(this);
        
        b2 = new JButton("Subtract");
        jf.add(b2);
        b2.addActionListener(this);
        
        b3 = new JButton("Multiply");
        jf.add(b3);
        b3.addActionListener(this);
        
        b4 = new JButton("Divide");
        jf.add(b4);
        b4.addActionListener(this);
        
        jf.setVisible(true);
       
    }
    public static void main(String[]args){
        Q5 ob = new Q5();
        }
    public void actionPerformed(ActionEvent e){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c=0;
        if(e.getSource()==b1)
            c=a+b;
        else if (e.getSource()==b2)
            c=a-b;
        else if(e.getSource()==b3)
            c=a*b;
        else
            c=a/b;
        t3.setText(c+ " ");
    }
}
