import javax.swing.*;
import java.awt.event.*;

public class MenuExample {
    JFrame jf;
    JMenuBar mb;
    JMenu appMenu;
    JMenuItem exitItem;

    MenuExample() {
        jf = new JFrame("Menu Demo");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mb = new JMenuBar();
        appMenu = new JMenu("Application");

        exitItem = new JMenuItem("Exit");

        // Shortcut Ctrl + E
        exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));

        // Use separate ActionListener class
        exitItem.addActionListener(new ExitHandler());

        // Add to menu
        appMenu.add(exitItem);
        mb.add(appMenu);
        jf.setJMenuBar(mb);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}

// Separate ActionListener class
class ExitHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
