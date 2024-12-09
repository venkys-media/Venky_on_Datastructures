# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for implementing BFS traversal of Binary Tree
# This program demonstrates level order traversal using queue

# Space complexity: O(w) where w is maximum width of tree
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|BFS          | O(n)      | O(n)         | O(n)       |
#|Insert       | O(h)      | O(h)         | O(h)       |

from collections import deque

class Node:
    def __init__(self, value):
        self.data = value  # Data part of the node
        self.left = None    # Pointer to the left child
        self.right = None   # Pointer to the right child

class BinaryTree:
    def __init__(self):
        self.root = None  # Root of the binary tree

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

    def bfs(self):
        if not self.root:
            return

        q = deque([self.root])
        print("BFS Traversal: ", end="")
        
        while q:
            current = q.popleft()
            print(current.data, end=" ")

            if current.left:
                q.append(current.left)
            if current.right:
                q.append(current.right)
        print()  # New line for better formatting

    def dfs(self):
        print("DFS Traversal: ", end="")
        self._dfs_helper(self.root)
        print()  # New line for better formatting

    def _dfs_helper(self, node):
        if node is None:
            return

        print(node.data, end=" ")  # Visit node
        self._dfs_helper(node.left)  # Traverse left subtree
        self._dfs_helper(node.right)  # Traverse right subtree

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

    # Traversal outputs
    tree.bfs()
    tree.dfs()

#Sample Input: Binary Tree with nodes 5,3,7,2,4,6,8
#Sample Output: BFS Traversal: 5 3 7 2 4 6 8

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork
