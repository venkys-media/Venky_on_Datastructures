/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for inserting a node at specific position in Linked List
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

    // Constructor to initialize a node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// class to handle linked list operations
public class Main {
    // Function to insert a node at a specific position
    public static Node insertNode(Node head, int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) { // Insert at the head
            newNode.next = head;
            return newNode;
        }

        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) { // Position is beyond the list length
            System.out.println("Invalid position!");
            return head;
        }

        newNode.next = current.next;
        current.next = newNode;
        return head;
    }

    // Function to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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

        // Insert a new node with value 2 at position 3
        head = insertNode(head, 2, 3);

        // Print the updated linked list
        System.out.print("Updated Linked List: ");
        printList(head);
    }
}

//Sample Input: List: 1->2->3->4->5, Insert: value=2, position=3
//Sample Output: Updated Linked List: 1 2 2 3 4 5

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 