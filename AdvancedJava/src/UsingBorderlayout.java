import javax.swing.*;
import java.awt.*;
public class UsingBorderlayout {
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
        JPanel jp=new JPanel();
        jp.add(b2);
        jp.add(b3);
        jp.add(b4);
        jf.add(b1,BorderLayout.NORTH);
        jf.add(jp,BorderLayout.SOUTH);
        jf.add(b5,BorderLayout.CENTER);
        
        jf.setVisible(true);
        
}
}