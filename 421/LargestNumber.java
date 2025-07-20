import java.util.Scanner;

// Finding Largest Number

 public class LargestNumber{
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest;

        // Input the first number and assume it's the largest
        System.out.print("Enter number 1: ");
        largest = input.nextInt();

        counter = 2; // Start from second number
        while (counter <= 10) {
            System.out.print("Enter number " + counter + ": ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter = counter + 1 ;
        }

        System.out.println("The largest number is: " + largest);
        input.close();
    }
}
