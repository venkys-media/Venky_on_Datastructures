#include <iostream>

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

int main() {
    Node* head = nullptr; // Head of the linked list

    std::cout << "Enter the number of nodes: ";
    int n;
    std::cin >> n;

    for (int i = 0; i < n; ++i) {
        std::cout << "Enter data for node " << (i + 1) << ": ";
        int data;
        std::cin >> data;
        Node* newNode = new Node(data);

        if (head == nullptr) {
            head = newNode; 
            // First node becomes head
        } else {
            Node* temp = head;
            while (temp->next != nullptr) {
                temp = temp->next; 
                // Traverse to the last node
            }
            temp->next = newNode; 
            // Link the new node to the last node
        }
    }

    // Optional: Print the linked list
    Node* temp = head;
    std::cout << "Linked list: ";
    while (temp != nullptr) {
        std::cout << temp->data << " ";
        temp = temp->next;
    }
    std::cout << std::endl;

    // Clean up memory (optional)
    temp = head;
    while (temp != nullptr) {
        Node* nextNode = temp->next;
        delete temp;
        temp = nextNode;
    }

    return 0;
}