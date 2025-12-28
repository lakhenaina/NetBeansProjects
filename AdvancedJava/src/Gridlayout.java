import javax.swing.*;
import java.awt.*;
public class Gridlayout {
    public static void main(String[]args){
        JFrame jf=new JFrame();
        jf.setSize(300,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new GridLayout(2,2,5,5));
        JButton b1=new JButton("One");
        JButton b2=new JButton("two");
        JButton b3=new JButton("Three");
        JButton b4=new JButton("Four");
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        
        jf.setVisible(true);
    }
}
