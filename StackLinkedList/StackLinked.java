class StackNode {
    int data;
    StackNode next;

    public StackNode(int data) {
        this.data = data;
        this.next = null; // Initialize next as null
    }
}

class StackLinked {
    private StackNode root; // Top of the stack

    public StackLinked() {
        this.root = null; // Constructor
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void push(int data) {
        StackNode stackNode = new StackNode(data);
        stackNode.next = root;
        root = stackNode;
        System.out.println(data + " pushed to stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0; // Return 0 on underflow
        }
        StackNode temp = root;
        root = root.next;
        int popped = temp.data;
        return popped;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return 0; // Return 0 if empty
        }
        return root.data;
    }

    public static void main(String[] args) {
        StackLinked stack = new StackLinked(); // Create a stack instance

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop() + " popped from stack");
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack empty: " + (stack.isEmpty() ? "Yes" : "No"));
    }
}
