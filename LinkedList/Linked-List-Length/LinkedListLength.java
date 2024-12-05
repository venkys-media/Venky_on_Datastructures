class Node {
    int data;
    Node next;

    // Constructor to initialize a node with data
    Node(int value) {
        data = value;
        next = null;
    }
}

public class LinkedListLength {
    
    // Function to count the number of nodes in the linked list
    public static int countListSize(Node head) {
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;  // Increment size for each node
            temp = temp.next;  // Move to the next node
        }

        return size;
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(5);

        // Count the number of nodes in the list
        int size = countListSize(head);
        System.out.println("Number of nodes in the list: " + size);

        // Clean up memory (not really necessary in Java, thanks to garbage collection)
        head = null; // Just set the head to null, and let the garbage collector handle the rest
    }
}
