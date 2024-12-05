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

    // Function to reverse the linked list
    public static Node reverseList(Node head) {
        Node current = head;
        Node prev = null;
        Node next;
        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the current node's pointer
            prev = current;      // Move prev to current
            current = next;      // Move current to next
        }

        head = prev;
        return head;
    }
    
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Reverse the linked list
        head = reverseList(head);
    }
}




