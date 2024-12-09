/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for calculating factorial using recursion
// This program demonstrates recursive approach to factorial calculation

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Factorial    | O(n)      | O(n)         | O(n)       |

#include <iostream>

// Function to calculate factorial recursively
int factorial(int n) {
    if (n == 0) {
        return 1;    // Base case
    } else {
        return n * factorial(n - 1);    // Recursive case
    }
}

// Main function to demonstrate factorial calculation
int main() {
    int n;
    std::cout << "Enter number: ";
    std::cin >> n;

    int fact = factorial(n);    // Calculate factorial
    std::cout << "Factorial of " << n << " is " << fact << std::endl;

    return 0;
}

//Sample Input: 5
//Sample Output: Factorial of 5 is 120

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 