# COS 201 — Computer Programming I

My weekly Java practical work for COS 201 Computer Programming I.

## Student Information

- Name: Akinboyo David Anuloluwa
- Matriculation Number: 25/16418
- Programme: Computer Science
- Course: COS 201 — Computer Programming I

## Week 1: Introduction to Programming and Problem-Solving

### Practical Exercise

I wrote, compiled and ran my first Java program. I then extended it so that it also prints the course code and title, my programme of study, three reasons programming is important in Computer Science, and my learning goal for COS 201.

### File

- `week01/FirstProgram.java`

### How to Run

Open a terminal inside the `week01` folder, then type:

- `javac FirstProgram.java`
- `java FirstProgram`

### Skills Practised

- Writing a Java class with a `main` method
- Displaying text with `System.out.println()`
- Compiling with `javac` and running with `java`
- Saving and submitting work with Git and GitHub

Activities A, B and C (the IPO model, algorithms, pseudocode and flowcharts) were done on paper as instructed, so they are not included in this repository.

## Week 2: Development Environment and First Java Program

### Objective

To set up the Java development environment, write a simple Java program, compile and run it, and submit the source code through GitHub.

### Files

- `week02/HelloWorld.java`: the HelloWorld practical, personalised with my name, matric number, course and programme.
- `week02/StudentProfile.java`: prints my student profile card using `print()` and `println()`.
- `week02/PrintExample.java`: the `print()` versus `println()` practice exercise. My predicted output is written in the comment at the top of the file.
- `week02/ErrorExample.java`: the "find and fix the error" exercise. The original line was missing a semicolon, which caused the compiler error `';' expected`.

### How to Run

1. Open a terminal inside the `week02` folder.
2. Compile a program, for example: `javac HelloWorld.java`
3. Run it: `java HelloWorld`

The other programs are compiled and run the same way, using their own names: `StudentProfile`, `PrintExample` and `ErrorExample`.

### Learning Outcome

I learnt how to compile and run Java programs from the terminal, the difference between `print()` and `println()`, how to write comments, how to read a compiler error and fix it, and how to push my source code to GitHub.

## Week 3: Variables, Data Types, Expressions and Input/Output

### Objectives

- Declare and initialize Java variables.
- Use appropriate primitive and reference data types.
- Perform arithmetic calculations.
- Read keyboard input using Scanner.
- Display formatted output.
- Compile, test and submit Java programs using GitHub.

### Programs

1. `week03/SimpleCalculator.java`
   - Reads two numbers and displays their sum, difference, product, quotient and remainder, written out as full expressions (for example `17.00 + 5.00 = 22.00`). If the second number is 0, it explains that division and remainder cannot be calculated instead of dividing.
2. `week03/AverageCalculator.java`
   - Reads a student's name and three scores, then calculates the total and the average. It also does the extension exercise: if any score is below 0 or above 100, it shows an error message and does not calculate an average.
3. `week03/ItemCost.java`
   - Reads an item name, the quantity and the unit price, then calculates the total cost and prints it as a receipt in Naira with commas (for example `NGN 1,500.00`).

### How to Run

Open a terminal inside the `week03` folder.

Simple calculator:

- `javac SimpleCalculator.java`
- `java SimpleCalculator`

Average calculator:

- `javac AverageCalculator.java`
- `java AverageCalculator`

Item cost:

- `javac ItemCost.java`
- `java ItemCost`

### Testing

I ran each program with normal inputs, decimal values, boundary values and invalid inputs, and compared the output with the results I worked out by hand.

| Program | Input | Expected result |
| --- | --- | --- |
| SimpleCalculator | 17 and 5 | 22.00, 12.00, 85.00, quotient 3.40, remainder 2.00 |
| SimpleCalculator | 9.6 and 3 | 12.60, 6.60, 28.80, quotient 3.20, remainder 0.60 |
| SimpleCalculator | 100 and 0 | Sum, difference and product shown; division and remainder skipped with a message |
| AverageCalculator | 58, 74, 91 | Total 223.00, Average 74.33 |
| AverageCalculator | 100, 0, 49 (boundary values) | Total 149.00, Average 49.67 |
| AverageCalculator | 80, -5, 60 | Error: every score must be from 0 to 100 |
| AverageCalculator | 101, 70, 60 | Error: every score must be from 0 to 100 |
| ItemCost | Biro, quantity 10, unit price 150 | Total Cost NGN 1,500.00 |
| ItemCost | Data Structures Textbook, quantity 2, unit price 6250.50 | Total Cost NGN 12,501.00 |

### Tools Used

- Java Development Kit (JDK)
- Visual Studio Code
- Git
- GitHub

### Learning Outcome

I learnt how to choose suitable data types (`int`, `double` and `String`), read input from the keyboard with `Scanner`, write arithmetic expressions including the remainder operator `%`, check for invalid input with an `if` statement, format numbers with `printf()`, and test my programs before pushing them to GitHub.
