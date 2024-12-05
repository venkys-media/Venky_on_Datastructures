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
    // Function to print the linked list
    public static void printList(Node head) {
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
        // Print the linked list
        printList(head);
        scanner.close();
    }
}


