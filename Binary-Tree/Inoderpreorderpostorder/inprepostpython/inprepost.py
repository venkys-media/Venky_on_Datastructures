# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for implementing tree traversals
# This program demonstrates inorder, preorder and postorder traversals

# Space complexity: O(h) where h is height of tree
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Traversal    | O(n)      | O(n)         | O(n)       |
#|Insert       | O(h)      | O(h)         | O(h)       |



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


#Sample Input: Binary Tree with nodes 1,2,3,4,5
#Sample Output: 
#Preorder: 1 2 3 4 5
#Inorder: 1 2 3 4 5  
#Postorder: 5 4 3 2 1

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork