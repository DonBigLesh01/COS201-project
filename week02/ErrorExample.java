/*
 * COS 201 - Computer Programming I
 * Week 2 Exercise: Find and fix the error
 *
 * Name: Akinboyo David Anuloluwa
 *
 * Error found: the line
 *     System.out.println("Learning Java")
 * had no semicolon at the end. Every Java statement must end with a
 * semicolon, so javac stopped with the message "';' expected".
 * Fix: I added the semicolon and the program compiled and ran.
 */
public class ErrorExample {
    public static void main(String[] args) {
        System.out.println("Learning Java");
    }
}
