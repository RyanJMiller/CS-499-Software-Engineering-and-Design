package clientmanagement.util;

public class InputValidationService {
    /**
     * Validates a username input.
     * return True if the username meets criteria, false otherwise.
     */
    public boolean isValidUsername(String username) {
        String usernamePattern = "^[a-zA-Z0-9._-]+$"; // Alphanumeric, '.', '-', and '_'
        return username.matches(usernamePattern) && !username.isEmpty();
    }

    /**
     * Validates a password.
     * return True if the password meets criteria, false otherwise.
     */
    public boolean isValidPassword(String password) {
        String passwordPattern = "^[a-zA-Z0-9.!@#$&_=-]+$"; // Alphanumeric and special characters
        return password.matches(passwordPattern) && !password.isEmpty();
    }
}
