#include <iostream>

// Function that recursively prints numbers from x to 9
void fun(int x) {
    if (x < 10) {               // Base condition
        fun(x + 1);            // Recursive call with incremented value
        std::cout << x << " "; // Print x after the recursive call returns
    }
}

int main() {
    int i = 5;                 // Initialize i to 5
    fun(i);                    // Call fun with i
    std::cout << std::endl;   // Print a new line for better output formatting
    std::cout << i << std::endl; // Print the original value of i
    return 0;                 // Indicate successful execution
}
