/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for implementing BFS traversal of Binary Tree
// This program demonstrates level order traversal using queue

// Space complexity: O(w) where w is maximum width of tree
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|BFS          | O(n)      | O(n)         | O(n)       |
//|Insert       | O(h)      | O(h)         | O(h)       |

#include <iostream>
#include <queue>
#include <stack>

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
private:
    Node* root;

public:
    BinaryTree() {
        root = nullptr;
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

    void bfs() {
        if (root == nullptr) return;

        std::queue<Node*> q;
        q.push(root);

        std::cout << "BFS Traversal: ";
        while (!q.empty()) {
            Node* current = q.front();
            q.pop();
            std::cout << current->data << " ";

            if (current->left != nullptr) {
                q.push(current->left);
            }
            if (current->right != nullptr) {
                q.push(current->right);
            }
        }
        std::cout << std::endl; // New line for better formatting
    }

    void dfs() {
        std::cout << "DFS Traversal: ";
        dfsHelper(root);
        std::cout << std::endl; // New line for better formatting
    }

    void dfsHelper(Node* node) {
        if (node == nullptr) return;

        std::cout << node->data << " "; // Visit node
        dfsHelper(node->left);           // Traverse left subtree
        dfsHelper(node->right);          // Traverse right subtree
    }

    void insert(int value) {
        root = insert(root, value);
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
    tree.bfs();
    tree.dfs();

    return 0;
}

//Sample Input: Binary Tree with nodes 5,3,7,2,4,6,8
//Sample Output: BFS Traversal: 5 3 7 2 4 6 8

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork