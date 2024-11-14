# Function to merge two sub-arrays
def merge(arr, left, mid, right):
    n1 = mid - left + 1
    n2 = right - mid

    # Create temporary arrays
    L = arr[left:mid + 1]
    R = arr[mid + 1:right + 1]

    # Merge the temporary arrays back into arr
    i = 0
    j = 0
    k = left

    while i < n1 and j < n2:
        if L[i] <= R[j]:
            arr[k] = L[i]
            i += 1
        else:
            arr[k] = R[j]
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
        mid = (left + right) // 2

        # Sort first and second halves
        merge_sort(arr, left, mid)
        merge_sort(arr, mid + 1, right)

        # Merge the sorted halves
        merge(arr, left, mid, right)

# Function to print an array
def print_array(arr):
    print(" ".join(map(str, arr)))

if __name__ == "__main__":
    arr = [12, 11, 13, 5, 6, 7]
    print("Original array:")
    print_array(arr)

    merge_sort(arr, 0, len(arr) - 1)

    print("Sorted array:")
    print_array(arr)
