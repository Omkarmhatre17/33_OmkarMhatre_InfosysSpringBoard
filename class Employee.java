class Employee {
    private int point;

    // Constructor
    public Employee(int point) {
        this.point = point;
    }

    // Getter method
    public int getPoint() {
        return point;
    }

    // Setter method
    public void setPoint(int point) {
        this.point = point;
    }
}

class PerformanceRating {
    // Constants
    private static final int Outstanding = 5;
    private static final int Good = 4;
    private static final int Average = 3;
    private static final int Poor = 2;

    // Static method to calculate performance
    public static int calculatePerformance(Employee employee) {
        int point = employee.getPoint();

        if (point >= 80 && point <= 100) {
            return Outstanding;
        } else if (point >= 60 && point <= 79) {
            return Good;
        } else if (point >= 50 && point <= 59) {
            return Average;
        } else if (point >= 1 && point <= 49) {
            return Poor;
        } else {
            System.out.println("Invalid point. Point should be between 1 and 100.");
            return 0; // Default return value for invalid points
        }
    }
}

public class PerformanceCalculator {
    public static void main(String[] args) {
        // Creating employee objects
        Employee employee1 = new Employee(90);
        Employee employee2 = new Employee(75);
        Employee employee3 = new Employee(55);

        // Calculating and printing performance ratings
        System.out.println("Employee 1 Rating: " + PerformanceRating.calculatePerformance(employee1));
        System.out.println("Employee 2 Rating: " + PerformanceRating.calculatePerformance(employee2));
        System.out.println("Employee 3 Rating: " + PerformanceRating.calculatePerformance(employee3));
    }
}
