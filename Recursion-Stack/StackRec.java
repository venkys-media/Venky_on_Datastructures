public class StackRec {
    // Function that recursively prints numbers from x to 9
    static void fun(int x) {
        if (x < 10) {               // Base condition
            fun(x + 1);            // Recursive call with incremented value
            System.out.print(x + " "); // Print x after the recursive call returns
        }
    }

    public static void main(String[] args) {
        int i = 5;                  // Initialize i to 5
        fun(i);                     // Call fun with i
        System.out.println();       // Print a new line for better output formatting
        System.out.println(i);      // Print the original value of i
    }
}
