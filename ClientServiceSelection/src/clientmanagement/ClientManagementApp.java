package clientmanagement;

import java.awt.*;

/**
 * Primary class to launch the Application.
 */
public class ClientManagementApp {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                MainFrame window = new MainFrame(); // Create the application window
                window.frame.setVisible(true); // Make the window visible
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}