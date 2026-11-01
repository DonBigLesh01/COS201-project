/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 2: Student Average Calculator
 *
 * Name: Akinboyo David Anuloluwa
 * Matric No: 25/16418
 * Programme: Computer Science
 *
 * Reads a student's name and three scores, then calculates the total
 * and the average. Extension exercise: a score below 0 or above 100
 * is rejected and no average is calculated.
 */
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUMBER_OF_SCORES = 3;

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter first score (0-100): ");
        double firstScore = scanner.nextDouble();

        System.out.print("Enter second score (0-100): ");
        double secondScore = scanner.nextDouble();

        System.out.print("Enter third score (0-100): ");
        double thirdScore = scanner.nextDouble();

        // Extension exercise: check that each score is in the 0-100 range.
        boolean firstOk = firstScore >= 0 && firstScore <= 100;
        boolean secondOk = secondScore >= 0 && secondScore <= 100;
        boolean thirdOk = thirdScore >= 0 && thirdScore <= 100;

        if (firstOk && secondOk && thirdOk) {
            double total = firstScore + secondScore + thirdScore;
            double average = total / NUMBER_OF_SCORES;

            System.out.println("\n===== SCORE SUMMARY =====");
            System.out.println("Student Name : " + studentName);
            System.out.printf("Total Score  : %.2f%n", total);
            System.out.printf("Average Score: %.2f%n", average);
        } else {
            System.out.println("\nError: scores must be from 0 to 100. Please run the program again.");
        }

        scanner.close();
    }
}
