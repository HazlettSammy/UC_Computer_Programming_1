import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your choice: ");
        String choice = scanner.nextLine();

        String symbol;
        if (choice.equalsIgnoreCase("D")) {
            symbol = "Donkey";
        } else if (choice.equalsIgnoreCase("R")) {
            symbol = "Elephant";
        } else if (choice.equalsIgnoreCase("I")) {
            symbol = "Person";
        } else {
            symbol = "Other";
        }

        System.out.println("You get a " + symbol + ".");

        scanner.close();
    }
}
