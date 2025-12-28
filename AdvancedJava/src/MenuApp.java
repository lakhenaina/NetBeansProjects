import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MenuApp implements ActionListener{
    JFrame jf;
    JMenuBar mb;
    JMenu file,edit;
    JMenuItem New,Exit;
    
    MenuApp(){
        jf=new JFrame();
        jf.setSize(400,400);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        New = new JMenuItem("New");
        Exit = new JMenuItem("Exit");
        mb.add(file);
        mb.add(edit);
        file.add(New);
        file.addSeparator();
        file.add(Exit);
        jf.setJMenuBar(mb);
        file.setMnemonic('F');
        New.addActionListener(this);
        Exit.addActionListener(this);
        New.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
        Exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,InputEvent.CTRL_DOWN_MASK));
        jf.setVisible(true);
        }
    public static void main(String[]args){
        new MenuApp();
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==Exit)
            System.exit(0);
        else if (e.getSource()==New)
            new HandleKeyEvent();
    }
}
