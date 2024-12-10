/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for implementing Linked List Reversal
// This program demonstrates reversing a linked list iteratively

// Space complexity: O(1)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Reversal     | O(n)      | O(n)         | O(n)       |
//|Traversal    | O(n)      | O(n)         | O(n)       |

import java.util.*;

// class to represent a Node in linked list
class Node {
    int data;    // data stored in the node
    Node next;   // reference to the next node
    
    // Constructor to initialize the node
    Node(int data) {
        this.data = data;  // store the data
        this.next = null;  // initialize next as null
    }
}

// class to handle linked list operations
public class Main {
    // Function to reverse the linked list
    public static Node reverseList(Node head) {
        Node current = head;
        Node prev = null;
        Node next;
        
        // traverse and reverse links
        while (current != null) {
            next = current.next;     // Store the next node
            current.next = prev;     // Reverse the current node's pointer
            prev = current;          // Move prev to current
            current = next;          // Move current to next
        }
        
        return prev;  // New head of reversed list
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
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Print original list
        System.out.println("Original Linked List:");
        printList(head);

        // Reverse the linked list
        head = reverseList(head);

        // Print reversed list
        System.out.println("Reversed Linked List:");
        printList(head);
    }
}

//Sample Input: 1 -> 2 -> 3 -> 4 -> 5
//Sample Output: 5 -> 4 -> 3 -> 2 -> 1

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 