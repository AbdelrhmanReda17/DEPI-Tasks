package Models;

public class IDGenerator {
    static private int studentId = 0;
    static private int instructorId = 0;
    static public int generateStudentId() {
        return studentId++;
    }

    static public int generateInstructorId() {
        return instructorId++;
    }
}
