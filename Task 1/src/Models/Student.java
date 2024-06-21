package Models;

public class Student extends User {
    static public int studentId;
    public Student(String username, String password) {
        super( username, password , "S"); // S for student
        studentId = IDGenerator.generateStudentId();
    }
}
