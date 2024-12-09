# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for finding height of Binary Tree
# This program demonstrates recursive height calculation

# Space complexity: O(h) where h is height of tree
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Height       | O(n)      | O(n)         | O(n)       |
#|Insert       | O(h)      | O(h)         | O(h)       |

class Node:
    def __init__(self, value):
        self.data = value
        self.left = None
        self.right = None

class BinaryTree:
    def __init__(self):
        self.root = None

    # Function to insert a node in BST fashion
    def insert(self, node, value):
        if node is None:
            return Node(value)
        if value < node.data:
            node.left = self.insert(node.left, value)
        else:
            node.right = self.insert(node.right, value)
        return node

    # Function to calculate height recursively
    def height(self, node):
        if node is None:
            return 0  # Base case: empty tree has height 0
        left_height = self.height(node.left)    # Get left subtree height
        right_height = self.height(node.right)  # Get right subtree height
        return 1 + max(left_height, right_height)  # Return max height + 1

# Main function to demonstrate tree height calculation
if __name__ == "__main__":
    tree = BinaryTree()

    # Inserting nodes into the binary tree
    tree.root = tree.insert(tree.root, 5)
    tree.root = tree.insert(tree.root, 3)
    tree.root = tree.insert(tree.root, 7)
    tree.root = tree.insert(tree.root, 2)
    tree.root = tree.insert(tree.root, 4)
    tree.root = tree.insert(tree.root, 6)
    tree.root = tree.insert(tree.root, 8)

    print("Height of the tree:", tree.height(tree.root))

#Sample Input: Binary Tree with nodes 5,3,7,2,4,6,8
#Sample Output: Height of the tree: 3

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 