/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for implementing Quick Sort
// This program demonstrates divide and conquer sorting algorithm

// Space complexity: O(log n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Quick Sort   | O(nlogn)  | O(nlogn)     | O(n²)      |

#include <iostream>
using namespace std;

// Function to swap two elements
void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

// Partition function with left and right pointers
int partition(int arr[], int low, int high) {
    int pivot = arr[high];    // Choose last element as pivot
    int left = low;          // Left pointer
    int right = high - 1;    // Right pointer

    while (true) {
        // Move left pointer to the right until finding element > pivot
        while (left <= right && arr[left] < pivot) left++;
        // Move right pointer to the left until finding element < pivot
        while (right >= left && arr[right] > pivot) right--;

        // If pointers cross, partition is complete
        if (left >= right) break;

        // Swap elements at left and right pointers
        swap(&arr[left], &arr[right]);
        left++;
        right--;
    }

    // Place pivot in its final position
    swap(&arr[left], &arr[high]);
    return left;  // Return pivot's position
}

// QuickSort recursive function
void quickSort(int arr[], int low, int high) {
    if (low < high) {
        // Get partition index
        int pi = partition(arr, low, high);

        // Recursively sort elements before and after partition
        quickSort(arr, low, pi - 1);    // Sort left subarray
        quickSort(arr, pi + 1, high);   // Sort right subarray
    }
}

// Function to print array elements
void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++)
        cout << arr[i] << " ";
    cout << endl;
}

// Main function to demonstrate quick sort
int main() {
    int arr[] = {10, 7, 8, 9, 1, 5};
    int n = sizeof(arr) / sizeof(arr[0]);

    cout << "Original array: ";
    printArray(arr, n);

    quickSort(arr, 0, n - 1);

    cout << "Sorted array: ";
    printArray(arr, n);
    return 0;
}

//Sample Input: [10, 7, 8, 9, 1, 5]
//Sample Output: [1, 5, 7, 8, 9, 10]

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork
