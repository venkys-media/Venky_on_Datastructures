# Function to swap two elements
def swap(arr, i, j):
    arr[i], arr[j] = arr[j], arr[i]

# Partition function with left and right pointers
def partition(arr, low, high):
    pivot = arr[high]  # Pivot element
    left = low
    right = high - 1

    while True:
        # Move left pointer to the right
        while left <= right and arr[left] < pivot:
            left += 1
        # Move right pointer to the left
        while right >= left and arr[right] > pivot:
            right -= 1

        # If pointers cross, break
        if left >= right:
            break

        # Swap elements at left and right pointers
        swap(arr, left, right)
        left += 1
        right -= 1

    # Swap the pivot element with the element at the left pointer
    swap(arr, left, high)
    return left

# QuickSort function
def quick_sort(arr, low, high):
    if low < high:
        pi = partition(arr, low, high)  # Partitioning index

        # Recursively sort elements before and after partition
        quick_sort(arr, low, pi - 1)
        quick_sort(arr, pi + 1, high)

# Function to print an array
def print_array(arr):
    print(" ".join(map(str, arr)))

if __name__ == "__main__":
    arr = [10, 7, 8, 9, 1, 5]
    quick_sort(arr, 0, len(arr) - 1)
    print("Sorted array:")
    print_array(arr)
