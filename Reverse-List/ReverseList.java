class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class ReverseList {

    // Function to reverse the linked list
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;  // Store the next node
            current.next = prev;  // Reverse the current node's pointer
            prev = current;       // Move pointers one position ahead
            current = next;
        }

        head = prev;
        return head;
    }

    // Function to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Print the original list
        System.out.print("Original list: ");
        printList(head);

        // Reverse the linked list
        head = reverseList(head);

        // Print the reversed list
        System.out.print("Reversed list: ");
        printList(head);

        // Clean up remaining nodes (optional in Java due to garbage collection)
        while (head != null) {
            Node temp = head;
            head = head.next;
            // No explicit delete needed; Java handles memory management
        }
    }
}
