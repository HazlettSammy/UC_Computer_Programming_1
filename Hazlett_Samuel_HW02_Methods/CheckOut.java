import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;

        // Continue prompting for item prices until the user indicates they have no more items
        while (true) {
            double itemPrice = SafeInput.getRangedDouble(scanner, "Enter the price of the item ($0.50 - $99.99)", 0.50, 99.99);
            totalCost += itemPrice;

            // Ask the user if they have more items to input
            boolean moreItems = SafeInput.getYNConfirm(scanner, "Do you have more items to input? (Y/N)");
            if (!moreItems) {
                break;
            }
        }

        // Display the total cost with two decimal places
        System.out.printf("Total cost of all items: $%.2f%n", totalCost);
    }
}
