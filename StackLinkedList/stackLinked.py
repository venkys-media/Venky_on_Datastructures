class StackNode:
    def __init__(self, data):
        self.data = data
        self.next = None  # Initialize next as None


class Stack:
    def __init__(self):
        self.root = None  # Top of the stack

    def is_empty(self):
        return self.root is None

    def push(self, data):
        stack_node = StackNode(data)
        stack_node.next = self.root
        self.root = stack_node
        print(f"{data} pushed to stack")

    def pop(self):
        if self.is_empty():
            print("Stack Underflow")
            return 0  # Return 0 on underflow
        temp = self.root
        self.root = self.root.next
        popped = temp.data
        del temp
        return popped

    def peek(self):
        if self.is_empty():
            print("Stack is Empty")
            return 0  # Return 0 if empty
        return self.root.data


if __name__ == "__main__":
    stack = Stack()  # Create a stack instance

    stack.push(10)
    stack.push(20)
    stack.push(30)

    print(f"{stack.pop()} popped from stack")
    print(f"Top element is: {stack.peek()}")
    print(f"Stack empty: {'Yes' if stack.is_empty() else 'No'}")
