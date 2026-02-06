import javax.swing.*;
import java.awt.event.*;

public class MultiplicationTable extends JFrame {
    public MultiplicationTable() {
        setSize(300, 300);
        setLayout(null);

        JTextField t = new JTextField();
        t.setBounds(50, 20, 100, 30);
        add(t);

        JTextArea area = new JTextArea();
        area.setBounds(50, 60, 200, 150);
        add(area);

        JButton b = new JButton("Show Table");
        b.setBounds(50, 220, 120, 30);
        add(b);

        b.addActionListener(e -> {
            area.setText("");
            int n = Integer.parseInt(t.getText());
            for(int i=1; i<=10; i++) {
                area.append(n + " x " + i + " = " + (n*i) + "\n");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MultiplicationTable();
    }
}
