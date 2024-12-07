/* Copyrights to venkys.io
 Visit https://venkys.io for more information */

// C++ program for implementing Linked List with user input
// This program demonstrates creation of linked list nodes dynamically

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Insertion    | O(1)      | O(1)         | O(1)       |
//|Traversal    | O(n)      | O(n)         | O(n)       |

#include <iostream>

// class to represent a Node in linked list
class StudentNode {
public:
    int studentId;       // data stored in the node
    StudentNode* next;   // pointer to the next node

    // Constructor to initialize the node
    StudentNode(int studentId) {
        this->studentId = studentId;
        this->next = nullptr;  // Initialize next as null
    }
};

// Function to print the linked list
void printList(StudentNode* head) {
    StudentNode* temp = head;
    while (temp != nullptr) {
        std::cout << temp->studentId << " ";
        temp = temp->next;
    }
    std::cout << std::endl;
}

// main function
int main() {
    // take number of nodes as input
    int n;
    std::cout << "Enter the number of nodes: ";
    std::cin >> n;

    StudentNode* head = nullptr;     // head of the linked list
    StudentNode* previous = nullptr; // track previous node
    StudentNode* current = nullptr;  // current node being created

    // create linked list with n nodes
    for (int i = 0; i < n; ++i) {
        int data;
        std::cout << "Enter data for node " << (i + 1) << ": ";
        std::cin >> data;
        current = new StudentNode(data);
        
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
        StudentNode* nextNode = current->next;
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

```</rewritten_file>