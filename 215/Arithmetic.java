import java.util.Scanner; // adding scanner
public class Arithmetic {
  public static void main (String[] args)
  {
  Scanner input = new Scanner(System.in);
  System.out.print(Enter first integer");
  int x = input.nextInt();// read first inetger
  System.out.print("Enter second integer");
  int y = input.nextInt();
 int sum = x + y;
        int product = x * y;
        int difference = x - y;
        int division = x / y;

         System.out.printf("Sum is %d%n" , sum);
            System.out.printf"Product is %d%n " , product);
            System.out.printf("Difference is %d%n " , difference);
            System.out.printf("Quotient is %d%n" , division");
}
input.close();
}
