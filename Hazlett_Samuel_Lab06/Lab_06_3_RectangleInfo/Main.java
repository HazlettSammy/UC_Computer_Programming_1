import java.util.Scanner;

public class Main {

    public static double getValidInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(prompt);
                double value = Double.parseDouble(scanner.nextLine());
                if (value <= 0) {
                    throw new IllegalArgumentException("Input must be a positive number.");
                }
                return value;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
            }
        }
    }

    public static double[] calculateRectangleInfo(double length, double width) {
        double area = length * width;
        double perimeter = 2 * (length + width);
        double diagonal = Math.sqrt(length * length + width * width);
        return new double[]{area, perimeter, diagonal};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lengths of the sides of the rectangle:");
        double length = getValidInput("Length: ");
        double width = getValidInput("Width: ");

        double[] info = calculateRectangleInfo(length, width);

        System.out.println("\nRectangle Information:");
        System.out.println("Area: " + info[0]);
        System.out.println("Perimeter: " + info[1]);
        System.out.println("Length of diagonal: " + info[2]);
    }
}
