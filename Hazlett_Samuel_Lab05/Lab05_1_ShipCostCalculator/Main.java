import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the item: $");
        double price = scanner.nextDouble();

        double shippingCost;
        if (price >= 100) {
            shippingCost = 0; // Shipping is free
        } else {
            shippingCost = 0.02 * price; // 2% of the price
        }

        double totalPrice = price + shippingCost;

        System.out.println("Shipping cost: $" + shippingCost);
        System.out.println("Total price: $" + totalPrice);

        scanner.close();
    }
}

