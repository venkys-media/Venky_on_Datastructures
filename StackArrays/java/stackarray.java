/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for implementing Stack using Arrays
// This program demonstrates basic stack operations using array

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Push         | O(1)      | O(1)         | O(1)       |
//|Pop          | O(1)      | O(1)         | O(1)       |
//|Peek         | O(1)      | O(1)         | O(1)       |

class Stack {
    private static final int MAX = 1000;  // Maximum size of Stack
    private int top;                      // Index of top element
    private int[] arr;                    // Array to store stack elements

    // Constructor to initialize empty stack
    public Stack() {
        this.top = -1;                    // Initialize top as -1
        this.arr = new int[MAX];          // Create array of maximum size
    }

    // Function to push element into stack
    public boolean push(int x) {
        if (top >= (MAX - 1)) {           // Check for stack overflow
            System.out.println("Stack Overflow");
            return false;
        } else {
            arr[++top] = x;               // Increment top and add element
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    // Function to pop element from stack
    public int pop() {
        if (top < 0) {                    // Check for stack underflow
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return arr[top--];            // Return top element and decrement top
        }
    }

    // Function to return top element without removing it
    public int peek() {
        if (top < 0) {                    // Check if stack is empty
            System.out.println("Stack is Empty");
            return 0;
        } else {
            return arr[top];              // Return top element
        }
    }

    // Function to check if stack is empty
    public boolean isEmpty() {
        return top < 0;                   // Return true if top is less than 0
    }

    // Main method to demonstrate stack operations
    public static void main(String[] args) {
        Stack s = new Stack();            // Create a stack object

        // Perform stack operations
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop() + " popped from stack");
        System.out.println("Top element is: " + s.peek());
        System.out.println("Stack empty: " + s.isEmpty());
    }
}

//Sample Input: push(10), push(20), push(30)
//Sample Output: 30 popped from stack
//              Top element is: 20
//              Stack empty: false

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork
