import java.util.Scanner;

public class GrossPay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int employeeNumber = 1;

        while (employeeNumber <= 3) {  // For 3 employees
            System.out.println("Enter hours worked for Employee " + employeeNumber + ":");
            int hours = input.nextInt();

            System.out.println("Enter hourly rate for Employee " + employeeNumber + ":");
            int rate = input.nextInt();

            double grossPay;

            if (hours <= 40) {
                grossPay = hours * rate;  // Straight time
            } else {
                int overtimeHours = hours - 40;
                grossPay = (40 * rate) + (overtimeHours * rate * 1.5); // Overtime
            }

            System.out.println("Gross pay for Employee " + employeeNumber + " is: $" + grossPay);
            System.out.println("---------------------------------");

            employeeNumber++; // Move to next employee
        }

        input.close();
    }
}
