# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for implementing Bubble Sort
# This program demonstrates sorting array using bubble sort algorithm

# Space complexity: O(1)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Bubble Sort  | O(n)      | O(n^2)       | O(n^2)     |

# Function to perform bubble sort
def bubble_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        swapped = False  # Flag to indicate whether a swap occurred
        # Compare adjacent elements
        for j in range(n - i - 1):
            if arr[j] > arr[j + 1]:
                # Swap arr[j] and arr[j+1]
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True  # Set flag to true, indicating a swap
        # If no elements were swapped, array is sorted
        if not swapped:
            break  # Exit the loop early

# Function to print array elements
def print_array(arr):
    print(arr)

# Main function to demonstrate bubble sort
if __name__ == "__main__":
    arr = [64, 34, 25, 12, 22, 11, 90]
    
    print("Unsorted array:")
    print_array(arr)
    
    bubble_sort(arr)
    
    print("Sorted array:")
    print_array(arr)

#Sample Input: [64, 34, 25, 12, 22, 11, 90]
#Sample Output: [11, 12, 22, 25, 34, 64, 90]

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork
