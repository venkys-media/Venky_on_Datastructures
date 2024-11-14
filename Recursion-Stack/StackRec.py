# Function that recursively prints numbers from x to 9
def fun(x):
    if x < 10:                   # Base condition
        fun(x + 1)              # Recursive call with incremented value
        print(x, end=" ")       # Print x after the recursive call returns

if __name__ == "__main__":
    i = 5                        # Initialize i to 5
    fun(i)                       # Call fun with i
    print()                     # Print a new line for better output formatting
    print(i)                    # Print the original value of i
