/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 2: Student Average Calculator
 *
 * Name:       Akinboyo David Anuloluwa
 * Matric No:  25/16418
 * Programme:  Computer Science
 *
 * Reads a student's name and three scores, then calculates and
 * displays the total and the average.
 *
 * Extension exercise: a score is only accepted if it is from 0 to
 * 100. If any score is outside that range, an error message is shown
 * and no average is calculated.
 */
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String studentName = keyboard.nextLine();

        System.out.print("Enter first score: ");
        double firstScore = keyboard.nextDouble();

        System.out.print("Enter second score: ");
        double secondScore = keyboard.nextDouble();

        System.out.print("Enter third score: ");
        double thirdScore = keyboard.nextDouble();

        // A score below 0 or above 100 is not a valid score.
        if (firstScore < 0 || firstScore > 100
                || secondScore < 0 || secondScore > 100
                || thirdScore < 0 || thirdScore > 100) {
            System.out.println("\nError: every score must be from 0 to 100. Please run the program again.");
        } else {
            double totalScore = firstScore + secondScore + thirdScore;
            double averageScore = totalScore / 3;

            System.out.println("\n===== RESULT SUMMARY =====");
            System.out.println("Student Name : " + studentName);
            System.out.printf("Total Score  : %.2f%n", totalScore);
            System.out.printf("Average Score: %.2f%n", averageScore);
        }

        keyboard.close();
    }
}
