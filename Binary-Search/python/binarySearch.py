# Copyrights to venkys.io
# Visit https://venkys.io for more information

# Python program for implementing Binary Search
# This program demonstrates searching an element in sorted array

# Space complexity: O(1)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Search       | O(1)      | O(log n)     | O(log n)   |

# class to perform Binary search operations
class BinarySearch:
    def __init__(self):
        self.arr = []  # array to search in
        self.n = 0     # size of array
        self.key = 0   # element to search for
    
    # function to perform binary search
    def search(self):
        left, right = 0, self.n - 1
        
        while left <= right:
            mid = left + (right - left) // 2
            
            if self.arr[mid] == self.key:
                return mid  # Return the index if key is found
            
            if self.arr[mid] < self.key:
                left = mid + 1  # Search in right half
            else:
                right = mid - 1  # Search in left half
                
        return -1  # Return -1 if key is not found
    
    # function to take user input
    def user_input(self):
        self.n = int(input("Enter size of array:\n"))
        print("Enter sorted array elements:")
        self.arr = list(map(int, input().split()))
        self.key = int(input("Enter element to search:\n"))
    
    # function to print output
    def print_output(self, result):
        if result == -1:
            print(f"Element {self.key} not found in the array.")
        else:
            print(f"Element {self.key} found at index: {result}")

# main function
def main():
    bs = BinarySearch()  # Create BinarySearch object
    bs.user_input()      # Taking user input
    result = bs.search() # Call to search the array
    bs.print_output(result) # Printing output

if __name__ == "__main__":
    main()

#Sample Input: 5
#             10 20 30 40 50
#             30
#Sample Output: Element 30 found at index: 2

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@venkysio 