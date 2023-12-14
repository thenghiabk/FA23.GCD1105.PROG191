package L07_Exceptions.GUI.EmptyInput;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmptyInputExceptionDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Empty TextField Exception Handling");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            JTextField textField = new JTextField(20);
            JButton checkButton = new JButton("Check Input");

            panel.add(textField);
            panel.add(checkButton);

            checkButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        String inputText = textField.getText().trim();
                        if (inputText.isEmpty()) {
                            throw new IllegalArgumentException("Input cannot be empty.");
                        }

                        // Process the valid input here
                        JOptionPane.showMessageDialog(frame, "Input is not empty: " + inputText);

                    } catch (IllegalArgumentException ex) {
                        // Display an error message for empty input
                        JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
