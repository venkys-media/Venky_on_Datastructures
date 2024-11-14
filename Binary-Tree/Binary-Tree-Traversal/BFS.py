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
