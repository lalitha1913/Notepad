import javax.swing.*;
import java.awt.*;
import javax.swing.plaf.metal.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.io.*;

class editor extends JFrame implements ActionListener {
    //creating the text area
    JTextArea t;
    //creating the frame to accomadate the text area and the menubar
    JFrame f;

    editor(){
        //initialising the frame
        f = new JFrame("Notepad");

        //setting the overall theme of the application
        try{

            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetallicLookandFeel");

            MetalLookAndFeel.setCurrentTheme(new OceanTheme());
        }
        catch(Exception e){

        }
        //initialising the text area;
        t = new JTextArea();

        //initialising the menubar
        JMenuBar m = new JMenuBar();

        //initialing file menu
        JMenu f1 = new JMenu("File");

        //create the individual menu items
        JMenuItem m1 = new JMenuItem("New");
        JMenuItem m2 = new JMenuItem("Open");
        JMenuItem m3 = new JMenuItem("Save");
        JMenuItem m4 = new JMenuItem("Print");

        //adding the actionlistener
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);

        //adding the menuitemss to the file menu
        f1.add(m1);
        f1.add(m2);
        f1.add(m3);
        f1.add(m4);

        JMenu f2 = new JMenu("Edit");

        JMenuItem m5 = new JMenuItem("Cut");
        JMenuItem m6 = new JMenuItem("Copy");
        JMenuItem m7 = new JMenuItem("Paste");

        m5.addActionListener(this);
        m6.addActionListener(this);
        m7.addActionListener(this);

        f2.add(m5);
        f2.add(m6);
        f2.add(m7);

        JMenuItem c = new JMenuItem("Exit");
        c.addActionListener(this);

        m.add(f1);
        m.add(f2);
        m.add(c);

        f.add(t);
        f.setJMenuBar(m);
        f.setSize(500, 500);
        f.show();



    }
    public void actionPerformed(ActionEvent e){

    }

    public static void main(String args[]){
        editor e = new editor();
    }
}




