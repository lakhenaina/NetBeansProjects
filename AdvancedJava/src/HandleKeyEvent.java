import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HandleKeyEvent extends KeyAdapter{
    JFrame jf;
    JTextField t1,t2;
    
    HandleKeyEvent(){
        jf=new JFrame();
        jf.setSize(300,300);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t1=new JTextField(20);
        t2=new JTextField(20);
        jf.add(t1);
        jf.add(t2);
        t1.addKeyListener(this);
        jf.setVisible(true);
    }
    public static void main(String[]args){
        new HandleKeyEvent();
    }
    public void KeyReleased(KeyEvent e){
        int a = Integer.parseInt(t1.getText());
        int b = a*a;
        t2.setText(b+ " ");
    }
    
}
