class Node {
    int data;         // Data part of the node
    Node next;        // Pointer to the next node

    // Constructor to initialize a new node
    Node(int val) {
        data = val;
        next = null;
    }
}

public class LinkedReverse {
    
    // Function to reverse the linked list
    public static Node reverse(Node head) {
        // Base case: if head is null or there's only one node
        if (head == null || head.next == null) {
            return head;
        }

        // Recursive call to reverse the rest of the list
        Node rest = reverse(head.next);

        // Adjust pointers
        head.next.next = head; // Make the next node point to the current node
        head.next = null;      // Set the next of current node to null

        return rest;           // Return the new head of the reversed list
    }

    // Function to print the linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " "); // Print the data of the current node
            head = head.next;                   // Move to the next node
        }
        System.out.println();                    // Print a new line at the end
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Print the original list
        System.out.print("Original List: ");
        printList(head);

        // Reverse the linked list
        head = reverse(head);

        // Print the reversed list
        System.out.print("Reversed List: ");
        printList(head);
    }
}
