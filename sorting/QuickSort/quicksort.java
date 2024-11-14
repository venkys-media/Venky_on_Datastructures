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
            swap(arr, left, right);
            left++;
            right--;
        }

        // Swap the pivot element with the element at the left pointer
        swap(arr, left, high);
        return left;
    }

    // QuickSort function
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // Partitioning index

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function to print an array
    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
