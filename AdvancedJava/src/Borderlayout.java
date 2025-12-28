import javax.swing.*;
import java.awt.*;
public class Borderlayout {

    
    public static void main(String[]args){
        JFrame jf=new JFrame();
        jf.setSize(300,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //jf.setLayout(new BorderLayout());
        jf.setLayout(new BorderLayout(10,10));
        JButton b1=new JButton ("one");
        JButton b2=new JButton ("two");
        JButton b3=new JButton ("three");
        JButton b4=new JButton ("four");
        JButton b5=new JButton ("five");
        jf.add(b1,BorderLayout.NORTH);
        jf.add(b2,BorderLayout.SOUTH);
        jf.add(b3,BorderLayout.WEST);
        jf.add(b4,BorderLayout.EAST);
        jf.add(b5,BorderLayout.CENTER);
        
        jf.setVisible(true);
        
        
    }
}
