/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for implementing Stack using Linked List
// This program demonstrates basic stack operations using linked list

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Push         | O(1)      | O(1)         | O(1)       |
//|Pop          | O(1)      | O(1)         | O(1)       |
//|Peek         | O(1)      | O(1)         | O(1)       |

#include <iostream>

// Node structure for stack
class StackNode {
public:
    int data;           // Data stored in node
    StackNode* next;    // Pointer to next node

    // Constructor to initialize node
    StackNode(int data) : data(data), next(nullptr) {}
};

// Stack class implementation using linked list
class Stack {
private:
    StackNode* root;    // Top of the stack

public:
    // Constructor to initialize empty stack
    Stack() : root(nullptr) {}

    // Function to check if stack is empty
    bool isEmpty() {
        return root == nullptr;
    }

    // Function to push element onto stack
    void push(int data) {
        StackNode* stackNode = new StackNode(data);  // Create new node
        stackNode->next = root;                      // Link new node to current top
        root = stackNode;                            // Update top to new node
        std::cout << data << " pushed to stack\n";
    }

    // Function to pop element from stack
    int pop() {
        if (isEmpty()) {                            // Check for underflow
            std::cout << "Stack Underflow\n";
            return 0;
        }
        StackNode* temp = root;                     // Store current top
        root = root->next;                          // Move top to next node
        int popped = temp->data;                    // Get data from top node
        delete temp;                                // Free memory
        return popped;
    }

    // Function to peek at top element
    int peek() {
        if (isEmpty()) {                            // Check if stack is empty
            std::cout << "Stack is Empty\n";
            return 0;
        }
        return root->data;                          // Return top element
    }
};

// Main function to demonstrate stack operations
int main() {
    Stack stack;                                    // Create a stack instance

    // Perform stack operations
    stack.push(10);
    stack.push(20);
    stack.push(30);

    std::cout << stack.pop() << " popped from stack\n";
    std::cout << "Top element is: " << stack.peek() << std::endl;
    std::cout << "Stack empty: " << (stack.isEmpty() ? "Yes" : "No") << std::endl;

    return 0;
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