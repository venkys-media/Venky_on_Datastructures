class Node {
    int data;           // Data part of the node
    Node left, right;   // Pointers to left and right children

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class Traversal {
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

    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        Traversal tree = new Traversal();

        // Inserting nodes into the binary tree
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 3);
        tree.root = tree.insert(tree.root, 7);
        tree.root = tree.insert(tree.root, 2);
        tree.root = tree.insert(tree.root, 4);
        tree.root = tree.insert(tree.root, 6);
        tree.root = tree.insert(tree.root, 8);

        // Traversal outputs
        System.out.print("In-order traversal: ");
        tree.inOrder(tree.root);
        System.out.println(); // New line for better formatting

        System.out.print("Pre-order traversal: ");
        tree.preOrder(tree.root);
        System.out.println(); // New line for better formatting

        System.out.print("Post-order traversal: ");
        tree.postOrder(tree.root);
        System.out.println(); // New line for better formatting
    }
}
