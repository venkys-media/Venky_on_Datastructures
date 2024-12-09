/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for finding height of Binary Tree
// This program demonstrates recursive height calculation

// Space complexity: O(h) where h is height of tree
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Height       | O(n)      | O(n)         | O(n)       |
//|Insert       | O(h)      | O(h)         | O(h)       |

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class Height {
    Node root;

    // Function to insert a node in BST fashion
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

    // Function to calculate height recursively
    int height(Node node) {
        if (node == null) {
            return 0;  // Base case: empty tree has height 0
        }
        int leftHeight = height(node.left);    // Get left subtree height
        int rightHeight = height(node.right);  // Get right subtree height
        return 1 + Math.max(leftHeight, rightHeight);  // Return max height + 1
    }

    public static void main(String[] args) {
        Height tree = new Height();

        // Inserting nodes into the binary tree
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 3);
        tree.root = tree.insert(tree.root, 7);
        tree.root = tree.insert(tree.root, 2);
        tree.root = tree.insert(tree.root, 4);
        tree.root = tree.insert(tree.root, 6);
        tree.root = tree.insert(tree.root, 8);

        System.out.println("Height of the tree: " + tree.height(tree.root));
    }
}

//Sample Input: Binary Tree with nodes 5,3,7,2,4,6,8
//Sample Output: Height of the tree: 3

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork