import java.util.Arrays;

public class sort {

    // Function to perform Insertion Sort
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; // Insert the key at the correct position
        }
    }

    // Function to print the array
    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Unsorted array: ");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Sorted array: ");
        printArray(arr);
    }
}
