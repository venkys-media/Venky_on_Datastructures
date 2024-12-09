/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for implementing Queue using Linked List
// This program demonstrates basic queue operations using linked list

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Enqueue      | O(1)      | O(1)         | O(1)       |
//|Dequeue      | O(1)      | O(1)         | O(1)       |
//|Front/Rear   | O(1)      | O(1)         | O(1)       |

class QueueNode {
    int data;           // Data stored in the node
    QueueNode next;     // Reference to the next node

    // Constructor
    QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueLinked {
    private QueueNode front; // Reference to the front of the queue
    private QueueNode rear;  // Reference to the rear of the queue

    // Constructor to initialize an empty queue
    public QueueLinked() {
        front = rear = null;
    }

    // Function to add an item to the queue
    public void enqueue(int data) {
        QueueNode newNode = new QueueNode(data); // Create a new node

        if (rear == null) { // If the queue is empty
            front = rear = newNode; // Both front and rear point to the new node
        } else {
            rear.next = newNode; // Link the old rear to the new node
            rear = newNode; // Update the rear to the new node
        }

        System.out.println(data + " enqueued to queue");
    }

    // Function to remove and return the front item from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return 0; // Return 0 on underflow
        }

        QueueNode temp = front; // Store the front node
        front = front.next; // Move front to the next node

        if (front == null) { // If the queue is now empty
            rear = null; // Update rear to null
        }

        int item = temp.data; // Get the data from the dequeued node
        return item;
    }

    // Function to get the front item from the queue without removing it
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return 0; // Return 0 if empty
        }
        return front.data;
    }

    // Function to get the rear item from the queue without removing it
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return 0; // Return 0 if empty
        }
        return rear.data;
    }

    // Function to check if the queue is empty
    public boolean isEmpty() {
        return (front == null);
    }

    // Main method to demonstrate queue operations
    public static void main(String[] args) {
        QueueLinked q = new QueueLinked(); // Create a queue instance

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue() + " dequeued from queue");
        System.out.println("Front item is " + q.getFront());
        System.out.println("Rear item is " + q.getRear());
    }
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
// Follow us on Youtube - https://www.youtube.com/@venkysio 