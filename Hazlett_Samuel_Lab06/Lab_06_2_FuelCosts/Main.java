import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of gallons of gas in the tank: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input for gallons. Please enter a valid number.");
            return;
        }
        double gallons = scanner.nextDouble();

        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input for fuel efficiency. Please enter a valid number.");
            return;
        }
        double fuelEfficiency = scanner.nextDouble();

        System.out.print("Enter the price of gas per gallon: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input for gas price. Please enter a valid number.");
            return;
        }
        double gasPrice = scanner.nextDouble();

        double costPer100Miles = (100.0 / fuelEfficiency) * gasPrice;
        double distance = gallons * fuelEfficiency;

        System.out.println("Cost per 100 miles: $" + costPer100Miles);
        System.out.println("The car can go approximately " + distance + " miles with the gas in the tank.");

        scanner.close();
    }
}
