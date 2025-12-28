import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Q4 implements ActionListener {
    JFrame jf;
    JButton b1;
    JTextField t1,t2,t3,t4;
    JLabel l1,l2,l3,l4;
    Font f =new Font("Times New Roman",Font.BOLD,20);
    
    Q4(){
        jf=new JFrame( " ");
        jf.setSize(300,300);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        l1= new JLabel("Principal");
        jf.add(l1);
        t1=new JTextField(10);
        jf.add(t1);
        t1.setFont(f);
        
        l2= new JLabel("Rate");
        jf.add(l2);
        t2=new JTextField(10);
        jf.add(t2);
        
        l3= new JLabel("Time");
        jf.add(l3);
        t3=new JTextField(10);
        jf.add(t3);
        
        l4=new JLabel("SI");
        jf.add(l4);
        t4=new JTextField(10);
        jf.add(t4);
        
        b1 = new JButton("Calculate");
        jf.add(b1);
        b1.addActionListener(this);
        
        jf.setVisible(true);
        t4.setEditable(false);
    }
    public static void main(String[]args){
        Q4 ob = new Q4();
    }
    public void actionPerformed(ActionEvent e){
        double p = Double.parseDouble(t1.getText());
        double r = Double.parseDouble(t2.getText());
        double t = Double.parseDouble(t3.getText());
        double interest = (p * r * t) / 100;
        t4.setText(String.valueOf(interest));
    }
    }
    
    
