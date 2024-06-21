package Models;

public class Instructor extends User {
    static public int instructorId;
    public Instructor(String username, String password) {
        super(username, password , "I"); // I for instructor
        instructorId = instructorId++;
    }
}
