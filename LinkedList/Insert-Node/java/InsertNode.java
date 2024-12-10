/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for inserting a node at a specific position in Linked List
// This program demonstrates insertion at any given position

// Space complexity: O(1)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Insertion    | O(1)      | O(n)         | O(n)       |

// class to represent a Node in linked list
class Node {
    int data;    // Node data
    Node next;   // Reference to the next node

    // Constructor to initialize the node
    Node(int val) {
        data = val;
        next = null;
    }
}

// class to handle linked list operations
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

    // main method
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

        // Insert a new node with value 200 at position 3
        head = insertNode(head, 200, 3);

        // Print the modified list
        System.out.print("List after inserting 200 at position 3: ");
        printList(head);
    }
}

//Sample Input: List: 1->2->3->4->5, Insert: value=200, position=3
//Sample Output: List after inserting 200 at position 3: 1 -> 2 -> 200 -> 3 -> 4 -> 5 -> null

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 