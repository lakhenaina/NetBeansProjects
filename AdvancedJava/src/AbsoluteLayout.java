import javax.swing.*;
public class AbsoluteLayout {
    public static void main(String[]args){
        JFrame jf=new JFrame();
        jf.setSize(500,300);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel L1=new JLabel("ID");
        L1.setBounds(10,10,80,25);
        jf.add(L1);
        
        JTextField t1= new JTextField();
        t1.setBounds(100,10,80,25);
        jf.add(t1);
        
        JLabel L2=new JLabel ("Name");
        L2.setBounds(10,45,80,25);
        jf.add(L2);
        
        JTextField t2=new JTextField();
        t2.setBounds(100,45,200,25);
        jf.add (t2);
        
        JButton b1= new JButton ("Ok");
        b1.setBounds(100,80,80,25);
        jf.add(b1);
        
        
        JButton b2= new JButton ("Cancel");
        b2.setBounds(190,80,80,25);
        jf.add(b2);
        
        jf.setVisible(true);
    }
}

