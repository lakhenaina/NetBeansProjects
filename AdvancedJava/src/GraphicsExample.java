import javax.swing.*;
import java.awt.*;
public class GraphicsExample extends JPanel{
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.setFont(new Font("Algerian",Font.BOLD,22));
        g.drawString("Tribhuvan University", 20, 20);
    }
    public static void main(String[]args){
        JFrame jf = new JFrame();
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsExample ob = new GraphicsExample();
        jf.add(ob);
        jf.setVisible(true);
        
    }
}
