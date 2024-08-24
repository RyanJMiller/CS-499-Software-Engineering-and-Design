package clientmanagement.util;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.spec.KeySpec;
import java.util.Arrays;
import java.util.Base64;

public class Hasher {

    private static final int ITERATIONS = 1000; // Iterations for key generation
    private static final int KEY_LENGTH = 256; // Key length in bits

    /**
     * Hashes a password using PBKDF2 with HMAC-SHA256.
     *
     * @param password The password as a character array.
     * @param salt     The salt used for hashing.
     * return the hashed password as a byte array.
     */
    public byte[] hashPassword(char[] password, byte[] salt) {
        try {
            KeySpec spec = new PBEKeySpec(password, salt, ITERATIONS, KEY_LENGTH);
            SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
            return factory.generateSecret(spec).getEncoded();
        } catch (Exception e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }

    /**
     * Verifies a password by comparing a stored hash with a newly hashed password.
     *
     * @param enteredPassword The entered password as a character array.
     * @param storedHash      The stored password hash.
     * @param storedSalt      The stored salt value.
     * return True if the password is correct, false otherwise.
     */
    public boolean verifyPassword(char[] enteredPassword, byte[] storedHash, byte[] storedSalt) {
        byte[] hashedPassword = hashPassword(enteredPassword, storedSalt);
        return Arrays.equals(hashedPassword, storedHash);
    }

    // method to convert from Base64 (String to Byte array)
    public byte[] fromBase64(String base64String) {
        return Base64.getDecoder().decode(base64String);
    }
}
