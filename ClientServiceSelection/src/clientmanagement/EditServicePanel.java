package clientmanagement;

import javax.swing.*;

public class EditServicePanel extends JPanel {

    /**
     * Creates the edit service panel for a given client.
     *
     * @param client the index of the client to be edited
     */
    public EditServicePanel(MainFrame mainFrame, int client) {
        setLayout(null);

        // User prompt label
        JLabel clientNameLabel = new JLabel("Select service option for " + mainFrame.clientNames[client]);
        clientNameLabel.setBounds(35, 50, 250, 25); // Set the label position and size
        add(clientNameLabel); // Add label to the panel

        // Brokerage service option button
        JButton brokerageButton = new JButton("Brokerage");
        brokerageButton.setBounds(35, 85, 100, 25); // Set the button position and size
        add(brokerageButton); // Add button to the panel

        // On clicking the button, update the service choice of the set client
        brokerageButton.addActionListener(e -> {
            mainFrame.serviceSelections[client] = "Brokerage";
            mainFrame.refreshMainPanel(); // refresh main panel to reflect edits
            mainFrame.cardLayout.show(mainFrame.cardPanel, "main"); // Transition back to main panel
        });

        // Retirement service option button
        JButton retirementButton = new JButton("Retirement");
        retirementButton.setBounds(35, 120, 100, 25); // Set the button position and size
        add(retirementButton);// Add button to the panel

        // On clicking the button, update the service choice of the set client
        retirementButton.addActionListener(e -> {
            mainFrame.serviceSelections[client] = "Retirement";
            mainFrame.refreshMainPanel(); // refresh main panel to reflect edits
            mainFrame.cardLayout.show(mainFrame.cardPanel, "main"); // Transition back to main panel
        });
    }
}
