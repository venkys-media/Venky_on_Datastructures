/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for implementing Quick Sort
// This program demonstrates divide and conquer sorting algorithm

// Space complexity: O(log n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Quick Sort   | O(nlogn)  | O(nlogn)     | O(n²)      |

import java.util.Arrays;
public class quicksort {
    // Function to swap two elements
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Partition function with left and right pointers
    static int partition(int[] arr, int low, int high) {
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
            swap(arr, left, right);
            left++;
            right--;
        }

        // Place pivot in its final position
        swap(arr, left, high);
        return left;  // Return pivot's position
    }

    // QuickSort recursive function
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Get partition index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);    // Sort left subarray
            quickSort(arr, pi + 1, high);   // Sort right subarray
        }
    }

    // Function to print array elements
    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Main method to demonstrate quick sort
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}

//Sample Input: [10, 7, 8, 9, 1, 5]
//Sample Output: [1, 5, 7, 8, 9, 10]

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork
