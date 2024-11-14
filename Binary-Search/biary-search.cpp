#include <iostream>
using namespace std;

int binarySearch(int arr[], int left, int right, int key) {
    while (left <= right) {
        int mid = left + (right - left) / 2;

        // Check if key is at mid
        if (arr[mid] == key)
            return mid;

        // If key is greater, ignore the left half
        if (arr[mid] < key)
            left = mid + 1;

        // If key is smaller, ignore the right half
        else
            right = mid - 1;
    }
    return -1; // Return -1 if key is not found
}

int main() {
    int arr[] = {10, 20, 30, 40, 50};
    int n = sizeof(arr) / sizeof(arr[0]);
    int key = 50;

    int result = binarySearch(arr, 0, n - 1, key);
    if (result == -1)
        cout << "Element not found in the array." << endl;
    else
        cout << "Element found at index: " << result << endl;

    return 0;
}
