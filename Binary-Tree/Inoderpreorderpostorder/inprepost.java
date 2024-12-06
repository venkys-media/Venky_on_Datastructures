class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
class InPrePost {
    Node root;
    public Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }
        return node;
    }
    public void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }
    public void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data);
    }

    public static void main(String[] args) {
        InPrePost tree = new InPrePost();
        tree.root = tree.insert(tree.root, 1);
        tree.root = tree.insert(tree.root, 2);
        tree.root = tree.insert(tree.root, 3);
        tree.root = tree.insert(tree.root, 4);
        tree.root = tree.insert(tree.root, 5);
        System.out.println("Preorder traversal: ");
        tree.preorder(tree.root);
    }

}
