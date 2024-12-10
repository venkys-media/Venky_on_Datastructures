/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for implementing Linked List Traversal
// This program demonstrates traversing and inserting nodes in a linked list

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Traversal    | O(n)      | O(n)         | O(n)       |
//|Insertion    | O(1)      | O(n)         | O(n)       |

#include <iostream>
using namespace std;

// structure to represent a Node in linked list
struct Node {
    int data;     // data stored in the node
    Node* next;   // pointer to the next node
};

// Function to traverse and print the linked list
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

// main function
int main() {
    Node* head = nullptr;
    
    // Insert some nodes
    insert(&head, 35);
    insert(&head, 71);
    insert(&head, 34);
    insert(&head, 67);
    insert(&head, 23);
    insert(&head, 89);
    
    // Print the linked list
    cout << "Linked list: ";
    traverse(head);
    
    // Clean up memory
    Node* temp = head;
    while (temp != nullptr) {
        Node* next = temp->next;
        delete temp;
        temp = next;
    }
    
    return 0;
}

//Sample Input: None (Static node insertion)
//Sample Output: Linked list: 35 -> 71 -> 34 -> 67 -> 23 -> 89 -> NULL

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 