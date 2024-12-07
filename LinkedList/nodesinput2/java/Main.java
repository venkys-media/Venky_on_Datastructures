/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for implementing Linked List with user input (Method 2)
// This program demonstrates creation of linked list by traversing to end

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Insertion    | O(1)      | O(n)         | O(n)       |
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
        Node head = null;  // head of the linked list

        // take number of nodes as input
        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        // create linked list with n nodes
        for (int i = 0; i < n; ++i) {
            System.out.print("Enter data for node " + (i + 1) + ": ");
            int data = scanner.nextInt();
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;  // First node becomes head
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;  // Traverse to the last node
                }
                temp.next = newNode;   // Link new node at the end
            }
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