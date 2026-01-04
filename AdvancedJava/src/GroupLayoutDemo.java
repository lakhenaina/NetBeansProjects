import javax.swing.*;

public class GroupLayoutDemo extends JFrame {

    public GroupLayoutDemo() {
        setTitle("Grouplayout(Naina)");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel lblName = new JLabel("Name:");
        JTextField txtName = new JTextField(15);

        JLabel lblEmail = new JLabel("Email:");
        JTextField txtEmail = new JTextField(15);

        JButton btnSubmit = new JButton("Submit");
        JButton btnCancel = new JButton("Cancel");

        // Create GroupLayout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        // Enable gaps
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Horizontal grouping
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addGroup(
                    layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName)
                            .addComponent(lblEmail))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(txtName)
                            .addComponent(txtEmail))
                )
                .addGroup(
                    layout.createSequentialGroup()
                        .addComponent(btnSubmit)
                        .addComponent(btnCancel)
                )
        );

        // Vertical grouping
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName)
                        .addComponent(txtName)
                )
                .addGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmail)
                        .addComponent(txtEmail)
                )
                .addGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSubmit)
                        .addComponent(btnCancel)
                )
        );

        setVisible(true);
    }

    public static void main(String[] args) {
        new GroupLayoutDemo();
    }
}
