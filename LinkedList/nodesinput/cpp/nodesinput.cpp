/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for implementing Linked List with user input (Method 1)
// This program demonstrates creation of linked list using previous pointer

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Insertion    | O(1)      | O(1)         | O(1)       |
//|Traversal    | O(n)      | O(n)         | O(n)       |

#include <iostream>

// class to represent a Node in linked list
class Node {
public:
    int data;     // data stored in the node
    Node* next;   // pointer to the next node

    // Constructor to initialize the node
    Node(int data) {
        this->data = data;
        this->next = nullptr;  // Initialize next as null
    }
};

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
    Node* head = nullptr;     // head of the linked list
    Node* previous = nullptr; // track previous node
    Node* current = nullptr;  // current node being created

    // take number of nodes as input
    std::cout << "Enter the number of nodes: ";
    int n;
    std::cin >> n;

    // create linked list with n nodes
    for (int i = 0; i < n; ++i) {
        std::cout << "Enter data for node " << (i + 1) << ": ";
        int data;
        std::cin >> data;
        current = new Node(data);
        
        if (head == nullptr) {
            head = current;     // First node becomes head
        } else {
            previous->next = current;  // Link previous node to current
        }
        previous = current;     // Update previous to current
    }

    // Print the linked list
    std::cout << "\nThe linked list is:" << std::endl;
    printList(head);

    // Clean up memory
    current = head;
    while (current != nullptr) {
        Node* nextNode = current->next;
        delete current;
        current = nextNode;
    }

    return 0;
}

//Sample Input: 3
//             10 20 30
//Sample Output: 10 20 30

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@venkysio 