
import java.util.Scanner;

// creating Datetest Class
public class DateTest {
  public static void main(String[] args) 
  {

    // adding scanner for user input
    Scanner input = new Scanner(System.in);

    // entering month, day, year as initial values
    System.out.print("Enter month (1-12): ");
    int month = input.nextInt();

    System.out.print("Enter day (1-31): ");
    int day = input.nextInt();

    System.out.print("Enter year: ");
    int year = input.nextInt();

    // creating object date with use entries
    Date date = new Date(month, day, year);

    // Displaying the entered date
    date.displayDate();

    
    // Close scanner
    input.close();
  }
}
