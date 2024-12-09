/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for finding height of Binary Tree
// This program demonstrates recursive height calculation

// Space complexity: O(h) where h is height of tree
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Height       | O(n)      | O(n)         | O(n)       |
//|Insert       | O(h)      | O(h)         | O(h)       |

#include <iostream>

class Node {
public:
    int data;
    Node* left;
    Node* right;

    Node(int value) {
        data = value;
        left = right = nullptr;
    }
};

class BinaryTree {
public:
    Node* root;

    BinaryTree() {
        root = nullptr;
    }

    // Function to insert a node in BST fashion
    Node* insert(Node* node, int value) {
        if (node == nullptr) {
            return new Node(value);
        }
        if (value < node->data) {
            node->left = insert(node->left, value);
        } else {
            node->right = insert(node->right, value);
        }
        return node;
    }

    // Function to calculate height recursively
    int height(Node* node) {
        if (node == nullptr) {
            return 0;  // Base case: empty tree has height 0
        }
        int leftHeight = height(node->left);    // Get left subtree height
        int rightHeight = height(node->right);  // Get right subtree height
        return 1 + std::max(leftHeight, rightHeight);  // Return max height + 1
    }

    // Wrapper function for insert
    void insert(int value) {
        root = insert(root, value);
    }
};

// Main function to demonstrate tree height calculation
int main() {
    BinaryTree tree;

    // Inserting nodes into the binary tree
    tree.insert(5);
    tree.insert(3);
    tree.insert(7);
    tree.insert(2);
    tree.insert(4);
    tree.insert(6);
    tree.insert(8);

    std::cout << "Height of the tree: " << tree.height(tree.root) << std::endl;

    return 0;
}

//Sample Input: Binary Tree with nodes 5,3,7,2,4,6,8
//Sample Output: Height of the tree: 3

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork