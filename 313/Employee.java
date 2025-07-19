

public class Employee {

  //   Creating Instance variables
  private String firstName;
  private String lastName;
  private double salary;

  //  Adding Constructor
  public Employee(String firstName, String lastName, double salary) {
    this.firstName = firstName;
    this.lastName = lastName;

    // validating  salary is not negative
    if (salary > 0.0) {
      this.salary = salary;
    }
    else{

      this.salary = 0;
    }
  }

  // Method to raise salary by 10%
  public void raiseSalary() {
    salary = salary + (0.10 * salary);
  }

  // Method to return monthly salary
  public double getSalary() {
    return salary;
  }

  //  Method to return yearly salary
  public double getYearlySalary() {
    return salary * 12;
  }

  // Setters and Getters
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLastName() {
    return lastName;
  }

  // Setter for salary
public void setSalary(double salary) {
  if (salary > 0.0) {
    this.salary = salary;
  } else {
    this.salary = 0.0;
  }
  
  }

}
