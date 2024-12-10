/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for deleting first node in Linked List
// This program demonstrates deletion of head node

// Space complexity: O(1)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Deletion     | O(1)      | O(1)         | O(1)       |

#include <iostream>

// class to represent a Node in linked list
class Node {
public:
    int data;   // Node data
    Node* next; // Pointer to the next node

    // Constructor to initialize the node
    Node(int data) {
        this->data = data;
        this->next = nullptr; // Initialize next as null
    }
};

// Function to delete the first node
Node* deleteFirstNode(Node* head) {
    // If the list is empty
    if (head == nullptr)
        return nullptr;

    // If the list has only one node
    if (head->next == nullptr) {
        delete head; // Free the memory
        return nullptr;
    }

    // If the list has multiple nodes
    Node* toDelete = head;
    head = head->next;
    delete toDelete; // Free the memory
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
    Node* head = nullptr; // Head of the linked list

    std::cout << "Enter the number of nodes: ";
    int n;
    std::cin >> n;

    // Create linked list with n nodes
    for (int i = 0; i < n; ++i) {
        std::cout << "Enter data for node " << (i + 1) << ": ";
        int data;
        std::cin >> data;
        Node* newNode = new Node(data);

        if (head == nullptr) {
            head = newNode; // First node becomes head
        } else {
            Node* temp = head;
            while (temp->next != nullptr) {
                temp = temp->next; // Traverse to the last node
            }
            temp->next = newNode; // Link the new node to the last node
        }
    }

    std::cout << "Original Linked List:" << std::endl;
    printList(head);

    // Deleting the first node
    head = deleteFirstNode(head);

    std::cout << "Linked List after deleting the first node:" << std::endl;
    printList(head);

    // Clean up memory
    while (head != nullptr) {
        Node* nextNode = head->next;
        delete head;
        head = nextNode;
    }

    return 0;
}

//Sample Input: n=5, nodes: 1 2 3 4 5
//Sample Output: Original List: 1 2 3 4 5
//              After deletion: 2 3 4 5

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork