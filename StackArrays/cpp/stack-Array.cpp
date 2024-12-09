/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for implementing Stack using Arrays
// This program demonstrates basic stack operations using array

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Push         | O(1)      | O(1)         | O(1)       |
//|Pop          | O(1)      | O(1)         | O(1)       |
//|Peek         | O(1)      | O(1)         | O(1)       |

#include <iostream>

#define MAX 1000  // Maximum size of Stack

class Stack {
    int top;      // Index of top element

public:
    int arr[MAX]; // Array to store stack elements

    // Constructor to initialize empty stack
    Stack() { 
        top = -1;  // Initialize top as -1 indicating empty stack
    }

    // Function to push element into stack
    bool push(int x) {
        if (top >= (MAX - 1)) {           // Check for stack overflow
            std::cout << "Stack Overflow\n";
            return false;
        } else {
            arr[++top] = x;               // Increment top and add element
            std::cout << x << " pushed into stack\n";
            return true;
        }
    }

    // Function to pop element from stack
    int pop() {
        if (top < 0) {                    // Check for stack underflow
            std::cout << "Stack Underflow\n";
            return 0;
        } else {
            return arr[top--];            // Return top element and decrement top
        }
    }

    // Function to return top element without removing it
    int peek() {
        if (top < 0) {                    // Check if stack is empty
            std::cout << "Stack is Empty\n";
            return 0;
        } else {
            return arr[top];              // Return top element
        }
    }

    // Function to check if stack is empty
    bool isEmpty() {
        return (top < 0);                 // Return true if top is less than 0
    }
};

// Main function to demonstrate stack operations
int main() {
    Stack s;                              // Create a stack object

    // Perform stack operations
    s.push(10);
    s.push(20);
    s.push(30);

    std::cout << s.pop() << " popped from stack\n";
    std::cout << "Top element is: " << s.peek() << std::endl;
    std::cout << "Stack empty: " << s.isEmpty() << std::endl;

    return 0;
}

//Sample Input: push(10), push(20), push(30)
//Sample Output: 30 popped from stack
//              Top element is: 20
//              Stack empty: 0

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork
