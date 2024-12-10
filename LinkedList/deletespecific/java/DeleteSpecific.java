/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for deleting a node at specific position in Linked List
// This program demonstrates deletion at any given position

// Space complexity: O(1)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Deletion     | O(1)      | O(n)         | O(n)       |

// class to represent a Node in linked list
class Node {
    int data;    // Node data
    Node next;   // Reference to the next node

    // Constructor to initialize a node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// class to handle linked list operations
public class DeleteSpecific {
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

    // main method
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

//Sample Input: List: 1->2->3->4->5, Delete position: 3
//Sample Output: List after deletion: 1 2 4 5

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 