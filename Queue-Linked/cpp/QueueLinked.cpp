/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for implementing Queue using Linked List
// This program demonstrates basic queue operations using linked list

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Enqueue      | O(1)      | O(1)         | O(1)       |
//|Dequeue      | O(1)      | O(1)         | O(1)       |
//|Front/Rear   | O(1)      | O(1)         | O(1)       |

#include <iostream>

class QueueNode {
public:
    int data;           // Data stored in the node
    QueueNode* next;    // Pointer to the next node

    // Constructor
    QueueNode(int data) {
        this->data = data;
        this->next = nullptr;
    }
};

class Queue {
private:
    QueueNode *front;   // Pointer to the front of the queue
    QueueNode *rear;    // Pointer to the rear of the queue

public:
    // Constructor to initialize an empty queue
    Queue() {
        front = rear = nullptr;
    }

    // Function to add an item to the queue
    void enqueue(int data) {
        QueueNode* newNode = new QueueNode(data);  // Create a new node

        if (rear == nullptr) {                  // If the queue is empty
            front = rear = newNode;             // Both front and rear point to new node
        } else {
            rear->next = newNode;               // Link the old rear to the new node
            rear = newNode;                     // Update the rear to the new node
        }

        std::cout << data << " enqueued to queue\n";
    }

    // Function to remove and return the front item from the queue
    int dequeue() {
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
    int getFront() {
        if (isEmpty()) {
            std::cout << "Queue is Empty\n";
            return 0; // Return 0 if empty
        }
        return front->data;
    }

    // Function to get the rear item from the queue without removing it
    int getRear() {
        if (isEmpty()) {
            std::cout << "Queue is Empty\n";
            return 0; // Return 0 if empty
        }
        return rear->data;
    }

    // Function to check if the queue is empty
    bool isEmpty() {
        return (front == nullptr);
    }

    // Destructor to free memory
    ~Queue() {
        while (front != nullptr) {
            QueueNode* temp = front;
            front = front->next;
            delete temp;
        }
        rear = nullptr;
    }
};

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

//Sample Input: enqueue(10), enqueue(20), enqueue(30)
//Sample Output: 10 dequeued from queue
//              Front item is 20
//              Rear item is 30

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 