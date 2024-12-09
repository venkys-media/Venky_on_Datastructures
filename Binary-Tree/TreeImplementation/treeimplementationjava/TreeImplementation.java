/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for implementing Binary Tree
// This program demonstrates basic tree operations and traversal

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Insert       | O(1)      | O(h)         | O(h)       |
//|Search       | O(1)      | O(h)         | O(h)       |
//|Traversal    | O(n)      | O(n)         | O(n)       |


class Node {
    int data;           // Data part of the node
    Node left, right;   // Pointers to left and right children

    // Constructor to initialize a new node
    Node(int value) {
        data = value;
        left = right = null;
    }
}

class TreeImplementation {
    Node root; // Root of the binary tree

    // Function to insert a new node
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

    // Function to search for a value in the tree
    boolean search(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (node.data == value) {
            return true;
        }
        return search(node.left, value) || search(node.right, value);
    }

    // Function for in-order traversal
    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    // Wrapper function for in-order traversal
    void inOrder() {
        inOrder(root);
        System.out.println(); // Print new line after traversal
    }

    public static void main(String[] args) {
        TreeImplementation tree = new TreeImplementation();

        // Inserting nodes into the binary tree
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 3);
        tree.root = tree.insert(tree.root, 7);
        tree.root = tree.insert(tree.root, 2);
        tree.root = tree.insert(tree.root, 4);
        tree.root = tree.insert(tree.root, 6);
        tree.root = tree.insert(tree.root, 8);

        // In-order traversal of the binary tree
        System.out.print("In-order traversal: ");
        tree.inOrder();
    }
}

//Sample Input: Tree with nodes 5,3,7,2,4,6,8
//Sample Output: In-order traversal: 2 3 4 5 6 7 8

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork