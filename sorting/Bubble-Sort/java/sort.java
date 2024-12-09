package java;
/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for implementing Bubble Sort
// This program demonstrates sorting array using bubble sort algorithm

// Space complexity: O(1)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Bubble Sort  | O(n)      | O(n^2)       | O(n^2)     |

import java.util.Arrays;

public class sort {
    // Function to perform bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;  // Flag to indicate whether a swap occurred
        for (int i = 0; i < n - 1; i++) {
            swapped = false;  // Set flag to false at start of each pass
            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;  // Set flag to true, indicating a swap
                }
            }
            // If no elements were swapped, array is sorted
            if (!swapped) {
                break;  // Exit the loop early
            }
        }
    }

    // Function to print array elements
    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Main method to demonstrate bubble sort
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Unsorted array: ");
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}

//Sample Input: [64, 34, 25, 12, 22, 11, 90]
//Sample Output: [11, 12, 22, 25, 34, 64, 90]

/* Join our communities*/
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@CoreCodersNetwork