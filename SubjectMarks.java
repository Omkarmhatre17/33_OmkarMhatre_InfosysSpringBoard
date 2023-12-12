import java.util.Scanner;

public class SubjectMarks {
    private int[] marksArray;

    // Constructor to initialize the array
    public SubjectMarks() {
        marksArray = new int[5];
    }

    // Method to store marks in the array
    public void inputMarks() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < marksArray.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marksArray[i] = scanner.nextInt();
        }

        scanner.close();
    }

    // Method to display marks using enhanced for loop
    public void displayMarks() {
        System.out.println("Subject-wise Marks:");

        int subjectNumber = 1;
        for (int marks : marksArray) {
            System.out.println("Subject " + subjectNumber + ": " + marks);
            subjectNumber++;
        }
    }

    public static void main(String[] args) {
        SubjectMarks subjectMarks = new SubjectMarks();

        // Input marks
        subjectMarks.inputMarks();

        // Display marks
        subjectMarks.displayMarks();
    }
}
