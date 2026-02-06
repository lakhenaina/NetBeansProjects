import javax.swing.*;
import java.awt.event.*;

public class ValidationExample extends JFrame {
    JTextField nameField, contactField;
    JButton submit;

    public ValidationExample() {
        setLayout(null);
        setSize(400, 200);

        nameField = new JTextField();
        nameField.setBounds(50, 30, 150, 30);
        add(nameField);

        contactField = new JTextField();
        contactField.setBounds(50, 70, 150, 30);
        add(contactField);

        submit = new JButton("Submit");
        submit.setBounds(50, 110, 100, 30);
        add(submit);

        submit.addActionListener(e -> {
            String name = nameField.getText();
            String contact = contactField.getText();
            if(!name.matches("[a-zA-Z ]+")) {
                JOptionPane.showMessageDialog(this, "Name should not contain numbers!");
            } else if(!contact.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Contact number should contain digits only!");
            } else {
                JOptionPane.showMessageDialog(this, "Validation Successful!");
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ValidationExample();
    }
}
