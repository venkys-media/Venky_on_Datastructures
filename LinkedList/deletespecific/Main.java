class Node {
    int data;
    Node next;

    // Constructor to initialize a node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    // Count the size of the list
    public static int countListSize(Node head) {
        int size = 0;
        for (Node temp = head; temp != null; temp = temp.next)
            size++;
        return size;
    }

    // Delete a node at a specific position
    public static Node deleteAnyNode(Node head, int nodeNum) {
        if (head == null || nodeNum < 1) {
            System.out.println("Invalid operation.");
            return head;
        }

        if (nodeNum == 1) return head.next; // Delete head

        Node current = head;
        for (int i = 1; current.next != null && i < nodeNum - 1; i++)
            current = current.next;

        if (current.next == null) {
            System.out.println("Position exceeds list size.");
            return head;
        }

        current.next = current.next.next; // Bypass node
        return head;
    }

    // Print the linked list
    public static void printList(Node head) {
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        printList(head);

        head = deleteAnyNode(head, 3); // Delete node at position 3

        System.out.println("After deleting position 3:");
        printList(head);
    }
}
