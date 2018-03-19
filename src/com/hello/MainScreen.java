package com.hello;

import javafx.scene.control.PasswordField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainScreen extends JFrame implements Runnable{
    JPanel panel;
    JLabel lbl1;
    JLabel lbl2;
    JTextField txt;
    JPasswordField pwd;
    JButton btn;
    MainScreen(){
        panel = new JPanel();
        panel.setBounds(20, 20, 360, 300);
        panel.setLayout(null);
        
        //label for name textfield
        lbl1 = new JLabel("Enter name:");
        lbl1.setBounds(50, 50, 150, 40);

        //label for password field
        lbl2 = new JLabel("Enter Password:");
        lbl2.setBounds(50, 100, 150, 40);
        
        //textfield for name
        txt = new JTextField(20);
        txt.setBounds(210, 50, 150, 40);
        
        //password field
        pwd = new JPasswordField(20); 
        pwd.setBounds(210, 100, 150, 40);
        
        //button
        btn = new JButton("Login!");
        btn.setBounds(130, 150, 75, 20);
        
        panel.add(lbl1);
        panel.add(lbl2);
        panel.add(txt);
        panel.add(pwd);
        panel.add(btn);
        add(panel);
        
        setSize(400, 350);
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
   } 

    @Override
    public void run() {
        new MainScreen();
    }
}
