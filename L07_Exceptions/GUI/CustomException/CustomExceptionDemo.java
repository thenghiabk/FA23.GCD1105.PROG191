package L07_Exceptions.GUI.CustomException;

import javax.swing.*;
import java.awt.*;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Custom Exception to JLabel Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel exceptionLabel = new JLabel();
            frame.add(exceptionLabel, BorderLayout.CENTER);

            JButton throwExceptionButton = new JButton("Throw Custom Exception");
            throwExceptionButton.addActionListener(e -> {
                try {
                    // Simulate throwing a custom exception
                    throw new CustomException("This is a custom exception.");
                } catch (CustomException ex) {
                    // Set the text of the JLabel to display the custom exception message
                    exceptionLabel.setText("Custom Exception: " + ex.getMessage());
                }
            });
            frame.add(throwExceptionButton, BorderLayout.SOUTH);

            frame.pack();
            frame.setVisible(true);
        });

    }
}
