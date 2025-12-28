import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MDIExample implements ActionListener {
    JFrame jf;
    JInternalFrame in;
    JDesktopPane dp;
    JMenuBar mb;
    JMenu app;
    JMenuItem New;
    
    MDIExample(){
        jf = new JFrame();
        jf.setSize(500,500);
        jf.setLayout(new BorderLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dp = new JDesktopPane();
        jf.add(dp);
        mb = new JMenuBar();
        app = new JMenu("Application");
        New = new JMenuItem("New");
        app.add(New);
        mb.add(app);
        jf.setJMenuBar(mb);
        New.addActionListener(this);
        jf.setVisible(true);
    }
    public static void main(String[]args){
        new MDIExample();
    }
    public void actionPerformed(ActionEvent e){
        in = new JInternalFrame();
        in.setSize(300,300);
        in.setClosable(true);
        dp.add(in);
        in.setVisible(true);
    }
}
