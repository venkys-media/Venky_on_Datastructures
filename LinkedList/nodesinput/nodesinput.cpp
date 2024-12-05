#include <iostream>

class StudentNode {
public:
    int studentId;       // Student ID
    StudentNode* next;   // Pointer to the next node

    // Constructor to initialize a node with details
    StudentNode(int studentId) {
        this->studentId = studentId; 
        this->next = nullptr; // Initialize next as null 
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

int main() {
    int n;
    std::cout << "Enter the number of nodes: ";
    std::cin >> n;

    StudentNode* head = nullptr;
    StudentNode* previous = nullptr;
    StudentNode* current = nullptr;

    for (int i = 0; i < n; ++i) {
        int data;
        std::cout << "Enter data for node " << (i + 1) << ": ";
        std::cin >> data;
        current = new StudentNode(data);
        if (head == nullptr) {
            head = current; 
            // First node becomes head
        } else {
            previous->next = current; 
            // Link the previous node to the current node
        }
        previous = current; 
        // Move previous to current
    }

    // Print the linked list
    printList(head);

    // Clean up memory (optional)
    current = head;
    while (current != nullptr) {
        StudentNode* nextNode = current->next;
        delete current;
        current = nextNode;
    }

    return 0;
}