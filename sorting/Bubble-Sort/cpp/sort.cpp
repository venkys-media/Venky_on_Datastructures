/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// C++ program for implementing Bubble Sort
// This program demonstrates sorting array using bubble sort algorithm

// Space complexity: O(1)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Bubble Sort  | O(n)      | O(n^2)       | O(n^2)     |

#include <iostream>
#include <algorithm> // For std::swap

// Function to perform bubble sort
void bubbleSort(int arr[], int n) {
    bool swapped;  // Flag to indicate whether a swap occurred in the pass
    for (int i = 0; i < n-1; i++) {
        swapped = false;  // Set flag to false at the start of each pass
        // Compare adjacent elements
        for (int j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                std::swap(arr[j], arr[j+1]);  // Swap if elements are in wrong order
                swapped = true;  // Set flag to true, indicating a swap occurred
            }
        }
        // If no two elements were swapped, array is sorted
        if (!swapped) {
            break;  // Exit the loop early
        }
    }
}

// Function to print array elements
void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        std::cout << arr[i] << " ";
    }
    std::cout << std::endl;
}

// Main function to demonstrate bubble sort
int main() {
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    int n = sizeof(arr)/sizeof(arr[0]);
    
    std::cout << "Unsorted array: ";
    printArray(arr, n);
    
    bubbleSort(arr, n);
    
    std::cout << "Sorted array: ";
    printArray(arr, n);

    return 0;
}

//Sample Input: [64, 34, 25, 12, 22, 11, 90]
//Sample Output: [11, 12, 22, 25, 34, 64, 90]

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork
