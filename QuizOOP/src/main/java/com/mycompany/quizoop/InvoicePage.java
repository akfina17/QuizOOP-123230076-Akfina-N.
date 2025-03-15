/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizoop;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Lab Informatika
 */
public class InvoicePage extends JFrame{
    public InvoicePage(String name, int bookingDate, String month, String bookingYear, String showTime, int numberofTicket, String paymentMethod, double totalPrice){
        setTitle("Invoice");
        setSize(400,300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        JLabel titleLabel = new JLabel("Invoice", SwingConstants.CENTER);
        titleLabel.setBounds(100,20,200,30);
        JLabel nameLabel = new JLabel ("Name: " + name);
        nameLabel.setBounds(50, 70, 300, 20);
        JLabel bookingDateLabel = new JLabel ("Booking Page: " + bookingDate + month + bookingYear);
        JLabel showTimeLabel = new JLabel ("Show Time: " + name);
        JLabel numberofTicketLabel = new JLabel ("Number of Tickets: " + numberofTicket);
        JLabel paymentMethodLabel = new JLabel ("Payment Method: " + paymentMethod);
        JLabel totalPriceLabel = new JLabel ("Total Price (incl. 10% tax): Rp." + totalPrice);
        nameLabel.setBounds(50, 20, 300, 20);
        bookingDateLabel.setBounds(50, 40, 300,20);
        showTimeLabelLabel.setBounds(50, 40, 300,20);
        numberofTicketLabel.setBounds(50, 40, 300,20);
        paymentMethodLabel.setBounds(50, 40, 300,20);
        totalPriceLabel.setBounds(50, 40, 300,20);
        bookingDateLabel.setBounds(50, 40, 300,20);
    }

    private void setTitle(String invoice) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
