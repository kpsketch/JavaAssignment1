
import java.util.Scanner; //adding Scanner for user input
public class Comparison{// adding new class
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter First integer");// adding first integer
    int x = input.nextInt();
    System.out.print("Enter second integer");
    int y = input.nextInt();
    if (x > y) {
            System.out.println(x + " is larger");
        } else if (num2 > num1) {
            System.out.println(y + " is larger");
        } else {
            System.out.println("These numbers are equal");
        }

        input.close();
      
    }
  }
