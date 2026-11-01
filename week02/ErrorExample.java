/*
 * COS 201 - Computer Programming I
 * Week 2 Exercise: Find and Fix the Error
 *
 * Name: Akinboyo David Anuloluwa
 *
 * The statement given in the exercise was:
 *     System.out.println("Learning Java")
 *
 * When I compiled it, javac stopped with the error "';' expected",
 * because every Java statement must end with a semicolon. I added
 * the missing semicolon at the end of the line, and the program then
 * compiled and printed "Learning Java".
 */
public class ErrorExample {
    public static void main(String[] args) {
        System.out.println("Learning Java");
    }
}
