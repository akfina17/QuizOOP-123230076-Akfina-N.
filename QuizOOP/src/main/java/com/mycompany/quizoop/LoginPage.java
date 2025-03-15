/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizoop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class LoginPage extends JFrame implements ActionListener{
    JLabel usernameLabel = new JLabel("Username: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JTextField usernameTextField = new JTextField();
    JTextField passwordTextField = new JTextField();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    LoginPage(){
        setVisible(true);
        setSize(720,480);
        setTitle("Title: Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
        add(usernameLabel);
        add(passwordLabel);
        add(usernameTextField);
        add(passwordTextField);
        add(loginButton);
        add(resetButton);
        usernameLabel.setBounds(210,20,150,24);
        passwordLabel.setBounds(20,84,440,12);
        usernameTextField.setBounds(18,100,440,32);
        passwordTextField.setBounds(18,100,440,32);
        loginButton.setBounds(50,220,200,32);
        resetButton.setBounds(50,275,200,32);
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == loginButton){
                String username = usernameTextField.getText();
                char[]passwordChar;
                passwordChar = passwordTextField.getPassword(); //declare teh password
                String password = new String(passwordChar);
                if(username.equals("user") && password.equals("user")){
                    JOptionPane.showMessageDialog(this, "Login sucess");
                    new MainMenuPage();
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Wrong username or password");
                }
            }
            else if(e.getSource() == resetButton){
                usernameTextField.setText("");
                passwordTextField.setText("");
            }
        } catch(Exception Error){}
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
