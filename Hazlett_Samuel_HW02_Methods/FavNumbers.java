import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for favorite integer
        int favoriteInt = SafeInput.getInt(scanner, "Enter your favorite integer");

        // Prompt for favorite double
        double favoriteDouble = SafeInput.getDouble(scanner, "Enter your favorite double");

        System.out.println("Your favorite integer is: " + favoriteInt);
        System.out.println("Your favorite double is: " + favoriteDouble);
    }
}
