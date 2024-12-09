# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for demonstrating recursion using stack
# This program shows how recursive calls are stored in stack

# Space complexity: O(n)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Recursion    | O(n)      | O(n)         | O(n)       |

# Function that recursively prints numbers from x to 9
def fun(x):
    if x < 10:                   # Base condition
        fun(x + 1)              # Recursive call with incremented value
        print(x, end=" ")       # Print x after the recursive call returns

# main function
if __name__ == "__main__":
    i = 5                        # Initialize i to 5
    fun(i)                       # Call fun with i
    print()                     # Print a new line for better output formatting
    print(i)                    # Print the original value of i

#Sample Input: i = 5
#Sample Output: 9 8 7 6 5
#              5

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@venkysio 