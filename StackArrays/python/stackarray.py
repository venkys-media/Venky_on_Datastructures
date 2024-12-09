# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for implementing Stack using Arrays
# This program demonstrates basic stack operations using array

# Space complexity: O(n)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Push         | O(1)      | O(1)         | O(1)       |
#|Pop          | O(1)      | O(1)         | O(1)       |
#|Peek         | O(1)      | O(1)         | O(1)       |

class Stack:
    MAX = 1000  # Maximum size of Stack

    def __init__(self):
        self.top = -1                     # Initialize top as -1
        self.arr = [0] * self.MAX         # Create array of maximum size

    def push(self, x):
        if self.top >= (self.MAX - 1):    # Check for stack overflow
            print("Stack Overflow")
            return False
        else:
            self.top += 1                 # Increment top
            self.arr[self.top] = x        # Add element at top
            print(f"{x} pushed into stack")
            return True

    def pop(self):
        if self.top < 0:                  # Check for stack underflow
            print("Stack Underflow")
            return 0
        else:
            x = self.arr[self.top]        # Get top element
            self.top -= 1                 # Decrement top
            return x

    def peek(self):
        if self.top < 0:                  # Check if stack is empty
            print("Stack is Empty")
            return 0
        else:
            return self.arr[self.top]     # Return top element

    def is_empty(self):
        return self.top < 0               # Return true if top is less than 0

# Main function to demonstrate stack operations
if __name__ == "__main__":
    s = Stack()                           # Create a stack object

    # Perform stack operations
    s.push(10)
    s.push(20)
    s.push(30)

    print(f"{s.pop()} popped from stack")
    print(f"Top element is: {s.peek()}")
    print(f"Stack empty: {s.is_empty()}")

#Sample Input: push(10), push(20), push(30)
#Sample Output: 30 popped from stack
#              Top element is: 20
#              Stack empty: False

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork
