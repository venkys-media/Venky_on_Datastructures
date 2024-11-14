#include <iostream>
using namespace std;

// Define the Node structure
struct Node {
    int data;
    Node* next;
    
    Node(int val) : data(val), next(nullptr) {}
};

// Function to count the size of the linked list
int countListSize(Node* head) {
    int size = 0;
    while (head != nullptr) {
        size++;
        head = head->next;
    }
    return size;
}

// Function to delete a node at a specific position
Node* deleteAnyNode(Node* head, int nodeNum) {
    int listSize = countListSize(head);

    // If the list is empty
    if (listSize == 0) {
        cout << "List is empty. Nothing to delete." << endl;
        return nullptr;
    }

    // If the list has only one node
    if (listSize == 1) {
        if (nodeNum == 1) {
            delete head;
            return nullptr;
        } else {
            cout << "Invalid node number to delete." << endl;
            return head;
        }
    }

    // If the nodeNum is greater than the size of the list
    if (nodeNum > listSize) {
        cout << "Invalid node number to delete." << endl;
        return head;
    }

    // If the node to delete is the head node
    if (nodeNum == 1) {
        Node* toDelete = head;
        head = head->next;
        delete toDelete;
        return head;
    }

    // Traverse to the node just before the one to be deleted
    Node* current = head;
    for (int i = 1; i < nodeNum - 1; i++) {
        current = current->next;
    }

    // Delete the node
    Node* toDelete = current->next;
    current->next = toDelete->next;
    delete toDelete;

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

    // Delete the node at position 3
    head = deleteAnyNode(head, 3);

    // Print the modified list
    cout << "List after deleting node at position 3: ";
    printList(head);

    // Clean up remaining nodes
    while (head != nullptr) {
        Node* temp = head;
        head = head->next;
        delete temp;
    }

    return 0;
}
