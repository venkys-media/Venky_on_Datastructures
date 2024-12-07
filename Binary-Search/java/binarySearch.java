/* All copyrights reserved by Venkys.io.
 Visit https://venkys.io for more information */

// Java program for implementing Binary Search
// This program demonstrates searching an element in sorted array

// Space complexity: O(1)
// Time complexity:
//|Operation    | Best Case | Average Case | Worst Case |
//|-------------|-----------|--------------|------------|
//|Search       | O(1)      | O(log n)     | O(log n)   |

import java.util.Scanner;

// class to perform Binary search
public class binarySearch {
    static int n; // size of array
    static int[] arr; // array to search in
    static int key; // element to search for

    // function to perform binary search
    public static int search() {
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key)
                return mid; // Return the index if key is found

            if (arr[mid] < key)
                left = mid + 1; // Search in right half
            else
                right = mid - 1; // Search in left half
        }
        return -1; // Return -1 if key is not found
    }

    // function to take user input
    public static void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        n = sc.nextInt();
        arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to search:");
        key = sc.nextInt();
        sc.close();
    }

    // function to print output
    public static void printOutput(int result) {
        if (result == -1)
            System.out.println("Element " + key + " not found in the array.");
        else
            System.out.println("Element " + key + " found at index: " + result);
    }

    // main method
    public static void main(String[] args) {
        userInput(); // Taking user input
        int result = search(); // Call to search the array
        printOutput(result); // Printing output
    }
}

// Sample Input: 5
// 10 20 30 40 50
// 30
// Sample Output: Element 30 found at index: 2

/* Join our communities */
// Follow us on LinkedIn - https://www.linkedin.com/company/venkysio
// Follow us on Facebook - https://www.facebook.com/venkysio
// Follow us on Instagram - https://www.instagram.com/venkys.io
// Follow us on Twitter - https://twitter.com/iovenkys
// Follow us on Youtube - https://www.youtube.com/@venkysio