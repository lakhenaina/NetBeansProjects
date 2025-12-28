import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UsingDiaglogBox implements ActionListener {
    JFrame jf;
    JButton b1;

    UsingDiaglogBox() {
        jf = new JFrame("Color Chooser Example");
        jf.setSize(400, 400);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1 = new JButton("Choose Color");
        jf.add(b1);
        b1.addActionListener(this);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new UsingDiaglogBox();
    }

    public void actionPerformed(ActionEvent e) {
        Color c = JColorChooser.showDialog(jf, "Select Color", Color.white);

        if (c != null) { 
            jf.getContentPane().setBackground(c);
        }
    }
}
