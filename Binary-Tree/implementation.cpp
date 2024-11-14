#include <iostream>

class Node {
public:
    int data;           // Data part of the node
    Node* left;        // Pointer to the left child
    Node* right;       // Pointer to the right child

    // Constructor to initialize a new node
    Node(int value) {
        data = value;
        left = right = nullptr;
    }
};

class BinaryTree {
private:
    Node* root;

    // Helper function to insert a new node
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

    // Helper function for in-order traversal
    void inOrder(Node* node) {
        if (node != nullptr) {
            inOrder(node->left);
            std::cout << node->data << " ";
            inOrder(node->right);
        }
    }

public:
    // Constructor to initialize the binary tree
    BinaryTree() {
        root = nullptr;
    }

    // Function to insert a new node
    void insert(int value) {
        root = insert(root, value);
    }

    // Function for in-order traversal
    void inOrder() {
        inOrder(root);
        std::cout << std::endl; // Print new line after traversal
    }
};

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

    // In-order traversal of the binary tree
    std::cout << "In-order traversal: ";
    tree.inOrder();

    return 0;
}
