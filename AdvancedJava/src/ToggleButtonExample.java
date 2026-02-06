import javax.swing.*;
import java.awt.event.*;

public class ToggleButtonExample extends JFrame {
    public ToggleButtonExample() {
        setSize(300, 150);
        setLayout(null);

        JTextField t = new JTextField();
        t.setBounds(50, 30, 200, 30);
        add(t);

        JToggleButton toggle = new JToggleButton("Toggle");
        toggle.setBounds(50, 70, 100, 30);
        add(toggle);

        toggle.addActionListener(e -> {
            if(toggle.isSelected()) t.setText("Button is ON");
            else t.setText("Button is OFF");
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ToggleButtonExample();
    }
}
