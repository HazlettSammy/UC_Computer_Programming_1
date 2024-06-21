import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> friendList = new ArrayList<>();

        System.out.println("Enter the first names of your friends (type 'Quit' to stop):");

        String input = SafeInput.getNonZeroLenString(scanner, "Enter a friend's first name");

        // Add friends until the user types "Quit"
        while (!input.equalsIgnoreCase("Quit")) {
            friendList.add(input);
            input = SafeInput.getNonZeroLenString(scanner, "Enter a friend's first name");
        }

        // Display friends and total count
        System.out.println("\nYour friends:");
        for (String friend : friendList) {
            System.out.println(friend);
        }
        System.out.println("Total friends: " + friendList.size());

        scanner.close();
    }
}
