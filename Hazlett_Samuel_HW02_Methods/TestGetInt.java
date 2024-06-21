import java.util.Scanner;

public class TestGetInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = SafeInput.getInt(scanner, "Enter an integer");
        System.out.println("You entered: " + num);
    }
}
