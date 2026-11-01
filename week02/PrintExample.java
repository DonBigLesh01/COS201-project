/*
 * COS 201 - Computer Programming I
 * Week 2 Practice Exercise: print() versus println()
 *
 * Name: Akinboyo David Anuloluwa
 *
 * My prediction before running the program:
 * print("COS ") prints the text but stays on the same line, so "201"
 * is printed right after it. println("201") then moves to a new line,
 * which means "Java" is printed on the second line. The output should be:
 *
 *     COS 201
 *     Java
 *
 * After running it, the output matched my prediction.
 */
public class PrintExample {
    public static void main(String[] args) {
        System.out.print("COS ");
        System.out.println("201");
        System.out.println("Java");
    }
}
