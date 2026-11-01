/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 1: Simple Calculator
 *
 * Name:       Akinboyo David Anuloluwa
 * Matric No:  25/16418
 * Programme:  Computer Science
 *
 * Reads two numbers from the keyboard, then shows the result of
 * adding, subtracting, multiplying and dividing them, plus the
 * remainder. Division and remainder are skipped when the second
 * number is zero, because dividing by zero is not allowed.
 */
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = keyboard.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = keyboard.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        System.out.println("\n===== CALCULATION RESULTS =====");
        System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, sum);
        System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, difference);
        System.out.printf("%.2f x %.2f = %.2f%n", num1, num2, product);

        if (num2 == 0) {
            System.out.println("Division and remainder cannot be calculated because the second number is 0.");
        } else {
            double quotient = num1 / num2;
            double remainder = num1 % num2;
            System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, quotient);
            System.out.printf("%.2f %% %.2f = %.2f%n", num1, num2, remainder);
        }

        keyboard.close();
    }
}
