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
    int pivot = arr[high]; // Pivot element
    int left = low;
    int right = high - 1;

    while (true) {
        // Move left pointer to the right
        while (left <= right && arr[left] < pivot) left++;
        // Move right pointer to the left
        while (right >= left && arr[right] > pivot) right--;

        // If pointers cross, break
        if (left >= right) break;

        // Swap elements at left and right pointers
        swap(&arr[left], &arr[right]);
        left++;
        right--;
    }

    // Swap the pivot element with the element at the left pointer
    swap(&arr[left], &arr[high]);
    return left;
}

// QuickSort function
void quickSort(int arr[], int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high); // Partitioning index

        // Recursively sort elements before and after partition
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

// Function to print an array
void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++)
        cout << arr[i] << " ";
    cout << endl;
}

int main() {
    int arr[] = {10, 7, 8, 9, 1, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    quickSort(arr, 0, n - 1);
    cout << "Sorted array: ";
    printArray(arr, n);
    return 0;
}
