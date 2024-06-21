mport java.util.Scanner;

public class SafeInput {

    // Method to get a non-empty string from the user
    public static String getNonEmptyString(Scanner scanner, String prompt) {
        String input;
        do {
            System.out.print(prompt + ": ");
            input = scanner.nextLine().trim();
        } while (input.isEmpty());
        return input;
    }

    // Method to get an integer from the user
    public static int getInt(Scanner scanner, String prompt) {
        int num;
        while (true) {
            System.out.print(prompt + ": ");
            try {
                num = Integer.parseInt(scanner.nextLine());
                break; // Exit loop if input is valid
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
            }
        }
        return num;
    }

    // Method to get a double from the user
    public static double getDouble(Scanner scanner, String prompt) {
        double num;
        while (true) {
            System.out.print(prompt + ": ");
            try {
                num = Double.parseDouble(scanner.nextLine());
                break; // Exit loop if input is valid
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }
        return num;
    }

    // Method to get a non-empty string with a minimum length from the user
    public static String getNonEmptyStringMinLength(Scanner scanner, String prompt, int minLength) {
        String input;
        do {
            System.out.print(prompt + ": ");
            input = scanner.nextLine().trim();
            if (input.length() < minLength) {
                System.out.println("Input must be at least " + minLength + " characters long.");
            }
        } while (input.isEmpty() || input.length() < minLength);
        return input;
    }

    // Method to get a non-zero length string from the user
    public static String getNonZeroLenString(Scanner scanner, String prompt) {
        String retString = ""; // Set this to zero length. Loop runs until it isn’t
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = scanner.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    // Method to get an integer within a specified range from the user
    public static int getRangedInt(Scanner scanner, String prompt, int low, int high) {
        int num;
        do {
            num = getInt(scanner, prompt + " [" + low + " - " + high + "]");
        } while (num < low || num > high);
        return num;
    }

    // Method to get a double within a specified range from the user
    public static double getRangedDouble(Scanner scanner, String prompt, double low, double high) {
        double num;
        do {
            num = getDouble(scanner, prompt + " [" + low + " - " + high + "]");
        } while (num < low || num > high);
        return num;
    }

    // Method to get a Yes/No confirmation from the user
    public static boolean getYNConfirm(Scanner scanner, String prompt) {
        String input;
        while (true) {
            System.out.print(prompt + " [Y/N]: ");
            input = scanner.nextLine().trim().toUpperCase();
            if (input.equals("Y") || input.equals("YES")) {
                return true;
            } else if (input.equals("N") || input.equals("NO")) {
                return false;
            } else {
                System.out.println("Invalid input! Please enter Y or N.");
            }
        }
    }

    // Method to get a string matching a specified regex pattern from the user
    public static String getRegExString(Scanner scanner, String prompt, String regEx) {
        String input;
        while (true) {
            System.out.print(prompt + ": ");
            input = scanner.nextLine().trim();
            if (input.matches(regEx)) {
                return input;
            } else {
                System.out.println("Invalid input! Please enter a valid string matching the pattern: " + regEx);
            }
        }
    }
}
