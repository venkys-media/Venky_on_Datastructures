# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for implementing Insertion Sort
# This program demonstrates sorting array using insertion sort algorithm

# Space complexity: O(1)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Insertion Sort| O(n)      | O(n^2)       | O(n^2)     |

# Function to perform Insertion Sort
def insertion_sort(arr):
    n = len(arr)
    for i in range(1, n):
        key = arr[i]              # Current element to be inserted
        j = i - 1                 # Index of last element in sorted portion
        
        # Shift elements of arr[0..i-1] that are greater than key
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]   # Move elements one position ahead
            j -= 1                # Move to previous element
        arr[j + 1] = key          # Insert key at correct position

# Function to print array elements
def print_array(arr):
    print(" ".join(map(str, arr)))

# Main function to demonstrate insertion sort
if __name__ == "__main__":
    arr = [12, 11, 13, 5, 6]

    print("Unsorted array:")
    print_array(arr)

    insertion_sort(arr)

    print("Sorted array:")
    print_array(arr)

#Sample Input: [12, 11, 13, 5, 6]
#Sample Output: [5, 6, 11, 12, 13]

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork
