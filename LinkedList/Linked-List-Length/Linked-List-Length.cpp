#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;

    // Constructor to initialize a node with data
    Node(int value) : data(value), next(nullptr) {}
};

// Function to count the number of nodes in the linked list
int countListSize(Node* head) {
    int size = 0;
    Node* temp = head;

    while (temp != nullptr) {
        size++;  // Increment size for each node
        temp = temp->next;  // Move to the next node
    }

    return size;
}

int main() {
    // Create a linked list: 1 -> 2 -> 3
    Node* head = new Node(1);
    head->next = new Node(2);
    head->next->next = new Node(3);
    head->next->next->next = new Node(5);

    // Count the number of nodes in the list
    int size = countListSize(head);
    cout << "Number of nodes in the list: " << size << endl;

    // Clean up memory
    Node* temp;
    while (head != nullptr) {
        temp = head;  // Store the current head
        head = head->next;  // Move the head to the next node
        delete temp;  // Delete the old head
    }

    return 0;
}
