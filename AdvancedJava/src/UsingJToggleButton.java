import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UsingJToggleButton implements ActionListener {
    JFrame jf;
    JToggleButton tb;
    UsingJToggleButton(){
        jf= new JFrame();
        jf.setSize(400,400);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tb=new JToggleButton("ON/OFF");
        jf.add(tb);
        tb.addActionListener(this);
        jf.setVisible(true);
        
    }
    public static void main(String[]args){
        new UsingJToggleButton();
    }
    public void actionPerformed(ActionEvent e){
        if(tb.isSelected())
            JOptionPane.showMessageDialog(null,"Button is pressed");
        else
            JOptionPane.showMessageDialog(null,"Buttton is pressed");
    }
}
