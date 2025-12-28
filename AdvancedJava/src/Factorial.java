import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Factorial implements ActionListener {
        JFrame jf;
        JButton b1;
        JTextField t1;
        JLabel l1;
        
        Factorial(){
            JFrame jf=new JFrame();
            jf.setSize(400,400);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jf.setLayout(new FlowLayout());
            
            t1=new JTextField(10);
            jf.add(t1);
            
            l1=new JLabel("Result");
            jf.add(l1);
            
            b1=new JButton("OK");
            jf.add(b1);
            b1.addActionListener(this);
            
            jf.setVisible(true);
        }
        public static void main(String[]args){
            Factorial ob = new Factorial();
        }
        public void actionPerformed(ActionEvent e){
             try {
            int n = Integer.parseInt(t1.getText());
            int fact = 1;

            for(int i = 1; i <= n; i++){
                fact = fact * i;
            }

            l1.setText("Factorial = " + fact);
        } 
        catch (Exception ex) {
            l1.setText("Invalid Input");
                }
            }
}
        
        

