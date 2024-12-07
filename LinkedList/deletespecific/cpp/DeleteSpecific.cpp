/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for deleting a node at specific position in Linked List
// This program demonstrates deletion at any given position

// Space complexity: O(1)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Deletion     | O(1)      | O(n)         | O(n)       |

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

// Function to count the size of the list
int countListSize(Node* head) {
    int size = 0;
    Node* temp = head;
    while (temp != nullptr) {
        size++;
        temp = temp->next;
    }
    return size;
}

// Function to delete a node at a specific position
Node* deleteAnyNode(Node* head, int nodeNum) {
    if (head == nullptr || nodeNum < 1) {
        std::cout << "Invalid operation." << std::endl;
        return head;
    }

    if (nodeNum == 1) return head->next; // Delete head

    Node* current = head;
    for (int i = 1; current->next != nullptr && i < nodeNum - 1; i++)
        current = current->next;

    if (current->next == nullptr) {
        std::cout << "Position exceeds list size." << std::endl;
        return head;
    }

    current->next = current->next->next; // Bypass node
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

    std::cout << "Original Linked List:" << std::endl;
    printList(head);

    head = deleteAnyNode(head, 3); // Delete node at position 3

    std::cout << "After deleting position 3:" << std::endl;
    printList(head);

    // Clean up memory
    while (head != nullptr) {
        Node* nextNode = head->next;
        delete head;
        head = nextNode;
    }

    return 0;
}

//Sample Input: List: 1->2->3->4->5, Delete position: 3
//Sample Output: List after deletion: 1 2 4 5

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@venkysio 