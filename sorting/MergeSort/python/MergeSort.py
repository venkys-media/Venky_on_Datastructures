# All copyrights reserved by Venkys.io.
# Visit https://venkys.io for more information

# Python program for implementing Merge Sort
# This program demonstrates divide and conquer sorting algorithm

# Space complexity: O(n)
# Time complexity:
#|Operation    | Best Case | Average Case | Worst Case |
#|-------------|-----------|--------------|------------|
#|Merge Sort   | O(nlogn)  | O(nlogn)     | O(nlogn)   |

# Function to merge two sorted sub-arrays
def merge(arr, left, mid, right):
    n1 = mid - left + 1    # Size of left subarray
    n2 = right - mid       # Size of right subarray

    # Create temporary arrays
    L = arr[left:mid + 1]  # Left subarray
    R = arr[mid + 1:right + 1]  # Right subarray

    # Merge temporary arrays back into arr[left..right]
    i = j = 0             # Initial indexes of left and right subarrays
    k = left             # Initial index of merged subarray

    while i < n1 and j < n2:
        if L[i] <= R[j]:
            arr[k] = L[i]  # Copy from left array
            i += 1
        else:
            arr[k] = R[j]  # Copy from right array
            j += 1
        k += 1

    # Copy remaining elements of L[]
    while i < n1:
        arr[k] = L[i]
        i += 1
        k += 1

    # Copy remaining elements of R[]
    while j < n2:
        arr[k] = R[j]
        j += 1
        k += 1

# Function to implement Merge Sort
def merge_sort(arr, left, right):
    if left < right:
        mid = (left + right) // 2  # Find middle point

        merge_sort(arr, left, mid)        # Sort first half
        merge_sort(arr, mid + 1, right)   # Sort second half
        merge(arr, left, mid, right)      # Merge sorted halves

# Function to print array elements
def print_array(arr):
    print(" ".join(map(str, arr)))

# Main function to demonstrate merge sort
if __name__ == "__main__":
    arr = [12, 11, 13, 5, 6, 7]
    print("Original array:")
    print_array(arr)

    merge_sort(arr, 0, len(arr) - 1)

    print("Sorted array:")
    print_array(arr)

#Sample Input: [12, 11, 13, 5, 6, 7]
#Sample Output: [5, 6, 7, 11, 12, 13]

# Join our communities
# Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
# Follow us on Facebook - https://www.facebook.com/venkysio
# Follow us on Instagram - https://www.instagram.com/venkys.io
# Follow us on Twitter - https://twitter.com/iovenkys
# Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork
