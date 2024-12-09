# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for calculating factorial using recursion
# This program demonstrates recursive approach to factorial calculation

# Space complexity: O(n)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Factorial    | O(n)      | O(n)         | O(n)       |

def factorial(n):
    if n == 0:
        return 1    # Base case
    else:
        return n * factorial(n - 1)    # Recursive case

def main():
    n = int(input("Enter number: "))    # Read user input
    fact = factorial(n)    # Calculate factorial
    print(f"Factorial of {n} is {fact}")    # Print result

if __name__ == "__main__":
    main()    # Execute main function

#Sample Input: 5
#Sample Output: Factorial of 5 is 120

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork 