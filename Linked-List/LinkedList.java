class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    
    // Function to traverse the linked list
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

    public static void main(String[] args) {
        Node head = null;

        head = insert(head, 10);
        head = insert(head, 20);
        head = insert(head, 30);

        System.out.print("Linked list: ");
        traverse(head);
    }
}
