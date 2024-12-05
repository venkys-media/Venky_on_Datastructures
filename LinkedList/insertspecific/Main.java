class Node {
    int data;
    Node next;

    // Constructor to initialize a node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
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

 public static void main(String[] args) {
 // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
         Node head = new Node(1);
         head.next = new Node(2);
         head.next.next = new Node(3);
         head.next.next.next = new Node(4);
         head.next.next.next.next = new Node(5);

 // Insert a new node with value 2 at position 3
        head = insertNode(head, 2, 3);
 }
}
