package clientmanagement;

import clientmanagement.util.Handler;
import clientmanagement.util.InputValidationService;

import javax.swing.*;

public class LoginPanel extends JPanel {

    Handler handler = new Handler();
    InputValidationService validation = new InputValidationService();

    /**
     * Creates the login panel.
     */
    public LoginPanel(MainFrame mainFrame) {
        setLayout(null);

        // Login screen welcome/title label
        JLabel entryLabel = new JLabel("Client Portal Login");
        entryLabel.setBounds(100, 10, 150, 25); // Set the label position and size
        add(entryLabel); // Add label to the panel

        // Username label
        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(35, 50, 100, 25); // Set the label position and size
        add(userLabel); // Add label to the panel

        // Text field for username entry
        JTextField userText = new JTextField();
        userText.setBounds(125, 50, 150, 25); // Set the text field position and size
        add(userText); // Add text field to the panel

        // Password label
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(35, 85, 100, 25); // Set the label position and size
        add(passwordLabel); // Add label to the panel

        // Text field for password entry
        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(125, 85, 150, 25); // Set the password field position and size
        add(passwordText); // Add text field to the panel

        // Feedback message for login success status
        JLabel successLabel = new JLabel("");
        successLabel.setBounds(35, 125, 250, 25); // Set the label position and size
        add(successLabel); // Add label to the panel

        // Button used to initiate login attempt
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 150, 100, 25); // Set the button position and size
        add(loginButton); // Add button to the panel

        // Action listener for the login button, initiates credential validation
        loginButton.addActionListener(e -> {

            // input sanitization process

            String username = "";
            String password = "";

            if (validation.isValidUsername(userText.getText())) {
                username = userText.getText();
            } else {
                successLabel.setText("Invalid Username");
            }

            if (validation.isValidPassword(passwordText.getText())) {
                password = new String(passwordText.getPassword()); // Retrieve the password from the password text field
            } else {
                successLabel.setText("Invalid Password");
            }

            successLabel.setText(""); // Clear the success label

            // Validate user input against admin username and password
            if (handler.onUserLogin(username, password)) {

                // If login is successful, transition to the main panel
                successLabel.setText("Login Successful");
                mainFrame.cardLayout.show(mainFrame.cardPanel, "main");
            } else {

                // If login is unsuccessful, increment the login counter
                mainFrame.loginCounter++;

                // If the user expends their login attempts, disable Login button
                if (mainFrame.loginCounter == mainFrame.attempts) {
                    loginButton.setEnabled(false);
                }

                // Print success state message to inform the user of failed login.
                successLabel.setText("Login Failed, " + (mainFrame.attempts - mainFrame.loginCounter) + " attempts remaining.");

            }
        });
    }
}
