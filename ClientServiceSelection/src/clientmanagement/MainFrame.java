package clientmanagement;

import javax.swing.*;
import java.awt.*;

/**
 * Class to handle the main application frame.
 * Uses a card layout to handle switching between different screens.
 */
public class MainFrame {
    JFrame frame;
    JPanel cardPanel;
    CardLayout cardLayout;

    int loginCounter = 0; // Counter variable to track login attempts.
    final int attempts = 3; // Constant representing the number of login attempts allowed.

    // Arrays containing client names and their associated service selection by index
    String[] serviceSelections = {"Brokerage", "Retirement", "Brokerage", "Brokerage", "Retirement"};
    String[] clientNames = {"Bob Jones", "Sarah Davis", "Amy Friendly", "Johnny Smith", "Carol Spears"};

    /**
     * Constructor for clientmanagement.MainFrame class.
     * Calls private initialization method.
     */
    public MainFrame() {
        initialize();
    }

    /**
     * Initializes the main frame and its components.
     * Includes the login and main panels
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 500, 500); // sets the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        frame.getContentPane().add(cardPanel, BorderLayout.CENTER);

        JPanel loginPanel = new LoginPanel(this); // Create the login panel

        cardPanel.add(loginPanel, "login"); // Add the login panel to the card panel

        defineMainPanel(); // Calls dedicated method to create the main panel and add it to the card panel

        cardLayout.show(cardPanel, "login"); // Show the login panel first
    }

    /**
     * Prepares the main panel.
     */
    void defineMainPanel() {
        JPanel mainPanel = new MainPanel(this); // Create the main panel
        cardPanel.add(mainPanel, "main"); // Add the main panel to the card panel
    }

    /**
     * Refreshes the main panel to reflect client service changes.
     */
    void refreshMainPanel() {
        cardPanel.remove(cardPanel.getComponent(1)); // Remove the old main panel
        defineMainPanel(); // Add the updated main panel
    }

    /**
     * Updates the edit service panel for a given client.
     *
     * @param client the index of the client to be edited
     */
    void updateEditServicePanel(int client) {
        JPanel editServicePanel = new EditServicePanel(this, client); // Create the edit service panel
        cardPanel.add(editServicePanel, "editService"); // Add the edit service panel to the card panel
    }
}
