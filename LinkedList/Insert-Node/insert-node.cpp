#include <iostream>
using namespace std;

// Define the Node structure
struct Node {
    int data;
    Node* next;
    
    Node(int val) : data(val), next(nullptr) {}
};

// Function to insert a node at a specific position
Node* insertNode(Node* head, int data, int position) {
    Node* newNode = new Node(data);

    if (position == 1) {  // Insert at the head
        newNode->next = head;
        return newNode;
    }

    Node* current = head;
    for (int i = 1; i < position - 1 && current != nullptr; i++) {
        current = current->next;
    }

    if (current == nullptr) {  // Position is beyond the list length
        cout << "Invalid position!" << endl;
        delete newNode;
        return head;
    }

    newNode->next = current->next;
    current->next = newNode;

    return head;
}

// Function to print the linked list
void printList(Node* head) {
    Node* current = head;
    while (current != nullptr) {
        cout << current->data << " -> ";
        current = current->next;
    }
    cout << "nullptr" << endl;
}

int main() {
    // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
    Node* head = new Node(1);
    head->next = new Node(2);
    head->next->next = new Node(3);
    head->next->next->next = new Node(4);
    head->next->next->next->next = new Node(5);

    // Print the original list
    cout << "Original list: ";
    printList(head);

    // Insert a new node with value 2.5 at position 3
    head = insertNode(head, 20, 3);

    // Print the modified list
    cout << "List after inserting 2.5 at position 3: ";
    printList(head);

    // Clean up remaining nodes
    while (head != nullptr) {
        Node* temp = head;
        head = head->next;
        delete temp;
    }

    return 0;
}
