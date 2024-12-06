#include <iostream>

class Node {
public:
    int data;          // Node data
    Node* left;       // Pointer to the left child
    Node* right;      // Pointer to the right child

    // Constructor to initialize the node
    Node(int data) {
        this->data = data;
        left = right = nullptr; // Initialize left and right as null
    }
};

class InPrePost {
public:
    Node* root;

    InPrePost() {
        root = nullptr; // Initialize root as null
    }

    // Function to insert a new node
    Node* insert(Node* node, int data) {
        if (node == nullptr) {
            return new Node(data);
        }
        if (data < node->data) {
            node->left = insert(node->left, data);
        } else {
            node->right = insert(node->right, data);
        }
        return node;
    }

    // Preorder traversal
    void preorder(Node* node) {
        if (node == nullptr) {
            return;
        }
        std::cout << node->data << " ";
        preorder(node->left);
        preorder(node->right);
    }

    // Inorder traversal
    void inorder(Node* node) {
        if (node == nullptr) {
            return;
        }
        inorder(node->left);
        std::cout << node->data << " ";
        inorder(node->right);
    }

    // Postorder traversal
    void postorder(Node* node) {
        if (node == nullptr) {
            return;
        }
        postorder(node->left);
        postorder(node->right);
        std::cout << node->data << " ";
    }
};

int main() {
    InPrePost tree;
    tree.root = tree.insert(tree.root, 1);
    tree.root = tree.insert(tree.root, 2);
    tree.root = tree.insert(tree.root, 3);
    tree.root = tree.insert(tree.root, 4);
    tree.root = tree.insert(tree.root, 5);

    std::cout << "Preorder traversal: ";
    tree.preorder(tree.root);
    std::cout << std::endl;

    std::cout << "Inorder traversal: ";
    tree.inorder(tree.root);
    std::cout << std::endl;

    std::cout << "Postorder traversal: ";
    tree.postorder(tree.root);
    std::cout << std::endl;

    return 0;
}