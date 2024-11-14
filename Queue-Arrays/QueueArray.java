class QueueArray {
    private static final int MAX = 1000; // Maximum size of the queue
    private int front, rear, size; // Front and rear pointers and size of the queue
    private int[] arr; // Array to store queue elements

    public QueueArray() {
        front = size = 0;
        rear = MAX - 1;
        arr = new int[MAX]; // Initialize array
    }

    // Function to add an item to the queue
    public boolean enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return false;
        }

        rear = (rear + 1) % MAX; // Circular increment
        arr[rear] = item;
        size++;
        System.out.println(item + " enqueued to queue");
        return true;
    }

    // Function to remove and return the front item from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return 0; // Return 0 on underflow
        }

        int item = arr[front];
        front = (front + 1) % MAX; // Circular increment
        size--;
        return item;
    }

    // Function to get the front item from the queue without removing it
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return 0; // Return 0 if empty
        }
        return arr[front];
    }

    // Function to get the rear item from the queue without removing it
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return 0; // Return 0 if empty
        }
        return arr[rear];
    }

    // Function to check if the queue is empty
    public boolean isEmpty() {
        return (size == 0);
    }

    // Function to check if the queue is full
    public boolean isFull() {
        return (size == MAX);
    }

    // Main method to demonstrate queue operations
    public static void main(String[] args) {
        QueueArray q = new QueueArray(); // Create a queue instance

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        System.out.println(q.dequeue() + " dequeued from queue");
        System.out.println("Front item is " + q.getFront());
        System.out.println("Rear item is " + q.getRear());
    }
}
