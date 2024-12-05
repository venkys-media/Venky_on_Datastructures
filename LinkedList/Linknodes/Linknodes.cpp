#include <iostream>

class StudentNode {
public:
    int studentId;       // Student ID
    std::string name;    // Student Name
    int age;             // Student Age
    StudentNode* next;   // Pointer to the next node

    // Constructor to initialize a node with details
    StudentNode(int studentId, std::string name, int age) {
        this->studentId = studentId; 
        this->name = name; 
        this->age = age; 
        this->next = nullptr; // Initialize next as null 
    }
};

int main() {
    // Create the first node (head node)
    StudentNode* head = new StudentNode(1, "Alice", 20);
    // Create the second node
    StudentNode* second = new StudentNode(2, "Bob", 22);
    // Create the third node
    StudentNode* third = new StudentNode(3, "Charlie", 21);
    head->next = second; 

    // Link the first node to the second node
    second->next = third; 

    // Clean up memory (optional)
    delete head;
    delete second;
    delete third;

    return 0;
}