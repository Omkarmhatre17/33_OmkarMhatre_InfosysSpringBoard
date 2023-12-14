class Employee {
    private int points;

    // Getter and Setter for points
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}

class PerformanceRating {
    private static final int Outstanding = 5;
    private static final int Good = 4;
    private static final int Average = 3;
    private static final int Poor = 2;

    // Static method to calculate performance
    public static int calculatePerformance(Employee employee) {
        int points = employee.getPoints();

        if (points >= 80 && points <= 100) {
            return Outstanding;
        } else if (points >= 60 && points <= 79) {
            return Good;
        } else if (points >= 50 && points <= 59) {
            return Average;
        } else if (points >= 1 && points <= 49) {
            return Poor;
        } else {
            // Default case if the point is out of valid range
            return -1; // or throw an exception indicating invalid points
        }
    }
}

public class PerformanceCalculator {
    public static void main(String[] args) {
        // Create three Employee objects
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        // Set points for each employee
        employee1.setPoints(90);
        employee2.setPoints(65);
        employee3.setPoints(40);

        // Calculate and print performance ratings for each employee
        System.out.println("Employee 1 Performance Rating: " + PerformanceRating.calculatePerformance(employee1));
        System.out.println("Employee 2 Performance Rating: " + PerformanceRating.calculatePerformance(employee2));
        System.out.println("Employee 3 Performance Rating: " + PerformanceRating.calculatePerformance(employee3));
    }
}