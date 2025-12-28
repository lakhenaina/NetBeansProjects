import javax.swing.*;
import java.awt.*;

public class Flag extends JPanel {
    public void paint(Graphics g)
    {
        Polygon p=new Polygon();

        p.addPoint(50,50);
        p.addPoint(150,150);
        p.addPoint(50,150);
        p.addPoint(150,300);
        p.addPoint(50,300);

        g.drawPolygon(p);
        g.drawArc(70,100,20,20,0,-180);
        g.drawOval(70,250,20,20);



    }

    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Flag ob = new Flag();  
        jf.add(ob);

        jf.setVisible(true);
    }
}