# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for implementing Binary Tree
# This program demonstrates basic tree operations and traversal

# Space complexity: O(n)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Insert       | O(1)      | O(h)         | O(h)       |
#|Search       | O(1)      | O(h)         | O(h)       |
#|Traversal    | O(n)      | O(n)         | O(n)       |

class Node:
    def __init__(self, value):
        self.data = value  # Data part of the node
        self.left = None    # Pointer to the left child
        self.right = None   # Pointer to the right child

class BinaryTree:
    def __init__(self):
        self.root = None  # Root of the binary tree

    # Function to insert a new node
    def insert(self, value):
        if self.root is None:
            self.root = Node(value)
        else:
            self._insert(self.root, value)

    def _insert(self, node, value):
        if value < node.data:
            if node.left is None:
                node.left = Node(value)
            else:
                self._insert(node.left, value)
        else:
            if node.right is None:
                node.right = Node(value)
            else:
                self._insert(node.right, value)

    # Function for in-order traversal
    def in_order(self, node):
        if node is not None:
            self.in_order(node.left)
            print(node.data, end=" ")
            self.in_order(node.right)

    def in_order_traversal(self):
        self.in_order(self.root)
        print()  # Print new line after traversal

# Main function to demonstrate binary tree
if __name__ == "__main__":
    tree = BinaryTree()

    # Inserting nodes into the binary tree
    tree.insert(5)
    tree.insert(3)
    tree.insert(7)
    tree.insert(2)
    tree.insert(4)
    tree.insert(6)
    tree.insert(8)

    # In-order traversal of the binary tree
    print("In-order traversal: ", end="")
    tree.in_order_traversal()

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork