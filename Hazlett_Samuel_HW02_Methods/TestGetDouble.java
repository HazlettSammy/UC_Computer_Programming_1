import java.util.Scanner;

public class TestGetDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = SafeInput.getDouble(scanner, "Enter a number");
        System.out.println("You entered: " + num);
    }
}
