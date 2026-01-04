import java.awt.*;

public class FlowLayoutDemo extends Frame {
    Button b1,b2,b3,b4,b5;
 
    FlowLayoutDemo() {
        setSize(300, 200);
        setTitle("FlowLayout(naina)");
        setLayout(new FlowLayout());
        b1=new Button("Button 1");
        b2=new Button("Button 2");
        b3=new Button("Button 3");
        b4=new Button("Button 4");
        b5=new Button("Button 5");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);   
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
