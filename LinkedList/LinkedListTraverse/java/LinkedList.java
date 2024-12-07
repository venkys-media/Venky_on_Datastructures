/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for implementing Linked List Traversal
// This program demonstrates traversing and inserting nodes in a linked list

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Traversal    | O(n)      | O(n)         | O(n)       |
//|Insertion    | O(1)      | O(n)         | O(n)       |

// class to represent a Node in linked list
class Node {
    int data;    // data stored in the node
    Node next;   // reference to the next node

    // Constructor to initialize the node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// class to handle linked list operations
public class LinkedList {
    // Function to traverse and print the linked list
    public static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    
    // Function to insert a new node at the end
    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null)
            return newNode;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        return head;
    }

    // main method
    public static void main(String[] args) {
        Node head = null;

        // Insert some nodes
        head = insert(head, 10);
        head = insert(head, 20);
        head = insert(head, 30);

        // Print the linked list
        System.out.print("Linked list: ");
        traverse(head);
    }
}

//Sample Input: None (Static node insertion)
//Sample Output: Linked list: 10 -> 20 -> 30 -> NULL

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@venkysio 