/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for implementing tree traversals
// This program demonstrates inorder, preorder and postorder traversals

// Space complexity: O(h) where h is height of tree
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Traversal    | O(n)      | O(n)         | O(n)       |
//|Insert       | O(h)      | O(h)         | O(h)       |

package inprepostjava;

class Node {
    int data;           // Node data
    Node left, right;   // References to left and right children

    // Constructor to initialize node
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class InPrePost {
    Node root;  // Root of the binary tree

    // Function to insert a new node
    public Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }
        return node;
    }

    // Preorder traversal: Root -> Left -> Right
    public void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Inorder traversal: Left -> Root -> Right
    public void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Postorder traversal: Left -> Right -> Root
    public void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // Main method to demonstrate traversals
    public static void main(String[] args) {
        InPrePost tree = new InPrePost();
        tree.root = tree.insert(tree.root, 1);
        tree.root = tree.insert(tree.root, 2);
        tree.root = tree.insert(tree.root, 3);
        tree.root = tree.insert(tree.root, 4);
        tree.root = tree.insert(tree.root, 5);

        System.out.print("Preorder traversal: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Postorder traversal: ");
        tree.postorder(tree.root);
        System.out.println();
    }
}

//Sample Input: Binary Tree with nodes 1,2,3,4,5
//Sample Output: 
//Preorder: 1 2 3 4 5
//Inorder: 1 2 3 4 5  
//Postorder: 5 4 3 2 1

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 