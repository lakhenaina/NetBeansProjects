import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Form implements ActionListener {
    JFrame jf;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1;
    JComboBox cb;
    JRadioButton r1,r2;
    JCheckBox c1,c2;
    JList myList;
    JButton b1;
    
    Form(){
        jf=new JFrame();
        jf.setSize(300,300);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        l1= new JLabel("Name");
        jf.add(l1);
        t1= new JTextField(20);
        jf.add(t1);
        
        l2= new JLabel("Faculty");
        jf.add(l2);
        String[]Faculty = {"BCA" , "BBA" , "BSW" , "BScCSIT"};
        cb = new JComboBox(Faculty);
        jf.add(cb);
        cb.setMaximumRowCount(3);
        
        l3= new JLabel("Gender");
        jf.add(l3);
        r1= new JRadioButton("Male");
        r2= new JRadioButton("Female");
        ButtonGroup bg= new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        jf.add(r1);
        jf.add(r2);
        
        l4= new JLabel("Hobbies");
        jf.add(l4);
        c1= new JCheckBox("Music");
        c2= new JCheckBox("Travelling");
        jf.add(c1);
        jf.add(c2);
        
        l5= new JLabel("Languages");
        jf.add(l5);
        String[]lang={"Nepali" , "English" , "Chinese" ,"Korean"};
        myList=new JList(lang);
        myList.setVisibleRowCount(4);
        JScrollPane jp=new JScrollPane(myList);
        b1 = new JButton("Submit");
        jf.add(b1);
        b1.addActionListener(this);
        jf.setVisible(true);
        
        
    }
    public static void main(String[]args){
        new Form();
    }
    public void actionPerformed(ActionEvent e){
        String name=t1.getText();
        String faculty=cb.getSelectedItem().toString();
        
        String gender=" ";
        if (r1.isSelected())
            gender="Male";
        else
            gender="Female";
        
        String hobbies=" ";
        if(c1.isSelected())
            hobbies="Music";
        if(c2.isSelected())
            hobbies="Travelling";
        
        java.util.List<String> languages = myList.getSelectedValuesList();
        String language = String.join(", ", languages);

        System.out.println("Name: "+name+ "\nFaculty: "+faculty+ "\nGender: "+gender+ "\nHobbies: "+hobbies+ "\nLanguage: "+language);
    }
}
