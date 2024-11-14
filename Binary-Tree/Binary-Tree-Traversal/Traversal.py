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

    def in_order(self, node):
        if node is not None:
            self.in_order(node.left)
            print(node.data, end=" ")
            self.in_order(node.right)

    def pre_order(self, node):
        if node is not None:
            print(node.data, end=" ")
            self.pre_order(node.left)
            self.pre_order(node.right)

    def post_order(self, node):
        if node is not None:
            self.post_order(node.left)
            self.post_order(node.right)
            print(node.data, end=" ")

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
    print("In-order traversal: ", end="")
    tree.in_order(tree.root)
    print()  # New line for better formatting

    print("Pre-order traversal: ", end="")
    tree.pre_order(tree.root)
    print()  # New line for better formatting

    print("Post-order traversal: ", end="")
    tree.post_order(tree.root)
    print()  # New line for better formatting
