import java.util.Scanner;

public class Main {

    public static double getValidInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(prompt);
                double value = Double.parseDouble(scanner.nextLine());
                if (value < 0) {
                    throw new IllegalArgumentException("Input must be a non-negative number.");
                }
                return value;
            } catch ( IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
    }

    public static void convertToMilesFeetInches(double meters) {
        final double MILES_IN_METER = 0.000621371;
        final double FEET_IN_METER = 3.28084;
        final double INCHES_IN_METER = 39.3701;

        double miles = meters * MILES_IN_METER;
        double feet = meters * FEET_IN_METER;
        double inches = meters * INCHES_IN_METER;

        System.out.println("Conversion:");
        System.out.println("Miles: " + miles);
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a measurement in meters:");
        double meters = getValidInput("Meters: ");

        convertToMilesFeetInches(meters);
    }
}
