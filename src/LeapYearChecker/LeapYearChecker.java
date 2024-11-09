package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Leap Year Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(null);

        // Create the input field
        JTextField yearTextField = new JTextField();
        yearTextField.setName("yearTextField");
        yearTextField.setBounds(50, 20, 200, 30);
        frame.add(yearTextField);

        // Create the button
        JButton checkYearButton = new JButton("Check Year");
        checkYearButton.setName("checkYearButton");
        checkYearButton.setBounds(50, 60, 200, 30);
        frame.add(checkYearButton);

        // Add action listener for the button
        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = yearTextField.getText();
                try {
                    // Parse input as an integer (year)
                    int year = Integer.parseInt(input);
                    if (isLeapYear(year)) {
                        JOptionPane.showMessageDialog(frame, "Leap year", "Message", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Not a leap year", "Message", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    // Handle invalid input (non-numeric)
                    JOptionPane.showMessageDialog(frame, "Please enter a valid year", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            // Helper method to check for leap year
            private boolean isLeapYear(int year) {
                return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            }
        });

        // Make the frame visible and ensure the UI is updated
        frame.setVisible(true);
    }
}