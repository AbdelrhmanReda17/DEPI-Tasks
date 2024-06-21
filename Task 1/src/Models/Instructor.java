package Models;

public class Instructor extends User {
    public int instructorId;
    public Instructor(String username, String password) {
        super(username, password , "I"); // I for instructor
        instructorId = IDGenerator.generateInstructorId();
    }
}
