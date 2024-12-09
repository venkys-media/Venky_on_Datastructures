# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for implementing Stack using Linked List
# This program demonstrates basic stack operations using linked list

# Space complexity: O(n)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Push         | O(1)      | O(1)         | O(1)       |
#|Pop          | O(1)      | O(1)         | O(1)       |
#|Peek         | O(1)      | O(1)         | O(1)       |

# Node class for stack
class StackNode:
    # Constructor to initialize node
    def __init__(self, data):
        self.data = data    # Data stored in node
        self.next = None    # Reference to next node

# Stack class implementation using linked list
class Stack:
    # Constructor to initialize empty stack
    def __init__(self):
        self.root = None    # Top of the stack

    # Function to check if stack is empty
    def is_empty(self):
        return self.root is None

    # Function to push element onto stack
    def push(self, data):
        stack_node = StackNode(data)       # Create new node
        stack_node.next = self.root        # Link new node to current top
        self.root = stack_node             # Update top to new node
        print(f"{data} pushed to stack")

    # Function to pop element from stack
    def pop(self):
        if self.is_empty():                # Check for underflow
            print("Stack Underflow")
            return 0                        # Return 0 on underflow
        temp = self.root                   # Store current top
        self.root = self.root.next         # Move top to next node
        popped = temp.data                 # Get data from top node
        del temp                           # Free memory
        return popped

    # Function to peek at top element
    def peek(self):
        if self.is_empty():                # Check if stack is empty
            print("Stack is Empty")
            return 0                        # Return 0 if empty
        return self.root.data              # Return top element

# Main function to demonstrate stack operations
if __name__ == "__main__":
    stack = Stack()                        # Create a stack instance

    # Perform stack operations
    stack.push(10)
    stack.push(20)
    stack.push(30)

    print(f"{stack.pop()} popped from stack")
    print(f"Top element is: {stack.peek()}")
    print(f"Stack empty: {'Yes' if stack.is_empty() else 'No'}")

#Sample Input: push(10), push(20), push(30)
#Sample Output: 30 popped from stack
#              Top element is: 20
#              Stack empty: No

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork
