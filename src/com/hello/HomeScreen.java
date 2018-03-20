package com.hello;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class HomeScreen extends JFrame{
    JPanel panel;
    JLabel lbl1;
    JMenu menu;
    JMenuItem itm1, itm2;
    JMenuBar bar;
    public HomeScreen(){
        panel = new JPanel();
        panel.setBounds(20, 20, 360, 300);
        panel.setLayout(null);
        
        lbl1 = new JLabel("This is the Home Screen");
        lbl1.setBounds(250,250,150,40);
        
        bar = new JMenuBar();
        
        //First menu bar button
        menu = new JMenu("File");
        itm1 = new JMenuItem("New");
        itm2 = new JMenuItem("Open");
        menu.add(itm1);
        menu.add(itm2);
        bar.add(menu);
        
        panel.add(lbl1);
        panel.add(bar);
        
        setJMenuBar(bar);
        add(panel);
        setSize(600, 550);
        setTitle("Home Screen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
