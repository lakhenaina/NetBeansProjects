import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class UsingFileChooser implements ActionListener{
    JFrame jf;
    JMenuBar mb;
    JMenu file;
    JMenuItem save,open;
    JTextArea ta;
    
    UsingFileChooser(){
        jf = new JFrame();
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new BorderLayout());
        ta = new JTextArea();
        JScrollPane jp = new JScrollPane(ta);
        jf.add(ta);
        mb = new JMenuBar();
        file = new JMenu("File");
        save = new JMenuItem("Save");
        open = new JMenuItem("Open");
        mb.add(file);
        file.add(open);
        file.add(save);
        jf.setJMenuBar(mb);
        open.addActionListener(this);
        save.addActionListener(this);
        jf.setVisible(true);
    }
    public static void main(String[]args){
        new UsingFileChooser();
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==open){
            JFileChooser jfc=new JFileChooser();
            jfc.showOpenDialog(jf);
            String Content = " ";
            String filename = jfc.getSelectedFile().toString();
            try{
                FileReader fr = new FileReader(filename);
                int ch;
                while ((ch=fr.read())!=-1){
                    Content +=(char)ch;
                }
                fr.close();
                ta.setText(Content);
            }catch(Exception ex){
                System.out.println(ex);
            }
        }else if(e.getSource()==save){
            JFileChooser jfc = new JFileChooser();
            jfc.showSaveDialog(jf);
            String Content = ta.getText();
            String filename = jfc.getSelectedFile().toString();
            try{
                FileWriter fw = new FileWriter(filename);
                fw.write(Content);
                fw.close();
            }
            catch(Exception ex){
                System.out.println(ex);
            }
        }
    }
}
