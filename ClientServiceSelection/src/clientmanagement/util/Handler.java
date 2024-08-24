package clientmanagement.util;

import clientmanagement.models.Account;

import java.util.Arrays;

public class Handler {

    Hasher hasher = new Hasher();
    Account account = new Account();

    /**
     * Calls methods to verify the user's password during login.
     *
     * @param username     The user's input username.
     * @param password     The user's input password.
     *
     * return True if the password is a match, false otherwise.
     */

    public boolean onUserLogin(String username, String password) {

        char[] passwordCharArray = password.toCharArray();
        byte[] hashByteArray = hasher.fromBase64(account.getHashedPassword());
        byte[] saltByteArray = hasher.fromBase64(account.getSalt());

        try {

            return hasher.verifyPassword(passwordCharArray, hashByteArray, saltByteArray) && username.equals(account.getUsername());

        } finally {
            Arrays.fill(passwordCharArray, '0');
            Arrays.fill(hashByteArray, (byte) 0);
            Arrays.fill(saltByteArray, (byte) 0);
        }
    }

}
