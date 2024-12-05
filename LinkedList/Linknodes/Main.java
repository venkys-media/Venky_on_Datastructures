class StudentNode {
    public int studentId;       // Student ID
    public String name;         // Student Name
    public int age;             // Student Age
    public StudentNode next;    // Pointer to the next node

    // Constructor to initialize a node with details
    public StudentNode(int studentId, String name, int age) {
        this.studentId = studentId; 
        this.name = name; 
        this.age = age; 
        this.next = null; // Initialize next as null 
    }
}

public class Main {
    public static void main(String[] args) {
        // Create the first node (head node)
        StudentNode head = new StudentNode(1, "Alice", 20);
        // Create the second node
        StudentNode second = new StudentNode(2, "Bob", 22);
        // Create the third node
        StudentNode third = new StudentNode(3, "Charlie", 21);
        head.next = second; 

        // Link the first node to the second node
    
        second.next = third; 
    }
  

}