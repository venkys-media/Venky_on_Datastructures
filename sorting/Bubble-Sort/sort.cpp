#include <iostream>
#include <algorithm> // For std::swap

void bubbleSort(int arr[], int n) {
    bool swapped; // Flag to indicate whether a swap occurred in the pass
    for (int i = 0; i < n-1; i++) {
        swapped = false; // Set flag to false at the start of each pass
        for (int j = 0; j < n-i-1; j++) {
            if (arr[j] > arr[j+1]) {
                std::swap(arr[j], arr[j+1]); // Swap if elements are in the wrong order
                swapped = true; // Set flag to true, indicating a swap occurred
            }
        }
        // If no two elements were swapped, the array is already sorted
        if (!swapped) {
            break; // Exit the loop early
        }
    }
}

void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        std::cout << arr[i] << " ";
    }
    std::cout << std::endl;
}

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
