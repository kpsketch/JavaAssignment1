
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

  
        if (number % 2 == 0) {. //if remainder is 0
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        input.close();
    }
}
