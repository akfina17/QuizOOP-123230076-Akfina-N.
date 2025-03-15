/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizoop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Lab Informatika
 */
public class MainMenuPage extends JFrame{
    JButton spongebobMovieButton = new JButton("Spongebob");
    JButton ffMovieButton = new JButton("Fast & Furious");
    JButton avengerMovieButton = new JButton("Avenger");
    JButton ironmanMovieButton = new JButton("Iron Man");
    public MainMenuPage(){
        setTitle("Movie Selection");
        setSize(400,300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        spongebobMovieButton.setBounds(50,75,200,32);
        ffMovieButton.setBounds(50,75,200,32);
        avengerMovieButton.setBounds(50,75,200,32);
        ironmanMovieButton.setBounds(50,75,200,32);
        add(spongebobMovieButton);
        add(ffMovieButton);
        add(avengerMovieButton);
        add(ironmanMovieButton);
        spongebobMovieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        ffMovieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        avengerMovieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        ironmanMovieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
}
