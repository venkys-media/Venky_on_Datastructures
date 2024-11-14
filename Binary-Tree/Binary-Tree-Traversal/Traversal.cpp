#include <iostream>

class Node {
public:
    int data;           // Data part of the node
    Node* left;        // Pointer to the left child
    Node* right;       // Pointer to the right child

    Node(int value) {
        data = value;
        left = right = nullptr;
    }
};

class BinaryTree {
private:
    Node* root;

    // Helper function for in-order traversal
    void inOrder(Node* node) {
        if (node != nullptr) {
            inOrder(node->left);
            std::cout << node->data << " ";
            inOrder(node->right);
        }
    }

    // Helper function for pre-order traversal
    void preOrder(Node* node) {
        if (node != nullptr) {
            std::cout << node->data << " ";
            preOrder(node->left);
            preOrder(node->right);
        }
    }

    // Helper function for post-order traversal
    void postOrder(Node* node) {
        if (node != nullptr) {
            postOrder(node->left);
            postOrder(node->right);
            std::cout << node->data << " ";
        }
    }

public:
    BinaryTree() {
        root = nullptr;
    }

    void insert(int value) {
        root = insert(root, value);
    }

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

    void inOrder() {
        inOrder(root);
        std::cout << std::endl; // Print new line after traversal
    }

    void preOrder() {
        preOrder(root);
        std::cout << std::endl; // Print new line after traversal
    }

    void postOrder() {
        postOrder(root);
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

    // Traversal outputs
    std::cout << "In-order traversal: ";
    tree.inOrder();
    
    std::cout << "Pre-order traversal: ";
    tree.preOrder();
    
    std::cout << "Post-order traversal: ";
    tree.postOrder();

    return 0;
}
