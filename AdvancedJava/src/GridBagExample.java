import java.awt.*;
import javax.swing.*;
public class GridBagExample {
    public static void main(String[]args){
        JFrame jf=new JFrame();
        jf.setSize(300,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout gl=new GridBagLayout();
        jf.setLayout(gl);
        GridBagConstraints gbc= new GridBagConstraints();
        gbc.insets=new Insets (5,5,5,5);
        
        JLabel L1=new JLabel("Id");
        gbc.gridx=0;
        gbc.gridy=0;
        gl.setConstraints(L1, gbc);
        jf.add(L1);
        
        JTextField t1=new JTextField(10);
        gbc.gridx=1;
        gbc.gridy=0;
        gbc.anchor=GridBagConstraints.NORTHWEST;
        gl.setConstraints(t1,gbc);
        jf.add(t1);
        
        JLabel L2=new JLabel("Name");
        gbc.gridx=0;
        gbc.gridy=1;
        gl.setConstraints(L2, gbc);
        jf.add(L2);
        
        JTextField t2=new JTextField(20);
        gbc.gridx=1;
        gbc.gridy=1;
        gl.setConstraints(t2,gbc);
        jf.add(t2);
        
        JButton b1=new JButton("OK");
        gbc.gridx=1;
        gbc.gridy=2;
        gbc.ipadx=30;
        gbc.ipady=12;
        gl.setConstraints(b1, gbc);
        jf.add(b1);
        
        jf.setVisible(true);
        
        
    }
}
