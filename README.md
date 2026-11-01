# COS 201 — Computer Programming I

This repository holds my weekly Java practical work for COS 201.

## Student Information

- Name: Akinboyo David Anuloluwa
- Matriculation Number: 25/16418
- Programme: Computer Science
- Course: COS 201 — Computer Programming I

## Repository Structure

```
week01/   FirstProgram.java
week02/   HelloWorld.java, StudentProfile.java, PrintExample.java, ErrorExample.java
week03/   SimpleCalculator.java, AverageCalculator.java, ItemCost.java
```

## Week 1: Introduction to Programming and Problem-Solving

### Practical Exercise

I wrote, compiled and ran my first Java programme, then changed it to show the course code and title, my programme of study, three reasons programming is important in Computer Science, and my learning goal for COS 201.

### File

- `week01/FirstProgram.java`

### How to Run

Open a terminal in the `week01` folder, then:

- `javac FirstProgram.java`
- `java FirstProgram`

### Skills Practised

- Writing a Java class with a `main` method
- Displaying text with output statements
- Compiling and running a program
- Using Git and GitHub for version control

Activities A, B and C (IPO components, algorithms, pseudocode and flowcharts) were done on paper, as the notes instruct, so they are not in this repository.

## Week 2: Development Environment and First Java Program

### Objective

To set up the Java development environment, write a simple Java program, compile and run it, and submit the source code through GitHub.

### Files

- `week02/HelloWorld.java`: the HelloWorld practical, personalised with my name, course and programme.
- `week02/StudentProfile.java`: prints my student profile using `print()` and `println()`.
- `week02/PrintExample.java`: the `print()` and `println()` exercise. My prediction of the output is written in the comment at the top.
- `week02/ErrorExample.java`: the "find and fix the error" exercise. The missing semicolon has been added.

### How to Run

1. Open a terminal in the `week02` folder.
2. Compile a program, for example `javac HelloWorld.java`.
3. Run it with `java HelloWorld`.

The other three files are compiled and run the same way: `StudentProfile`, `PrintExample` and `ErrorExample`.

### Learning Outcome

I learnt the difference between `print()` and `println()`, how to use comments, how to read a compiler error message (`';' expected`) and fix it, and how to push my source code to GitHub.

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
   - Reads two numbers and displays their sum, difference, product and quotient. If the second number is 0, it prints a message instead of dividing.
2. `week03/AverageCalculator.java`
   - Reads a student's name and three scores, then displays the total and the average. Extension exercise: if any score is below 0 or above 100, it shows an error and does not calculate the average.
3. `week03/ItemCost.java`
   - Reads an item name, the quantity and the unit price, then calculates the total cost.

### How to Run

Open a terminal in the `week03` folder.

Compile and run the calculator:

- `javac SimpleCalculator.java`
- `java SimpleCalculator`

Compile and run the average calculator:

- `javac AverageCalculator.java`
- `java AverageCalculator`

Compile and run the item cost program:

- `javac ItemCost.java`
- `java ItemCost`

### Testing

I ran each program with normal values, boundary values and invalid values, and compared the output with results I worked out by hand.

| Program | Input | Expected result |
| --- | --- | --- |
| SimpleCalculator | 84 and 12 | Sum 96.00, Difference 72.00, Product 1008.00, Quotient 7.00 |
| SimpleCalculator | 9.6 and -3.2 | Sum 6.40, Difference 12.80, Product -30.72, Quotient -3.00 |
| SimpleCalculator | 30 and 0 | Quotient not calculated: "cannot divide by zero." |
| AverageCalculator | 58, 74, 91 | Total 223.00, Average 74.33 |
| AverageCalculator | 100, 0, 100 (boundary values) | Total 200.00, Average 66.67 |
| AverageCalculator | 80, -5, 60 | Error: scores must be from 0 to 100 |
| AverageCalculator | 101, 50, 60 | Error: scores must be from 0 to 100 |
| ItemCost | Biro, quantity 8, unit price 150 | Total cost N1200.00 |
| ItemCost | Graph book, quantity 3, unit price 725.50 | Total cost N2176.50 |

### Tools Used

- Java Development Kit (JDK)
- Visual Studio Code
- Git
- GitHub

### Learning Outcome

I learnt how to choose data types such as `int`, `double` and `String`, read input from the keyboard with `Scanner`, write arithmetic expressions, format output with `printf()`, and check input values before using them.
