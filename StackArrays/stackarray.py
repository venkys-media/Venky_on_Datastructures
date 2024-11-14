class Stack:
    MAX = 1000

    def __init__(self):
        self.top = -1
        self.arr = [0] * self.MAX  # Initialize stack with a fixed size

    def push(self, x):
        if self.top >= (self.MAX - 1):
            print("Stack Overflow")
            return False
        else:
            self.top += 1
            self.arr[self.top] = x
            print(f"{x} pushed into stack")
            return True

    def pop(self):
        if self.top < 0:
            print("Stack Underflow")
            return 0
        else:
            x = self.arr[self.top]
            self.top -= 1
            return x

    def peek(self):
        if self.top < 0:
            print("Stack is Empty")
            return 0
        else:
            return self.arr[self.top]

    def is_empty(self):
        return self.top < 0


if __name__ == "__main__":
    s = Stack()
    s.push(10)
    s.push(20)
    s.push(30)
    print(f"{s.pop()} popped from stack")
    print(f"Top element is: {s.peek()}")
    print(f"Stack empty: {s.is_empty()}")
