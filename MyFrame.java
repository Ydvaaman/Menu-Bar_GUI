import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.*;
import java.io.FileReader;


public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar ;
    JMenu fileMenu ;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem loadItem ;
    JMenuItem saveItem ;
    JMenuItem exitItem ;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("load.png");
        saveIcon = new ImageIcon("save.png");
        exitIcon = new ImageIcon("exit.png");

        Image i = loadIcon.getImage();
        Image new_loadIcon =i.getScaledInstance(30,30,Image.SCALE_SMOOTH);
         loadIcon = new ImageIcon(new_loadIcon);
         
         
        Image j = saveIcon.getImage();
        Image new_saveIcon =j.getScaledInstance(30,30,Image.SCALE_SMOOTH);
         saveIcon = new ImageIcon(new_saveIcon);

         Image k = exitIcon.getImage();
        Image new_exitIcon =k.getScaledInstance(30,30,Image.SCALE_SMOOTH);
         exitIcon = new ImageIcon(new_exitIcon);
         

         menuBar = new JMenuBar();

         fileMenu = new JMenu("File");
         editMenu = new JMenu("Edit");
         helpMenu = new JMenu("Help");

         loadItem = new JMenuItem("Load");
         saveItem = new JMenuItem("Save");
         exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
 
        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        fileMenu.setMnemonic(KeyEvent.VK_F); //! Alt + f for file
        editMenu.setMnemonic(KeyEvent.VK_E); //! Alt + e  for edit
        helpMenu.setMnemonic(KeyEvent.VK_H); //! Alt + h for help


        loadItem.setMnemonic(KeyEvent.VK_L); //! L stands for LoadItem
        saveItem.setMnemonic(KeyEvent.VK_S); //! S stands for SaveItem
        exitItem.setMnemonic(KeyEvent.VK_E); //! E stands for exit item



        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

           
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);



    }
    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource()==loadItem){
            System.out.println("*beep beep you loaded a file*");

        }
        if (e.getSource()==saveItem){
            System.out.println("*beep beep you saved a file*");

        }
        if (e.getSource()==exitItem){
            System.exit(0);
        }

    }
}
