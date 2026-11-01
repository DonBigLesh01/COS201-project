/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 3: Total Cost of Items
 *
 * Name:       Akinboyo David Anuloluwa
 * Matric No:  25/16418
 * Programme:  Computer Science
 *
 * Reads the name of an item, how many were bought (quantity) and the
 * price of one item (unit price), then calculates the total cost.
 * Amounts are shown in Naira (NGN) with commas, e.g. NGN 12,500.00.
 */
import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the item name: ");
        String item = keyboard.nextLine();

        System.out.print("Enter the quantity: ");
        int quantity = keyboard.nextInt();

        System.out.print("Enter the unit price (NGN): ");
        double unitPrice = keyboard.nextDouble();

        double totalCost = quantity * unitPrice;

        System.out.println("\n===== PURCHASE RECEIPT =====");
        System.out.println("Item       : " + item);
        System.out.println("Quantity   : " + quantity);
        System.out.printf("Unit Price : NGN %,.2f%n", unitPrice);
        System.out.printf("Total Cost : NGN %,.2f%n", totalCost);

        keyboard.close();
    }
}
