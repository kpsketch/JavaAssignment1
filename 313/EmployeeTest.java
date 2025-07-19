

import java.util.Scanner;

public class EmployeeTest {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // Creating two Employee objects
    Employee employeeOne = new Employee("Raj", "Verma", 0.0);
    Employee employeeTwo = new Employee("Simran", "Kaur", 0.0);

    // Input salary for Employee One
    System.out.print("Enter monthly salary for " + employeeOne.getFirstName() + " " + employeeOne.getLastName() + ": ");
    double salary1 = input.nextDouble();
    employeeOne.setSalary(salary1);

    // Input salary for Employee Two
    System.out.print("Enter monthly salary for " + employeeTwo.getFirstName() + " " + employeeTwo.getLastName() + ": ");
    double salary2 = input.nextDouble();
    employeeTwo.setSalary(salary2);

    // Displaying yearly salaries before raise
    System.out.printf("%nYearly Salaries before 10%% raise:%n");
    System.out.printf("%s %s: $%.2f%n",
        employeeOne.getFirstName(), employeeOne.getLastName(), employeeOne.getYearlySalary());
    System.out.printf("%s %s: $%.2f%n",
        employeeTwo.getFirstName(), employeeTwo.getLastName(), employeeTwo.getYearlySalary());

    // Apply 10% raise
    employeeOne.raiseSalary();
    employeeTwo.raiseSalary();

    // Displaying yearly salaries after raise
    System.out.printf("%nYearly Salaries after 10%% raise:%n");
    System.out.printf("%s %s: $%.2f%n",
        employeeOne.getFirstName(), employeeOne.getLastName(), employeeOne.getYearlySalary());
    System.out.printf("%s %s: $%.2f%n",
        employeeTwo.getFirstName(), employeeTwo.getLastName(), employeeTwo.getYearlySalary());

    input.close();
  }
}
