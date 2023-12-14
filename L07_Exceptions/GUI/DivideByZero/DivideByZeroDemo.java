package L07_Exceptions.GUI.DivideByZero;

import javax.swing.*;
import java.awt.*;

public class DivideByZeroDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Exception to JLabel Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel exceptionLabel = new JLabel();
            frame.add(exceptionLabel, BorderLayout.CENTER);

            JButton throwExceptionButton = new JButton("Throw Exception");
            throwExceptionButton.addActionListener(e -> {
                try {
                    // Simulate an exception
                    int result = 10 / 0;
                } catch (Exception ex) {
                    // Set the text of the JLabel to display the exception message
                    exceptionLabel.setText("Exception: " + ex.getMessage());
                }
            });
            frame.add(throwExceptionButton, BorderLayout.SOUTH);

            frame.pack();
            frame.setVisible(true);
        });
    }
}
