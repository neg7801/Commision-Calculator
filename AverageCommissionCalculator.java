import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;
    String name;
    List<Commission> commissions;

    public Employee(int id, String name, List<Commission> commissions) {
        this.id = id;
        this.name = name;
        this.commissions = commissions;
    }

    public double calculateAverageCommission() {
        double totalCommission = 0.0;
        for (Commission commission : commissions) {
            totalCommission += commission.amount;
        }
        return totalCommission / commissions.size();
    }
}

class Commission {
    int year;
    int month;
    double amount;

    public Commission(int year, int month, double amount) {
        this.year = year;
        this.month = month;
        this.amount = amount;
    }
}

public class AverageCommissionCalculator {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Populate the employees list with your data
        // ...

        // Calculate and print the average commission for each employee
        for (Employee employee : employees) {
            double averageCommission = employee.calculateAverageCommission();
            System.out.println("Employee " + employee.name + " (ID: " + employee.id + "): Average Commission = "
                    + averageCommission);
        }
    }
}
