def binary_search(arr, key):
    left, right = 0, len(arr) - 1
    
    while left <= right:
        mid = left + (right - left) // 2

        # Check if key is at mid
        if arr[mid] == key:
            return mid
        
        # If key is greater, ignore the left half
        elif arr[mid] < key:
            left = mid + 1
        
        # If key is smaller, ignore the right half
        else:
            right = mid - 1

    return -1  # Return -1 if key is not found

arr = [10, 20, 30, 40, 50]
key = 40

result = binary_search(arr, key)
if result == -1:
    print("Element not found in the array.")
else:
    print(f"Element found at index: {result}")
