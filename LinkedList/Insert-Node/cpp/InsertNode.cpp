/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for inserting a node at a specific position in Linked List
// This program demonstrates insertion at any given position

// Space complexity: O(1)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Insertion    | O(1)      | O(n)         | O(n)       |

#include <iostream>
using namespace std;

// structure to represent a Node in linked list
struct Node {
    int data;     // Node data
    Node* next;   // Pointer to the next node
    
    // Constructor to initialize the node
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

// main function
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

    // Insert a new node with value 20 at position 3
    head = insertNode(head, 20, 3);

    // Print the modified list
    cout << "List after inserting 20 at position 3: ";
    printList(head);

    // Clean up memory
    while (head != nullptr) {
        Node* temp = head;
        head = head->next;
        delete temp;
    }

    return 0;
}

//Sample Input: List: 1->2->3->4->5, Insert: value=20, position=3
//Sample Output: List after inserting 20 at position 3: 1 -> 2 -> 20 -> 3 -> 4 -> 5 -> nullptr

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 