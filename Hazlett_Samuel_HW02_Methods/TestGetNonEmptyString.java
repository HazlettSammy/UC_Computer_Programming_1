import java.util.Scanner;

public class TestGetNonEmptyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = SafeInput.getNonEmptyString(scanner, "Enter a non-empty string");
        System.out.println("You entered: " + input);
    }
}
