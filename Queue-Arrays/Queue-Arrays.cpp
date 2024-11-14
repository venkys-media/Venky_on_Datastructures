#include <iostream>

#define MAX 1000 // Maximum size of the queue

class Queue {
private:
    int front, rear, size; // Front and rear pointers and size of the queue
    int arr[MAX];          // Array to store queue elements

public:
    Queue();               // Constructor
    bool enqueue(int item);
    int dequeue();
    int getFront();
    int getRear();
    bool isEmpty();
    bool isFull();
};

// Constructor to initialize queue
Queue::Queue() {
    front = size = 0;
    rear = MAX - 1;
}

// Function to add an item to the queue
bool Queue::enqueue(int item) {
    if (isFull()) {
        std::cout << "Queue Overflow\n";
        return false;
    }

    rear = (rear + 1) % MAX; // Circular increment
    arr[rear] = item;
    size++;
    std::cout << item << " enqueued to queue\n";
    return true;
}

// Function to remove and return the front item from the queue
int Queue::dequeue() {
    if (isEmpty()) {
        std::cout << "Queue Underflow\n";
        return 0; // Return 0 on underflow
    }

    int item = arr[front];
    front = (front + 1) % MAX; // Circular increment
    size--;
    return item;
}

// Function to get the front item from the queue without removing it
int Queue::getFront() {
    if (isEmpty()) {
        std::cout << "Queue is Empty\n";
        return 0; // Return 0 if empty
    }
    return arr[front];
}

// Function to get the rear item from the queue without removing it
int Queue::getRear() {
    if (isEmpty()) {
        std::cout << "Queue is Empty\n";
        return 0; // Return 0 if empty
    }
    return arr[rear];
}

// Function to check if the queue is empty
bool Queue::isEmpty() {
    return (size == 0);
}

// Function to check if the queue is full
bool Queue::isFull() {
    return (size == MAX);
}

// Main function to demonstrate queue operations
int main() {
    Queue q; // Create a queue instance

    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);

    std::cout << q.dequeue() << " dequeued from queue\n";
    std::cout << "Front item is " << q.getFront() << std::endl;
    std::cout << "Rear item is " << q.getRear() << std::endl;

    return 0;
}
