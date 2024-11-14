class Node:
    def __init__(self, value):
        self.data = value
        self.left = None
        self.right = None

class BinaryTree:
    def __init__(self):
        self.root = None

    def insert(self, node, value):
        if node is None:
            return Node(value)
        if value < node.data:
            node.left = self.insert(node.left, value)
        else:
            node.right = self.insert(node.right, value)
        return node

    def height(self, node):
        if node is None:
            return 0
        left_height = self.height(node.left)
        right_height = self.height(node.right)
        return 1 + max(left_height, right_height)

# Main function to demonstrate the height of the binary tree
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
