import java.util.Scanner;

public class TwoLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int largest;
        int secondLargest;
        int counter = 0;  // We will start counting from the second number

        // Input the first number and assume it's the largest
        System.out.println("Enter number 1: ");
        largest = input.nextInt();

        // Input the second number and make it largest if it is greater than 1st no. and vice versa
        System.out.println("Enter number 2: ");
        number = input.nextInt();

        if (number > largest) {
            secondLargest = largest;
            largest = number;
        } else {
            secondLargest = number;
        }

        counter = 3;

        while (counter <= 10) {
            System.out.println("Enter number " + counter + ": ");
            number = input.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }

            counter++;
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The second largest number is: " + secondLargest);

        input.close();
    }
}
