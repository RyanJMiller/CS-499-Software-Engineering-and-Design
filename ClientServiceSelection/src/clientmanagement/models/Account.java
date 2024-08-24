package clientmanagement.models;

public class Account {

    private String username = "admin";

    private String salt = "hd3ae9oUq19WJ9wE3iQk1w==";

    private String hashedPassword = "uzIuucDkOAk21Kc5mknJ7Nn9v2YPwcaUZJcW8wf+Kqs=";


    public String getUsername() {
        return username;
    }

    public String getSalt() {
        return salt;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }
}
