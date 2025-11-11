import java.util.ArrayList;
import java.util.List;


class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    double calculateSalary() {
        return 0.0;
    }

    void displayInfo() {
        System.out.println("Employee Name: " + name + ", ID: " + id);
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    FullTimeEmployee(String name, int id) {
        super(name, id);
        this.monthlySalary = 40000;
    }

    @Override
    //annotation
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class Task10 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("Samir", 100, 50000));
        employees.add(new FullTimeEmployee("Amit", 203));
        employees.add(new PartTimeEmployee("Aarav", 112, 80, 300));
        employees.add(new PartTimeEmployee("Riya", 160, 100, 250));

        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println("Calculated Salary : " + emp.calculateSalary());
        }
    }
}
