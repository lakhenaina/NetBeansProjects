import javax.swing.*;
import java.awt.event.*;

public class ShowHideExample extends JFrame {
    public ShowHideExample() {
        setSize(300, 150);
        setLayout(null);

        JTextField t = new JTextField();
        t.setBounds(50, 20, 150, 30);
        add(t);

        JButton show = new JButton("Show");
        show.setBounds(50, 60, 70, 30);
        add(show);

        JButton hide = new JButton("Hide");
        hide.setBounds(130, 60, 70, 30);
        add(hide);

        show.addActionListener(e -> t.setVisible(true));
        hide.addActionListener(e -> t.setVisible(false));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ShowHideExample();
    }
}
