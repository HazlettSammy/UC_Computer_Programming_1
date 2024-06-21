import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for SSN
        String ssn = SafeInput.getRegExString(scanner, "Enter your Social Security Number (XXX-XX-XXXX)", "\\d{3}-\\d{2}-\\d{4}");

        // Prompt for UC Student M number
        String mNumber = SafeInput.getRegExString(scanner, "Enter your UC Student M Number (M#####)", "(M|m)\\d{5}");

        // Prompt for Zip+4 code
        String zipCode = SafeInput.getRegExString(scanner, "Enter your Zip+4 code (#####-####)", "\\d{5}-\\d{4}");

        System.out.println("Social Security Number: " + ssn);
        System.out.println("UC Student M Number: " + mNumber);
        System.out.println("Zip+4 Code: " + zipCode);
    }
}
