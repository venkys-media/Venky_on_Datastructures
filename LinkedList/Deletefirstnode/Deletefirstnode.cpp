#include <iostream>

class Node
{
public:
    int data;   // Node data
    Node *next; // Pointer to the next node

    // Constructor to initialize the node
    Node(int data)
    {
        this->data = data;
        this->next = nullptr; // Initialize next as null
    }
};

// Function to delete the first node
Node *deleteFirstNode(Node *head)
{
    // If the list is empty
    if (head == nullptr)
        return nullptr;

    // If the list has only one node
    if (head->next == nullptr)
    {
        delete head; // Free the memory
        return nullptr;
    }

    // If the list has multiple nodes
    Node *toDelete = head;
    head = head->next;
    delete toDelete; // Free the memory
    return head;
}

// Function to print the linked list
void printList(Node *head)
{
    Node *temp = head;
    while (temp != nullptr)
    {
        std::cout << temp->data << " ";
        temp = temp->next;
    }
    std::cout << std::endl;
}

int main()
{
    Node *head = nullptr; // Head of the linked list

    std::cout << "Enter the number of nodes: ";
    int n;
    std::cin >> n;

    for (int i = 0; i < n; ++i)
    {
        std::cout << "Enter data for node " << (i + 1) << ": ";
        int data;
        std::cin >> data;
        Node *newNode = new Node(data);

        if (head == nullptr)
        {
            head = newNode;
            // First node becomes head
        }
        else
        {
            Node *temp = head;
            while (temp->next != nullptr)
            {
                temp = temp->next;
                // Traverse to the last node
            }
            temp->next = newNode;
            // Link the new node to the last node
        }
    }

    std::cout << "Original Linked List:" << std::endl;
    printList(head);

    // Deleting the first node
    head = deleteFirstNode(head);

    std::cout << "Linked List after deleting the first node:" << std::endl;
    printList(head);

    // Clean up memory (optional)
    while (head != nullptr)
    {
        Node *nextNode = head->next;
        delete head;
        head = nextNode;
    }

    return 0;
}