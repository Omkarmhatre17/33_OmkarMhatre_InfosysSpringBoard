public class EmployeeRecord {

    public static void main(String[] args) {
        // Salaries of five employees
        double[] salaries = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};

        // Calculate the average salary
        double totalSalary = 0;
        for (double salary : salaries) {
            totalSalary += salary;
        }
        double averageSalary = totalSalary / salaries.length;

        // Count the number of employees with salary greater than average and lesser than average
        int aboveAverageCount = 0;
        int belowAverageCount = 0;
        for (double salary : salaries) {
            if (salary > averageSalary) {
                aboveAverageCount++;
            } else if (salary < averageSalary) {
                belowAverageCount++;
            }
        }

        // Display the summary
        System.out.println("Employee Salaries:");
        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Employee " + (i + 1) + ": $" + salaries[i]);
        }

        System.out.println("\nAverage Salary: $" + averageSalary);
        System.out.println("Number of employees with salary greater than average: " + aboveAverageCount);
        System.out.println("Number of employees with salary lesser than average: " + belowAverageCount);
    }
}
