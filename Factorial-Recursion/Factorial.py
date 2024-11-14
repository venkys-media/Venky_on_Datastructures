def factorial(n):
    if n == 0:
        return 1  # Base case
    else:
        return n * factorial(n - 1)  # Recursive case

def main():
    n = int(input("Enter number: "))  # Read user input
    fact = factorial(n)  # Calculate factorial
    print(f"Factorial of {n} is {fact}")  # Print result

if __name__ == "__main__":
    main()  # Execute main function
