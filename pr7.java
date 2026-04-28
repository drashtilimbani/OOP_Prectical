import java.util.Scanner;

class Employee {
    // Private instance variables
    private String employeeName;
    private double employeeSalary;

    // Method to read employee data from user
    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        employeeSalary = sc.nextDouble();
    }

    // Method to display employee data
    public void displayEmployeeData() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }
}

public class pr7 {
    public static void main(String[] args) {
        // Object creation
        Employee emp = new Employee();

        // Method invocation
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}
