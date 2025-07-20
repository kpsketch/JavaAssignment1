import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int miles;       // miles for current trip
        int gallons;     // gallons for current trip
        int totalMiles = 0;  // total miles for all trips
        int totalGallons = 0; // total gallons for all trips

        System.out.println("Enter miles driven (press 0 to end): ");
        miles = input.nextInt();

        while (miles != 0) {
            System.out.println("Enter gallons used: ");
            gallons = input.nextInt();

            double MileagePerGallon = (double) miles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", MileagePerGallon);

            totalMiles = totalMiles + miles;
            totalGallons = totalGallons + gallons;

            double overallMPG = (double) totalMiles / totalGallons;
            System.out.printf("Overall miles per gallon: %.2f%n", overallMPG);

            System.out.println("Enter miles driven (0 to end): ");
            miles = input.nextInt();
        }


        input.close();
    }
}
