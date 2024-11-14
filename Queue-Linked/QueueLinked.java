class QueueNode {
    int data;           // Data stored in the node
    QueueNode next;     // Pointer to the next node

    // Constructor
    QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueLinked {
    private QueueNode front; // Pointer to the front of the queue
    private QueueNode rear;  // Pointer to the rear of the queue

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
        return item; // Return the dequeued item
    }

    // Function to get the front item from the queue without removing it
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return 0; // Return 0 if empty
        }
        return front.data; // Return the front item's data
    }

    // Function to get the rear item from the queue without removing it
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return 0; // Return 0 if empty
        }
        return rear.data; // Return the rear item's data
    }

    // Function to check if the queue is empty
    public boolean isEmpty() {
        return (front == null); // Queue is empty if front is null
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
