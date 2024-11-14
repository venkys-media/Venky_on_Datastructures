def linear_search(arr, key):
    for i in range(len(arr)):
        if arr[i] == key:
            return i  # Return the index if key is found
    return -1  # Return -1 if key is not found

arr = [10, 20, 30, 40, 50]
key = 50

result = linear_search(arr, key)
if result == -1:
    print("Element not found in the array.")
else:
    print(f"Element found at index: {result}")
