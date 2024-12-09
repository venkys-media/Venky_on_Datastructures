package java;
/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for implementing Stack using Linked List
// This program demonstrates basic stack operations using linked list

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Push         | O(1)      | O(1)         | O(1)       |
//|Pop          | O(1)      | O(1)         | O(1)       |
//|Peek         | O(1)      | O(1)         | O(1)       |

// Node class for stack
class StackNode {
    int data;           // Data stored in node
    StackNode next;     // Reference to next node

    // Constructor to initialize node
    public StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class implementation using linked list
class StackLinked {
    private StackNode root;    // Top of the stack

    // Constructor to initialize empty stack
    public StackLinked() {
        this.root = null;
    }

    // Function to check if stack is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Function to push element onto stack
    public void push(int data) {
        StackNode stackNode = new StackNode(data);  // Create new node
        stackNode.next = root;                      // Link new node to current top
        root = stackNode;                           // Update top to new node
        System.out.println(data + " pushed to stack");
    }

    // Function to pop element from stack
    public int pop() {
        if (isEmpty()) {                           // Check for underflow
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode temp = root;                     // Store current top
        root = root.next;                          // Move top to next node
        int popped = temp.data;                    // Get data from top node
        return popped;
    }

    // Function to peek at top element
    public int peek() {
        if (isEmpty()) {                           // Check if stack is empty
            System.out.println("Stack is Empty");
            return 0;
        }
        return root.data;                          // Return top element
    }

    // Main method to demonstrate stack operations
    public static void main(String[] args) {
        StackLinked stack = new StackLinked();     // Create a stack instance

        // Perform stack operations
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack empty: " + (stack.isEmpty() ? "Yes" : "No"));
    }
}

//Sample Input: push(10), push(20), push(30)
//Sample Output: 30 popped from stack
//              Top element is: 20
//              Stack empty: No

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork
