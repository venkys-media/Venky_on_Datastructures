#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
};

// Function to print the linked list
void traverse(Node* head) {
    Node* temp = head;
    while (temp != nullptr) {
        cout << temp->data << " -> ";
        temp = temp->next;
    }
    cout << "NULL" << endl;
}

// Function to insert a new node at the end
void insert(Node** head, int data) {
    Node* newNode = new Node();
    newNode->data = data;
    newNode->next = nullptr;

    if (*head == nullptr) {
        *head = newNode;
        return;
    }

    Node* temp = *head;
    while (temp->next != nullptr)
        temp = temp->next;

    temp->next = newNode;
}

int main() {
    Node* head = nullptr;
    
    insert(&head, 35);
    insert(&head, 71);
    insert(&head, 34);
    insert(&head, 67);
    insert(&head, 23);
    insert(&head, 89);


    
    cout << "Linked list: ";
    traverse(head);
    
    return 0;
}
