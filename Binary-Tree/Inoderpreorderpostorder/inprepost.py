class Node:
    def __init__(self, data):
        self.data = data  # Node data
        self.left = None  # Pointer to the left child
        self.right = None # Pointer to the right child

class InPrePost:
    def __init__(self):
        self.root = None  # Initialize root as None

    # Function to insert a new node
    def insert(self, node, data):
        if node is None:
            return Node(data)
        if data < node.data:
            node.left = self.insert(node.left, data)
        else:
            node.right = self.insert(node.right, data)
        return node

    # Preorder traversal
    def preorder(self, node):
        if node is None:
            return
        print(node.data, end=" ")
        self.preorder(node.left)
        self.preorder(node.right)

    # Inorder traversal
    def inorder(self, node):
        if node is None:
            return
        self.inorder(node.left)
        print(node.data, end=" ")
        self.inorder(node.right)

    # Postorder traversal
    def postorder(self, node):
        if node is None:
            return
        self.postorder(node.left)
        self.postorder(node.right)
        print(node.data, end=" ")

def main():
    tree = InPrePost()
    tree.root = tree.insert(tree.root, 1)
    tree.root = tree.insert(tree.root, 2)
    tree.root = tree.insert(tree.root, 3)
    tree.root = tree.insert(tree.root, 4)
    tree.root = tree.insert(tree.root, 5)

    print("Preorder traversal: ", end="")
    tree.preorder(tree.root)
    print()

    print("Inorder traversal: ", end="")
    tree.inorder(tree.root)
    print()

    print("Postorder traversal: ", end="")
    tree.postorder(tree.root)
    print()

if __name__ == "__main__":
    main()