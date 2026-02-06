import javax.swing.*;
import java.awt.event.*;

public class AddMultiply extends JFrame {
    JTextField t1, t2, t3;
    JButton add, multiply;

    public AddMultiply() {
        setLayout(null);
        setSize(400, 200);

        t1 = new JTextField();
        t1.setBounds(50, 30, 100, 30);
        add(t1);

        t2 = new JTextField();
        t2.setBounds(160, 30, 100, 30);
        add(t2);

        t3 = new JTextField();
        t3.setBounds(270, 30, 100, 30);
        t3.setEditable(false);
        add(t3);

        add = new JButton("Add");
        add.setBounds(50, 80, 100, 30);
        add(add);

        multiply = new JButton("Multiply");
        multiply.setBounds(160, 80, 100, 30);
        add(multiply);

        add.addActionListener(e -> {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(n1 + n2));
        });

        multiply.addActionListener(e -> {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText(String.valueOf(n1 * n2));
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AddMultiply();
    }
}
