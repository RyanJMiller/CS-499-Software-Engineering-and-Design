package clientmanagement;

import javax.swing.*;

public class MainPanel extends JPanel {

    /**
     * Creates the main panel displaying client names and their service selections.
     * Includes edit buttons for each client to make changes to their selected service.
     */
    public MainPanel(MainFrame mainFrame) {
        setLayout(null);

        // Client Name column label
        JLabel categoryOneLabel = new JLabel("Client Name");
        categoryOneLabel.setBounds(35, 10, 100, 25); // Set the label position and size
        add(categoryOneLabel); // Add label to the panel

        // Service Selected column label
        JLabel categoryTwoLabel = new JLabel("Service Selected");
        categoryTwoLabel.setBounds(150, 10, 100, 25); // Set the label position and size
        add(categoryTwoLabel); // Add label to the panel


        // Name label for the first client
        JLabel clientOneNameLabel = new JLabel(mainFrame.clientNames[0]);
        clientOneNameLabel.setBounds(35, 50, 100, 25); // Set the label position and size
        add(clientOneNameLabel); // Add label to the panel

        // Service label for the first client
        JLabel clientOneServiceLabel = new JLabel(mainFrame.serviceSelections[0]);
        clientOneServiceLabel.setBounds(150, 50, 100, 25); // Set the label position and size
        add(clientOneServiceLabel); // Add label to the panel

        // Edit button for the first client
        JButton clientOneButton = new JButton("Edit");
        clientOneButton.setBounds(265, 50, 75, 25); // Set the button position and size
        add(clientOneButton); // Add button to the panel

        // On clicking the button, update the Edit Service Panel with the index of the client
        clientOneButton.addActionListener(e -> {
            mainFrame.updateEditServicePanel(0);
            mainFrame.cardLayout.show(mainFrame.cardPanel, "editService"); // Transition to Edit Service panel
        });


        // Name label for the second client
        JLabel clientTwoNameLabel = new JLabel(mainFrame.clientNames[1]);
        clientTwoNameLabel.setBounds(35, 85, 100, 25); // Set the label position and size
        add(clientTwoNameLabel); // Add label to the panel

        // Service label for the second client
        JLabel clientTwoServiceLabel = new JLabel(mainFrame.serviceSelections[1]);
        clientTwoServiceLabel.setBounds(150, 85, 100, 25); // Set the label position and size
        add(clientTwoServiceLabel); // Add label to the panel

        // Edit button for the second client
        JButton clientTwoButton = new JButton("Edit");
        clientTwoButton.setBounds(265, 85, 75, 25); // Set the button position and size
        add(clientTwoButton); // Add button to the panel

        // On clicking the button, update the Edit Service Panel with the index of the client
        clientTwoButton.addActionListener(e -> {
            mainFrame.updateEditServicePanel(1);
            mainFrame.cardLayout.show(mainFrame.cardPanel, "editService"); // Transition to Edit Service panel
        });


        // Name label for the third client
        JLabel clientThreeNameLabel = new JLabel(mainFrame.clientNames[2]);
        clientThreeNameLabel.setBounds(35, 120, 100, 25); // Set the label position and size
        add(clientThreeNameLabel); // Add label to the panel

        // Service label for the third client
        JLabel clientThreeServiceLabel = new JLabel(mainFrame.serviceSelections[2]);
        clientThreeServiceLabel.setBounds(150, 120, 100, 25); // Set the label position and size
        add(clientThreeServiceLabel); // Add label to the panel

        // Edit button for the third client
        JButton clientThreeButton = new JButton("Edit");
        clientThreeButton.setBounds(265, 120, 75, 25); // Set the button position and size
        add(clientThreeButton); // Add button to the panel

        // On clicking the button, update the Edit Service Panel with the index of the client
        clientThreeButton.addActionListener(e -> {
            mainFrame.updateEditServicePanel(2);
            mainFrame.cardLayout.show(mainFrame.cardPanel, "editService"); // Transition to Edit Service panel
        });


        // Name label for the fourth client
        JLabel clientFourNameLabel = new JLabel(mainFrame.clientNames[3]);
        clientFourNameLabel.setBounds(35, 155, 100, 25); // Set the label position and size
        add(clientFourNameLabel); // Add label to the panel

        // Service label for the fourth client
        JLabel clientFourServiceLabel = new JLabel(mainFrame.serviceSelections[3]);
        clientFourServiceLabel.setBounds(150, 155, 100, 25); // Set the label position and size
        add(clientFourServiceLabel); // Add label to the panel

        // Edit button for the fourth client
        JButton clientFourButton = new JButton("Edit");
        clientFourButton.setBounds(265, 155, 75, 25); // Set the button position and size
        add(clientFourButton); // Add button to the panel

        // On clicking the button, update the Edit Service Panel with the index of the client
        clientFourButton.addActionListener(e -> {
            mainFrame.updateEditServicePanel(3);
            mainFrame.cardLayout.show(mainFrame.cardPanel, "editService"); // Transition to Edit Service panel
        });


        // Name label for the fifth client
        JLabel clientFiveNameLabel = new JLabel(mainFrame.clientNames[4]);
        clientFiveNameLabel.setBounds(35, 190, 100, 25); // Set the label position and size
        add(clientFiveNameLabel); // Add label to the panel

        // Service label for the fifth client
        JLabel clientFiveServiceLabel = new JLabel(mainFrame.serviceSelections[4]);
        clientFiveServiceLabel.setBounds(150, 190, 100, 25); // Set the label position and size
        add(clientFiveServiceLabel); // Add label to the panel

        // Edit button for the fifth client
        JButton clientFiveButton = new JButton("Edit");
        clientFiveButton.setBounds(265, 190, 75, 25); // Set the button position and size
        add(clientFiveButton); // Add button to the panel

        // On clicking the button, update the Edit Service Panel with the index of the client
        clientFiveButton.addActionListener(e -> {
            mainFrame.updateEditServicePanel(4);
            mainFrame.cardLayout.show(mainFrame.cardPanel, "editService"); // Transition to Edit Service panel
        });
    }
}
