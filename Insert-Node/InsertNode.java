class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class InsertNode {

    // Function to insert a node at a specific position
    public static Node insertNode(Node head, int data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {  // Insert at the head
            newNode.next = head;
            return newNode;
        }

        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Invalid position!");
                return head;
            }
            current = current.next;
        }

        if (current == null) {  // Position is beyond the list length
            System.out.println("Invalid position!");
            return head;
        }

        newNode.next = current.next;
        current.next = newNode;

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

        // Insert a new node with value 2.5 at position 3
        head = insertNode(head, 200, 3);

        // Print the modified list
        System.out.print("List after inserting 200 at position 3: ");
        printList(head);

        // Clean up remaining nodes (optional in Java due to garbage collection)
        while (head != null) {
            Node temp = head;
            head = head.next;
            // No explicit delete needed; Java handles memory management
        }
    }
}
