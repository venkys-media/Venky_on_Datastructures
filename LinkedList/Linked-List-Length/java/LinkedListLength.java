/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for finding length of a Linked List
// This program demonstrates counting nodes in a linked list

// Space complexity: O(1)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Count Length | O(n)      | O(n)         | O(n)       |

// class to represent a Node in linked list
class Node {
    int data;    // data stored in the node
    Node next;   // reference to the next node

    // Constructor to initialize a node with data
    Node(int value) {
        data = value;
        next = null;
    }
}

// class to handle linked list operations
public class LinkedListLength {
    // Function to count the number of nodes in the linked list
    public static int countListSize(Node head) {
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;  // Increment size for each node
            temp = temp.next;  // Move to the next node
        }

        return size;
    }

    // main method
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(5);

        // Count the number of nodes in the list
        int size = countListSize(head);
        System.out.println("Number of nodes in the list: " + size);
    }
}

//Sample Input: None (Static list creation: 1 -> 2 -> 3 -> 5)
//Sample Output: Number of nodes in the list: 4

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@venkysio 