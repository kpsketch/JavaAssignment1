

import java.util.Scanner;

public class Arithmetic217 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        

        System.out.print("Enter first integer: ");//adding 1st number
        int x = input.nextInt();

        System.out.print("Enter second integer: ");
        int y = input.nextInt();//adding 2nd number

        System.out.print("Enter third integer: ");//adding third number
        int z = input.nextInt();

    
        int sum = x + y + z;
        int average = sum / 3;
        int product = x * y * z;

        int small ;

int large ;

if (x < y && x < z) {
    small= x;
} else if (y < z) {
    small = y;
} else {
    small = z;
}

// Check for largest
if (x > y && x > z) {
    large = x;
} else if (y > z) {
    large = y;
} else {
    large= z;
}

}
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
        System.out.println("Product is " + product);
        System.out.println("Smallest is " + small);
        System.out.println("Largest is " + large);

        input.close();
    }

