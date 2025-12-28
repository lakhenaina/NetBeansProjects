import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CustomDialogBox implements ActionListener {
    JFrame jf;
    JButton b1;
    CustomDialogBox(){
        jf = new JFrame();
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());
        b1 = new JButton("Click");
        jf.add(b1);
        b1.addActionListener(this);
        jf.setVisible(true);
}
    public static void main(String[]args){
        new CustomDialogBox();
    }
    public void actionPerformed(ActionEvent e){
        JDialog d1 = new JDialog(jf,true);
        d1.setSize(200,200);
        d1.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Welcome");
        d1.add(l1);
        d1.setVisible(true);
    }
}
