/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for demonstrating recursion using stack
// This program shows how recursive calls are stored in stack

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Recursion    | O(n)      | O(n)         | O(n)       |

// class to handle recursion operations
public class RecursionStack {
    // Function that recursively prints numbers from x to 9
    static void fun(int x) {
        if (x < 10) {               // Base condition
            fun(x + 1);            // Recursive call with incremented value
            System.out.print(x + " "); // Print x after the recursive call returns
        }
    }

    // main method
    public static void main(String[] args) {
        int i = 5;                  // Initialize i to 5
        fun(i);                     // Call fun with i
        System.out.println();       // Print a new line for better output formatting
        System.out.println(i);      // Print the original value of i
    }
}

//Sample Input: i = 5
//Sample Output: 9 8 7 6 5
//              5

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@venkysio 