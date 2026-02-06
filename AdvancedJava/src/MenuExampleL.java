import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuExampleL extends JFrame {
    public MenuExampleL() {
        setSize(400, 300);
        setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem aboutItem = new JMenuItem("About Us");

        file.add(newItem);
        file.add(saveItem);
        file.add(openItem);
        file.add(exitItem);

        help.add(aboutItem);

        menuBar.add(file);
        menuBar.add(help);
        setJMenuBar(menuBar);

        exitItem.addActionListener(e -> System.exit(0));

        aboutItem.addActionListener(e -> {
            JDialog dialog = new JDialog(this, "About Developer", true);
            dialog.setSize(300, 150);
            dialog.setLayout(new GridLayout(2,1));
            
            JLabel nameLabel = new JLabel("Name: Naina Lakhe", SwingConstants.CENTER);
            nameLabel.setFont(new Font("Algerian", Font.BOLD, 26));
            JLabel contactLabel = new JLabel("Contact: 1234567890", SwingConstants.CENTER);
            contactLabel.setFont(new Font("Algerian", Font.BOLD, 26));
            
            dialog.add(nameLabel);
            dialog.add(contactLabel);
            dialog.setVisible(true);
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuExampleL();
    }
}
