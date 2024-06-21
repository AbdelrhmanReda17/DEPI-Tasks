package Models;

import java.util.Objects;

public class ModelsFactory {
    public static User createModel(String username , String password , String type) {
        if (type.equals("I")) {
            return new Instructor(username, password);
        } else if (type.equals("S")) {
            return new Student(username, password);
        }
        return null;
    }
}
