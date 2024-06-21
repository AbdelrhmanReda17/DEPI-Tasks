package Data;

import Models.User;

import java.util.Vector;

public class DataManager {
    static private final Vector<User> users = new Vector<>();
    static final String[] courses = {
            "Java Programming",
            "Web Development",
            "Data Science",
            "Machine Learning"
    };

    static public void addUser(User user) {
        users.add(user);
    }
    static public int getSize(){
        return users.size();
    }

    static public boolean isUserRegistered(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    static public Vector<User> getUsers() {
        return users;
    }
    static public String[] getCourses() {
        return courses;
    }
    static public boolean isPasswordCorrect(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    static public User getUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

}
