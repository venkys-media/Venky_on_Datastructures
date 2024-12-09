/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for calculating factorial using recursion
// This program demonstrates recursive approach to factorial calculation

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Factorial    | O(n)      | O(n)         | O(n)       |

import java.util.Scanner;

public class Factorial {
    // Function to calculate factorial recursively
    static int factorial(int n) {
        if (n == 0) {
            return 1;    // Base case
        } else {
            return n * factorial(n - 1);    // Recursive case
        }
    }

    // Main method to demonstrate factorial calculation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    // Create scanner for input

        System.out.print("Enter number: ");
        int n = scanner.nextInt();    // Read user input

        int fact = factorial(n);    // Calculate factorial
        System.out.println("Factorial of " + n + " is " + fact);

        scanner.close();    // Close the scanner
    }
}

//Sample Input: 5
//Sample Output: Factorial of 5 is 120

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 