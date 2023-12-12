class Student {
    private String studentName;
    private String studentID;
    private char residentialStatus; // 'H' for hosteller, 'D' for day scholar

    // Constructor
    public Student(String studentName, String studentID, char residentialStatus) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.residentialStatus = residentialStatus;
    }

    // Getter methods
    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public char getResidentialStatus() {
        return residentialStatus;
    }

    // Setter methods
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setResidentialStatus(char residentialStatus) {
        this.residentialStatus = residentialStatus;
    }
}

// Tester class to check the implemented code
public class StudentTester {
    public static void main(String[] args) {
        // Creating a student object
        Student student1 = new Student("John Doe", "12345", 'H');

        // Displaying student details
        System.out.println("Student Name: " + student1.getStudentName());
        System.out.println("Student ID: " + student1.getStudentID());
        System.out.println("Residential Status: " + student1.getResidentialStatus());

        // Updating student details
        student1.setStudentName("Jane Doe");
        student1.setResidentialStatus('D');

        // Displaying updated student details
        System.out.println("\nUpdated Student Details:");
        System.out.println("Student Name: " + student1.getStudentName());
        System.out.println("Student ID: " + student1.getStudentID());
        System.out.println("Residential Status: " + student1.getResidentialStatus());
    }
}
