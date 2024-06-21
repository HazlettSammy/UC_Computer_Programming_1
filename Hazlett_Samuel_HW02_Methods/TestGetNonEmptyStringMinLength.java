import java.util.Scanner;

public class TestGetNonEmptyStringMinLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = SafeInput.getNonEmptyStringMinLength(scanner, "Enter a string", 3);
        System.out.println("You entered: " + input);
    }
}
