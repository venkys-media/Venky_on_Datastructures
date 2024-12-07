/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for deleting first node in Linked List
// This program demonstrates deletion of head node

// Space complexity: O(1)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Deletion     | O(1)      | O(1)         | O(1)       |

import java.util.*;

// class to represent a Node in linked list
class Node {
    int data;    // Node data
    Node next;   // Reference to the next node

    // Constructor to initialize the node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// class to handle linked list operations
public class DeleteFirstNode {
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

    // main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;
        Node previous = null;
        Node current = null;

        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        // Create linked list with n nodes
        for (int i = 0; i < n; ++i) {
            System.out.print("Enter data for node " + (i + 1) + ": ");
            int data = scanner.nextInt();
            current = new Node(data);

            if (head == null) {
                head = current; // First node becomes head
            } else {
                previous.next = current; // Link previous node to current
            }
            previous = current; // Move previous to current
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

//Sample Input: n=5, nodes: 1 2 3 4 5
//Sample Output: Original List: 1 2 3 4 5
//              After deletion: 2 3 4 5

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@venkysio 