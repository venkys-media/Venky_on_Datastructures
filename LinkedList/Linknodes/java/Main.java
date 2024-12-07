/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for implementing Node Linking in Linked List
// This program demonstrates how to create and link nodes

// Space complexity: O(1)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Creation     | O(1)      | O(1)         | O(1)       |
//|Linking      | O(1)      | O(1)         | O(1)       |

// class to represent a Student Node in linked list
class StudentNode {
    public int studentId;       // Student ID
    public String name;         // Student Name
    public int age;            // Student Age
    public StudentNode next;    // Reference to the next node

    // Constructor to initialize a node with details
    public StudentNode(int studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.next = null; // Initialize next as null
    }
}

// class to handle linked list operations
public class Main {
    // main method
    public static void main(String[] args) {
        // Create the first node (head node)
        StudentNode head = new StudentNode(1, "Alice", 20);
        // Create the second node
        StudentNode second = new StudentNode(2, "Bob", 22);
        // Create the third node
        StudentNode third = new StudentNode(3, "Charlie", 21);

        // Link the nodes together
        head.next = second;    // Link first node to second
        second.next = third;   // Link second node to third
    }
}

//Sample Input: None (Static node creation)
//Sample Output: None (Node linking demonstration)

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@venkysio 