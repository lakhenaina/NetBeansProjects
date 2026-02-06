import javax.swing.*;

public class FormExample extends JFrame {
    public FormExample() {
        setSize(500, 400);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 80, 25);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(120, 20, 150, 25);
        add(nameField);

        JLabel facultyLabel = new JLabel("Faculty:");
        facultyLabel.setBounds(20, 60, 80, 25);
        add(facultyLabel);

        String[] faculties = {"Science","Commerce","Arts"};
        JComboBox<String> facultyBox = new JComboBox<>(faculties);
        facultyBox.setBounds(120, 60, 150, 25);
        add(facultyBox);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 100, 80, 25);
        add(genderLabel);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(120, 100, 70, 25);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(200, 100, 80, 25);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male); genderGroup.add(female);
        add(male); add(female);

        JLabel hobbyLabel = new JLabel("Hobbies:");
        hobbyLabel.setBounds(20, 140, 80, 25);
        add(hobbyLabel);

        JCheckBox music = new JCheckBox("Music");
        music.setBounds(120, 140, 70, 25);
        JCheckBox dance = new JCheckBox("Dance");
        dance.setBounds(200, 140, 70, 25);
        JCheckBox sports = new JCheckBox("Sports");
        sports.setBounds(280, 140, 80, 25);
        add(music); add(dance); add(sports);

        JLabel langLabel = new JLabel("Languages:");
        langLabel.setBounds(20, 180, 80, 25);
        add(langLabel);

        String[] languages = {"English","Nepali","Hindi","French"};
        JList<String> langList = new JList<>(languages);
        langList.setBounds(120, 180, 150, 60);
        add(langList);

        JButton submit = new JButton("Submit");
        submit.setBounds(120, 260, 100, 30);
        add(submit);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FormExample();
    }
}
