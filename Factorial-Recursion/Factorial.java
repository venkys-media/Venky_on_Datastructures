import java.util.Scanner;

public class Factorial {
    // Function to calculate factorial
    static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner for input

        System.out.print("Enter number: ");
        int n = scanner.nextInt(); // Read user input

        int fact = factorial(n); // Calculate factorial
        System.out.println("Factorial of " + n + " is " + fact); // Print result

        scanner.close(); // Close the scanner
    }
}
