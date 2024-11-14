#include <iostream>

class StackNode {
public:
    int data;
    StackNode* next;

    StackNode(int data) : data(data), next(nullptr) {} // Constructor
};

class Stack {
private:
    StackNode* root; // Top of the stack

public:
    Stack() : root(nullptr) {} // Constructor

    bool isEmpty() {
        return root == nullptr;
    }

    void push(int data) {
        StackNode* stackNode = new StackNode(data);
        stackNode->next = root;
        root = stackNode;
        std::cout << data << " pushed to stack\n";
    }

    int pop() {
        if (isEmpty()) {
            std::cout << "Stack Underflow\n";
            return 0; // Return 0 on underflow
        }
        StackNode* temp = root;
        root = root->next;
        int popped = temp->data;
        delete temp;
        return popped;
    }

    int peek() {
        if (isEmpty()) {
            std::cout << "Stack is Empty\n";
            return 0; // Return 0 if empty
        }
        return root->data;
    }
};

int main() {
    Stack stack; // Create a stack instance

    stack.push(10);
    stack.push(20);
    stack.push(30);

    std::cout << stack.pop() << " popped from stack\n";
    std::cout << "Top element is: " << stack.peek() << std::endl;
    std::cout << "Stack empty: " << (stack.isEmpty() ? "Yes" : "No") << std::endl;

    return 0;
}
