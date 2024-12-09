/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for reversing a linked list using recursion
// This program demonstrates recursive approach to reverse list

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Recursion    | O(n)      | O(n)         | O(n)       |

#include <iostream>

// Node structure definition
struct Node {
    int data;      // Data part of the node
    Node* next;    // Pointer to the next node

    // Constructor to initialize a new node
    Node(int val) : data(val), next(nullptr) {}
};

// Function to reverse the linked list
Node* reverse(Node* head) {
    // Base case: if head is nullptr or there's only one node
    if (head == nullptr || head->next == nullptr) {
        return head;
    }

    // Recursive call to reverse the rest of the list
    Node* rest = reverse(head->next);

    // Adjust pointers
    head->next->next = head; // Make the next node point to the current node
    head->next = nullptr;     // Set the next of current node to nullptr

    return rest;             // Return the new head of the reversed list
}

// Function to print the linked list
void printList(Node* head) {
    while (head != nullptr) {
        std::cout << head->data << " "; // Print the data of the current node
        head = head->next;               // Move to the next node
    }
    std::cout << std::endl;              // Print a new line at the end
}

int main() {
    // Create a linked list: 1 -> 2 -> 3 -> 4
    Node* head = new Node(1);
    head->next = new Node(2);
    head->next->next = new Node(3);
    head->next->next->next = new Node(4);

    // Print the original list
    std::cout << "Original List: ";
    printList(head);

    // Reverse the linked list
    head = reverse(head);

    // Print the reversed list
    std::cout << "Reversed List: ";
    printList(head);

    // Clean up the memory
    while (head != nullptr) {
        Node* temp = head;
        head = head->next;
        delete temp;
    }

    return 0;
}

//Sample Input: List: 1->2->3->4
//Sample Output: Original List: 1 2 3 4
//              Reversed List: 4 3 2 1

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@venkysio 