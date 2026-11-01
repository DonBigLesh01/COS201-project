/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 3: Total Cost of Items
 *
 * Name: Akinboyo David Anuloluwa
 * Matric No: 25/16418
 * Programme: Computer Science
 *
 * Reads the name of an item, how many were bought and the price of
 * one item, then calculates the total cost.
 */
import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String item = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter unit price (N): ");
        double unitPrice = scanner.nextDouble();

        double totalCost = quantity * unitPrice;

        System.out.println("\n===== COST SUMMARY =====");
        System.out.println("Item       : " + item);
        System.out.println("Quantity   : " + quantity);
        System.out.printf("Unit Price : N%.2f%n", unitPrice);
        System.out.printf("Total Cost : N%.2f%n", totalCost);

        scanner.close();
    }
}
