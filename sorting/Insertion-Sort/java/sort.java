/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for implementing Insertion Sort
// This program demonstrates sorting array using insertion sort algorithm

// Space complexity: O(1)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Insertion Sort| O(n)      | O(n^2)       | O(n^2)     |

import java.util.Arrays;

public class sort {
    // Function to perform Insertion Sort
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];          // Current element to be inserted
            int j = i - 1;             // Index of last element in sorted portion

            // Shift elements of arr[0..i-1] that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];   // Move elements one position ahead
                j = j - 1;             // Move to previous element
            }
            arr[j + 1] = key;          // Insert key at correct position
        }
    }

    // Function to print array elements
    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Main method to demonstrate insertion sort
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Unsorted array: ");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Sorted array: ");
        printArray(arr);
    }
}

//Sample Input: [12, 11, 13, 5, 6]
//Sample Output: [5, 6, 11, 12, 13]

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork
