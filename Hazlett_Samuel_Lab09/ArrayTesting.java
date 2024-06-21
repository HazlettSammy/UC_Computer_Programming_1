import java.util.Scanner;
import java.util.Random;

public class ArrayTesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part a: Declare and initialize dataPoints array
        int[] dataPoints = new int[50];
        Random rnd = new Random();

        // Part b: Initialize each element in dataPoints array to a random value between 1 and 50
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(50) + 1;
        }

        // Part c: Display the values of dataPoints array
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i != dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Part d: Calculate sum and average of dataPoints array
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.printf("The average of the random array dataPoints is: %.2f%n", average);

        // Part e: Prompt user for input and count occurrences of the input value in dataPoints array
        int userInput = SafeInput.getRangedInt(scanner, "Enter an integer between 1 and 25", 1, 25);
        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInput) {
                System.out.println("The value " + userInput + " was found at array index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The value " + userInput + " is not in the array.");
        }

        scanner.close();
    }
}
