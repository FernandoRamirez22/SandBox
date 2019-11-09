package com.company;
import javafx.event.ActionEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//THIS CODE IS HERE BECAUSE IT MAY HELP US IN THE FUTURE TO VALIDATE PRE-EXISTING USERS (in the database) BACK INTO THE PROGRAM, basically signing them back when entering the correct password



import javafx.event.ActionEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Password {
    private static  String password = "pass";

     public void hidePassword(){
         JFrame frame = new JFrame("Password");
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(400,100);

         JLabel label = new JLabel("Enter Password");
         JPanel panel = new JPanel();
         frame.add(panel);


         JPasswordField pass = new JPasswordField(15);
         pass.setEchoChar('*');
         pass.addActionListener(new AL());
         panel.add(label, BorderLayout.WEST);
         panel.add(pass, BorderLayout.WEST);

    }

    static class AL implements ActionListener{
         public void actionPerformed(ActionEvent hide) {
             JPasswordField input = (JPasswordField) hide.getSource();
             char[] passy = input.getPassword();
             String p = new String(passy);

             if(p.equals(password)){
                JOptionPane.showMessageDialog(null, "Correct");
             }
             else
                 JOptionPane.showMessageDialog(null, "Incorrect Password");
         }
    }
}
