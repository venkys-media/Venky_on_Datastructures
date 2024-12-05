import java.util.*;
class Node {
    int data;
    Node next;

    // Constructor to initialize the node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;

        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; ++i) {
            System.out.print("Enter data for node " + (i + 1) + ": ");
            int data = scanner.nextInt();
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode; 
                // First node becomes head
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next; 
                    // Traverse to the last node
                }
                temp.next = newNode; 
                // Link the new node to the last node
            }
        }

        scanner.close();
    }
}
