import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for birth year
        int year = SafeInput.getRangedInt(scanner, "Enter your birth year (1921-2020)", 1921, 2020);

        // Prompt for birth month
        int month = SafeInput.getRangedInt(scanner, "Enter your birth month (1-12)", 1, 12);

        // Prompt for birth day based on the selected month
        int maxDay;
        switch (month) {
            case 2: // February
                maxDay = 29; // Assuming a leap year for simplicity
                break;
            case 4: case 6: case 9: case 11: // April, June, September, November
                maxDay = 30;
                break;
            default:
                maxDay = 31;
        }
        int day = SafeInput.getRangedInt(scanner, "Enter your birth day (1-" + maxDay + ")", 1, maxDay);

        // Prompt for birth hour
        int hour = SafeInput.getRangedInt(scanner, "Enter the hour of your birth (1-24)", 1, 24);

        // Prompt for birth minute
        int minute = SafeInput.getRangedInt(scanner, "Enter the minute of your birth (1-59)", 1, 59);

        // Display birth date and time
        System.out.println("Your birth date and time: " + month + "/" + day + "/" + year + " " + hour + ":" + minute);
    }
}
