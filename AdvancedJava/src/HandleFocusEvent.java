import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HandleFocusEvent implements FocusListener{
    JFrame jf;
    JTextField t1,t2;
    
    HandleFocusEvent(){
        jf=new JFrame();
        jf.setSize(400,400);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t1=new JTextField(20);
        t2=new JTextField(20);
        jf.add(t1);
        jf.add(t2);
        t1.addFocusListener(this);
        t2.addFocusListener(this);
        jf.setVisible(true);
    }
    public static void main(String[]args){
        new HandleFocusEvent();
    }
    public void focusGained(FocusEvent e){
        if(e.getSource()==t1)
            t1.setBackground(Color.red);
        else
            t2.setBackground(Color.red);
        
    }
    public void focusLost(FocusEvent e){
        if(e.getSource()==t1)
            t1.setBackground(Color.white);
        else
            t2.setBackground(Color.white);
    }
}
