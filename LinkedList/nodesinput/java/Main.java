/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for implementing Linked List with user input (Method 1)
// This program demonstrates creation of linked list using previous pointer

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Insertion    | O(1)      | O(1)         | O(1)       |
//|Traversal    | O(n)      | O(n)         | O(n)       |

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        Node head = null;      // head of the linked list
        Node previous = null;  // track previous node
        Node current = null;   // current node being created

        // take number of nodes as input
        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        // create linked list with n nodes
        for (int i = 0; i < n; ++i) {
            System.out.print("Enter data for node " + (i + 1) + ": ");
            int data = scanner.nextInt();
            current = new Node(data);
            
            if (head == null) {
                head = current;     // First node becomes head
            } else {
                previous.next = current;  // Link previous node to current
            }
            previous = current;     // Update previous to current
        }

        // Print the linked list
        System.out.println("\nThe linked list is:");
        printList(head);
        scanner.close();
    }
}

//Sample Input: 3
//             10 20 30
//Sample Output: 10 20 30

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@venkysio 