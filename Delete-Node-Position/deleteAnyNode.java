class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class LinkedList {

    // Function to count the size of the linked list
    public static int countListSize(Node head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    // Function to delete a node at a specific position
    public static Node deleteAnyNode(Node head, int nodeNum) {
        int listSize = countListSize(head);

        // If the list is empty
        if (listSize == 0) {
            System.out.println("List is empty. Nothing to delete.");
            return null;
        }

        // If the list has only one node
        if (listSize == 1) {
            if (nodeNum == 1) {
                return null; // The head will be deleted
            } else {
                System.out.println("Invalid node number to delete.");
                return head;
            }
        }

        // If the nodeNum is greater than the size of the list
        if (nodeNum > listSize) {
            System.out.println("Invalid node number to delete.");
            return head;
        }

        // If the node to delete is the head node
        if (nodeNum == 1) {
            Node toDelete = head;
            head = head.next;
            return head;
        }

        // Traverse to the node just before the one to be deleted
        Node current = head;
        for (int i = 1; i < nodeNum - 1; i++) {
            current = current.next;
        }

        // Delete the node
        Node toDelete = current.next;
        current.next = toDelete.next;

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

        // Delete the node at position 3
        head = deleteAnyNode(head, 3);

        // Print the modified list
        System.out.print("List after deleting node at position 3: ");
        printList(head);

        // Clean up remaining nodes (optional in Java due to garbage collection)
        while (head != null) {
            Node temp = head;
            head = head.next;
            // No explicit delete needed; Java handles memory management
        }
    }
}
