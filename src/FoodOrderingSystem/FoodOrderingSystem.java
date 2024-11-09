package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Food Ordering System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 400);
        frame.setLayout(null);

        // Create checkboxes for food items
        JCheckBox cPizza = new JCheckBox("Pizza - Php 100");
        cPizza.setBounds(50, 20, 200, 30);
        frame.add(cPizza);

        JCheckBox cBurger = new JCheckBox("Burger - Php 80");
        cBurger.setBounds(50, 50, 200, 30);
        frame.add(cBurger);

        JCheckBox cFries = new JCheckBox("Fries - Php 65");
        cFries.setBounds(50, 80, 200, 30);
        frame.add(cFries);

        JCheckBox cSoftDrinks = new JCheckBox("Soft Drinks - Php 55");
        cSoftDrinks.setBounds(50, 110, 200, 30);
        frame.add(cSoftDrinks);

        JCheckBox cTea = new JCheckBox("Tea - Php 50");
        cTea.setBounds(50, 140, 200, 30);
        frame.add(cTea);

        JCheckBox cSundae = new JCheckBox("Sundae - Php 40");
        cSundae.setBounds(50, 170, 200, 30);
        frame.add(cSundae);

        // Create radio buttons for discount options
        JRadioButton rbNone = new JRadioButton("No Discount");
        rbNone.setBounds(50, 210, 200, 30);
        frame.add(rbNone);

        JRadioButton rb5 = new JRadioButton("5% Discount");
        rb5.setBounds(50, 240, 200, 30);
        frame.add(rb5);

        JRadioButton rb10 = new JRadioButton("10% Discount");
        rb10.setBounds(50, 270, 200, 30);
        frame.add(rb10);

        JRadioButton rb15 = new JRadioButton("15% Discount");
        rb15.setBounds(50, 300, 200, 30);
        frame.add(rb15);

        // Group the discount radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(rbNone);
        group.add(rb5);
        group.add(rb10);
        group.add(rb15);

        // Create the order button
        JButton btnOrder = new JButton("Order");
        btnOrder.setBounds(50, 330, 200, 30);
        frame.add(btnOrder);

        // Action listener for the order button
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double totalPrice = 0;

                // Calculate the total price based on selected food items
                if (cPizza.isSelected()) totalPrice += 100;
                if (cBurger.isSelected()) totalPrice += 80;
                if (cFries.isSelected()) totalPrice += 65;
                if (cSoftDrinks.isSelected()) totalPrice += 55;
                if (cTea.isSelected()) totalPrice += 50;
                if (cSundae.isSelected()) totalPrice += 40;

                // Determine the discount
                double discount = 0;
                if (rb5.isSelected()) discount = 0.05;
                else if (rb10.isSelected()) discount = 0.10;
                else if (rb15.isSelected()) discount = 0.15;

                // Apply the discount
                totalPrice = totalPrice - (totalPrice * discount);

                // Display the total price
                JOptionPane.showMessageDialog(frame, "The total price is Php " + String.format("%.2f", totalPrice));
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}