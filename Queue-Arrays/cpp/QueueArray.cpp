/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for implementing Queue using Arrays
// This program demonstrates basic queue operations using array

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Enqueue      | O(1)      | O(1)         | O(1)       |
//|Dequeue      | O(1)      | O(1)         | O(1)       |
//|Front/Rear   | O(1)      | O(1)         | O(1)       |

#include <iostream>

#define MAX 1000 // Maximum size of the queue

class Queue {
private:
    int front, rear, size; // Front and rear pointers and size of the queue
    int arr[MAX];          // Array to store queue elements

public:
    // Constructor to initialize queue
    Queue() {
        front = size = 0;
        rear = MAX - 1;
    }

    // Function to add an item to the queue
    bool enqueue(int item) {
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
    int dequeue() {
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
    int getFront() {
        if (isEmpty()) {
            std::cout << "Queue is Empty\n";
            return 0; // Return 0 if empty
        }
        return arr[front];
    }

    // Function to get the rear item from the queue without removing it
    int getRear() {
        if (isEmpty()) {
            std::cout << "Queue is Empty\n";
            return 0; // Return 0 if empty
        }
        return arr[rear];
    }

    // Function to check if the queue is empty
    bool isEmpty() {
        return (size == 0);
    }

    // Function to check if the queue is full
    bool isFull() {
        return (size == MAX);
    }
};

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

//Sample Input: enqueue(10), enqueue(20), enqueue(30), enqueue(40)
//Sample Output: 10 dequeued from queue
//              Front item is 20
//              Rear item is 40

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 