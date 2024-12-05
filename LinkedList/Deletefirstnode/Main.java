import java.util.*;

class Node {
    int data;
    Node next;

    // Constructor to initialize the node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    // Function to delete the first node
    static Node deleteFirstNode(Node head) {
        // If the list is empty
        if (head == null)
            return null;

        // If the list has only one node
        if (head.next == null) {
            head = null; // Explicitly set head to null
            return null;
        }

        // If the list has multiple nodes
        Node toDelete = head;
        head = head.next;
        toDelete = null; // Allow garbage collector to handle memory
        return head;
    }

    // Function to print the linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;
        Node previous = null;
        Node current = null;

        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; ++i) {
            System.out.print("Enter data for node " + (i + 1) + ": ");
            int data = scanner.nextInt();
            current = new Node(data);

            if (head == null) {
                head = current; 
                // First node becomes head
            } else {
                previous.next = current; 
                // Link the previous node to the current node
            }

            previous = current; 
            // Move previous to current
        }

        System.out.println("Original Linked List:");
        printList(head);

        // Deleting the first node
        head = deleteFirstNode(head);

        System.out.println("Linked List after deleting the first node:");
        printList(head);

        scanner.close();
    }
}
