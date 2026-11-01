/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 1: Simple Calculator
 *
 * Name: Akinboyo David Anuloluwa
 * Matric No: 25/16418
 * Programme: Computer Science
 *
 * Reads two numbers entered by the user and displays their sum,
 * difference, product and quotient. The quotient is only worked out
 * when the second number is not zero.
 */
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        System.out.println("\n===== RESULTS =====");
        System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, sum);
        System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, difference);
        System.out.printf("%.2f x %.2f = %.2f%n", num1, num2, product);

        // A number cannot be divided by zero, so check first.
        if (num2 == 0) {
            System.out.println("Quotient: cannot divide by zero.");
        } else {
            double quotient = num1 / num2;
            System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, quotient);
        }

        scanner.close();
    }
}
