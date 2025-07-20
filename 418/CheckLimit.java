

import java.util.Scanner;

public class CheckLimit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

           // Entering customer details
        System.out.print("Enter account number (or 0 to quit): ");
        int accountNumber = input.nextInt();

        while (accountNumber != 0) 
        
        {
            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();


            System.out.print("Enter total charges: ");
            int charges = input.nextInt();


            System.out.print("Enter total credits: ");
            int credits = input.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int creditLimit = input.nextInt();

            // Calculating new balance
            int newBalance = beginningBalance + charges - credits;
            System.out.println("New balance for account " + accountNumber + " is: " + newBalance);

              // Checking credit limit
            if (newBalance > creditLimit) 
            {
                System.out.println("Credit limit exceeded.");
            }

            
            System.out.print("Enter account number (or 0 to quit): ");
            accountNumber = input.nextInt();
        }

        System.out.println("All Done");
        input.close();
    }
}
