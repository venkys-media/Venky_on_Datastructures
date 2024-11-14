# Function to perform Insertion Sort
def insertion_sort(arr):
    n = len(arr)
    for i in range(1, n):
        key = arr[i]
        j = i - 1
        
        # Shift elements of arr[0..i-1] that are greater than key to one position ahead
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key  # Insert the key at the correct position

# Function to print the array
def print_array(arr):
    print(" ".join(map(str, arr)))

# Main function
if __name__ == "__main__":
    arr = [12, 11, 13, 5, 6]

    print("Unsorted array:")
    print_array(arr)

    insertion_sort(arr)

    print("Sorted array:")
    print_array(arr)
