/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizoop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class BookingPage extends JFrame{
    JLabel nameLabel = new JLabel("Name:");
    JTextField nameField = new JTextField();
    JLabel bookingDateLabel = new JLabel("Booking Date:");
    JTextField bookingDateField = new JTextField();
    JComboBox<String> month = new JComboBox<>(new.String[]{"Jan", "Feb", "Mar", "Apr", "Mei", "Jun", "Jul", "Agu", "Sep", "Okt", "Nov", "Des"});
    JLabel bookingYearLabel = new JLabel("2025");
    JLabel showTimeLabel = new JLabel("Show Time:");
    JComboBox<String> showtime = new JComboBox<>(new.string[]{"12:00", "15:00", "18:00", "21:00"});
    JLabel numberofTicketLabel = new JLabel("Number of Ticket:");
    JComboBox<Integer> ticketCount = new JComboBox<>(new.integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15});
    JLabel paymentMethodLabel = new JLabel("Payment Method:");
    JRadioButton credit = new JRadioButton("Credit Card");
    JRadioButton ewallet = new JRadioButton("E-Wallet");
    JRadioButton bank = new JRadioButton("Bank Transfer");
    JButton bookButton = new JButton("Book");
    JButton resetButton = new JButton("Reset");
    JButton backButton = new JButton("Back");
    
    Movie movie;
        public BookingPage(Movie movie){
            this.movie = movie;
            setTitle("Booking Page");
            setSize(400,300);
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            nameLabel.setBounds(20, 20, 100, 20);
            nameField.setBounds(120, 20, 150, 20);
            bookingDateLabel.setBounds(20, 50, 150, 20);
            bookingDateField.setBounds(180, 50, 150, 20);
            month.setBounds(20, 80, 150, 20);
            bookingYearLabel.setBounds(20, 150, 100, 20);
            showTimeLabel.setBounds(180,80,90,20);
            showtime.setBounds(20, 110, 100, 20);
            numberofTicketLabel.setBounds(20, 110, 100, 20);
            ticketCount.setBounds(50, 110, 70, 20);
            paymentMethodLabel.setBounds(20, 160, 100, 30);
            credit.setBounds(20, 180, 100, 20);
            ewallet.setBounds(20, 200, 100, 20);
            bank.setBounds(50, 200, 100, 20);
            bookButton.setBounds(80, 120, 100, 20);
            resetButton.setBounds(50, 160, 100, 20);
            backButton.setBounds(200, 200, 100, 20);
            add(nameLabel);
            add(nameField);
            add(bookingDateLabel);
            add(bookingDateField);
            add(month);
            add(bookingYearLabel);
            add(showTimeLabel);
            add(showtime);
            add(numberofTicketLabel);
            add(ticketCount);
            add(paymentMethodLabel);
            add(credit);
            add(ewallet);
            add(bank);
            add(bookButton);
            add(resetButton);
            add(backButton);
            ActionListener processBooking;
            bookButton.addActionListener(e->processBooking());
            resetButton.addActionListener(e->resetForm());
            backButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    dispose();
                    new MainMenuPage();
                }
            });
            setVisible(true);
        }
        private void resetForm() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void processBooking() {
        try {
            String name = name Field.getText();
            if (name.isEmpty()) throw new Exception("Name can not be empty")
            int 
        }
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
}
