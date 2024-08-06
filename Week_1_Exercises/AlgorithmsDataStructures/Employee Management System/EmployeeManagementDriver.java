package com.company;

public class EmployeeManagementDriver {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        // Adding employees
        ems.addEmployee(new Employee("E001", "Alice", "Developer", 60000));
        ems.addEmployee(new Employee("E002", "Bob", "Designer", 50000));
        ems.addEmployee(new Employee("E003", "Charlie", "Manager", 80000));
        ems.addEmployee(new Employee("E004", "David", "Analyst", 55000));
        ems.addEmployee(new Employee("E005", "Eve", "HR", 45000));

        // Traverse employees
        System.out.println("Employees in the system:");
        ems.traverseEmployees();

        // Search for an employee
        System.out.println("\nSearching for employee E003:");
        Employee emp = ems.searchEmployee("E003");
        if (emp != null) {
            System.out.println("Employee found: " + emp);
        } else {
            System.out.println("Employee not found");
        }

        // Delete an employee
        System.out.println("\nDeleting employee E002:");
        boolean deleted = ems.deleteEmployee("E002");
        if (deleted) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }

        // Traverse employees after deletion
        System.out.println("\nEmployees in the system after deletion:");
        ems.traverseEmployees();
    }
}
