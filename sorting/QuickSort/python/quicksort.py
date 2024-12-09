# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for implementing Quick Sort
# This program demonstrates divide and conquer sorting algorithm

# Space complexity: O(log n)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Quick Sort   | O(nlogn)  | O(nlogn)     | O(n²)      |

# Function to swap two elements
def swap(arr, i, j):
    arr[i], arr[j] = arr[j], arr[i]

# Partition function with left and right pointers
def partition(arr, low, high):
    pivot = arr[high]    # Choose last element as pivot
    left = low          # Left pointer
    right = high - 1    # Right pointer

    while True:
        # Move left pointer to the right until finding element > pivot
        while left <= right and arr[left] < pivot:
            left += 1
        # Move right pointer to the left until finding element < pivot
        while right >= left and arr[right] > pivot:
            right -= 1

        # If pointers cross, partition is complete
        if left >= right:
            break

        # Swap elements at left and right pointers
        swap(arr, left, right)
        left += 1
        right -= 1

    # Place pivot in its final position
    swap(arr, left, high)
    return left  # Return pivot's position

# QuickSort recursive function
def quick_sort(arr, low, high):
    if low < high:
        # Get partition index
        pi = partition(arr, low, high)

        # Recursively sort elements before and after partition
        quick_sort(arr, low, pi - 1)    # Sort left subarray
        quick_sort(arr, pi + 1, high)   # Sort right subarray

# Function to print array elements
def print_array(arr):
    print(" ".join(map(str, arr)))

# Main function to demonstrate quick sort
if __name__ == "__main__":
    arr = [10, 7, 8, 9, 1, 5]
    print("Original array:")
    print_array(arr)

    quick_sort(arr, 0, len(arr) - 1)

    print("Sorted array:")
    print_array(arr)

#Sample Input: [10, 7, 8, 9, 1, 5]
#Sample Output: [1, 5, 7, 8, 9, 10]

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork
