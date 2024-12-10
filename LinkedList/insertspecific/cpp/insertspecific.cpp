/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for inserting a node at specific position in Linked List
// This program demonstrates insertion at any given position

// Space complexity: O(1)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Insertion    | O(1)      | O(n)         | O(n)       |

#include <iostream>

// class to represent a Node in linked list
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

// Function to insert a node at a specific position
Node* insertNode(Node* head, int data, int position) {
    Node* newNode = new Node(data);
    if (position == 1) { // Insert at the head
        newNode->next = head;
        return newNode;
    }

    Node* current = head;
    for (int i = 1; i < position - 1 && current != nullptr; i++) {
        current = current->next;
    }

    if (current == nullptr) { // Position is beyond the list length
        std::cout << "Invalid position!" << std::endl;
        return head;
    }

    newNode->next = current->next;
    current->next = newNode;
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

// main function
int main() {
    // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
    Node* head = new Node(1);
    head->next = new Node(2);
    head->next->next = new Node(3);
    head->next->next->next = new Node(4);
    head->next->next->next->next = new Node(5);

    // Insert a new node with value 2 at position 3
    head = insertNode(head, 2, 3);

    // Print the updated linked list
    std::cout << "Updated Linked List: ";
    printList(head);

    // Clean up memory
    while (head != nullptr) {
        Node* nextNode = head->next;
        delete head;
        head = nextNode;
    }

    return 0;
}

//Sample Input: List: 1->2->3->4->5, Insert: value=2, position=3
//Sample Output: Updated Linked List: 1 2 2 3 4 5

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 