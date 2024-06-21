import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // read input from the user
        Scanner scanner = new Scanner(System.in);

        // input from the user
        System.out.println("Enter three integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Calling the subtractTwoNumbers method and storing the result
        int result = subtractTwoNumbers(num1, num2, num3);

        // Displaying the result
        System.out.println("Result: " + result);

        // Close the scanner
        scanner.close();
    }

    // Method to subtract two numbers
    public static int subtractTwoNumbers(int num1, int num2, int num3) {
        return num1 - num2 - num3;
    }
}
