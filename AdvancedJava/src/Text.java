import javax.swing.*;
import java.awt.*;

public class Text extends JPanel {
    public void paint(Graphics g)
    {
       g.drawRect(50, 50, 200, 100);

       g.setFont(new Font("Arial", Font.BOLD, 20));
       g.setColor(Color.BLUE);

       int x = 50 + 200/2 ; 
       int y = 50 + 100/2 ;  

       g.drawString("BCA-TU", x, y);
    }

    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Text ob = new Text();  
        jf.add(ob);

        jf.setVisible(true);
    }
}