#include <iostream>

class QueueNode {
public:
    int data;           // Data stored in the node
    QueueNode* next;    // Pointer to the next node
};

class Queue {
private:
    QueueNode *front;   // Pointer to the front of the queue
    QueueNode *rear;    // Pointer to the rear of the queue

public:
    Queue();            // Constructor
    void enqueue(int data);  // Add item to the queue
    int dequeue();      // Remove and return item from the queue
    int getFront();     // Get the front item without removing it
    int getRear();      // Get the rear item without removing it
    bool isEmpty();     // Check if the queue is empty
};

// Constructor to initialize an empty queue
Queue::Queue() {
    front = rear = nullptr;
}

// Function to add an item to the queue
void Queue::enqueue(int data) {
    QueueNode* newNode = new QueueNode();  // Create a new node
    newNode->data = data;                   // Assign data
    newNode->next = nullptr;                // Set next pointer to nullptr

    if (rear == nullptr) {                  // If the queue is empty
        front = rear = newNode;             // Both front and rear point to new node
    } else {
        rear->next = newNode;               // Link the old rear to the new node
        rear = newNode;                     // Update the rear to the new node
    }

    std::cout << data << " enqueued to queue\n";
}

// Function to remove and return the front item from the queue
int Queue::dequeue() {
    if (isEmpty()) {
        std::cout << "Queue Underflow\n";
        return 0; // Return 0 on underflow
    }

    QueueNode* temp = front;                // Store the front node
    front = front->next;                    // Move front to the next node

    if (front == nullptr) {                 // If the queue is now empty
        rear = nullptr;                     // Update rear to nullptr
    }

    int item = temp->data;                  // Get the data from the dequeued node
    delete temp;                            // Free memory of the dequeued node
    return item;
}

// Function to get the front item from the queue without removing it
int Queue::getFront() {
    if (isEmpty()) {
        std::cout << "Queue is Empty\n";
        return 0; // Return 0 if empty
    }
    return front->data;                     // Return the front item's data
}

// Function to get the rear item from the queue without removing it
int Queue::getRear() {
    if (isEmpty()) {
        std::cout << "Queue is Empty\n";
        return 0; // Return 0 if empty
    }
    return rear->data;                      // Return the rear item's data
}

// Function to check if the queue is empty
bool Queue::isEmpty() {
    return (front == nullptr);               // Queue is empty if front is nullptr
}

// Main function to demonstrate queue operations
int main() {
    Queue q; // Create a queue instance

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);

    std::cout << q.dequeue() << " dequeued from queue\n";
    std::cout << "Front item is " << q.getFront() << std::endl;
    std::cout << "Rear item is " << q.getRear() << std::endl;

    return 0;
}
