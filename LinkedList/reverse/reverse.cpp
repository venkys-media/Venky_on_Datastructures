#include <iostream>

class Node {
public:
    int data;          // Node data
    Node* next;       // Pointer to the next node

    // Constructor to initialize the node
    Node(int data) {
        this->data = data;
        this->next = nullptr; // Initialize next as null
    }
};

// Function to reverse the linked list
Node* reverseList(Node* head) {
    Node* current = head;
    Node* prev = nullptr;
    Node* next = nullptr;

    while (current != nullptr) {
        next = current->next; // Store the next node
        current->next = prev; // Reverse the current node's pointer
        prev = current;       // Move prev to current
        current = next;       // Move current to next
    }

    head = prev; // Update head to the new front
    return head;
}

// Function to print the linked list
void printList(Node* head) {
    Node* temp = head;
    while (temp != nullptr) {
        std::cout << temp->data << " ";
        temp = temp->next;
    }
    std::cout << std::endl;
}

int main() {
    // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
    Node* head = new Node(1);
    head->next = new Node(2);
    head->next->next = new Node(3);
    head->next->next->next = new Node(4);
    head->next->next->next->next = new Node(5);

    std::cout << "Original Linked List: ";
    printList(head);

    // Reverse the linked list
    head = reverseList(head);

    std::cout << "Reversed Linked List: ";
    printList(head);

    // Clean up memory (optional)
    while (head != nullptr) {
        Node* nextNode = head->next;
        delete head;
        head = nextNode;
    }

    return 0;
}