/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for implementing Merge Sort
// This program demonstrates divide and conquer sorting algorithm

// Space complexity: O(n)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Merge Sort   | O(nlogn)  | O(nlogn)     | O(nlogn)   |

import java.util.Arrays;

public class MergeSort {
    // Function to merge two sorted sub-arrays
    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;    // Size of left subarray
        int n2 = right - mid;       // Size of right subarray

        // Create temporary arrays
        int[] L = new int[n1];      // Left subarray
        int[] R = new int[n2];      // Right subarray

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        // Merge temporary arrays back into arr[left..right]
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];      // Copy from left array
                i++;
            } else {
                arr[k] = R[j];      // Copy from right array
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Function to implement Merge Sort
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;  // Find middle point

            mergeSort(arr, left, mid);            // Sort first half
            mergeSort(arr, mid + 1, right);       // Sort second half
            merge(arr, left, mid, right);         // Merge sorted halves
        }
    }

    // Function to print array elements
    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Main method to demonstrate merge sort
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Original array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}

//Sample Input: [12, 11, 13, 5, 6, 7]
//Sample Output: [5, 6, 7, 11, 12, 13]

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork
