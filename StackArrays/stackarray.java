class Stack {
    private static final int MAX = 1000;
    private int top;
    private int[] arr;

    public Stack() {
        this.top = -1;
        this.arr = new int[MAX]; // Initialize stack with a fixed size
    }

    public boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            arr[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return arr[top--];
        }
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is Empty");
            return 0;
        } else {
            return arr[top];
        }
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " popped from stack");
        System.out.println("Top element is: " + s.peek());
        System.out.println("Stack empty: " + s.isEmpty());
    }
}
