package Models;

public class User {
    private final String username;
    private final String password;
    private final String type;
    public User(String username, String password , String type) {
        this.username = username;
        this.password = password;
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}
