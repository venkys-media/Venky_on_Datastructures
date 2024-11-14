import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;           // Data part of the node
    Node left, right;   // Pointers to left and right children

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class BFS {
    Node root; // Root of the binary tree

    Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.data) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }
        return node;
    }

    void bfs() {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        System.out.print("BFS Traversal: ");
        
        while (!q.isEmpty()) {
            Node current = q.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                q.add(current.left);
            }
            if (current.right != null) {
                q.add(current.right);
            }
        }
        System.out.println(); // New line for better formatting
    }

    void dfs() {
        System.out.print("DFS Traversal: ");
        dfsHelper(root);
        System.out.println(); // New line for better formatting
    }

    void dfsHelper(Node node) {
        if (node == null) return;

        System.out.print(node.data + " "); // Visit node
        dfsHelper(node.left);               // Traverse left subtree
        dfsHelper(node.right);              // Traverse right subtree
    }

    public static void main(String[] args) {
        BFS tree = new BFS();

        // Inserting nodes into the binary tree
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 3);
        tree.root = tree.insert(tree.root, 7);
        tree.root = tree.insert(tree.root, 2);
        tree.root = tree.insert(tree.root, 4);
        tree.root = tree.insert(tree.root, 6);
        tree.root = tree.insert(tree.root, 8);

        // Traversal outputs
        tree.bfs();
        tree.dfs();
    }
}
